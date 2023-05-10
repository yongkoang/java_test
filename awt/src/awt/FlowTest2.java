package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.FlowLayout;

public class FlowTest2 extends Frame {
	public static void main(String[] args) {
		FlowTest2 f = new FlowTest2();
		//f.setLayout(new FlowLayout(FlowLayout.LEFT));		
		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		Button b1 = new Button("Button1");
		Button b2 = new Button("Button2");
		Button b3 = new Button("Button3");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setTitle("FlowTest2");
		f.setSize(300,200);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
