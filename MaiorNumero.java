public class MaiorNumero {
    public static void main(String[] args) {
        int num1 =10, num2=150, num3=5;

        if(num1<num2 && num1<num3){
            System.out.println("Este é o MENOR numero: "+num1);
        } else if (num1>num2 && num1>num3) {
            System.out.println("Este é o MAIOR numero: "+num1);
        }
        if (num2<num1 && num2<num3){
            System.out.println("Este é o MENOR numero: "+num2);
        } else if (num2>num1 && num2>num3) {
            System.out.println("Este é o MAIOR numero: "+num2);
        }
        if (num3<num1 && num3<num2){
            System.out.println("Este é o MENOR numero: "+num3);
        } else if (num3>num1 && num3>num2) {
            System.out.println("Este é o MAIOR numero: "+num3);
        }
    }
}
