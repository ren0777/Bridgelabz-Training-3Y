package Workshop;
import java.util.Scanner;
// . The Library Book Tracker 
// A library records the number of books borrowed each day for 7 days in an array.
// Use a loop to calculate the total number of books borrowed in the week.
// Find the day with the highest borrowings.
// Check if there was any day with zero borrowings (holiday).
// Display the average daily borrowings
public class library {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        int sum=0,max=0,day=0;
        boolean holiday=false;
        for(int i=0;i<7;i++){
            System.out.println("Enter the number of books borrowed on day "+(i+1)+": ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
                day=i+1;
            }
            if(arr[i]==0){
                holiday=true;
            }

        }
        System.out.println("Total books borrowed in the week: "+sum);
        System.out.println("Day with highest borrowings: Day "+day+" with "+max+" books");
        if(holiday){
            System.out.println("There was at least one holiday (day with zero borrowings).");
        } else {
            System.out.println("There were no holidays (no days with zero borrowings).");
        }
        sc.close();
        System.out.println("Average daily borrowings: "+(sum/7.0)); 
    }
    
}
