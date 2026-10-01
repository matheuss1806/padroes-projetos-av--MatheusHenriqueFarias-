public class FreteAereo extends Frete {

    public FreteAereo(String cliente, double valorCarga) {
        super(cliente, valorCarga);
    }

    @Override
    public String getModalidade() {
        return "Aéreo";
    }

    @Override
    public double calcularValor() {
        return getValorCarga() * 0.06;
    }

    @Override
    public String getDocumentos() {
        return "AWB (Air Waybill)";
    }
}
