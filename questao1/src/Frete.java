public abstract class Frete {

    private String cliente;
    private double valorCarga;

    public Frete(String cliente, double valorCarga) {
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorCarga() {
        return valorCarga;
    }

    public abstract String getModalidade();

    public abstract double calcularValor();

    public abstract String getDocumentos();
}
