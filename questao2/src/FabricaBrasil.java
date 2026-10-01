public class FabricaBrasil implements FabricaAssinatura {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NotaFiscalServico();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLgpd();
    }
}
