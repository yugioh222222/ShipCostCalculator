import java.util.Scanner;

public class Lab5_ShipCostCalculator {
    public static void main(String[] args)
        {
            double itemPrice = 0;
            double shipPrice = 0;
            double finalPrice = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("\nPlease enter your items price. ");
            if( in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                if (itemPrice <=0){
                System.out.print("You gave a negative price. That is invalid");
                    System.exit(0);
            }

                in.nextLine();
                System.out.println("Your price is: " + itemPrice);

            }
            else{

            System.out.print("You gave a invalid price");
                System.exit(0);


        }
            if (itemPrice >= 100){
                System.out.println("Your will not have any sales tax so your total will be " + itemPrice);
            }else{
                shipPrice = itemPrice * .02;

                finalPrice = itemPrice + shipPrice;
                System.out.println("The shipping cost is " + shipPrice + " so your grand total is " + finalPrice);



            }










        }











}
