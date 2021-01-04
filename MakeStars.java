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
        outputtext = "";
        Scanner wordscan = new Scanner(inputtext);
        while(wordscan.hasNext()){
          wordtext = wordscan.next();
          for(int i = 0; i < wordtext.length(); i ++){
            outputtext = outputtext + "*";
          }outputtext = outputtext + " ";
        } System.out.println(outputtext);
      }
    }
}
