import java.util.Random;

public class DoWhile {

    public static void main(String[] args) {
        
        System.out.println("Discando ...");

        do{
            System.out.println("Telefone tocando ...");
        }while(tocando()); //Enquanto tocando for verdadeiro

        System.out.println("Alo!!!");
        
    }   
    private static boolean tocando() {
        boolean tocando = new Random().nextBoolean(); //Gera um valor aleatório entre 0 e 1
        return tocando; //Retorna o valor gerado
    }
    //O método tocando() retorna um valor booleano aleatório, que é usado para determinar se o telefone está tocando ou não. 
}
    