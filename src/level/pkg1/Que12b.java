
package level.pkg1;

import java.util.Scanner;

public class Que12b 
{
    public static void main(String[] args) 
    {
        String name,name1,name2,name3,name4;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name");
        name = sc.nextLine();
        
        if(name.startsWith("mr"))
           System.out.println("male");
        else if(name.startsWith("miss"))
          System.out.println("Female" );
        else if(name.startsWith("mrs"))
          System.out.println("Married female" );
        else if(name.startsWith("Kumari"))
          System.out.println("Ladki" );
        else
            System.out.println("Can not Determine");
    }

}

