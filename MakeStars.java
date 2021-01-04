import java.util.Scanner;
import java.util.NoSuchElementException;
public class MakeStars{
  public static void main(String args[]){
    Scanner newscan = new Scanner(System.in);
    String inputtext;
    String outputtext = "";
    while(true){
      try{
        inputtext = newscan.nextLine();
        outputtext = "";
        String lastchar = " ";
        for(int i = 0; i < inputtext.length(); i ++){
          if(inputtext.charAt(i) != ' '){
            outputtext = outputtext + "*";
          }else{
            if (lastchar.equals(inputtext.charAt(i))){
              continue;
            }
            outputtext = outputtext + ' ';
          }
          lastchar = inputtext.charAt(i) + "";
        } System.out.println(outputtext);
      }catch(NoSuchElementException e){
        break;
      }

    }

  }
}
