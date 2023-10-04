import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }
    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JOSE"};
    

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double salarioPretendido){

       double salarioBase = 2000.0;

       if(salarioBase > salarioPretendido){
       System.out.println("LIGAR PARA O CANDIDADTO");
       }
       else if(salarioBase == salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
       }
       else {
        System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
       }
    }
}
