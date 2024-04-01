import java.util.Scanner;

public class Usando_a_classe_matematica {
    public static void main(String[] args) {
        // algumas classs de math pi(constante math.pi),pow(exponenciação math.pow),sqrt(raiz ao quadrado math.sqrt),cbrt(raiz cúbica math.cbrt)
        // abs(valor absoluto, math.abs), flor(arredonda para baixo, math.floor), ceil(arredonda para cima, math.ceil), round(arredonda aritmeticamente, math.round)
        // tambem pode usar um randon (math.randon)
        Scanner teclado = new Scanner(System.in);

        /* System.out.println("Digite o valor do primeiro numero: ");
        int a = teclado.nextInt();

        System.out.println("Digite o valor do segundo numero: ");
        int b = teclado.nextInt();

        int c = a / b;

        float raiz = (float) Math.sqrt(a);

        System.out.println("A divisão de " + a + " com  " + b + " é igual a " + c + " e a raiz vale " + raiz);
         */

        float v = 8.5f;
        int ar = (int) Math.ceil(v);
        System.out.println(ar);
    }
}
