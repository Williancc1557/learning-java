package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

interface Teste {
    final int name = 1;
}

public class CalculadoraTest02 {

    public static class User {
        int user = 123;
        String description = "Hello world";
    }

    public static class Main {
        int x;
        String y;

        Main(int i, String y) {
            this.x = i;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5};

        Calculator.somaArray(numeros);
        Calculator.somaArrayVarargs(1, 2, 3, 4, 5, 6);

        Main test = new Main(1, "");
        test.x = 1;
    }
}