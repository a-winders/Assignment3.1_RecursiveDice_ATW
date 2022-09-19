import java.util.Random;
import java.util.ArrayList;

/**
 * This class is designed to mimic rolling a die using recursive methods.
 * @author Adam Winders
 *
 */
public class RecDieRoller {
	
	private static int totalNumberOfRolls = 1;	// initializes total number of rolls to start at 1 
	int roll = 1000;	// initializes number of die rolls to 1000
	
	/*
	 * Uncomment count variable below to roll die n times
	 */
	int count;
	
	
	/**
	 * Uncomment this body in order to roll die n times.
	 * 
	 * Simulates the rolling of a die, and the random integers that result.
	 * @return number of rolls it took to land on a 2
	 *
	public static void Roll (int count) {
		Random rand = new Random ();	// creates new object of Random class 
		int upperbound = 7;	// places limit of return up to 6 
		int int_random = rand.nextInt(upperbound);	// only generates random numbers between 1-6
		int count = totalNumberOfRolls;

		System.out.println("Total number of rolls: " +totalNumberOfRolls+"\nYou rolled a: "+int_random+"\n");	// prints all randomly generated ints
		totalNumberOfRolls++;	// counts the total number of times totalNumberOfRolls is called, incrementing by 1 each time 
		if (count <= 1) {
			return;
					}	// end if
			if (int_random == 2) {
				
				System.out.println("-----------------------------------------\n Number of rolls it took to get a two: "+count+"\n-----------------------------------------\n\n\n");
				return;
					}	// end if
		Roll (count -1);
	}	// end Roll
*/	


	/**
	 * Simulates the rolling of a die 1000 times, and the random integers that result
	 * @return number of rolls it took to land on a 2
	 * @return average number of rolls it took to land on a 2
	 */
	public static void Roll (int roll) {
		Random rand = new Random ();	// creates new object of Random class
		int upperbound = 7;	// places limit of return up to 6
		int int_random = rand.nextInt(upperbound);	// only generates random numbers between 1-6
		int average;	// average number of rolls to return a 2
		ArrayList<Integer> numOfRollsToGetTwo = new ArrayList<Integer>();	// keeps track of total number of rolls to land a 2
		float sum = 0;	// 

		
		System.out.println("Total number of rolls: " +totalNumberOfRolls+"\nYou rolled a: "+int_random+"\n");	// prints all randomly generated ints
		totalNumberOfRolls++;	// counts the total number of times totalNumberOfRolls is called, incrementing by 1 each time 
		if (roll <= 1) {
			return;
					}	// end if
			if (int_random == 2) {
				totalNumberOfRolls--;
				System.out.println("-----------------------------------------\n Number of rolls it took to get a two: "+totalNumberOfRolls+"\n-----------------------------------------\n\n\n");
				for (int i = 0; i < 1000; i++) {	// rolls die 1000 times and stores total count
						if(int_random == 2) {
							totalNumberOfRolls++;
						}	// end if
				}	// end for
				return;
					}	// end if
		Roll (roll -1);
		/**
		 * @return average number of rolls to return a 2
		 * Commented out since it was not working properly.
		 *
		int i=0;
        while(i < numOfRollsToGetTwo.length) {
            sum += numOfRollsToGetTwo[i];
            i++;
        }
         
        float average = (sum / numOfRollsToGetTwo.length); 
         
        System.out.println("Average : "+average);
        */
	}	// end Roll
	
}	// end class
