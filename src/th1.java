import java.util.Scanner;

public class th1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap so: ");
        int number = scanner.nextInt();
        if(number < 2);
        int i = 2;
        boolean check = true;
        while (1 < Math.sqrt(number)){
            if (number % i == 0){
                check = false;
                break;
            }
            i++;
        }
        if (check)
            System.out.println(number + "is a prime");
        else
            System.out.println(number+"is not a prime");
    }

}