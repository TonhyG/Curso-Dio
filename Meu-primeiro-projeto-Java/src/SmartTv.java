public class SmartTv {

    Boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void aumnetarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

    public void mudarcanal(int mudarCanal){
        canal = mudarCanal;
    }
    
}
