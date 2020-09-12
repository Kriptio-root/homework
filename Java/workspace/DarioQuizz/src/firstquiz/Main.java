package firstquiz;

public class Main {
	///////global public vars//////////
public int minutes,hours,seconds;
///////showPM///////////////
public void showPM() {
	if (hours < 10)
		System.out.print("0");
	System.out.print(hours +":");
	if(minutes < 10)
		System.out.print("0");
	System.out.print(minutes+":");
	if(seconds < 10)
		System.out.print("0");
	System.out.print(seconds);
	if(hours<12)
		System.out.print("AM");
	if(hours>12)
		System.out.print("PM");
	
		
}
///////tick/////////////////
public void tick() {
	minutes++;
	hours+=minutes/60;
	minutes+=seconds/60;
	seconds%=60;
	hours%=24;
}
///////tack/////////////////
public void tock() {
seconds+=1;
}
///////tock/////////////////
public void tack() {
hours+=1;
}
////////////show//////////
public void show() {
	if (hours < 10)
		System.out.print("0");
	System.out.print(hours +":");
	if(minutes < 10)
		System.out.print("0");
	System.out.print(minutes+":");
	if(seconds < 10)
		System.out.print("0");
	System.out.print(seconds);
}

	public static void main(String[] args) {
		Main c1=new Main();
		Main clock1=new Main();
		c1.hours=10;
		c1.minutes=8;
		c1.seconds=50;
		System.out.print("The time is: ");
		System.out.println();
		c1.show();
		System.out.println();
		c1.showPM();
		System.out.println();
		c1.hours=23;
		c1.minutes=8;
		c1.seconds=50;
		c1.showPM();
		System.out.println();
		clock1.hours=0;
		clock1.minutes=0;
		clock1.seconds=0;
		clock1.showPM();
		clock1.tock();
		clock1.tack();
		System.out.println();
		clock1.showPM();
	}

}