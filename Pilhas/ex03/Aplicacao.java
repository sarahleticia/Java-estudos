package ex03;

public class Aplicacao {
    public static void main(String[] args) {

        Conta contaSarah = new Conta("Sarah","123456", "17-03-2024", 6, 500);
        Conta contaLeticia = new Conta("leticia","12345", "18-03-2024", 5, 400);

       /* if (contaSarah == contaLeticia) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
*/
      /*  System.out.println(contaSarah.depositar(20));
        System.out.println(contaSarah.sacar(50));
        System.out.println(contaSarah.calculaRendimento());*/

        System.out.println(contaSarah.impressaoValores());
    }
}
