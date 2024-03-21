package Vetores;

public class SomaVetores {
    public static void main(String[] args) {
        int [] vetorA ={4,5,7,8,9,6,4,5,4,5};
        int [] vetorB = {6,20,10,8,9,4,14,6,8,9};
        int [] vetorC = new int[10];

        for(int cont=0; cont < vetorA.length; cont++){
            vetorC[cont] = vetorA[cont]+vetorB[cont];
            System.out.println(vetorA[cont]+ " + "+vetorB[cont]+ " : "+vetorC[cont]);
        }
    }
}
