import java.util.Scanner;

public class Algo1 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean check = false;
        int num = 0;

        do{
            check=false;
        System.out.print("Enter a Positive number: ");
        num = scanner.nextInt();
        scanner.nextLine();
            if(num<0) {
                System.out.println("Invalid number. Enter a number greater than 0");
                check = true; 
            }

        }while(check);

        int n1 =0;
        int n2 = 1;
        int n3;

        String output = n1 + ", " + n2 + ", ";

        
       
            for (int i = 0; i < num; i++) {
                n3 = n1 + n2;

                n1=n2;
                n2=n3;
                if(n3<=num)   output += n3+", ";
                else break ;
 
            }
       

        System.out.println(output+ "\b\b ");
    }
}
