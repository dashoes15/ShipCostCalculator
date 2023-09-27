import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double item = 0;
        double shippingCost;
        System.out.println("Enter the price of an item to find its shipping cost:");
        if (scan.hasNextDouble()) {
            item = scan.nextDouble();
        } else {
            System.out.println("You have entered an invalid input");
            System.exit(0);
        }

        if (item > 100) {
            System.out.println("There is no shipping! Your total is " + item);
        } else {
            shippingCost = item*0.02;
            System.out.println("Your total is: " + (item + shippingCost) + ". The shipping cost was: " + shippingCost);
        }
    }
}