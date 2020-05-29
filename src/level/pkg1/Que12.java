
package level.pkg1;

import java.util.Scanner;

public class Que12 
{
    public static void main(String[] args) 
    {
        String name,name1,name2,name3,name4;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name");
        name = sc.nextLine();
        name1 = name.substring(0, 2);
        name2 = name.substring(0, 4);
        name3 = name.substring(0, 3);
        name4 = name.substring(0, 6);
        
        if(name1.equalsIgnoreCase("mr"))
           System.out.println("male");
        else if(name2.equalsIgnoreCase("miss"))
          System.out.println("Female" );
        else if(name3.equalsIgnoreCase("mrs"))
          System.out.println("Married female" );
        else if(name4.equalsIgnoreCase("Kumari"))
          System.out.println("Ladki" );
        else
            System.out.println("Can not Determine");
    }

}
