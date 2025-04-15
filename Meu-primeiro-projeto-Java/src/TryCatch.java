import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{ // Exceção para capturar erro de entrada
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
        }catch (InputMismatchException e) {// Informação de onde ocorreu o erro
            System.out.println("Idade deve ser digitada com numeros inteiros.");
        }
    
    }
}
