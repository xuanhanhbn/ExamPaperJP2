import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        studentManager stManager = new studentManager();
        int studentId;

        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    stManager.add();
                    break;
                case "2":
                    stManager.show();
                    break;
                case "3":
                    stManager.save();
                    break;
                case "4":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }if (exit) {
                break;
            }
            // show menu
            showMenu();
        }


    }

    public static void showMenu() {
         System.out.println("-----------menu------------");
         System.out.println("1. Add student.");
         System.out.println("2. Display student records");
         System.out.println("3. Save");
         System.out.println("4. Exit");
         System.out.println("---------------------------");
         System.out.print("Please choose: ");
    }
}