public class Main {

    public static void main(String[] args) {
        ContratacaoFrete rodoviaria = new ContratacaoRodoviaria();
        rodoviaria.contratar("Mercado Bom Preço", 10000.00);

        ContratacaoFrete aerea = new ContratacaoAerea();
        aerea.contratar("Loja de Eletrônicos Silva", 10000.00);

        ContratacaoFrete maritima = new ContratacaoMaritima();
        maritima.contratar("Importadora Oceano", 10000.00);
    }
}
