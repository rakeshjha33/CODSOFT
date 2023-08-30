import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        double maths, sanskrit, physics, history;
        System.out.println("This project is coded by Rakesh Jha");
        System.out.println("Maths(Max.Marks) = 100");
        System.out.println("Sanskrit(Max.Marks) =100");
        System.out.println("Physics(Max.Marks) = 100");
        System.out.println("History(Max.Marks) = 100");
        Scanner sc = new Scanner(System.in);
        int exit;

        do {
        String name;
        System.out.println("Enter Student Name");
        name = sc.next();
        System.out.println("Student Name=" + name);
        System.out.println("Marks Obtained in Maths");
        double m = sc.nextDouble();
        System.out.println("Marks Obtained in Sanskrit");
        double skt = sc.nextDouble();
        System.out.println("Marks Obtained in Physics");
        double phy = sc.nextDouble();
        System.out.println("Marks Obtained in History");
        double his = sc.nextDouble();
        System.out.println("Maths(marks)=" + m);
        System.out.println("Sanskrit(marks)=" + skt);
        System.out.println("Physics(marks)=" + phy);
        System.out.println("History(marks)=" + his);
        double TotalMarks = (m + skt + phy + his);
        System.out.println("Total Marks Obtained=" + TotalMarks);
        double avgPercentage = (TotalMarks / 4);
        System.out.println(" Average Percentage =" + avgPercentage + "%");
        if ((avgPercentage > 89) && (avgPercentage < 101))
            System.out.println("Grade=A");
        else if ((avgPercentage > 79) && (avgPercentage < 90))
            System.out.println("Grade=B");
        else if ((avgPercentage > 59) && (avgPercentage < 80))
            System.out.println("Grade=C");
        else { System.out.println("Grade=Pass"); }
         System.out.println("Enter 0 to exit or any other number to calculate grades of another student");
            exit=sc.nextInt();
        } while(exit!=0);
    }
}
