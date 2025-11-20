import java.util.concurrent.ThreadLocalRandom;
public class WhileExemplo {
    public static void main(String[] args) {
        double mesada = 10000.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor " + valorDoce + "Add no Carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda sua mesada em doces ");

        }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 100);
    }
}