
import java.util.Scanner;
public class CalculaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora?: ");
        Double salarioHora = scanner.nextDouble();

        System.out.print("Quantas horas trabalhadas no mês?: ");
        Double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto, salarioLiquido, impostoRenda, inss, sindicato;
        salarioBruto = salarioHora * horasTrabalhadas;

        impostoRenda = salarioBruto*0.11;
        inss = salarioBruto*0.08;
        sindicato=salarioBruto*0.05;

        salarioLiquido = salarioBruto - (impostoRenda+inss+sindicato);

        System.out.println("Salario Bruto: "+salarioBruto+ "\nDesconto Imposto de renda: "+impostoRenda+ " \nDesconto INSS: "+inss+
                " \nDesconto Sindicato: "+sindicato+ " \nSalario Liquido: "+salarioLiquido);

        scanner.close();
    }

}
