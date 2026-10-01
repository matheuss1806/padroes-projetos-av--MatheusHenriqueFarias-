public class ContratacaoMaritima extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(String cliente, double valorCarga) {
        return new FreteMaritimo(cliente, valorCarga);
    }
}
