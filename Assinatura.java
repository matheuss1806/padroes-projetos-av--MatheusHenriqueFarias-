public class Assinatura {

    private FabricaAssinatura fabrica;

    public Assinatura(FabricaAssinatura fabrica) {
        this.fabrica = fabrica;
    }

    public void ativar(String cliente, double valor) {
        ComprovanteFiscal comprovante = fabrica.criarComprovanteFiscal();
        Pagamento pagamento = fabrica.criarPagamento();
        TermoPrivacidade termo = fabrica.criarTermoPrivacidade();

        System.out.println("===== Assinatura ativada =====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Comprovante fiscal: " + comprovante.gerar(valor));
        System.out.println("Pagamento: " + pagamento.processar(valor));
        System.out.println("Termo de privacidade: " + termo.descricao());
        System.out.println();
    }
}
