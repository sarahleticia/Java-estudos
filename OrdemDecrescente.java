package Vetor;

public class OrdemDecrescente {
    public static void main(String[] args) {

        int[] iniciaValores = {12, 32, 54, 3, 2, 89, 24, 64, 6};
        int i, j, t = 0;

        //Laços de repetição onde cada laço pega um elemento para comparar, caso o elementor seja maior que o da posiçao anterior, troca de posição no vetor.
        for ( i = 0; i < iniciaValores.length; i++) {
            for (j = 0; j < i; j++) {
                if (iniciaValores[i] > iniciaValores[j]) {
                    int temp = iniciaValores[i];
                    iniciaValores[i] = iniciaValores[j];
                    iniciaValores[j] = temp;
                }
            }
        }
        //impressão do vetor organizado
        for (int a = 0; a < iniciaValores.length; a++) {
            System.out.print(iniciaValores[a] + "  ");
        }
    }
}