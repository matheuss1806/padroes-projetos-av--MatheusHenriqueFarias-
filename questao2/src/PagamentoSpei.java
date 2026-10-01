public class PagamentoSpei implements Pagamento {

    @Override
    public String processar(double valor) {
        return "Pagamento de MXN " + String.format("%.2f", valor) + " processado via SPEI";
    }
}
