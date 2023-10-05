import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for(int i = 1;i <= periodo; i++){
          valorFinal = valorInicial * taxaJuros * periodo * i;
        }


        System.out.println("Valor final do investimento: R$ " + valorFinal);
        
        scanner.close();
    }
}
