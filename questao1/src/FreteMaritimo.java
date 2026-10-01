public class FreteMaritimo extends Frete {

    public FreteMaritimo(String cliente, double valorCarga) {
        super(cliente, valorCarga);
    }

    @Override
    public String getModalidade() {
        return "Marítimo";
    }

    @Override
    public double calcularValor() {
        return getValorCarga() * 0.01;
    }

    @Override
    public String getDocumentos() {
        return "BL (Bill of Lading) e fatura comercial";
    }
}
