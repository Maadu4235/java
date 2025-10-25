import java.util.*;
class guessno
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=1+(int)(100*Math.random()),guess=0;
        System.out.println("Guess a number between 1 to 100:");
        guess=sc.nextInt();
        while(guess!=number)
        {
            if(guess<number)
            {
                System.out.println("Your guess is too low. Try again:");
            }
            else if(guess>number)
            {
                System.out.println("Your guess is too high. Try again:");
            }
            guess=sc.nextInt();
        }
        System.out.println("Congratulations! You guessed the number "+number);
    }
}