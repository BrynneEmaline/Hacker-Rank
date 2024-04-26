import java.util.Arrays;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {

        // testing for password class
        String pwd = "010100101001";
        Password password = new Password();
        password.getMinFlips(pwd);


        // testing for studentRank class
        Scanner scanner = new Scanner(System.in);


        System.out.println("How many of students?: ");
        int numOfStudents = scanner.nextInt();
        String[] students = new String[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter student name: ");
            students[i] = scanner.next();
        }

        int[] ranks = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter corresponding student score: ");
            ranks[i] = scanner.nextInt();
        }
        System.out.println("Students: " + Arrays.toString(students));
        System.out.println("Scores: " + Arrays.toString(ranks));
        StudentRank studentRank = new StudentRank(students, ranks);

        System.out.println("Highest ranking student: " + studentRank.highestRank());
        System.out.println("Lowest ranking student: " + studentRank.lowestRank());






    }
}
