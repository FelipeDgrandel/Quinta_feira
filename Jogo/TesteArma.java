import java.util.Scanner;

public class TesteArma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da arma: ");
        String nome = scanner.nextLine();
        Arma arma1 = new Arma(nome);

        System.out.println("nome: "+ arma1.getNome());
        System.out.println("Dano: "+ arma1.getDano());

        scanner.close();
    }
}
