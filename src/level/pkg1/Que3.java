
package level.pkg1;
import java.util.Scanner;

public class Que3 {
    
    public static void main(String[] args) 
    {
        String name,Str;
        int l, Count = 0, letter=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        name = sc.nextLine();
        l = name.length();
        for(int i = 0; i < l; i++)
        {
            char ch = name.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                letter++;
        }   
            System.out.println("Capital Letters is..." + letter);
    }
    
}
