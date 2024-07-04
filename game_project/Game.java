package game_project;
import java.util.*;
public class Game {
	
	public  Weapon  pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Score: ");
		int score=sc.nextInt();
		if(score<=400)
		{
			System.out.println("You got the Knife");
			Knife k=new Knife();
			return k;
		}
		else if(score<=800)
		{
			System.out.println("Press 1 for Knife and 2 for Gun");
			int x=sc.nextInt();
			switch(x)
			{
			case 1: 
				System.out.println("You have selected for Knife");
				Knife k=new Knife();
				return k;
			case 2: 
				System.out.println("You have selected for Gun");
				Gun g=new Gun();
				return g;
			default :
				System.out.println("Please press a valid Input");
				return null;
			}
			
		}
		else
		{
			System.out.println("You got the Bomb");
			Bomb b=new Bomb();
			return b;
		}
	}

}




