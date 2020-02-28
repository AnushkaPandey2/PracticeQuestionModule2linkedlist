import java.util.Scanner;

public class practice1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practice1 obj = new practice1();
        while (true) {
            System.out.println("press 1:insert\n2:print list");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter element to be added");
                    int data = sc.nextInt();
                    obj.insert(data);
                    break;
                case 2:
                    obj.printlist();
                    break;
                case 3:
                    System.out.println("enter element to be added");
                    int d = sc.nextInt();
                    obj.delete(d);
                default:
                    System.out.println("you entered wrong choice");
            }
        }

    }
}
