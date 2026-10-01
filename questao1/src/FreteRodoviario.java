public class FreteRodoviario extends Frete {

    public FreteRodoviario(String cliente, double valorCarga) {
        super(cliente, valorCarga);
    }

    @Override
    public String getModalidade() {
        return "Rodoviário";
    }

    @Override
    public double calcularValor() {
        return getValorCarga() * 0.02;
    }

    @Override
    public String getDocumentos() {
        return "CT-e e MDF-e";
    }
}
