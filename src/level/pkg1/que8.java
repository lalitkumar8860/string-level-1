
package level.pkg1;

import java.util.Scanner;

public class que8 {
    
    public static void main(String[] args) 
    {
        int l;
        String name,str="";
        char ch1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        name = sc.nextLine();
        l = name.length();
        for(int i =0; i < l ; i++ )
        {
            char ch = name.charAt(i);
            if(Character.isLowerCase(ch))
            {
                ch1 = Character.toUpperCase(ch);
            }
            else 
            {
                ch1 = Character.toLowerCase(ch);
            
            }
        str = str + ch1;
        }
        
        System.out.println("New string is => " + str);
    }  
}
