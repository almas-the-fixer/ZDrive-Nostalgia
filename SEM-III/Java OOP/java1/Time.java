import java.util.*;
class Time
{
	int hours,minutes,seconds;
	
	
	
	Time(int hrs,int min,int sec)
	{
		hours = hrs;
		minutes = min;
		seconds = sec;
	}
	
	static Time calc(Time tt1,Time tt2)//static keyword, then return type in this case its `Time` then method name then object as parameter.
	{
		Time tt3 = new Time(0,0,0);
		tt3.seconds = tt1.seconds + tt2.seconds;
		tt3.minutes = tt1.minutes + tt2.minutes;
		tt3.hours = tt1.hours + tt2.hours;
		
		if(tt3.seconds>59)
		{
			tt3.seconds = tt3.seconds - 60;
			tt3.minutes++;
		}
		if(tt3.minutes>59)
		{
			tt3.minutes = tt3.minutes - 60;
			tt3.hours++;
		}
		
		return (tt3);
	}
	void displayTime()
	{
		System.out.println("Result: "+hours+" Hours: "+minutes+" Minutes: "+seconds+" Seconds: ");
	}
	
	public static void main(String args[])
	{
		Time t1 = new Time(10,30,30);
		Time t2 = new Time(5,31,31);
		Time t3;
		
		t3 = Time.calc(t1,t2);
		t3.displayTime();
	}
}