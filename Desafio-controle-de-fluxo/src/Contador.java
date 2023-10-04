import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deverá ser maior que o primeiro");
		}
		
	}

	/**
	 * @param parametroUm
	 * @param parametroDois
	 * @throws ParametrosInvalidosException
	 */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois)
        throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	    for(int x = 1 ; x <= contagem; x++ ){
                System.out.println("imprimindo o numero " + x);
 
        }



    }

}

/*public class ExemploFor {
    public static void main(String[] args) {
        
        for ( int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println("contando carneirinho " + carneirinhos);
        }
        System.out.println("Joaozinho dormiu");
    }
}
 */

 