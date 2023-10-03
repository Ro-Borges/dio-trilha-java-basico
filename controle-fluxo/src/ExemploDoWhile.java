import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {

    System.out.println("Discando");      
        do{
    System.out.println("Telefone tocando");

        }
        while(tocando()); // enquanto tocando for verdadeiro, repete o loop
    System.out.println("Alô !!!");
    }
private static boolean tocando(){
    boolean atendeu = new Random().nextInt(3)==1;// numero aleatorio de 0 a 3, se for 1 é verdadeiro
    System.out.println("Atendeu? " + atendeu);
    //negando o ato de continuar a tocar
    return ! atendeu; // se deu verdadeiro, ele para de executar o código
}
}
