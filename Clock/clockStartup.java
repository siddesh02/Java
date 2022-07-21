package Clock;
import javax.swing.JOptionPane;
public class clockStartup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int d=Integer.parseInt(JOptionPane.showInputDialog("enter date"));
//		int m=Integer.parseInt(JOptionPane.showInputDialog("enter month"));
//		int y=Integer.parseInt(JOptionPane.showInputDialog("enter year"));
//		int h=Integer.parseInt(JOptionPane.showInputDialog("enter hour"));
//		int min=Integer.parseInt(JOptionPane.showInputDialog("enter min"));
//		int sec=Integer.parseInt(JOptionPane.showInputDialog("enter sec"));
		Clock tick= new Clock(12,3,2021,12,33,59);
		tick.display();
		tick.timeElapsed();
		tick.display();
		
		
		
				
		

		
		
	


	}

}
