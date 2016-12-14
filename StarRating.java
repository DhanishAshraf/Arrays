/**
 * 
 * @author Dhanish Ashraf
 * @param rating is the rating as a double.
 * @return rating as a string.
 * The class StarRating takes a rating and then interprets what string input to give return
 * using nested if statements. 
 */
public class StarRating 
{
	public static String interpret(double rating)
	{
		if (rating >= 0.0 && rating < 4.0)
		{
			return "CRAP";
		}
		else if (rating >= 4.0 && rating < 4.5)
		{
			return "OK";
		}
		else if (rating >= 4.5 && rating < 5.0)
		{
			return "EXCELLENT";
		}
		else if (rating >= 5.0)
		{
			return "[HAS ONLY ONE REVIEW]";
		}
		else 
		{
			return "not rated";
		}
	}
}
