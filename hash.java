import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<Double>> alunosNotas = new HashMap<>();

        System.out.print("Informe a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        System.out.print("Informe a quantidade de notas por aluno: ");
        int quantidadeNotas = scanner.nextInt();

        scanner.nextLine(); 

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            ArrayList<Double> notas = new ArrayList<>();

            for (int j = 0; j < quantidadeNotas; j++) {
                System.out.print("Informe a nota " + (j + 1) + " de " + nome + ": ");
                double nota = scanner.nextDouble();
                notas.add(nota);
            }

            scanner.nextLine(); 
            alunosNotas.put(nome, notas);
        }

        System.out.println("\n--- RESULTADOS ---");

        for (String nome : alunosNotas.keySet()) {
            ArrayList<Double> notas = alunosNotas.get(nome);
            double soma = 0.0;

            for (double nota : notas) {
                soma += nota;
            }

            double media = soma / notas.size();
            String resultado = media >= 6.0 ? "Aprovado" : "Reprovado";

            System.out.printf("%s [%.2f] [%s]%n", nome, media, resultado);
        }

        scanner.close();
    }
}
