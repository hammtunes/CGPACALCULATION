import java.util.Scanner;
//2021/A/KCS/0563/F
public class CalculatingCGPA
{
  public static void main(String args[])
  {
	  //ALOWING THE USER TO PUT THERE NUMBER OS SUBJECTS
     try (Scanner sc = new Scanner(System.in)) {
    	 System.out.println("KABALE UNIVERSITY JAVA PROGRAM TO CALCULATE CGPA AND ITS PERCENTAGE");
		System.out.println("Enter number of subjects");

		 int n=sc.nextInt();

		 double[] marks=new double[n];
		 //ENTERING NUMBER OF MARKS OBTAINED

		 System.out.println("Enter marks");

		 for(int i=0;i<n;i++)
		 {
		    marks[i]=sc.nextInt();
		 }

		 double grade[]=new double[n];

		 double cgpa,sum=0;

		 for(int i=0;i<n;i++)
		 {
		    grade[i]=(marks[i]/10) ;
		 }

		 for(int i=0;i<n;i++)
		 {
		   sum+=grade[i];
		 }
// CALCULATING THE CCPA AND PERCANTAGE FROM CGPA
		 cgpa=sum/n;

		 System.out.println("cgpa="+cgpa);

		 System.out.println("percantage from cgpa="+cgpa*9.5);
	}

   }
}