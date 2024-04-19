package Exe01;
public class Lampada {
    String status, qualidade;
    double valor;


    //CRIAÇÃO DO MÉTODO 1
    public void desconto(){
        //MÉTODO FALAR
       // System.out.println("Eu sou o metodo desconto");
        if (valor > 10){
            System.out.println("voce possui desconto");

        }
        else {System.out.println("voce não possui desconto");
        }
    }

    //CRIAÇÃO DO MÉTODO 2
    public void qualidade(){
       // System.out.println("Eu sou o metodo qualidade");
        if (qualidade == "defeito"){
            System.out.println("produto com defeito! Não compre!");

        }
        else {System.out.println("produto não possui defeito!");
        }
    }

    //CRIAÇÃO DO MÉTODO 3
    public void status(){
      //  System.out.println("Eu sou o metodo status");
        if (status == "reprovado"){
            System.out.println("Produto reprovado");

        }
        else {System.out.println("produto aprovado!");
        }
    }

}





