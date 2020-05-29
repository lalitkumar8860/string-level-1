
package level.pkg1;

import java.util.Scanner;

public class Que6 {
    
    public static void main(String[] args) 
    {
        String st1,st2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        st1=sc.nextLine();
        System.out.println("Enter the second string");
        st2=sc.nextLine();
        if(st1.equals(st2))
            System.out.println("your strings are same");
        else
            System.out.println("Does not matched");
        
        
        
    }
 
    
}
