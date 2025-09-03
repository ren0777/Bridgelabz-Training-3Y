package Workshop;
import java.util.Scanner;
//  The Online Shopping Cart 
// A shopping app stores product prices in an array when a customer adds items.
// Use a loop to calculate the total cart value.
// Apply a discount of 10% if the total exceeds 5000.
// Add a delivery charge of 100 if the total after discount is less than 2000.
// Display the final payable amount.
public class OnlineShoppingCart {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items in the cart: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the price of item "+(i+1)+": ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Total cart value: "+sum);
        if(sum>5000){
            sum=sum-(sum*10/100);
            System.out.println("After 10% discount: "+sum);
        }
        if(sum<2000){
            sum+=100;
            System.out.println("After adding delivery charge of 100: "+sum);
        }   
        System.out.println("Final payable amount: "+sum);
        sc.close();

    }
    
}
