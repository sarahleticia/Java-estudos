package Matriz;

public class NumerosImpares { //informe a quantidade de números pares e impares na matriz
    public static void main(String[] args) {
        int[][] valores = new int[][]{{1,2,2},{2,2,2},{3,2,5}};
        int linha, coluna, par=0, impar=0;

        for (linha = 0; linha < valores.length; linha++) {
            for (coluna = 0; coluna < valores.length; coluna++) {
                if (valores[linha][coluna] % 2 == 0 ){
                    par++;
                } else{
                    impar++;
                }
            }

        }
        System.out.println("Quantidade de números pares na matriz: "+par);
        System.out.println("Quantidade de números ímpares na matriz: "+impar);
    }

}
