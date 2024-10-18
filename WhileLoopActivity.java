
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int n = Scan.nextInt();
        int highest = 0;
        int lowest = 100;
        int TotalGrades = 0;
        int passedCount = 0;
        int failedCount = 0;
        int i = 0;
        int grades = 0;

        while (i < n) {
            System.out.println("Input grade of students (0 to 100): ");
            grades = Scan.nextInt();

            if (grades > 0 && grades <= 100) {
                TotalGrades += grades;

                if (grades > highest) {
                    highest = grades;
                }
                if (grades < lowest) {
                    lowest = grades;
                }
                if (grades < 75) {
                    failedCount++;
                }
                if (grades > 75) {
                    passedCount++;
                }
                i++;
            } else {
                System.out.println("The range is from 0 to 100! ");
            }
        }
        double Average = TotalGrades / n;
        System.out.println("The average grade of the class is: "+ (Average));
        System.out.println("The highest grade is: " + (highest));
        System.out.println("The lowest grade is: " + (lowest));
        System.out.println("The number of passing students is: "+ (passedCount));
        System.out.println("The number of failing students is: "+ failedCount);


    }
}