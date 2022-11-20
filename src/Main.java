import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
        System.out.println("Input your number");
        int number= scanner.nextInt();
        if (number<10){
            System.out.println("bir orundu");
        } else if (number<=100) {
            System.out.println("eki orundu");
        }else if (number<1000){
            System.out.println("uch orundu");
        } else if (number<=10000) {
            System.out.println("tort orundu");
        } else{
            System.out.println(" besh orundu");
        }
        {

        }
    }
}