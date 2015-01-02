import java.util.ArrayList;
import java.util.Scanner;

public class BabyMaker
	{
	static String playerName;
	static int parentType;
	static int randomBabyNumber;
	static ArrayList <Mother> mothers = new ArrayList <Mother>();
	static ArrayList <Father> fathers = new ArrayList <Father>();

	public static void main(String[] args)
		{
		nameParents();
		chooseEyes();
		addParents();
		//displayParents();
		determineNumber();
		}
	
	public static void nameParents()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hi, what is your name?");
		playerName = userInput.nextLine();
		System.out.println("Hi, " + playerName + "!");
		System.out.println("Are you the (1) mother or (2) father?");
		parentType = userInput.nextInt();
		Scanner userInput2 = new Scanner(System.in);
		if (parentType == 1)
			{
			Mother.setName(playerName);
			System.out.println("Great!  What is the father's name?");
			Father.setName(userInput2.nextLine());
			}
		if (parentType == 2)
			{
			Father.setName(playerName);
			System.out.println("Great!  What is the mother's name?");
			Mother.setName(userInput2.nextLine());
			}
		}
	
	public static void chooseEyes()
		{
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("What color are the mother's eyes? (1) blue, (2) green, or (3) brown");
		int motherEyeNumber = userInput3.nextInt();
		System.out.println("What color are the father's eyes? (1) blue, (2) green, or (3) brown");
		int fatherEyeNumber = userInput3.nextInt();
		Scanner userInput4 = new Scanner(System.in);

		if (fatherEyeNumber == 1)
			{
			Father.setEyeColor("blue");
			}
		if (fatherEyeNumber == 2)
			{
			Father.setEyeColor("green");
			}
		if (fatherEyeNumber == 3)
			{
			Father.setEyeColor("brown");
			System.out.println("Is the father eye color (1) homozygous or (2) heterozygous?");
			int fatherHeterozygous = userInput4.nextInt();
			if (fatherHeterozygous == 2)
				{
				Father.setHeterozygous(true);
				}
			}
		if (motherEyeNumber == 1)
			{
			Mother.setEyeColor("blue");
			}
		if (motherEyeNumber == 2)
			{
			Mother.setEyeColor("green");
			}
		if (motherEyeNumber == 3)
			{
			Mother.setEyeColor("brown");
			System.out.println("Is the mother eye color (1) homozygous or (2) heterozygous?");
			int motherHeterozygous = userInput4.nextInt();
			if (motherHeterozygous == 2)
				{
				Mother.setHeterozygous(true);
				}
			}
		
		System.out.println("So, " + Father.getName() + " the father has " + Father.getEyeColor() +
				" eyes, and " + Mother.getName() + " the mother has " +
				Mother.getEyeColor() + " eyes.");
		System.out.println();
		}
	
	public static void displayParents()
		{
		System.out.println("\t\tFather");
		System.out.println();
		System.out.printf("%-10s  %-10s   %-10s", "Name", "Eye Color", "Heterozygous");
		System.out.println();
		for (Father fred : fathers)
			{
			System.out.printf("%-10s  %-10s   %-10s", Father.getName(), 
					Father.getEyeColor(), Father.isHeterozygous());
			System.out.println();
			}
		System.out.println();
		System.out.println("\t\tMother");
		System.out.println();
		System.out.printf("%-10s  %-10s   %-10s", "Name", "Eye Color", "Heterozygous");
		System.out.println();
		for (Mother wilma : mothers)
			{
			System.out.printf("%-10s  %-10s   %-10s", Mother.getName(), 
					Mother.getEyeColor(), Mother.isHeterozygous());
			System.out.println();
			}
		}
	
	public static void addParents()
		{
		mothers.add(new Mother(Mother.getName(), Mother.getEyeColor(), Mother.isHeterozygous()));
		fathers.add(new Father(Father.getName(), Father.getEyeColor(), Father.isHeterozygous()));
		}
		
	public static int determineNumber()
		{
		randomBabyNumber = (int) (Math.random() * 8000);
		if (randomBabyNumber == 1 )
			{
			System.out.println("Congratulations, you have triplets!");
			determineGender();
			determineEyeColor();
			determineGender();
			determineEyeColor();
			determineGender();
			determineEyeColor();
			}
		else if (randomBabyNumber > 1 &&  randomBabyNumber < 11)
			{
			System.out.println("Congratulations, you have twins!");
			determineGender();
			determineEyeColor();
			determineGender();
			determineEyeColor();
			}
		else
			{
			System.out.println("Congratulations, you are having a baby!");
			determineGender();
			determineEyeColor();
			}
		return randomBabyNumber;
		}
	
	public static void determineGender()
		{
		int randomNumber = (int) (Math.random() * 205);
		if (randomNumber < 107 )
			System.out.println("Congratulations, you have a boy!");

		else
			System.out.println("Congratulations, you have a girl!");
		}
	
	public static void determineEyeColor()
		{
		if (Father.isHeterozygous() == true && Mother.isHeterozygous() == true)
			{
			int randomEye = (int) (Math.random() * 4);
			if (randomEye < 3)
				{
				System.out.println("Your baby has brown eyes.");
				}
			else
				{
				int randomBGEye = (int) (Math.random() * 2);
				if (randomBGEye == 1)
					{
					System.out.println("Your baby has blue eyes.");
					}
				else
					{
					System.out.println("Your baby has green eyes.");
					}

				}
			}
		
		else if ((Father.isHeterozygous() && Mother.getEyeColor().equals("blue")) ||
				Mother.isHeterozygous() && Father.getEyeColor().equals("blue"))
			{
			int randomBGEye = (int) (Math.random() * 2);
			if (randomBGEye == 1)
				{
				System.out.println("Your baby has blue eyes.");
				}
			else
				{
				System.out.println("Your baby has brown eyes.");
				}
			}
		
		else if ((Father.isHeterozygous() && Mother.getEyeColor().equals("green")) ||
				Mother.isHeterozygous() && Father.getEyeColor().equals("green"))
			{
			int randomBGEye = (int) (Math.random() * 2);
			if (randomBGEye == 1)
				{
				System.out.println("Your baby has green eyes.");
				}
			else
				{
				System.out.println("Your baby has brown eyes.");
				}
			}	
		
	
	     else if ((Father.getEyeColor().equals("green")) && Mother.getEyeColor().equals("blue") ||
	  		  Father.getEyeColor().equals("blue") && Mother.getEyeColor().equals("green"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 2);
	  		  if (randomBGEye == 1)
	  			  {
	  			  System.out.println("Your baby has blue eyes.");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has green eyes.");
	  			  }
	  		  }
		    
        else if (Father.getEyeColor().equals("green") && Mother.getEyeColor().equals("green"))
	  		
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 2);
	  		  if (randomBGEye == 1)
	  			  {
	  			  System.out.println("Your baby has green eyes.");
	  			  }
	  		  }
	  		
	   else if  (Father.getEyeColor().equals("blue") && Mother.getEyeColor().equals("blue"))
	  			  {
	  			  System.out.println("Your baby has blue eyes.");
	  			  }
	  		  
		else if ((!Father.isHeterozygous() && !Mother.isHeterozygous()))
			{
			System.out.println("Your baby has brown eyes. XXX");
			}
	     }
	}
	  		   		  
	  		  
	  			  
	  		  
