<<<<<<< HEAD
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.File;

public class HardTester{
  private HashSet<String> set;
  private ArrayList<String> list; //both data structures containing the dictionary
  
  public static void main(String[] args) throws Exception {
    HardTester tester=new HardTester();
    System.out.println(tester.wordLadder("Calf", "Lamb")); //[Calf, Caff, Cafe, Came, Lame, Lamb]
  }

  public HardTester() throws Exception
  {
    set=new HashSet<String>();
    list=new ArrayList<String>();
    File file=new File("words.txt");
    Scanner scanner= new Scanner(file);
    while (scanner.hasNextLine()) {
        String data = scanner.nextLine();
        list.add(data);
        set.add(data);
      }
    scanner.close();
  }

  public String[] wordLadder(String a, String b){
    //write code here

    return null; //delete when done
  }
}
=======
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.File;

public class HardTester{
  private HashSet<String> set;
  private ArrayList<String> list; //both data structures containing the dictionary
  
  public static void main(String[] args) throws Exception {
    HardTester tester=new HardTester();
    System.out.println(tester.wordLadder("Calf", "Lamb")); //[Calf, Caff, Cafe, Came, Lame, Lamb]
  }

  public HardTester() throws Exception
  {
    set=new HashSet<String>();
    list=new ArrayList<String>();
    File file=new File("words.txt");
    Scanner scanner= new Scanner(file);
    while (scanner.hasNextLine()) {
        String data = scanner.nextLine();
        list.add(data);
        set.add(data);
      }
    scanner.close();
  }

  public String[] wordLadder(String a, String b){
    //write code here

    return null; //delete when done
  }
}
>>>>>>> 3cdb547da2787ac44312fab2e5cf6831583e107d
