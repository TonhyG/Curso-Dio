public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("A TV esta ligada? " + smartTv.ligada);
        System.out.println("Em qual canal esta? " + smartTv.canal);
        System.out.println("O volume é: " + smartTv.volume);

        smartTv.ligar(); //Ligando a TV
        System.out.println(smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.mudarcanal(13);
        System.out.println(smartTv.canal);
    
        
    }
    
}
