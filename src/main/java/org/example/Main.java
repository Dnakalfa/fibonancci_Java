package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando qualquer número ao usuário
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();
        scanner.close();

        // Verificando se o número pertence à sequência de Fibonacci
        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        int a = 0;
        int b = 1;

        if (n == 0 || n == 1) {
            return true;
        }

        while (b <= n) {
            int next = a + b;
            a = b;
            b = next;

            if (b == n) {
                return true;
            }
        }

        return false;
    }
}
