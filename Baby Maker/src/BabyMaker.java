import java.util.Scanner;

public class BabyMaker
	{
	static String playerName;
	static int parentType;
	static String fatherName;
	static String motherName;
	static int motherEyeNumber;
	static int fatherEyeNumber;
	static String motherEyeColor;
	static String fatherEyeColor;
	static int motherHeterozygous;
	static int fatherHeterozygous;
	
	public static void main(String[] args)
		{
		nameParents();
		checkEyes();
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
			System.out.println("Great!  What is the father's name?");
			fatherName = userInput2.nextLine();
			motherName = playerName;
			}
		if (parentType == 2)
			{
			System.out.println("Great!  What is the mother's name?");
			motherName = userInput2.nextLine();
			fatherName = playerName;
			}
		System.out.println("So, the father's name is " + fatherName + " and the mother's name is " +
			motherName + ".");
		}
	public static void checkEyes()
		{
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("What color are the mother's eyes? (1) blue, (2) green, or (3) brown");
		motherEyeNumber = userInput3.nextInt();
		System.out.println("What color are the father's eyes? (1) blue, (2) green, or (3) brown");
		fatherEyeNumber = userInput3.nextInt();
		Scanner userInput4 = new Scanner(System.in);

		if (fatherEyeNumber == 1)
			{
			fatherEyeColor = "blue";
			}
		if (fatherEyeNumber == 2)
			{
			fatherEyeColor = "green";
			}
		if (fatherEyeNumber == 3)
			{
			fatherEyeColor = "brown";
			System.out.println("Is the father eye color (1) homozygous or (2) heterozygous?");
			fatherHeterozygous = userInput4.nextInt();
			}
		if (motherEyeNumber == 1)
			{
			motherEyeColor = "blue";
			}
		if (motherEyeNumber == 2)
			{
			motherEyeColor = "green";
			}
		if (motherEyeNumber == 3)
			{
			motherEyeColor = "brown";
			System.out.println("Is the mother eye color (1) homozygous or (2) heterozygous?");
			motherHeterozygous = userInput4.nextInt();
			}
		
		System.out.println("So, the father has " + fatherEyeColor + " eyes, and the mother has " +
				motherEyeColor + " eyes.");
		}
	}

