import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        //Coin Tosser
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i<num;i++){
            if (Math.random() < 0.5){
                System.out.println("Heads");
            }
            else{
                System.out.println("Tails");
            }
        }
        input.close();
    }
}
