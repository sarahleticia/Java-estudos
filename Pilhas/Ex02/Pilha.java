package EstruturaDeDados.Pilhas.Ex02;
public class Pilha {
    public Object[] numeros;
    public int ponteiro;

    public Pilha() {
        this.numeros = new Object[10];
        this.ponteiro = -1;
    }

    public void empilha(Object valor) {
        if (this.ponteiro < this.numeros.length - 1) {
            ponteiro++;
            this.numeros[ponteiro] = valor;
        }
    }

    public Object desempilha() {
        if (this.ponteiro == -1) {
            //return null;
            System.out.println("\nPilha vazia");
        }
        return this.numeros[this.ponteiro--];
    }

    public Object desempilhaUmNumero() {
        if (this.ponteiro == -1) {
            //return null;
            System.out.println("\nPilha vazia");
        }
        System.out.println("Numero ímpar, desempilhando um elemento da pilha: "+this.numeros[this.ponteiro]);
        return this.numeros[this.ponteiro--];
    }
    public boolean pilhaVazia(){
        if(this.ponteiro == -1){
            return true;
        }
        return false;
    }
}
