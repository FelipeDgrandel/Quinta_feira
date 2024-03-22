import java.util.Scanner;

public class MostraNImpares {
    //Dado um numero inteiro positivo n, imprimir os primeiros naturais ímpares. 
    // Exemplo; Para n = 4 , a saida deverá ser 1, 3, 5, 7 ...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor inteiro positivo: ");
        int n = sc.nextInt();
        while (n <= 1) { // Para caso o usuario coloque numero negativo.
            System.out.println("O numero deve ser positivo: ");
            n = sc.nextInt();
        }
        int cont = 1;
        int impar = 1;
        while (cont <= n) {
            System.out.println(impar);
            cont++;
            impar = impar + 2;
        }
        sc.close();
    }
}
