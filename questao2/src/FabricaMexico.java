public class FabricaMexico implements FabricaAssinatura {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new ComprovanteCfdi();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoSpei();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLfpdppp();
    }
}
