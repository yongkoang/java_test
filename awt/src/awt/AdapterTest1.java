/**
 * 
 */
package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author user
 *
 */
public class AdapterTest1 extends Frame {
	
	public AdapterTest1() {
		addWindowListener(new AdapterTest());
		setSize(300,300);
		setVisible(true);
	}
	
	class AdapterTest extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(ABORT);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdapterTest1 at = new AdapterTest1();

	}

}
