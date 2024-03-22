import java.util.Scanner;

public class TesteLaco {
// nesse laco vemos como ele se comporta com apenas um laço
// sem um passo

    public static void main(String[] args) {
        System.out.println("digite continue para continuar ou qualquer coisa para parar");
        Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();
        while (opcao.equals("continue")) {
            System.out.println("Parar ou continuar?");
            opcao = sc.nextLine();
            sc.close();
            
        }

    }
}