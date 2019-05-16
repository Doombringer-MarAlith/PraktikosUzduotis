public class Cow
{
	public Cow() { }

	public Cow produceNewCow()
	{
		return new Cow();
	}

	public int getAge()
	{
		return age;
	}

	public void increaseAge()
	{
		age++;
	}

	private int age = 0;
}