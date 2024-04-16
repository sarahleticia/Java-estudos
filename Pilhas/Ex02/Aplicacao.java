package EstruturaDeDados.Pilhas.Ex02;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String args[]) {
        Pilha p = new Pilha();
        Scanner scanner = new Scanner(System.in);

            for (int cont = 0; cont < p.numeros.length; cont++) {
                System.out.print("Digite um numero: ");
                int valor = scanner.nextInt();

                if((valor % 2) == 0) {
                    p.empilha(valor);
                } else {
                    if(p.pilhaVazia() == true){
                        System.out.println("\nPilha vazia\n");
                    }
                    else{ p.desempilhaUmNumero();
                    }
                }
            }
        System.out.println("\nElementos desempilhados: ");
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilha());
        }
    }
}
