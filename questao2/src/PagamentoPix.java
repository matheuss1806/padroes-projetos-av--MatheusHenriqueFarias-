public class PagamentoPix implements Pagamento {

    @Override
    public String processar(double valor) {
        return "Pagamento de R$ " + String.format("%.2f", valor) + " processado via Pix";
    }
}
