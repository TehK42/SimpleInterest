import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Input Principal Amount
        System.out.println("Principal Amount = ");
        float principal = input.nextFloat();

        //Input Rate
        System.out.println("Rate in decimal = ");
        float rate = input.nextFloat();

        //Input Time
        System.out.println("Time =");
        float time = input.nextFloat();

        //Simple Interest Formula
        double simpleInterest = (principal * rate * time);
        System.out.println("Simple Interest = " + simpleInterest);

    }
}
