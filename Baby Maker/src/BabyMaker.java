import java.util.ArrayList;
import java.util.Scanner;

public class BabyMaker
	{
	static String playerName;
	static int parentType;
	static ArrayList <Mother> mothers = new ArrayList <Mother>();
	static ArrayList <Father> fathers = new ArrayList <Father>();

	
	public static void main(String[] args)
		{
		nameParents();
		setEyes();
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
	
	public static void setEyes()
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
			if (fatherHeterozygous == 1)
				{
				Father.setHeterozygous(false);
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
			if (motherHeterozygous == 1)
				{
				Mother.setHeterozygous(false);
				}
			}
		
		System.out.println("So, " + Father.getName() + " the father has " + Father.getEyeColor() +
				" eyes, and " + Mother.getName() + " the mother has " +
				Mother.getEyeColor() + " eyes.");
		}
	
	public static void displayParents()
		{
		System.out.println("Fathers");
		System.out.println("Name");
		}
	}

