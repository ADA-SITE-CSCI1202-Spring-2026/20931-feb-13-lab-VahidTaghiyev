import java.util.Scanner;
public class app {

    public static void main(String[] args) {    

        //Leap Year
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not Leap Year");
            }
        }
        else{
            if (year % 100 == 0 && year % 400 == 0){
                System.out.println("Leap Year");
            }
            else if(year % 100 == 0){
                System.out.println("Not Leap Year");
            }
            else{
                System.out.println("Leap Year");
            }
        }

        input.close();
    }
}