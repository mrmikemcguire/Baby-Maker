public class Baby
	{
	private static String name;
	private static String eyeColor;
	//private static boolean heterozygous = false;
	private static String hair;
	
	public Baby(String n, String e, String h)
		{
		name = n;
		eyeColor = e;
		//heterozygous = het;
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
		Baby.name = name;
		}

	public static void setEyeColor(String eyeColor)
		{
		Baby.eyeColor = eyeColor;
		}

//	public static boolean isHeterozygous()
//		{
//		return heterozygous;
//		}
//
//	public static void setHeterozygous(boolean heterozygous)
//		{
//		Baby.heterozygous = heterozygous;
//		}

	public static String getHair()
		{
		return hair;
		}

	public static void setHair(String hair)
		{
		Baby.hair = hair;
		}
	}