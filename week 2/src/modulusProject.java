import java.util.Scanner;

public class modulusProject
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args) 
			{
				System.out.print("How many questions would you like to do? ");
				int numberOfQuestions = userInput.nextInt();
				int questions = ((int)(Math.random() * (numberOfQuestions - 1)));
				int correct = 0;
				
				for (int i = 0 ; i < numberOfQuestions; i++)
					{
						int a = ((int)(Math.random() * 20));
						int b = ((int)(Math.random() * 10) + 1);
					
						if (i == questions)
							{
								int answer = a%b;
								
								System.out.print(a + " % " + b + " =");
								int guess = userInput.nextInt();
								
								if (guess == answer)
									{
										System.out.println("Nice");
										correct++;
									}
								else
									{
										System.out.println("Nope, wrong, The Correct Answer is: " + answer);
									}	
							}
						else if ((i + 1) == questions)
							{
								int answer = a % a;
								
								System.out.print(a + " % " + a + " =");
								int guess = userInput.nextInt();
								
								if(guess == answer)
									{
										System.out.println("Nice");
										correct++;
									}	
								else
									{
										System.out.println("Nope, wrong, The Correct Answer is: " + answer);
									}
							}
						else
							{
								int answer = b % a;
								
								System.out.print(b + " % " + a + " =");
								int guess = userInput.nextInt();
								
								if(guess == answer)
									{
										System.out.println("Nice");
										correct++;
									}	
								else
									{
										System.out.println("Nope, wrong, The Correct Answer is: " + answer);
									}
							}
					}
				System.out.println("You got " + correct + " out of " + numberOfQuestions + " correct");
			}
}