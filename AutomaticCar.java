
public class AutomaticCar
{
  private String model;
  private String year;
  private int speed;
  private int gear;
  int distance = 0;

  public AutomaticCar (String model, String year)
  {
    setModel (model);
    setYear (year);
  }

  public void setModel (String model)
  {
    this.model = model;
  }
  public void setYear (String year)
  {
    this.year = year;
  }
  public void setSpeed (int speed)
  {
    if (speed >= 0)
      this.speed = speed;
    else
      System.out.println ("Invalid speed");
  }
  public void setGear (int gear)
  {
    if (speed == 0)
      {
	this.gear = 0;
      }
    else if (speed > 0 && speed <= 100)
      {
	this.gear = 1;
      }
    else if (speed > 100 && speed <= 200)
      {
	this.gear = 2;
      }
    else if (speed > 200 && speed <= 300)
      {
	this.gear = 3;
      }
    else if (speed > 300 && speed <= 400)
      {
	this.gear = 4;
      }
    else if (speed > 400 && speed <= 500)
      {
	this.gear = 5;
      }
    else
      {
	System.out.println ("Invalid speed");
      }
  }

  public String getModel ()
  {
    return this.model;
  }
  public String getYear ()
  {
    return this.year;
  }
  public int getSpeed ()
  {
    return this.speed;
  }
  public int getGear ()
  {
    return this.gear;
  }

}
