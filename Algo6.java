import java.util.Scanner;

public class Algo6 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text;
        do{
        System.out.print("Enter a Sentence: ");
        text = scanner.nextLine().strip();
        }while(text.isBlank());


        char[] chars = text.toCharArray();
        int space = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==' ') space++;
            
        }
        // System.out.println(space);
       String[] words = new String[space+1];
       int preIndex=0;
       int postIndex=-1;
       int count = 0;

       for (int i = 0; i < chars.length; i++) {
        // System.out.println(i);
        if(chars[i]==' ') {
            // System.out.println(i);
            preIndex=postIndex +1;
            postIndex = i;
            for (int j = preIndex; j < postIndex; j++) {
                System.out.println(chars[j]);
                words[count]+=chars[j];
            }
            count++;
        }else continue;
       }

       for (int i = 0; i < words.length; i++) {
        System.out.println(words[i]);
       }

    }
}
