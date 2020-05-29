
package level.pkg1;

import java.util.Scanner;

public class Que9 
{
    public static void main(String[] args) 
    {
        String str;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        str = sc.nextLine();
        int i=0,j=str.length()-1;
        
        if(str.charAt(i)==str.charAt(j))
            i++;
            j--;
        
        else 
            
            System.out.println("no");
        
                
        
    }
 
    
}
