import java.util.Scanner;
public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        int SubNum = sc.nextInt();
        int TotalMarks=0;

        System.out.println("Please enter Marks out of 100.");
        for(int i=1; i<=SubNum; i++)
        {
            System.out.print("Enter marks of subject "+i+" : ");
            int Marks = sc.nextInt();
            TotalMarks= TotalMarks+Marks;
        }

        double AvgPercentage = (double) TotalMarks / SubNum;
        char Grade;

        if(AvgPercentage>=90)
        {
            Grade='O';
        }
        else if(AvgPercentage>=80)
        {
            Grade='A';
        }
        else if(AvgPercentage>=70)
        {
            Grade='B';
        }
        else if(AvgPercentage>=60)
        {
            Grade='C';
        }
        else if(AvgPercentage>=50)
        {
            Grade='D';
        }
        else if(AvgPercentage>=40)
        {
            Grade='E';
        }
        else
        {
            Grade='F';
        }

        System.out.println("Result is :");
        System.out.println("Total Marks : "+TotalMarks);
        System.out.println("Average Percentage : "+AvgPercentage+"%");
        System.out.println("Grade : "+Grade);
        sc.close();
    }
}