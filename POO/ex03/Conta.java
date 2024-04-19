package ex03;

public class Conta {
    String nomeTitular, agencia, dataAbertura;
    int numero;
    double saldo;

    public Conta( String nomeTitular, String agencia, String  dataAbertura,
            int numero, double saldo) {
        this.nomeTitular = nomeTitular;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
        this.numero = numero;
        this.saldo = saldo;
    }

    public double sacar(double valor){
        saldo -= valor;
        return saldo;
    }

    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }

    public double calculaRendimento(){
        saldo *= 0.1;
        return saldo;
    }

    public String impressaoValores(){
        String dados = "\nTitular: " + this.nomeTitular;
               dados += "\nAgencia: " + this.agencia;
               dados += "\nData Abertura: " + this.dataAbertura;
               dados += "\nNumero: " + this.numero;
               dados += "\nSaldo: " + this.saldo;
        return dados;
    }
}
