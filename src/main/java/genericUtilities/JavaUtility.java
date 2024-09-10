package genericUtilities;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * this method will return the current date from the system
	 * @return
	 */
	public String getSystemDate()
	{
		Date d = new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String currentDate = formatter.format(d);
		return currentDate;
	}
	
	/**
	 * this method will give the random number to the system
	 */
	public int getRandomNumber()
	{
		Random r= new Random();
		int value=r.nextInt(100);
		return value;
	}
	
	
	

}
