package awt;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;

public class FlowTest1 extends Frame {
	public static void main(String[] args) {
		Panel p = new Panel();
		Button b1 = new Button("Button1");
		Button b2 = new Button("Button2");
		Button b3 = new Button("Button3");
		FlowTest1 f = new FlowTest1();
		
		f.add(p);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		f.setSize(200,200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});
	}

}
