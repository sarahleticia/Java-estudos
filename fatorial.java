package Exe01;

public class fatorial {
    public static void main(String[] args) {
        int numero = 5, fatorial = 1;
        if(numero < 0 || numero > 100){
            System.out.println(" Digite um numero entre 0 - 100");
        } else {
            for (int cont = numero; cont > 1; cont--) {
                fatorial *= cont;

            } System.out.println("o fatorial de "+numero+" é: "+fatorial);
        }
    }
}