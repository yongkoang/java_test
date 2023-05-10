package awt;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtTest2 extends Frame {
	public static void main(String[] args) {
		AwtTest2 f = new AwtTest2();
		TextArea ta = new TextArea(3,30);
		
		ta.append("one\n");
		ta.append("two");
		
		f.add(ta);		
		f.setSize(200, 200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});
	}
}
