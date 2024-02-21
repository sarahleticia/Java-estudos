import java.util.Scanner;
public class CalculaSalarioIR {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Quanto você ganha por hora?: ");
            Double salarioHora = scanner.nextDouble();

            System.out.print("Quantas horas trabalhadas no mês?: ");
            Double horasTrabalhadas = scanner.nextDouble();


            double salarioBruto, salarioLiquido=0, impostoRenda, fgts, inss, sindicato;

            salarioBruto = salarioHora * horasTrabalhadas;
            impostoRenda = 0;
            fgts = salarioBruto*0.11;
            sindicato=salarioBruto*0.03;
            inss=salarioBruto*0.10;


            if(salarioBruto <=900){
                salarioLiquido = fgts+salarioBruto - (impostoRenda+sindicato+inss);

            } else if (salarioBruto > 900 && salarioBruto <=1500) {
                impostoRenda=salarioBruto*0.05;
                salarioLiquido = fgts+salarioBruto - (impostoRenda+sindicato+inss);

            } else if (salarioBruto > 1500 && salarioBruto <=2500) {
                impostoRenda=salarioBruto*0.10;
                salarioLiquido = fgts+salarioBruto - (impostoRenda+sindicato+inss);

            } else if (salarioBruto > 2500) {
                impostoRenda=salarioBruto*0.20;
                salarioLiquido = fgts+salarioBruto - (impostoRenda+sindicato+inss);

            }

            System.out.println("Salario Bruto: "+salarioBruto+ "\nDesconto Imposto de renda: "+impostoRenda+ " \nAcrescimo FGTS: "+fgts+
                    " \nDesconto Sindicato: "+sindicato+ " \nSalario Liquido: "+salarioLiquido);

            scanner.close();
        }

    }


