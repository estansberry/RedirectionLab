import java.util.Scanner;
import java.util.NoSuchElementException;
public class MakeStars{
  public static void main(String args[]){
    Scanner linescan = new Scanner(System.in);
    String inputtext;
    String wordtext;
    String outputtext = "";
    while(linescan.hasNextLine()){
        inputtext = linescan.nextLine();
        Scanner wordscan = new Scanner(inputtext);
        wordtext = wordscan.nextLine();
        outputtext = "";
        for(int i = 0; i < wordtext.length(); i ++){
          outputtext = outputtext + "*";
        } System.out.println(outputtext);
    }
  }
}
