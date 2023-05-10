package awt;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;

public class GridTest1 extends Frame {		
	public static void main(String[] args) {
		GridTest2 f = new GridTest2();
		
		f.setLayout(new GridLayout(3,2));
		
		Button b1 = new Button("Button1");
		Button b2 = new Button("Button2");
		Button b3 = new Button("Button3");
		Button b4 = new Button("Button4");
		Button b5 = new Button("Button5");
		Button b6 = new Button("Button6");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		f.setTitle("GridTest1");
		f.setSize(200,200);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});
	}
}
