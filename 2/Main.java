import java.util.TreeMap;
import java.util.Map;

public class Main
{
	public static void main(String[] args)
	{
		String[] arr = {"XOOO", "XOXO", "XOXO", "OOXX", "OOOO"};
		System.out.println(landPerimeter(arr));
	}

	public static String landPerimeter(String[] arr)
	{
		Map<Integer, String> map = new TreeMap<Integer, String>();
		int rowCount = arr.length;
		int totalPerimeter = 0;
		try
		{
			int rowLength = arr[0].length();
	
			for (int i = 0; i < rowCount; i++)
			{
				char[] charArr = arr[i].toCharArray();
				for (int o = 0; o < rowLength; o++)
					if (charArr[o] == 'X')
						map.put(o + i * rowLength, "X");
			}
	
			for (int i = 0; i < rowLength * rowCount; i++)
			{
				if (map.get(i) != null)
				{
						if (map.get(i + 1) == null && map.get(i - 1) == null)
							totalPerimeter += 2;
						else if (map.get(i + 1) == null && map.get(i - 1) != null)
							totalPerimeter++;
						else if (map.get(i + 1) != null && map.get(i - 1) == null)
							totalPerimeter++;
						
						if (map.get(i - rowLength) == null && map.get(i + rowLength) == null)
							totalPerimeter += 2;
						else if (map.get(i - rowLength) == null && map.get(i + rowLength) != null)
							totalPerimeter++;
						else if (map.get(i - rowLength) != null && map.get(i + rowLength) == null)
							totalPerimeter++;
				}
			}
		}
		catch (IndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}

		return "Total land perimeter: " + totalPerimeter;
	}
}