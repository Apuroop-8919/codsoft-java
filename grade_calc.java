import java.util.Scanner;
public class grade_calc
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("---Welcome to STUDENT GRADE CALCULATOR---");
        System.out.println("Enter the total number of subjects: ");
        int n=sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of the subject: ");
            String str=sc.next();
            System.out.println("Enter "+str+"'s marks: ");
            int mark=sc.nextInt();
            total=total+mark;
        }
        int per=total/n;
        char grade;
        if(per>=90)
        {
            grade='O';
        }
        else if(per>=80 && per<90)
        {
            grade='A';
        }
        else if(per>=65 && per<80)
        {
            grade='B';
        }
        else if(per>=50 && per<65)
        {
            grade='C';
        }
        else if(per>=35 && per<50)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }
        System.out.println("Total marks: "+total);
        System.out.println("Percentage: "+per);
        System.out.println("Grade achieved: "+grade);
    }
}
