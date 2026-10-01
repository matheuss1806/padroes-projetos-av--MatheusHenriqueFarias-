public class ContratacaoRodoviaria extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(String cliente, double valorCarga) {
        return new FreteRodoviario(cliente, valorCarga);
    }
}
