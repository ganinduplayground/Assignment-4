import java.util.Scanner;

public class Algo5 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text;
        do{
        System.out.print("Enter a text: ");
        text = scanner.nextLine();
        }while(text.isBlank());


        char[] chars = text.toCharArray();

        int y;
        if(chars.length%2==0){
            y = chars.length/2;
        }else y = chars.length/2 + 1;

        for (int i = 0; i < y; i++) {
            char x = chars[i];
            chars[i] = chars[chars.length-(1+i)];
            chars[chars.length-(1+i)] = x;
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

    }
}
