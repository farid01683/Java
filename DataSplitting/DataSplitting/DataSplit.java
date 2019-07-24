
package datasplit;
import java.util.Scanner;

public class DataSplit {

    public static void main(String[] args) {
        
        String str = "1 2 3 4 5 6 7 8";
        
        Scanner fromStr = new Scanner(str);
        System.out.println("The numbers in the string are: ");
        
        int sum = 0;
        
        while(fromStr.hasNextInt())
        {
            int temp = fromStr.nextInt();
            System.out.println(temp);
            sum += temp;
            System.out.println(sum + "\n");
            
            
            
            
        }
        
        
        
        
    }
    
}
