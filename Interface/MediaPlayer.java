package Interface;

public class MediaPlayer implements Media {

    @Override
    public void start() {
       System.out.println("LeD lighting");
    }

    @Override
    public void stop() {
        System.out.println("Media player Stopped");
    }
    
}
