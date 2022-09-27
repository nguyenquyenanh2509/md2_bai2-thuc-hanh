import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        /* In ra menu cho phep order do an sang cho sinh vien
         *1. Pho bo kobe
         *2. Pho ga doi
         * 3.Xoi ga
         * 4.Banh my pate
         * 5.My tom
         * 6.Thoat
         **/

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("*******MENU*********");
            System.out.println("1. Pho bo kobe");
            System.out.println("2. Pho ga");
            System.out.println("3. Xoi ga");
            System.out.println("4. Banh my");
            System.out.println("5.My tom");
            System.out.println("6. Thoat");
            System.out.print("SU lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Cam on ban!!");
                    break;
                case 2:
                    System.out.println("Cam on ban!!");
                    break;
                case 3:
                    System.out.println("Cam on ban!!");
                    break;
                case 4:
                    System.out.println("Cam on ban!!");
                    break;
                case 5:
                    System.out.println("Cam on ban!!");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Vui long chon tu 1-6");
            }
        }while (true);
    }
}

