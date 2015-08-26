import java.util.Scanner;
public class modulusProject
	{

		public static void main(String[] args)
			{
				Scanner userImput= new Scanner(System.in);
				System.out.println("Dear user how many questions do you want to answer between 1-10?");
				int numberOfQuestions = userImput.nextInt();
				if (numberofQuestions==1)
					{
						System.out.println("1. what is "+(((int)(Math.random()*10)+5)%((int)(Math.random()*5)))+"?");					
					}
				
			}

	}