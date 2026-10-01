public class ComprovanteCfdi implements ComprovanteFiscal {

    @Override
    public String gerar(double valor) {
        double iva = valor * 0.16;
        return "CFDI emitido - IVA de 16%: MXN " + String.format("%.2f", iva);
    }
}
