import java.util.*;
import java.text.SimpleDateFormat;// for formating the time input
public class DigitalClock extends Thread{
    public void run(){
        try{// infinite loop for the clock to work endlessly
            while(true){
                Date now = new Date();
                // formatter created for it to dispay time in HH:mm:ss format
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                //current time
                String time = formatter.format(now);
                System.out.println(time);
                // to put the thread to sleep for 1 second
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){//to handle any interruption
            System.out.println("Clock Stopped");
        }
    }
    public static void main(String[] args){
        DigitalClock clock = new DigitalClock();
        clock.start();
    }
}