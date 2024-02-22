public class VetorInvertido {
    public static void main(String[] args) {
        int numero[] = {1,5,7,25,39,98,41,200,63};

        int cont;
        for(cont = numero.length-1; cont >= 0; cont--){
            System.out.println(numero[cont]);
        }
    }
}
