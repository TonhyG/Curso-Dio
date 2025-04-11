public class Operadores {

    public static void main(String[] args) {

        //Inicio Ternario
        int a = 5;
        int b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";
        
        System.out.println(resultado);
        //Fim Ternario

        //Inicio Bollean
        String nomeUm = "Anthony";
        String nomeDois = new String("Anthony");

        System.out.println(nomeUm.equals(nomeDois));// Melhor forma de fazer comparativo para objetos.
        //Fim Bollean
        
    }
}
