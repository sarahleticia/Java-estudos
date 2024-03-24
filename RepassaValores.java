package Vetor;

public class RepassaValores {

    public static void main(String[] args) {
        int [] vetorA ={5,78,4,6,3,2,1,0,98,5};
        int [] vetorB = new int[10];

        int cont;
        for (cont=0; cont < vetorA.length; cont++){
            vetorB[cont] = vetorA[cont];
            System.out.println(vetorB[cont]);
        }
    }
}
