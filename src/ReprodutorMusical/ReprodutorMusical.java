package ReprodutorMusical;

public class ReprodutorMusical implements Reprodutor{
    public int volume = 5;

    public void aumentarVolume(){
        if(volume < 10){
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume está no máximo");
        }
    }

    public void diminuirVolume(){
        if (volume > 0){
            volume--;
            System.out.println("Volume diminuido para: " + volume);
        } else {
            System.out.println("Volume está no minimo");
        }
    }

}
