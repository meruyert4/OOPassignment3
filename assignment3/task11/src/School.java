import java.util.Scanner;
public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of subjects: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<n;i++){
            Subject subject = new Subject();

            System.out.println("Enter subjects name: ");
            subject.subjectname = scanner.nextLine();

            System.out.println("Enter number of hours: ");
            subject.numberofhours = scanner.nextInt();

            scanner.nextLine();

            subject.info();
        }

        scanner.close();
    }
}