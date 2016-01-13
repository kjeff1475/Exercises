/*
 * class that will calculate the factorial of a number
 */
public class Factorial {
	long total = 1;		//int that will be the working total
	/*
	 * class that will calculate the factorial of num
	 * @param num, number that you want to take the factorial of
	 */
	public Factorial(int num)
	{
		for(long k = 1; k<num; k++)
		{
			total*=k;
		}
	}
	/*
	 * getter method to return the total of the factorial
	 */
	private long getTotal()
	{
		return total;
	}
	/*
	 * method to return the sum of the digits in total
	 */
	private long digitSum()
	{
		long sum = 0;		//sum of the digits
		long temp = total;	//temp use of total
		while(temp > 0)
		{
			sum += temp%10;			//add the last digit to the sum
			temp /= 10;				//truncate the last digit to move down
		}
		return sum;
	}
	/*
	 * main, find the factorial of 10 and print the total annd digit of sums
	 */
	public static void main(String[] args) {
		Factorial temp = new Factorial(100);
		System.out.println(temp.getTotal());
		System.out.println(temp.digitSum());
	}

}
