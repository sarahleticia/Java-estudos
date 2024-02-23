package Vetores;

public class MultiplicaIndex {
    public static void main(String[] args) {
        int [] vetorA={5,2,4,3,1,7,6,8,4,1};
        int [] vetorB = new int[10];

        for (int cont=0; cont < vetorA.length; cont++){
            vetorB[cont]= vetorA[cont]*cont;
            System.out.println(vetorA[cont]+" x  "+cont+" : "+vetorB[cont]);
        }
    }
}
