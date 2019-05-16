import java.util.ArrayList;
import java.io.IOException;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> collectionOfResults = new ArrayList<String>(10); // Allocate array size for 10 matches
		collectionOfResults.add("3:1");
		collectionOfResults.add("2:2");
		collectionOfResults.add("0:1");
		collectionOfResults.add("0:0");
		collectionOfResults.add("0:4");
		collectionOfResults.add("2:3");
		collectionOfResults.add("3:0");
		collectionOfResults.add("0:0");
		collectionOfResults.add("1:1");
		collectionOfResults.add("4:2");

		System.out.println(countResult(collectionOfResults));
	}

	public static int countResult(ArrayList<String> collectionOfResults)
	{
		int totalScore = 0;
		int xScore = 0;
		int yScore = 0;

		for (int i = 0; i < collectionOfResults.size(); i++)
		{
			try
			{
				xScore = Integer.parseInt(collectionOfResults.get(i).substring(0, 1));
				yScore = Integer.parseInt(collectionOfResults.get(i).substring(2));

				if (xScore > yScore)
					totalScore += 3;
				else if (xScore == yScore)
					totalScore++;
			}
			catch (NumberFormatException ex)
			{
				System.out.println(ex);
			}
			catch (IndexOutOfBoundsException ex)
			{
				System.out.println(ex);
			}
		}

		return totalScore;
	}
}