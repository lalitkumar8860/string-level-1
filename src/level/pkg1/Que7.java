
package level.pkg1;
import java.util.Scanner;

public class Que7 {
    
    public static void main(String[] args) 
    {
        String date;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day Name");
        date = sc.nextLine();
        if(date.equalsIgnoreCase("Monday"))
            System.out.println("day is  " + 1);
        
        else if(date.equalsIgnoreCase("Tuesday"))
             System.out.println("day is  " + 2);
        
        else if(date.equalsIgnoreCase("Wednesday"))
             System.out.println("day is  " + 3);
        
        else if(date.equalsIgnoreCase("Thursday"))
             System.out.println("day is  " + 4);
        
        else if(date.equalsIgnoreCase("Friday"))
             System.out.println("day is  " + 5);
        
        else if(date.equalsIgnoreCase("Saturday"))
             System.out.println("day is  " + 6);
        
        else if(date.equalsIgnoreCase("Sunday"))
             System.out.println("day is  " + 7);
        else
            System.out.println("Wrong choice");
        
        
    }
 
    
}
