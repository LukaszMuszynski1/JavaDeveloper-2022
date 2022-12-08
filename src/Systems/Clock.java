package Systems;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {
    
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int licznik =5;
            @Override
            public void run() {
                if(licznik > 0) {
                    System.out.println(".");
                    licznik--;
                } else {
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0,1000);
    }
}