package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.Button;

public class BorderTest1 extends Frame {
	public static void main(String[] args) {
		BorderTest1 f = new BorderTest1(); 
		
		Button b1 = new Button("BorderLayout.NORTH");		
		Button b2 = new Button("BorderLayout.SOUTH");
		Button b3 = new Button("BorderLayout.EAST");
		Button b4 = new Button("BorderLayout.WEST");
		Button b5 = new Button("BorderLayout.CENTER");	
		
		f.add(b1, BorderLayout.NORTH);			
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setTitle("BorderTest1");
		f.setSize(400,400);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});
	}
}
