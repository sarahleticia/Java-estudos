package ex04;

import ex03.Conta;

public class Aplicacao {
    public static void main(String[] args) {
        Porta porta1 = new Porta("sim", "rosa", 3,2);

        porta1.abre();
        porta1.fecha();
        porta1.pinta(porta1.dimensaoX, porta1.dimensaoY);
        porta1.statusAberta();

    }
}
