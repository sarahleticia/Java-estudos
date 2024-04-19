package EstruturaDeDados.Pilhas.Ex03;

public class PilhaEx03 {
    public Integer[] numeros;
    public int ponteiro;

    public PilhaEx03() {
        this.numeros = new Integer[10];
        this.ponteiro = -1;
    }
    public void empilha(Integer valor) {
        if (this.ponteiro < this.numeros.length - 1) {
            ponteiro++;
            this.numeros[ponteiro] = valor;
        }
    }
    public Integer desempilhaPar() {
        if (this.ponteiro == -1) {
            //return null;
            System.out.println("\nPilha vazia");
        }
        System.out.println("Numero 0 , desempilhando um elemento da pilha de Pares: " + this.numeros[this.ponteiro]);
        return this.numeros[ponteiro--];
    }

    public Integer desempilhaImpar() {
        if (this.ponteiro == -1) {
            //return null;
            System.out.println("\nPilha vazia");
        }
        System.out.println("Numero 0, desempilhando um elemento da pilha de Impares: " + this.numeros[this.ponteiro]);
        return this.numeros[ponteiro--];
    }

    public boolean pilhaVazia() {
        if (this.ponteiro == -1) {
            return true;
        }
        return false;
    }

    public Integer desempilha() {
        if (this.ponteiro == -1) {
            //return null;
            System.out.println("\nPilha vazia");
        }
         return this.numeros[this.ponteiro--];
    }

}


