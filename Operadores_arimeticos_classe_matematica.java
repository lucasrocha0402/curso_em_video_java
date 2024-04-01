import java.util.Scanner;

public class Operadores_arimeticos_classe_matematica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite o segundo valor: ");
        int b = teclado.nextInt();

        int c = a / b;
        int d = a % b;
        System.out.println("O valor da divisão é " + c + " o resto da divisão é  " + d );
    }
}
