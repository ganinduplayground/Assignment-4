import java.util.Scanner;

public class Algo9 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean check = false;
        char [] chars;
        String word;
        
        do{
            check=false;
            System.out.print("Enter a single word: ");
            word = scanner.nextLine().strip();
            loop:
            {
                if(word.isBlank()){
                    check=true;
                    System.out.println("Text can't be blank.");
                    break loop;
                }
            chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i]==' '){
                    check=true;
                    System.out.println("Invalid input. Enter a single word.");
                    break;
                }
            }
            }
        }while(check);

    String reverseStr = "";
    
    int strLength = word.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + word.charAt(i);
    }

    if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(word + " is a Palindrome String.");
    }
    else {
      System.out.println(word + " is not a Palindrome String.");
    }
  }
}
