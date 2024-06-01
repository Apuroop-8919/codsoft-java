import java.util.Scanner;
public class num_game
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game.");
        int k=1,round=0,score=0;
        while(k==1)
        {
            int number=1+(int)(100* Math.random());
            int ch=5;
            System.out.println("You have to guess the number chosen by the computer in 5 attempts...");
            System.out.println("The number is chosen between 1 to 100.");
            int i, guess;
            for(i=0;i<ch;i++)
            {
                System.out.println("Guess the number: ");
                guess=sc.nextInt();
                if(number==guess)
                {
                    System.out.println("Congratulations!!You have guessed the number.");
                    round+=1;
                    score+=i;
                    break;
                }
                else if(number>guess && i!=ch-1)
                {
                    System.out.println("The number is greater than "+guess);
                }
                else if(number<guess && i!=ch-1)
                {
                    System.out.println("The number is less than "+guess);
                }
            }
            if(i==ch)
            {
                System.out.println("You have exhausted all the 5 attempts.");
                System.out.println("The number was "+number);
            }
            System.out.println("Do you want to play one more round? If yes, press 1...if no, press any other number...");
            k=sc.nextInt();
        }
        System.out.println("Rounds won: "+round);
        System.out.println("You scored "+score+" points.");
        System.out.println("Thanks for playing...");
    }
}
