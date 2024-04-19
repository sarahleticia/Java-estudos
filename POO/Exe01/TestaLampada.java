package Exe01;

public class TestaLampada {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();

        lampada1.qualidade = "sem defeito";
        lampada1.status = "aprovado";
        lampada1.valor=12.5;

        Lampada lampada2 = new Lampada();
        lampada2.valor=8;
        lampada2.qualidade="defeito";
        lampada2.status="reprovado";

        System.out.println("\nProduto Lampada 01: ");
        lampada1.desconto();
        lampada1.qualidade();
        lampada1.status();

        System.out.println("\nProduto Lampada 02: ");
        lampada2.desconto();
        lampada2.qualidade();
        lampada2.status();

    }
}

