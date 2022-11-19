import java.util.Scanner;

public class ExercioDeFixaçao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o valor/Hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mes: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDesconto = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("salarioBruto: " + salarioBruto);
        System.out.println("inss: " + inss);
        System.out.println("sindicato: " + sindicato);
        System.out.println("ir: " + ir);
        System.out.println("totalDesconto: " + totalDesconto);
        System.out.println("salarioLiquido: " + salarioLiquido);
 }
};
