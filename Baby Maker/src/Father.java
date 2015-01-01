public class Father
	{
	private static String name;
	private static String eyeColor;
	private static boolean heterozygous = false;
	
	public Father(String n, String e, boolean het)
		{
		name = n;
		eyeColor = e;
		heterozygous = het;
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
	

	}
