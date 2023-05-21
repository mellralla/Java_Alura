import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) { //!= significa DIFERENTE enquanto == é IGUAL
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvaliacao += + nota; //ele recebe o que ele já tem e soma com o que ele recebeu agora (+=)
                totalDeNotas++;
            }

        }

        System.out.println("Média de avaliações: " + mediaAvaliacao/totalDeNotas);
    }
}
