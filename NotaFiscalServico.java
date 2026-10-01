public class NotaFiscalServico implements ComprovanteFiscal {

    @Override
    public String gerar(double valor) {
        double iss = valor * 0.05;
        return "NFS-e emitida - ISS de 5%: R$ " + String.format("%.2f", iss);
    }
}
