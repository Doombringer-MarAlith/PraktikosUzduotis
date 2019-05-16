import java.util.ArrayList;

public class CowCounter
{
	public CowCounter() { }

	public int countCows(int n)
	{
		ArrayList<Cow> listOfCows = new ArrayList<Cow>();
		Cow firstCow = new Cow(); // Initial cow
		listOfCows.add(firstCow);

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < listOfCows.size(); j++)
				listOfCows.get(j).increaseAge();

			for (int o = 0; o < listOfCows.size(); o++)
			{
				if (listOfCows.get(o).getAge() >= 3)
					listOfCows.add(listOfCows.get(o).produceNewCow());
			}
		}

		return listOfCows.size();
	}
}