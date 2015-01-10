public class Person
	{
	private String name;
	private String eyeColor;
	private boolean heterozygous = false;
	private String hair;
	
	public Person(String n, String e, boolean het, String h)
		{
		name = n;
		eyeColor = e;
		heterozygous = het;
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

	public boolean isHeterozygous()
		{
		return heterozygous;
		}

	public void setHeterozygous(boolean heterozygous)
		{
		this.heterozygous = heterozygous;
		}

	public String getHair()
		{
		return hair;
		}

	public void setHair(String hair)
		{
		this.hair = hair;
		}
	}
