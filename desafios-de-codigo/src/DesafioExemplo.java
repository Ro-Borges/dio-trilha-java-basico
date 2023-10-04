import java.util.Scanner;
public class DesafioExemplo {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner (System.in);

        double valorSalario;
        double valorBeneficios;
        double valorImposto = 0;
        double saida;

        System.out.println("Qual o valor do salário? ");
        valorSalario = ler.nextInt();
        System.out.println("Qual o valor do benefício? ");
        valorBeneficios = ler.nextInt();

        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10;
        }
        else if (valorSalario > 2500) {
            valorImposto = 0.15;
        }
    
        saida = valorSalario - valorImposto + valorBeneficios;

    System.out.println(saida);
    ler.close();

    }
    
}
