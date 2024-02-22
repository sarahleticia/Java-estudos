public class InverteString {
    public static void main(String[] args) {
        String nome, invertida;
        nome = "frase invertida";
        invertida= " ";


        for(int contador = nome.length()-1; contador >=0; contador --){
            invertida += nome.charAt(contador);
        }
        System.out.println("palavra invertida:" +invertida);
    }
}
