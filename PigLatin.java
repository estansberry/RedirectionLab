import java.util.*;
import java.lang.*;
public class PigLatin{
  public static void main(String args[]){
    System.out.println(pigLatinBest("4chan"));
  }
  public static String pigLatinSimple(String s){
    String vowels = "a, e, i, o, u";
    if(vowels.indexOf(s.substring(0,1)) != -1){
      s = s + "hay";
    } else{
      s = s.substring(1 , s.length()) + s.charAt(0) + "ay";
    }return(s);
  }

  public static String pigLatin(String s){
    String vowels = "a, e, i, o, u";
    String digraphs = "bl ,  br ,  ch ,  ck ,  cl ,  cr ,  dr ,  fl ,  fr ,  gh ,  gl ,  gr ,  ng ,  ph ,  pl ,  pr ,  qu ,  sc ,  sh ,  sk ,  sl ,  sm ,  sn ,  sp ,  st ,  sw ,  th ,  tr ,  tw ,  wh ,  wr";
    if(vowels.indexOf(s.substring(0,1)) != -1){
      s = s + "hay";
    }else if(digraphs.indexOf(s.substring(0,2)) != -1){
      s = s.substring(2, s.length()) + s.substring(0,2) + "ay";
    }else{
      s = s.substring(1 , s.length()) + s.charAt(0) + "ay";
    }return(s);
  }

  public static String pigLatinBest(String s){
    String vowels = "a, e, i, o, u";
    String digraphs = "bl ,  br ,  ch ,  ck ,  cl ,  cr ,  dr ,  fl ,  fr ,  gh ,  gl ,  gr ,  ng ,  ph ,  pl ,  pr ,  qu ,  sc ,  sh ,  sk ,  sl ,  sm ,  sn ,  sp ,  st ,  sw ,  th ,  tr ,  tw ,  wh ,  wr";
    String extra = "";
    if(!(Character.isLetterOrDigit(s.charAt(s.length() - 1)))){
      extra = s.substring(s.length() - 1);
      s = s.substring(0, s.length() - 1);
    }if(!(Character.isLetter(s.charAt(0)))){
      return(s);
    }
    if(vowels.indexOf(s.substring(0,1)) != -1){
      s = s + "hay";
    }else if(digraphs.indexOf(s.substring(0,2)) != -1){
      s = s.substring(2, s.length()) + s.substring(0,2) + "ay";
    }else{
      s = s.substring(1 , s.length()) + s.charAt(0) + "ay";
    }s = s + extra;
    return(s);
  }

}
