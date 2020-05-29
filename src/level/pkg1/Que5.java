
package level.pkg1;

import java.util.Scanner;

public class Que5 {
     public static void main(String[] args) 
    {
        String name;
        int l, letter=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        name = sc.nextLine();
        l = name.length();
        for(int i = 0; i < l; i++)
        {
            char ch = name.charAt(i);
            if(ch == ' ')
            {
                letter++;
            }
        }   
            System.out.println("Number of Words Present in it => " + letter);
    }
    
}
