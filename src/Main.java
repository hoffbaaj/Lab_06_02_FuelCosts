import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gas = 0;
        double eff = 0;
        double price = 0;
        double hundred = 0;
        double distance;


        System.out.print("Enter how many gallons of gas are in your tank ");
        if (in.hasNextDouble())
        {
            gas = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is not valid.");
        }

        System.out.print("Enter the fuel efficiency of your vehicle ");
        if (in.hasNextDouble())
        {
            eff = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is not valid.");
        }

        System.out.print("Enter the price of gas ");
        if (in.hasNextDouble())
        {
            price = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is not valid.");
        }

        System.out.println("The price per 100 miles is " + (100/eff)*price);

        distance = gas * eff;

        System.out.println("The distance you can travel is " + distance + " miles");
    }
}