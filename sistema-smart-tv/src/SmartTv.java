public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 50;


    public void mudarCanal(){
        canal++;
        
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o Volume para:" + volume);
        //volume = volume + 1;
        

    }
    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o Volume para:" + volume);
        
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
    
}
