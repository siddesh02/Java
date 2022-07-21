package Clock;
import javax.swing.JOptionPane;

public class Clock {
	int seconds; int minutes; int hours; int date; int year;int months;

  Clock(int d,int m,int y,int h,int min, int s)
	{
	 
	    date=d;
	    months=m;
	    year=y;
		hours= h;
		minutes=min;
		seconds= s;
		date=d;
	  
	}
 
	
	
	
	public void timeElapsed() {
		int days[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(((year%4==0)&&(year%100!=0)|(year%400==0)))
			days[1]=29;
		
			seconds++;
		if (seconds==60) {
			seconds=0;
			minutes++;
			
		
		
		if(minutes==60) {
			minutes=0;
			hours++;
			if(hours==24) {
				hours=0;
				date++;
				if(date>days[months-1]) {
					date=1;
					months++;
					if(months==13) {
						months=1;
						year++;
					}
				}
				}
			}
			
		}
	
		

	}
	
public void display() {
	JOptionPane.showMessageDialog(null,"date= " + date + "\nmonths= " + months+ "\nyear= "+ year + "\nhours= " + hours + "\nminutes= " + minutes + "\nseconds= " + seconds );
}

}

