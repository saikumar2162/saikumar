import java.util.Scanner;
public class ExamPassCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[3];
        System.out.println("Enter marks of 3 students (in the range from 0 to 100):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        int passCount = 0;
        for (int i = 0; i < 3; i++) {
            if (marks[i] >= 35) {
                passCount++;
            }
        }
        System.out.println("Number of students who passed: " + passCount);
        scanner.close();
    }
}
