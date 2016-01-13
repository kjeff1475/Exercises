import java.util.ArrayList;

/*
 * class that will process the multiples of given ints in a given range and print out the sum of them
 */
public class Multiples{
	
	ArrayList<Integer> mult = new ArrayList<Integer>();			//array list to hold multiples
	
	/*
	 * constructor that will populate mult with multiples
	 * @param multiples, values to find are multiples of the int in array list
	 * @param range, the given range 0-range
	 */
	public Multiples(ArrayList<Integer> multiples, int range)
	{
		boolean added = false;		//boolean to determine if int was already added to mult
		//for loop to go through range and determine if it is a multiple
		for(int k = 0; k<range; k++)
		{
			//for loop to check if multiples of give ints
			for(int x = 0; x<multiples.size(); x++)
			{
				//if not added, check for multiples
				if(added == false)
					if(k%multiples.get(x) == 0)
					{
						mult.add(k);
						added = true;		//if added, set boolean to true
					}
			}
			added = false;		//reset added when changing k
		}
	}
	/*
	 * method to calculate the sum of the multiples found
	 * @return sum, sum of the multiples
	 */
	private int sum()
	{
		int sum = 0;
		//traverse the arraylist adding the indices to the sum
		for(int k = 0; k<mult.size(); k++)
		{
			sum += mult.get(k);
		}
		return sum;
	}
	/*
	 * main, print the sum of the multiples 3,5 on the range < 1000
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(3);
		nums.add(5);
		Multiples temp = new Multiples(nums, 1000);		//multiples class to process multiples up to 1000
		System.out.println(temp.sum());
	}
}


