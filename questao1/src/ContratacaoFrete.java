public abstract class ContratacaoFrete {

    protected abstract Frete criarFrete(String cliente, double valorCarga);

    public void contratar(String cliente, double valorCarga) {
        Frete frete = criarFrete(cliente, valorCarga);
        double valorFrete = frete.calcularValor();
        imprimirResumo(frete, valorFrete);
    }

    private void imprimirResumo(Frete frete, double valorFrete) {
        System.out.println("===== Resumo do Frete =====");
        System.out.println("Modalidade: " + frete.getModalidade());
        System.out.println("Cliente: " + frete.getCliente());
        System.out.println("Valor do frete: R$ " + String.format("%.2f", valorFrete));
        System.out.println("Documentos exigidos: " + frete.getDocumentos());
        System.out.println();
    }
}
