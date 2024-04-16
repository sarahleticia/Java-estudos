package EstruturaDeDados.Pilhas.ex01;
public class Pilha {
    public Object[] elementos; // criando um elemento genérico
    public int ponteiro; //indicador do topo ou ponteiro da pilha


    //CRIANDO O CONSTRUTOR DA CLASSE----
    public Pilha() {
        this.elementos = new Object[5]; //criando uma pilha de 5 posições
        this.ponteiro = -1; // indica que a pilha está nula ou vazia, pois a posição 0 indica que já contem um elemento na pilha.

    }

    //MÉTODOS----

    //adiciona elementos na pilha
    public void empilha(Object valor) {
        if (this.ponteiro < this.elementos.length - 1) {
            ponteiro++;
            this.elementos[ponteiro] = valor;

        }
    }

    // tirar elementos da pilha
    public Object desempilha() {
        if (this.ponteiro == -1) {
            //return null;
            System.out.println("\nPilha vazia");
        }
         return this.elementos[this.ponteiro--];
    }

    // pegar o elemento do topo
    public void acessoTopo() {
        if (this.ponteiro == -1) {
            System.out.println("\nPilha vazia");
        } else {
            System.out.println("\nElemento no topo da pilha: "+this.elementos[ponteiro]);
        }
    }
    // informa a situacao da pilha
    public void situacaoPilha() {
        if (this.ponteiro == -1) {
            System.out.println("\nPilha vazia\n");
        } else {
            if (this.ponteiro == this.elementos.length - 1) {
                System.out.println("\nPilha cheia");
            } else {
                System.out.println("\n Total de posições da pilha (Tamanho): \n" + this.elementos.length);
                System.out.println("\n Total de elementos na pilha: \n" + (this.ponteiro+1));
                System.out.println("\n Espaço disponivel na pilha: \n" + (this.elementos.length - (ponteiro + 1)));
            }
        }
    }

    //verifica a situaçao da pilha retornando um valor booleano
    public boolean pilhaVazia() {
        if (this.ponteiro == -1) {
            return true;
        }
        return false;
    }

}

