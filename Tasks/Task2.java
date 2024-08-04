import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("how many subjects:");
	int subjects=sc.nextInt();
	int sum=0;
	double average=0; 
	for(int i=1;i<=subjects;i++)
	{
		System.out.println("marks in the "+i+" subject [out of 100]");
		int subject=sc.nextInt();
		sum=sum+subject;
	    average=sum/subjects;
		
	}
	sc.close();
	
	
	System.out.println("The total marks is : "+sum);
	
	System.out.println("Average percentage is : "+average);
	
	
	if(average>=90)
	{
		System.out.println("Grade is : A+");
	}
	else if(average>=80 && average<90)
	{
		System.out.println("Grade is : A");
	}
	else if(average>=70 && average<80)
	{
		System.out.println("Grade is : B+");
	}
	else if(average>=60 && average<70)
	{
		System.out.println("Grade is : B");
	}
	else if(average>=55 && average<60)
	{
		System.out.println("Grade is : C+");
	}
	else if(average>=50 && average<55)
	{
		System.out.println("Grade is : C");
	}
	else if(average>=45 && average<50)
	{
		System.out.println("Grade is : D+");
	}
	else if(average>=40 && average<45)
	{
		System.out.println("Grade is : D");
	}
	else
	{
		System.out.println("Grade is : Fail");
	}
	
	
	}
	

}