package core_javaPractice;
import java.util.Scanner;
public class New {
	public static void main(String args[]){
		float p,q,result;
		int choice;
		Scanner S =new Scanner(System.in);
		System.out.println("Simple calculator");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplcation");
		System.out.println("Enter Your choice(1-4):");
		choice=S.nextInt();
		if(choice>=1&& choice<=4)
		{
			System.out.println("Enter the any Two Number:");
			p=S.nextFloat();
			q=S.nextFloat();
			if(choice==1)
				result=p+q;
			else if(choice==2)
				result=p-q;
			else if(choice==3)
				result=p/q;
			else
				result=p*q;
			System.out.println("\n Result is = "+result);
		}
		else
			System.out.println("\n Invalid Choice..!");	
		
	}

}
