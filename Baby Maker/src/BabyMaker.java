import java.util.ArrayList;
import java.util.Scanner;

public class BabyMaker
	{
	static String playerName, babyEyes, babyHair, babyName;
	static int parentType;
	static int randomBabyNumber;
	static boolean fertile = true;
	static ArrayList <Mother> mothers = new ArrayList <Mother>();
	static ArrayList <Father> fathers = new ArrayList <Father>();
	static ArrayList <Baby> babies = new ArrayList <Baby>();


	public static void main(String[] args)
		{
	    nameParents();
		chooseEyes();
		chooseHair();
		addParents();
		while(fertile)
			{
			determineNumber();
			nameBaby();
			displayFamily();
			checkForMoreBabies();
			}
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
		}

	public static void chooseHair()
		
			{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What color is the mother's hair? (1) black, (2) brown, (3) red, or (4) blonde?");
			int motherHair = userInput3.nextInt();
			System.out.println("What color is the father's hair? (1) black, (2) brown, (3) red, or (4) blonde?");
			int fatherHair = userInput3.nextInt();
			Scanner userInput4 = new Scanner(System.in);

			if (fatherHair == 1)
				{
				Father.setHair("black");
				}
			if (fatherHair == 2)
				{
				Father.setHair("brown");
				}
			if (fatherHair == 3)
				{
				Father.setHair("red");
				}
			if (fatherHair == 4)
				{
				Father.setHair("blonde");
				}
			if (motherHair == 1)
				{
				Mother.setHair("black");
				}
			if (motherHair == 2)
				{
				Mother.setHair("brown");
				}
			if (motherHair == 3)
				{
				Mother.setHair("red");
				}
			if (motherHair == 4)
				{
				Mother.setHair("blonde");
				}
			}
		
	
	public static void displayFamily()
		{
		System.out.println("\t\tThe Family");
		System.out.println();
		System.out.printf("%-10s  %-10s   %-10s", "Name", "Eye Color", "Hair Color");
		System.out.println();
		for (Father fred : fathers)
			{
			System.out.printf("%-10s  %-10s   %-10s", Father.getName(), 
					Father.getEyeColor(), Father.getHair());
			}
		System.out.println();
		for (Mother wilma : mothers)
			{
			System.out.printf("%-10s  %-10s   %-10s", Mother.getName(), 
					Mother.getEyeColor(), Mother.getHair());
			System.out.println();
			}
		System.out.println();
		for (int i = 0; i < babies.size(); i++)
			{
			System.out.printf("%-10s  %-10s   %-10s", babies.get(i).getName(), 
					babies.get(i).getEyeColor(), babies.get(i).getHair());
			System.out.println();
			}
		}
	
	public static void addParents()
		{
		mothers.add(new Mother(Mother.getName(), Mother.getEyeColor(), Mother.isHeterozygous(), Mother.getHair()));
		fathers.add(new Father(Father.getName(), Father.getEyeColor(), Father.isHeterozygous(), Father.getHair()));
		}
		
	public static int determineNumber()
		{
		randomBabyNumber = (int) (Math.random() * 8000);
		if (randomBabyNumber == 1 )
			{
			System.out.println("Congratulations, you have triplets!");
			determineGender();
			determineEyeColor();
			determineHair();
			determineGender();
			determineEyeColor();
			determineHair();
			determineGender();
			determineEyeColor();
			determineHair();
			}
		else if (randomBabyNumber > 1 &&  randomBabyNumber < 11)
			{
			System.out.println("Congratulations, you have twins!");
			determineGender();
			determineEyeColor();
			determineHair();
			determineGender();
			determineEyeColor();
			determineHair();
			}
		else
			{
			determineGender();
			determineEyeColor();
			determineHair();
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
	
	public static void nameBaby()
		{
		Scanner userInput5 = new Scanner(System.in);
		System.out.println();
		System.out.println("What name do you give your child?");
		babyName = userInput5.nextLine();
		//Baby.setName(babyName);
		babies.add(new Baby(babyName, babyEyes, babyHair));
		}
	
	public static void determineEyeColor()
		{
		if (Father.isHeterozygous() == true && Mother.isHeterozygous() == true)
			{
			int randomEye = (int) (Math.random() * 4);
			if (randomEye < 3)
				{
				System.out.println("Your baby has brown eyes.");
				babyEyes = "brown";
				//Baby.setEyeColor("brown");
				}
			else
				{
				int randomBGEye = (int) (Math.random() * 2);
				if (randomBGEye == 1)
					{
					System.out.println("Your baby has blue eyes.");
					babyEyes = "blue";
					//Baby.setEyeColor("blue");
					}
				else
					{
					System.out.println("Your baby has green eyes.");
					babyEyes = "green";
					//Baby.setEyeColor("green");
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
				babyEyes = "blue";
				//Baby.setEyeColor("blue");
				}
			else
				{
				System.out.println("Your baby has brown eyes.");
				babyEyes = "brown";
				//Baby.setEyeColor("brown");
				}
			}
		
		else if ((Father.isHeterozygous() && Mother.getEyeColor().equals("green")) ||
				Mother.isHeterozygous() && Father.getEyeColor().equals("green"))
			{
			int randomBGEye = (int) (Math.random() * 2);
			if (randomBGEye == 1)
				{
				System.out.println("Your baby has green eyes.");
				babyEyes = "green";
				//Baby.setEyeColor("green");
				}
			else
				{
				System.out.println("Your baby has brown eyes.");
				babyEyes = "brown";
				//Baby.setEyeColor("brown");
				}
			}	
		
	
	     else if ((Father.getEyeColor().equals("green")) && Mother.getEyeColor().equals("blue") ||
	  		  Father.getEyeColor().equals("blue") && Mother.getEyeColor().equals("green"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 2);
	  		  if (randomBGEye == 1)
	  			  {
	  			  System.out.println("Your baby has blue eyes.");
	  			  babyEyes = "blue";
	  			  //Baby.setEyeColor("blue");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has green eyes.");
	  			  babyEyes = "green";
	  			  //Baby.setEyeColor("green");
	  			  }
	  		  }
		    
        else if (Father.getEyeColor().equals("green") && Mother.getEyeColor().equals("green"))
	  		
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 2);
	  		  if (randomBGEye == 1)
	  			  {
	  			  System.out.println("Your baby has green eyes.");
	  			  babyEyes = "green";
	  			  //Baby.setEyeColor("green");
	  			  }
	  		  }
	  		
	   else if  (Father.getEyeColor().equals("blue") && Mother.getEyeColor().equals("blue"))
	  			  {
	  			  System.out.println("Your baby has blue eyes.");
	  			  babyEyes = "blue";
	  			  //Baby.setEyeColor("blue");
	  			  }
	  		  
		else if ((!Father.isHeterozygous() && !Mother.isHeterozygous()))
			{
			System.out.println("Your baby has brown eyes.");
			babyEyes = "brown";
			//Baby.setEyeColor("brown");
			}
	     }
	
	public static void determineHair()
		{
		if (Father.getHair().equals(Mother.getHair()))
			{
			System.out.println("Your baby has " + Mother.getHair() + " hair.");
			babyHair = Mother.getHair();
			//Baby.setHair(Mother.getHair());
			}
		
		else if ((Father.getHair().equals("black")) && Mother.getHair().equals("brown") ||
		  		  Father.getHair().equals("brown") && Mother.getHair().equals("black"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 2)
	  			  {
	  			  System.out.println("Your baby has black hair.");
	  			  babyHair = "black";
	  			  //Baby.setHair("black");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has brown hair.");
	  			  babyHair = "brown";
	  			  //Baby.setHair("brown");
	  			  }
	  		  }
		
	     else if ((Father.getHair().equals("black")) && Mother.getHair().equals("red") ||
		  		  Father.getHair().equals("red") && Mother.getHair().equals("black"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 2)
	  			  {
	  			  System.out.println("Your baby has black hair.");
	  			  babyHair = "black";
	  			  //Baby.setHair("black");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has red hair.");
	  			  babyHair = "red";
	  			  //Baby.setHair("red");
	  			  }
	  		  }
	     else if ((Father.getHair().equals("blonde")) && Mother.getHair().equals("red") ||
		  		  Father.getHair().equals("red") && Mother.getHair().equals("blonde"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 1)
	  			  {
	  			  System.out.println("Your baby has blonde hair.");
	  			  babyHair = "blonde";
	  			  //Baby.setHair("blonde");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has red hair.");
	  			  babyHair = "red";
	  			  //Baby.setHair("red");
	  			  }
	  		  }
	     else if ((Father.getHair().equals("brown")) && Mother.getHair().equals("red") ||
		  		  Father.getHair().equals("red") && Mother.getHair().equals("brown"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 2)
	  			  {
	  			  System.out.println("Your baby has brown hair.");
	  			  babyHair = "brown";
	  			  //Baby.setHair("brown");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has red hair.");
	  			  babyHair = "red";
	  			  //Baby.setHair("red");
	  			  }
	  		  }
	     else if ((Father.getHair().equals("blonde")) && Mother.getHair().equals("black") ||
		  		  Father.getHair().equals("black") && Mother.getHair().equals("blonde"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 1)
	  			  {
	  			  System.out.println("Your baby has blonde hair.");
	  			  babyHair = "blonde";
	  			  //Baby.setHair("blonde");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has black hair.");
	  			  babyHair = "black";
	  			  //Baby.setHair("black");
	  			  }
	  		  }
	     else if ((Father.getHair().equals("blonde")) && Mother.getHair().equals("brown") ||
		  		  Father.getHair().equals("brown") && Mother.getHair().equals("blonde"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 1)
	  			  {
	  			  System.out.println("Your baby has blonde hair.");
	  			  babyHair = "blonde";
	  			  //Baby.setHair("blonde");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has brown hair.");
	  			  babyHair = "black";
	  			  //Baby.setHair("black");
	  			  }
	  		  }
		}
	
	public static void checkForMoreBabies()
		{
		Scanner userInput6 = new Scanner(System.in);
		System.out.println();
		System.out.println("Would you like to have more children? (1) yes, or (2) no?");
		int choice = userInput6.nextInt();
		if (choice == 2)
			{
			fertile = false;
			System.out.println("Great.  Enjoy your family!");
			}
//		else
//			{
//			babies.add(new Baby(Baby.getName(), Baby.getEyeColor(), Baby.getHair()));
//			}
		}
	}
	
	  		   		  
	  		  
	  			  
	  		  
