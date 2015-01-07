public class Father
	{
	private static String name;
	private static String eyeColor;
	private static boolean heterozygous = false;
	private static String hair;
	
	public Father(String n, String e, boolean het, String h)
		{
		name = n;
		eyeColor = e;
		heterozygous = het;
		hair = h;
		}

	public static String getName()
		{
		return name;
		}

	public static String getEyeColor()
		{
		return eyeColor;
		}

	public static void setName(String name)
		{
		Father.name = name;
		}

	public static void setEyeColor(String eyeColor)
		{
		Father.eyeColor = eyeColor;
		}

	public static boolean isHeterozygous()
		{
		return heterozygous;
		}

	public static void setHeterozygous(boolean heterozygous)
		{
		Father.heterozygous = heterozygous;
		}

	public static String getHair()
		{
		return hair;
		}

	public static void setHair(String hair)
		{
		Father.hair = hair;
		}
	}
