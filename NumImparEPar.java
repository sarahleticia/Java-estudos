public class NumImparEPar {

        public static void main(String[] args) {
            double divisao;
            int[] numero = {3, 14, 20, 25, 74, 109, 58, 54, 13, 99};

            int cont;
            for (cont = 0; cont < numero.length; cont++) {
                 divisao = cont % 2;
                if (divisao != 0) {
                    System.out.println("Este numero é Ímpar: " + numero[cont]);
                }
                if(divisao == 0){
                    System.out.println("Este numero é Par: " + numero[cont]);
                }

            }

        }
    }


