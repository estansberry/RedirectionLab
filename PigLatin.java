import java.util.*;
public class PigLatin{
  public static void main(String args[]){
    System.out.println(pigLatinSimple("alphabet"));
  }
  public static String pigLatinSimple(String s){
    String vowels = "a, e, i, o, u";
    if(vowels.indexOf(s.substring(0,1)) != -1){
      s = s + "hay";
    } else{
      s = s.substring(1 , s.length()) + s.charAt(0) + "ay";
    }return(s);
  }

  //public static String pigLatin(String s){

  //}

}
