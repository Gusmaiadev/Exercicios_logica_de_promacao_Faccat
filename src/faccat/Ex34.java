package faccat;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Para X = 3 e Y = 2
        int x1 = 3;
        int y1 = 2;
        int z1 = (x1 * y1) + 5;
        char resposta1;

        if (z1 <= 0) {
            resposta1 = 'A';
        } else if (z1 <= 100) {
            resposta1 = 'B';
        } else {
            resposta1 = 'C';
        }

        System.out.println("X: " + x1 + "\tY: " + y1 + "\tZ: " + z1 + "\tResposta: " + resposta1);

        // Para X = 7 e Y = -1
        int x2 = 7;
        int y2 = -1;
        int z2 = (x2 * y2) + 5;
        char resposta2;

        if (z2 <= 0) {
            resposta2 = 'A';
        } else if (z2 <= 100) {
            resposta2 = 'B';
        } else {
            resposta2 = 'C';
        }

        System.out.println("X: " + x2 + "\tY: " + y2 + "\tZ: " + z2 + "\tResposta: " + resposta2);

        // Para X = -2 e Y = 5
        int x3 = -2;
        int y3 = 5;
        int z3 = (x3 * y3) + 5;
        char resposta3;

        if (z3 <= 0) {
            resposta3 = 'A';
        } else if (z3 <= 100) {
            resposta3 = 'B';
        } else {
            resposta3 = 'C';
        }

        System.out.println("X: " + x3 + "\tY: " + y3 + "\tZ: " + z3 + "\tResposta: " + resposta3);
    }
}
