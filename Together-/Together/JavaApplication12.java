
package javaapplication12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;



public class JavaApplication12 {

    
    public static void main(String[] args) {
        
        String count= "F:\\Gephi\\number.txt";
        
        BufferedReader br = null;
		FileReader fr = null;

		try {

		
			fr = new FileReader(count);
			br = new BufferedReader(fr);
                        

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

                    }    
                    
                catch (IOException e) {

			e.printStackTrace();
                        
                        }
                
                    finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} 
                        
                        catch (IOException ex) {

				ex.printStackTrace();

			}
                        
                
                        if (count != null);
                        
                        String[] temp = count.split("/t");
                        
                        
                      
                        
                        


		}
                
        
        
        
    }
    
}
