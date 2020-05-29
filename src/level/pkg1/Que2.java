
package level.pkg1;

import java.util.Scanner;

public class Que2 
{
    public static void main(String[] args) 
    {
        String name,name2,name3,shortname;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your First Name");
        name = sc.next();
        
        System.out.println("Enter your Middle Name");
        name2 = sc.next();
        
        System.out.println("Enter your Last Name");
        name3 = sc.next();
        
        System.out.println("Your Name Is" + name +" "+ name2+" " + name3);
        shortname = name.charAt(0) + ". " + name2.charAt(0) + ". " + name3.charAt(0) +". ";
        System.out.println("Your Short Is " + shortname );
        
    
    }
    
}
