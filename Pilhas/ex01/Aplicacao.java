package EstruturaDeDados.Pilhas.ex01;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String args[]) {
        Pilha p = new Pilha();
        Scanner scanner = new Scanner(System.in);

        /*
        p.empilha("Portuguesa ");
        p.empilha("Frango com catupiry ");
        p.empilha("Calabresa ");
        p.empilha("Quatro queijos ");
        p.empilha(10);*/

        //adiciona elementos na pilha
        for (int cont=0; cont < p.elementos.length; cont++){
            System.out.print("Digite uma palavra: ");
            String valor = scanner.nextLine();
            p.empilha(valor);
        }

        // tirar elementos da pilha
        System.out.println("\nElementos desempilhados: ");
            while (p.pilhaVazia() == false) {
                System.out.println(p.desempilha());
            }

        // pegar o elemento do topo da pilha
        // p.acessoTopo();

        //verifica a situação atual da pilha
        //p.situacaoPilha();

    }
}
