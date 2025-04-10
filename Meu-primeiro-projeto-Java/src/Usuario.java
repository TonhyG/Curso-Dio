public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ligada? " + smartTv.ligada);
        System.out.println("Em qual canal esta? " + smartTv.canal);
        System.out.println("O volume é: " + smartTv.volume);

        smartTv.ligar(); //Ligando a TV
        System.out.println(smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println(smartTv.diminuirVolume);
    
        
    }
    
}
