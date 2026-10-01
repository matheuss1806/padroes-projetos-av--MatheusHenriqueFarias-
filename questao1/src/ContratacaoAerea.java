public class ContratacaoAerea extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(String cliente, double valorCarga) {
        return new FreteAereo(cliente, valorCarga);
    }
}
