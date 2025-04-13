import java.util.Scanner;

public class DadosPessoais {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scr.next();

        System.out.println("Quantos anos vc tem? ");
        int idade = scr.nextInt();

        System.out.println("Qual a sua altura? ");
        double altura = scr.nextDouble();

    }
}
