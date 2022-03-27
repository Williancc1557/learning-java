package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculator {
    public static void soma( long num1, long num2) {
        System.out.println(num1 + num2);
    }

    public static void somaArray(int[] numeros) {
        int soma = 0;

        for(int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

    public static void somaArrayVarargs(int... numeros) {
        int soma = 0;

        for(int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }
}
