public class Fila {
    public static void main(String[] args) {

        int prioridade = 4;
        int urgencia = 8;

        if (prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa crítica");
        } else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa importante");
        } else {
            System.out.println("Tarefa comum");
        }

    }
}
