public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    int getTotalAvaliacoes(){
            return totalAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;

    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
