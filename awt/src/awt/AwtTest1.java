package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtTest1 extends Frame {
	public static void main(String[] args) {
		AwtTest1 a = new AwtTest1();
		
		a.add(new Button("button1"));
		
		a.setSize(200,200);
		a.setVisible(true);
		
		a.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});	
	}
}
