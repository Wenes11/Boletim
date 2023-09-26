import java.util.ArrayList;
import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> materias = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        int contador = 0;

        System.out.println("Bem-vindo ao sistema de boletim de notas!");

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar matéria e notas");
            System.out.println("2 - Mostrar boletim");
            System.out.println("3 - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.println("Insira o nome da matéria:");
                    String materia = scanner.nextLine();
                    materias.add(materia);

                    System.out.println("Insira as notas da matéria (digite -1 para parar):");
                    double somaNotas = 0;
                   
                    while (true) {
                        double nota = scanner.nextDouble();
                        if (nota == -1) {
                            break;
                        }
                       
                        somaNotas += nota;
                        contador++;
                    }
                    double mediaMateria = contador > 0 ? somaNotas / contador : 0;
                    notas.add(mediaMateria);
                    System.out.println("Média da matéria " + materia + ": " + mediaMateria);
                    break;

                case 2:
                    if (materias.isEmpty()) {
                        System.out.println("Nenhuma matéria foi adicionada ainda.");
                    } else {
                        System.out.println("Boletim de Notas:");
                        for(String item1:materias){
                    
                            for(Double item2:notas){
                                System.out.println("materia: " + item1 + " Notas : " + item2);
                            }
                        }
                  
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema de boletim de notas.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Método para calcular a média de notas para uma matéria específica
} 

