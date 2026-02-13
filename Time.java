import java.util.Scanner;

public class Time {
    //Seconds to time
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        int seconds = time.nextInt();
        int minutes = seconds / 60;
        int hours = minutes / 60;
        if (seconds<60){
            System.out.println(seconds + " 30Seconds");
        }
        else if (minutes > 60){
            int remaining_seconds = seconds - minutes*60;
            int remaining_minutes = minutes - hours*60;
            System.out.println(hours + ":" + remaining_minutes + ":" + remaining_seconds );
        }
        time.close();

    }
}
