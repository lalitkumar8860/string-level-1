
package level.pkg1;

import java.util.Scanner;

public class Que4 {
    
    public static void main(String[] args) 
    {
        int str,i,var = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        name = sc.nextLine();
        str = name.length();
        for(i = 0; i < str; i++)
        {
           char ch1 = name.charAt(i);
           char ch = Character.toLowerCase(ch1);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                var++;
            
        }
        
        System.out.println("Number of Vowels present in it => " + var);
        
    }
 
    
}
