import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber =(int)(Math.random()*100);

        int userNumber = 0;
        do {
            System.out.println("Guess Your Number : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("yeah!!! Correct Number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your Number Is Too Large");
            } else {
                System.out.println("Your Number Is Small");
            }
        }while(userNumber >= 0) ;

        System.out.println("Your Number Was : ");
        System.out.println(myNumber);
    }
}