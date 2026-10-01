public class Main {

    public static void main(String[] args) {
        Assinatura assinaturaBrasil = new Assinatura(new FabricaBrasil());
        assinaturaBrasil.ativar("Padaria Pão Quente", 200.00);

        Assinatura assinaturaMexico = new Assinatura(new FabricaMexico());
        assinaturaMexico.ativar("Tacos El Güero", 1500.00);
    }
}
