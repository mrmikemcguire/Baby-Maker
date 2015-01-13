import java.util.ArrayList;
import java.util.Scanner;

public class BabyMaker
	{
	static String playerName;
	static int parentType;
	static int randomBabyNumber;
	static boolean fertile = true;
	static ArrayList <Person> mothers = new ArrayList <Person>();
	static ArrayList <Person> fathers = new ArrayList <Person>();
	static ArrayList <Person> babies = new ArrayList <Person>();

	public static void main(String[] args)
		{
		Person father = instantiateFather();
		Person mother = instantiateMother();
	    nameParents(father, mother);
		chooseEyes(father, mother);
		chooseHair(father, mother);
		addParents(father, mother);
		while(fertile)
			{
			makeBabies(father, mother);
			displayFamily();
			checkForMoreBabies();
			}
		}
	
	public static Person instantiateFather()
		{
		Person f = new Person("", "", false, "");
		return f;
		}
	
	public static Person instantiateMother()
		{
		Person m = new Person("", "", false, "");
		return m;
		}
	
	public static void nameParents(Person f, Person m)
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
			m.setName(playerName);
			System.out.println("Great!  What is the father's name?");
			f.setName(userInput2.nextLine());
			}
		if (parentType == 2)
			{
			f.setName(playerName);
			System.out.println("Great!  What is the mother's name?");
			m.setName(userInput2.nextLine());
			}
		}
	
	public static void chooseEyes(Person f, Person m)
		{
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("What color are the mother's eyes? (1) blue, (2) green, or (3) brown");
		int motherEyeNumber = userInput3.nextInt();
		System.out.println("What color are the father's eyes? (1) blue, (2) green, or (3) brown");
		int fatherEyeNumber = userInput3.nextInt();
		Scanner userInput4 = new Scanner(System.in);

		if (fatherEyeNumber == 1)
			{
			f.setEyeColor("blue");
			}
		if (fatherEyeNumber == 2)
			{
			f.setEyeColor("green");
			}
		if (fatherEyeNumber == 3)
			{
			f.setEyeColor("brown");
			System.out.println("Is the father eye color (1) homozygous or (2) heterozygous?");
			int fatherHeterozygous = userInput4.nextInt();
			if (fatherHeterozygous == 2)
				{
				f.setHeterozygous(true);
				}
			}
		if (motherEyeNumber == 1)
			{
			m.setEyeColor("blue");
			}
		if (motherEyeNumber == 2)
			{
			m.setEyeColor("green");
			}
		if (motherEyeNumber == 3)
			{
			m.setEyeColor("brown");
			System.out.println("Is the mother eye color (1) homozygous or (2) heterozygous?");
			int motherHeterozygous = userInput4.nextInt();
			if (motherHeterozygous == 2)
				{
				m.setHeterozygous(true);
				}
			}
		}

	public static void chooseHair(Person f, Person m)
		
			{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What color is the mother's hair? (1) black, (2) brown, (3) red, or (4) blonde?");
			int motherHair = userInput3.nextInt();
			System.out.println("What color is the father's hair? (1) black, (2) brown, (3) red, or (4) blonde?");
			int fatherHair = userInput3.nextInt();
			Scanner userInput4 = new Scanner(System.in);

			if (fatherHair == 1)
				{
				f.setHair("black");
				}
			if (fatherHair == 2)
				{
				f.setHair("brown");
				}
			if (fatherHair == 3)
				{
				f.setHair("red");
				}
			if (fatherHair == 4)
				{
				f.setHair("blonde");
				}
			if (motherHair == 1)
				{
				m.setHair("black");
				}
			if (motherHair == 2)
				{
				m.setHair("brown");
				}
			if (motherHair == 3)
				{
				m.setHair("red");
				}
			if (motherHair == 4)
				{
				m.setHair("blonde");
				}
			}
		
	
	public static void displayFamily()
		{
		System.out.println("\t\tThe Family");
		System.out.println();
		System.out.printf("%-10s  %-10s   %-10s", "Name", "Eye Color", "Hair Color");
		System.out.println();
		for (Person p : fathers)
			{
			System.out.printf("%-10s  %-10s   %-10s", p.getName(), 
					p.getEyeColor(), p.getHair());
			}
		System.out.println();
		for (Person p : mothers)
			{
			System.out.printf("%-10s  %-10s   %-10s", p.getName(), 
					p.getEyeColor(), p.getHair());
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
	
	public static void addParents(Person f, Person m)
		{
		mothers.add(m);
		fathers.add(f);
		}
	public static void makeBabies(Person f, Person m) {
	int babyCount = determineNumber();
	for (int i = 0; i < babyCount; i++) {
		makeBaby(f, m);
	}
}

public static void makeBaby(Person f, Person m) {
	Person b = new Person("", "", false, "");
	determineGender(b);
	determineEyeColor(f, m, b);
	determineHair(f, m, b);
	nameBaby(b);
	babies.add(b);
}
	public static int determineNumber()
		{
		randomBabyNumber = (int) (Math.random() * 8000);
		if (randomBabyNumber == 1 )
			{
			System.out.println("Congratulations, you have triplets!");
			return 3;
			}
		else if (randomBabyNumber > 1 &&  randomBabyNumber < 11)
			{
			System.out.println("Congratulations, you have twins!");
			return 2;
			}
		else
			{
			return 1;
			}

		}
	
	public static void determineGender(Person b)
		{
		int randomNumber = (int) (Math.random() * 205);
		if (randomNumber < 107 )
			System.out.println("Congratulations, you have a boy!");

		else
			System.out.println("Congratulations, you have a girl!");
		}
	
	public static void nameBaby(Person b)
		{
		Scanner userInput5 = new Scanner(System.in);
		System.out.println();
		System.out.println("What name do you give your child?");
		b.setName(userInput5.nextLine());
		}
	
	public static void determineEyeColor(Person m, Person f, Person b)
		{
		if (f.isHeterozygous() == true && m.isHeterozygous() == true)
			{
			int randomEye = (int) (Math.random() * 4);
			if (randomEye < 3)
				{
				System.out.println("Your baby has brown eyes.");
				b.setEyeColor("brown");
				}
			else
				{
				int randomBGEye = (int) (Math.random() * 2);
				if (randomBGEye == 1)
					{
					System.out.println("Your baby has blue eyes.");
					b.setEyeColor("blue");
					}
				else
					{
					System.out.println("Your baby has green eyes.");
					b.setEyeColor("green");
					}

				}
			}
		
		else if ((f.isHeterozygous() && m.getEyeColor().equals("blue")) ||
				m.isHeterozygous() && f.getEyeColor().equals("blue"))
			{
			int randomBGEye = (int) (Math.random() * 2);
			if (randomBGEye == 1)
				{
				System.out.println("Your baby has blue eyes.");
				b.setEyeColor("blue");
				}
			else
				{
				System.out.println("Your baby has brown eyes.");
				b.setEyeColor("brown");
				}
			}
		
		else if ((f.isHeterozygous() && m.getEyeColor().equals("green")) ||
				m.isHeterozygous() && f.getEyeColor().equals("green"))
			{
			int randomBGEye = (int) (Math.random() * 2);
			if (randomBGEye == 1)
				{
				System.out.println("Your baby has green eyes.");
				b.setEyeColor("green");
				}
			else
				{
				System.out.println("Your baby has brown eyes.");
				b.setEyeColor("brown");
				}
			}	
		
	
	     else if ((f.getEyeColor().equals("green")) && m.getEyeColor().equals("blue") ||
	  		  f.getEyeColor().equals("blue") && m.getEyeColor().equals("green"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 2);
	  		  if (randomBGEye == 1)
	  			  {
	  			  System.out.println("Your baby has blue eyes.");
	  			  b.setEyeColor("blue");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has green eyes.");
	  			  b.setEyeColor("green");
	  			  }
	  		  }
		    
        else if (f.getEyeColor().equals("green") && m.getEyeColor().equals("green"))
	  		
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 2);
	  		  if (randomBGEye == 1)
	  			  {
	  			  System.out.println("Your baby has green eyes.");
	  			  b.setEyeColor("green");
	  			  }
	  		  }
	  		
	   else if  (f.getEyeColor().equals("blue") && m.getEyeColor().equals("blue"))
	  			  {
	  			  System.out.println("Your baby has blue eyes.");
	  			  b.setEyeColor("blue");
	  			  }
	  		  
		else if ((!f.isHeterozygous() && !m.isHeterozygous()))
			{
			System.out.println("Your baby has brown eyes.");
			b.setEyeColor("brown");
			}
	     }
	
	public static void determineHair(Person m, Person f, Person b)
		{
		if (f.getHair().equals(m.getHair()))
			{
			System.out.println("Your baby has " + m.getHair() + " hair.");
			b.setHair(m.getHair());
			}
		
		else if ((f.getHair().equals("black")) && m.getHair().equals("brown") ||
		  		  f.getHair().equals("brown") && m.getHair().equals("black"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 2)
	  			  {
	  			  System.out.println("Your baby has black hair.");
	  			  b.setHair("black");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has brown hair.");
	  			  b.setHair("brown");
	  			  }
	  		  }
		
	     else if ((f.getHair().equals("black")) && m.getHair().equals("red") ||
		  		  f.getHair().equals("red") && m.getHair().equals("black"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 2)
	  			  {
	  			  System.out.println("Your baby has black hair.");
	  			  b.setHair("black");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has red hair.");
	  			  b.setHair("red");
	  			  }
	  		  }
	     else if ((f.getHair().equals("blonde")) && m.getHair().equals("red") ||
		  		  f.getHair().equals("red") && m.getHair().equals("blonde"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 1)
	  			  {
	  			  System.out.println("Your baby has blonde hair.");
	  			  b.setHair("blonde");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has red hair.");
	  			  b.setHair("red");
	  			  }
	  		  }
	     else if ((f.getHair().equals("brown")) && m.getHair().equals("red") ||
		  		  f.getHair().equals("red") && m.getHair().equals("brown"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 2)
	  			  {
	  			  System.out.println("Your baby has brown hair.");
	  			  b.setHair("brown");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has red hair.");
	  			  b.setHair("red");
	  			  }
	  		  }
	     else if ((f.getHair().equals("blonde")) && m.getHair().equals("black") ||
		  		  f.getHair().equals("black") && m.getHair().equals("blonde"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 1)
	  			  {
	  			  System.out.println("Your baby has blonde hair.");
	  			  b.setHair("blonde");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has black hair.");
	  			  b.setHair("black");
	  			  }
	  		  }
	     else if ((f.getHair().equals("blonde")) && m.getHair().equals("brown") ||
		  		  f.getHair().equals("brown") && m.getHair().equals("blonde"))
	  		  {
	  		  int randomBGEye = (int) (Math.random() * 4);
	  		  if (randomBGEye < 1)
	  			  {
	  			  System.out.println("Your baby has blonde hair.");
	  			  b.setHair("blonde");
	  			  }
	  		  else
	  			  {
	  			  System.out.println("Your baby has brown hair.");
	  			  b.setHair("black");
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
		}
	}
	
	  		   		  
	  		  
	  			  
	  		  
