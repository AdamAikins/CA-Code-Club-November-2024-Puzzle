public class EasyTester{
  public static void main(String[] args){
    boolean res=isPalindrome("racecar");
    System.out.println(res);
    //true
    res=isPalindrome("Codeclub");
    System.out.println(res);
    //false
    res=isPalindrome("CodeEdoc");
    System.out.println(res);
    //true
    res=isPalindrome("");
    System.out.println(res);
    //true
    res=isPalindrome("A");
    System.out.println(res);
    //true
    res=isPalindrome("yv");
    System.out.println(res);
    //false
    res=isPalindrome("Was it a car or a cat I saw?");
    System.out.println(res);
    //true
  }

  public static boolean isPalindrome(String input){
    //write code here
    return false; //delete when done
  }
}
