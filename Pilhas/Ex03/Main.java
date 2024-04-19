package EstruturaDeDados.Pilhas.Ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilhaEx03 par = new PilhaEx03();
        PilhaEx03 impar = new PilhaEx03();
        Scanner scanner = new Scanner(System.in);

        for (int cont = 0; cont <=9; cont++) {
            System.out.print("Digite um numero: ");
            int valor = scanner.nextInt();

            if (valor == 0) {

                if (par.pilhaVazia() == true || impar.pilhaVazia() == true) {
                    System.out.println("\nPilha vazia\n");
                } else {
                    par.desempilhaPar();
                    impar.desempilhaImpar();
                }
            }
            else if ((valor % 2) == 0) {
                par.empilha(valor);
            }
            else {
                impar.empilha(valor);
            }
        }

        System.out.println("\nElementos desempilhados Impar: ");
        while (!impar.pilhaVazia()) {
            System.out.println(impar.desempilha());
        }

        System.out.println("\nElementos desempilhados Par: ");
        while (!par.pilhaVazia()) {
            System.out.println(par.desempilha());
        }
    }
}
