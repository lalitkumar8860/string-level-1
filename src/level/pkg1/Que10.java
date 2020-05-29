
package level.pkg1;

import java.util.Scanner;

public class Que10 {
    
    public static void main(String[] args) 
    {
        String name,name1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        name = sc.nextLine();
        name1 = name.substring(3);
        System.out.println("your substring is.. " + name1);
    }
 
    
}
