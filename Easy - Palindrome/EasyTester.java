import java.util.Scanner;

public class EasyTester{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input=scanner.nextLine();
    boolean res=isPalindrome("racecar");
    System.out.println(res);
    //true
    res=isPalindrome("codeclub");
    System.out.println(res);
    //false
    res=isPalindrome("codeedoc");
    System.out.println(res);
    //true
    res=isPalindrome("");
    System.out.println(res);
    //true
    res=isPalindrome("a");
    System.out.println(res);
    //true
    res=isPalindrome("yv");
    System.out.println(res);
    //false
  }

  public static boolean isPalindrome(String input){
    //write code here
    return false; //delete when done
  }
}
