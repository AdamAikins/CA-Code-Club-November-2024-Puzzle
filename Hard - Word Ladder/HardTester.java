import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class HardTester{
  private HashSet set;
  private ArrayList list; //both data structures containing the dictionary
  
  public static main(String[] args){
    HardTester tester=new HardTester();
    System.out.println(tester.wordLadder("Calf", "Lamb")) //[Calf, Caff, Cafe, Came, Lame, Lamb]
  }

  public HardTester(){
    File file=new File("words.txt");
    Scanner scanner= new Scanner(file);
    while (scanner.hasNextLine()) {
        String data = scanner.nextLine();
        list.add(data);
        set.add(data);
      }
  }

  public String[] wordLadder(String a, String b){
    //write code here

    return null; //delete when done
  }
}
