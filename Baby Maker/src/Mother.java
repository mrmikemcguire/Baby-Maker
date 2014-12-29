public class Mother
	{
	private static String name;
	private static String eyeColor;
	private static boolean heterozygous = true;
	
	public Mother(String n, String e, boolean het)
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
		Mother.name = name;
		}

	public static void setEyeColor(String eyeColor)
		{
		Mother.eyeColor = eyeColor;
		}

	public static boolean isHeterozygous()
		{
		return heterozygous;
		}

	public static void setHeterozygous(boolean heterozygous)
		{
		Mother.heterozygous = heterozygous;
		}
	
	}