
package parsing;


public class Parsing {

  
    public static void main(String[] args) {
      String s1="welcome to bangladesh";
      System.out.println("length of the string:"+ s1.length());
      int pos =s1.indexOf("bangladesh");
      System.out.println("position of bangladesh:"+pos);
      
      String sub = s1.substring(11);
      System.out.println(sub);
}
}