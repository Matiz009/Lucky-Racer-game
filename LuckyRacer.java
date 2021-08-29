
import java.util.Random;
public class LuckyRacer
{
  public static void main (String args[])
  {
    int TotalSpeedCar1 = 0;
    int TotalSpeedCar2 = 0;
    int TotalSpeedCar3 = 0;
    int TotalSpeedCar4 = 0;
    int TotalSpeedCar5 = 0;
    int totalDistanceForCar1 = 0;
    int totalDistanceForCar2 = 0;
    int totalDistanceForCar3 = 0;
    int totalDistanceForCar4 = 0;
    int totalDistanceForCar5 = 0;

    Random rand = new Random ();
    AutomaticCar car1 = new AutomaticCar ("Ferrari 234", "2010");
    AutomaticCar car2 = new AutomaticCar ("Honda Civic", "2018");
    AutomaticCar car3 = new AutomaticCar ("Bugati", "2017");
    AutomaticCar car4 = new AutomaticCar ("Lexus", "2020");
    AutomaticCar car5 = new AutomaticCar ("BMW", "2016");

      System.out.printf ("\nCar 1 is %s %s", car1.getModel (),
			 car1.getYear ());
      System.out.printf ("\nCar 2 is %s %s", car2.getModel (),
			 car2.getYear ());
      System.out.printf ("\nCar 3 is %s %s", car3.getModel (),
			 car3.getYear ());
      System.out.printf ("\nCar 4 is %s %s", car4.getModel (),
			 car4.getYear ());
      System.out.printf ("\nCar 5 is %s %s", car5.getModel (),
			 car5.getYear ());


      System.out.println ("\nRace has been started");
      System.out.println ("\n");

    for (int i = 0; i < 10; i++)
      {
	System.out.printf ("\nAfter %d hours", i + 1);
	System.out.printf ("\n");
	System.out.printf ("\n");
	System.out.printf ("\n");
	TotalSpeedCar1 = rand.nextInt (300);
	car1.setSpeed (TotalSpeedCar1);
	totalDistanceForCar1 = 1 * TotalSpeedCar1;
	car1.distance = car1.distance + totalDistanceForCar1;
	System.out.printf ("\n%s %s at speed %d", car1.getModel (),
			   car1.getYear (), TotalSpeedCar1);
	int g = car1.distance / 100;
	for (int f = 0; f <= g; f++)
	  {
	    System.out.printf ("-");
	  }
	System.out.printf ("has passed %dkm", car1.distance);
	System.out.printf ("\n");

	TotalSpeedCar2 = rand.nextInt (300);
	car2.setSpeed (TotalSpeedCar2);
	totalDistanceForCar2 = 1 * TotalSpeedCar2;
	car2.distance = car2.distance + totalDistanceForCar2;
	System.out.printf ("\n%s %s at speed %d", car2.getModel (),
			   car2.getYear (), TotalSpeedCar2);
	g = car2.distance / 100;
	for (int f = 0; f <= g; f++)
	  {
	    System.out.printf ("-");
	  }
	System.out.printf ("has passed %dkm", car2.distance);
	System.out.printf ("\n");

	TotalSpeedCar3 = rand.nextInt (300);
	car3.setSpeed (TotalSpeedCar3);
	totalDistanceForCar3 = 1 * TotalSpeedCar3;
	car3.distance = car3.distance + totalDistanceForCar3;
	System.out.printf ("\n%s %s at speed %d", car3.getModel (),
			   car3.getYear (), TotalSpeedCar3);
	g = car3.distance / 100;
	for (int f = 0; f <= g; f++)
	  {
	    System.out.printf ("-");
	  }
	System.out.printf ("has passed %dkm", car3.distance);
	System.out.printf ("\n");

	TotalSpeedCar4 = rand.nextInt (300);
	car4.setSpeed (TotalSpeedCar4);
	totalDistanceForCar4 = 1 * TotalSpeedCar4;
	car4.distance = car4.distance + totalDistanceForCar4;
	System.out.printf ("\n%s %s at speed %d", car4.getModel (),
			   car4.getYear (), TotalSpeedCar4);
	g = car4.distance / 100;
	for (int f = 0; f <= g; f++)
	  {
	    System.out.printf ("-");
	  }
	System.out.printf ("has passed %dkm", car4.distance);
	System.out.printf ("\n");

	TotalSpeedCar5 = rand.nextInt (300);
	car5.setSpeed (TotalSpeedCar5);
	totalDistanceForCar5 = 1 * TotalSpeedCar5;
	car5.distance = car5.distance + totalDistanceForCar1;
	System.out.printf ("\n%s %s at speed %d", car5.getModel (),
			   car5.getYear (), TotalSpeedCar5);
	g = car5.distance / 100;
	for (int f = 0; f <= g; f++)
	  {
	    System.out.printf ("-");
	  }
	System.out.printf ("has passed %dkm", car5.distance);
	System.out.printf ("\n");
      }
    System.out.printf ("\n");
    System.out.printf ("\n");
    System.out.printf ("\n");
    System.out.printf ("\n");
    System.out.printf ("\n");
    System.out.printf ("Race Ended\n");


    if (totalDistanceForCar1 > totalDistanceForCar2
	&& totalDistanceForCar1 > totalDistanceForCar3
	&& totalDistanceForCar1 > totalDistanceForCar4
	&& totalDistanceForCar1 > totalDistanceForCar5)
      {
	System.out.printf ("%s has won the race", car1.getModel ());
      }
    else
      if (totalDistanceForCar2 > totalDistanceForCar1
	  && totalDistanceForCar2 > totalDistanceForCar3
	  && totalDistanceForCar2 > totalDistanceForCar4
	  && totalDistanceForCar2 > totalDistanceForCar5)
      {
	System.out.printf ("%s has won the race", car2.getModel ());
      }
    else
      if (totalDistanceForCar3 > totalDistanceForCar1
	  && totalDistanceForCar3 > totalDistanceForCar2
	  && totalDistanceForCar3 > totalDistanceForCar4
	  && totalDistanceForCar3 > totalDistanceForCar5)
      {
	System.out.printf ("%s has won the race", car3.getModel ());
      }
    else
      if (totalDistanceForCar4 > totalDistanceForCar1
	  && totalDistanceForCar4 > totalDistanceForCar2
	  && totalDistanceForCar4 > totalDistanceForCar3
	  && totalDistanceForCar4 > totalDistanceForCar5)
      {
	System.out.printf ("%s has won the race", car4.getModel ());
      }
    else
      if (totalDistanceForCar5 > totalDistanceForCar1
	  && totalDistanceForCar5 > totalDistanceForCar2
	  && totalDistanceForCar5 > totalDistanceForCar3
	  && totalDistanceForCar5 > totalDistanceForCar4)
      {
	System.out.printf ("%s has won the race", car1.getModel ());
      }
  }




}
