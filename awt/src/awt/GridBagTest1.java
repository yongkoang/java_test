package awt;

import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridBagConstraints;
import java.awt.Button;
import java.awt.Component;

public class GridBagTest1 extends Frame {
	GridBagTest1() {
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(gbl);
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		
		gbc.weightx = 100;
		gbc.weighty = 100;
		
		addC(b1,gbc,0,0,1,1);
		addC(b2,gbc,1,0,1,1);
		addC(b3,gbc,2,0,1,1);
		addC(b4,gbc,0,1,1,1);
		addC(b5,gbc,1,1,2,1);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public void addC(Component c, GridBagConstraints gbc, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.NORTH;
		add(c, gbc);
	}
	
	public static void main(String[] args) {
		GridBagTest1 g = new GridBagTest1();
		
		g.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});
	}
}
