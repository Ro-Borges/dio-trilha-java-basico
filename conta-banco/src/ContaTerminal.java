import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

Scanner ler = new Scanner(System.in);

int numero;
String agencia;
String nomeCliente;
double saldo;

System.out.println("Por favor, o seu nome:");
nomeCliente = ler.nextLine();

System.out.println("Qual o número da sua Agência?");
agencia = ler.nextLine();

System.out.println("Agora informe sua conta:");
numero = ler.nextInt();

System.out.println("Qual o valor do seu saldo?");
saldo = ler.nextDouble();

System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
