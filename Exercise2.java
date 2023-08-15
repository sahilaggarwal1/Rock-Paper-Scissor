package JavaProgram;

import java.util.*;
public class Exercise2 {

	public static void main(String[]args)
	{
		int point = 0;
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
        while(ch=='y')
        {
    		
    		String Comp = new String();
    		String user = new String();
    		for(int i = 0;i<5;i++)
    		{
    			int comp = (int)Math.floor(3*Math.random());
   
    			switch(comp)
    			{
    			case 0 ->Comp = "Scissor";
    			case 1 ->Comp = "Rock";
    			case 2 ->Comp = "Paper";
    			}

   			System.out.print("Choose from Rock Paper Scissor :");
    			user = sc.nextLine();
    			if(user.equals("Rock") || user.equals("Paper")||user.equals("Scissor"))
    			{
    				if(Comp.equalsIgnoreCase(user))
        			{
        				System.out.println("Draw");
        			}
        			else if(Comp.equals("Scissor"))
        			{
        				if(user.equals("Rock"))
        				{
        					System.out.println("Win");
        					point++;
        				}else
        				{
        					System.out.println("Lost");
        				}
        			}
        			else if(Comp.equals("Paper"))
        			{
        				if(user.equals("Scissor"))
        				{
        					System.out.println("Won");
        					point++;
        				}else
        				{
        					System.out.println("Lost");
        				}
        			}
        			else if(Comp.equals("Rock"))
        			{
        				if(user.equals("Paper"))
        				{
        					System.out.println("Won");
        					point++;
        				}else
        				{
        					System.out.println("Lost");
        				}
        				
        			}
    			}
    			else
    			{
    				System.out.println("Your Have Entered Wrong Input. Please Try Again.");
    				i--;
    			}
    			
    		}
    		System.out.println("Your total score out of 5 is :"+ point);
    		System.out.println("Wanna Play Again . Type y for Yes n For No");
    		ch = sc.next().charAt(0);
    		sc.nextLine();
        }
        System.out.print("Thanks for Playing");
 }
}

