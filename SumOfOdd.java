import java.util.Scanner;
public class SumOfOdd {

    public static void main(String[] args) {    

        // Sum Of Odd numbers
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 % 2 == 1 && num2 % 2 == 1){
            int sum = num1 + num2;
            System.out.println(sum);
        }
        else{
            System.out.println("Given numbers are not odd numbers.");
        }
        input.close();
    }
}