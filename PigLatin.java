import java.util.*;
public class PigLatin{
  public static void main(String args[]){
    System.out.println(pigLatinSimple("alphabet"));
  }
  public static String pigLatinSimple(String s){
    ArrayList<String> vowels = new ArrayList<String>() {
              {add("a");
                add("e");
                add("i");
                add("o");
                add("u");}
              };
    if(vowels.contains(s.substring(0,1))){
      s = s + "hay";
    } else{
      s = s.substring(1 , s.length()) + s.charAt(0) + "ay";
    }return(s);
  }
}
