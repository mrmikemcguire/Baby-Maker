public class Baby
	{
	private String name;
	private String eyeColor;
	//private static boolean heterozygous = false;
	private String hair;
	
	public Baby(String n, String e, String h)
		{
		name = n;
		eyeColor = e;
		//heterozygous = het;
		hair = h;
		}

	public String getName()
		{
		return name;
		}

	public String getEyeColor()
		{
		return eyeColor;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public void setEyeColor(String eyeColor)
		{
		this.eyeColor = eyeColor;
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

	public String getHair()
		{
		return hair;
		}

	public void setHair(String hair)
		{
		this.hair = hair;
		}
	}