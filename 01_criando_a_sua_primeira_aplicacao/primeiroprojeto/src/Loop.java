import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += + nota; //ele recebe o que ele já tem e soma com o que ele recebeu agora (+=)
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao/3);
    }
}
