
package farid;

public class Farid {

  
    public static void main(String[] args) {
      
        String inputTextTabDelimiter = "Sean	Martin	KK	Jacky	Jancy	Hema";
		splitStringTabDelimiter(inputTextTabDelimiter);
    }
                
                private static void splitStringTabDelimiter(String inputTextTabDelimiter) {
 
		System.out.println("Input String splitted based on tab("+"\\t"+")"+" delimiter:");
		if(inputTextTabDelimiter == null || inputTextTabDelimiter.isEmpty()){
			System.out.println("Enter valid String..");
			return;
		}
		
		String delimeter = "\t";
		String[] splitStringArray = inputTextTabDelimiter.split(delimeter);
		for (String s : splitStringArray) {
			System.out.println(s);
		}
    }
    
}
