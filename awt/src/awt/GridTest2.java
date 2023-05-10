package awt;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GridTest2 extends Frame implements ActionListener{
	TextArea ta1;
	TextArea ta2;
	
	public GridTest2() {
		ta1 = new TextArea(5,5);
		ta2 = new TextArea(5,5);
		add(ta1,"North");
		add(ta2,"South");
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if (e.getActionCommand().equals("Button1")) {
			ta1.append("good\n");
		} else {
			ta2.append("good\n");
		}		
	}
	
	
	public static void main(String[] args) {
		GridTest2 f = new GridTest2();
		
		f.setLayout(new GridLayout(3,2));
		
		Button b1 = new Button("Button1");
		Button b2 = new Button("Button2");
		Button b3 = new Button("Button3");
		Button b4 = new Button("Button4");
		
		b1.addActionListener(f);
		b2.addActionListener(f);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		f.setTitle("GridTest1");
		f.setSize(400,400);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});
	}
}
