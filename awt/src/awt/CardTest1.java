package awt;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.Container;

class CardTest1 extends Frame {
	public CardTest1() {
		Card c = new Card();		
		add(c);
		
		//c.card.next(c);
		//Container ct = new Container();
		//c.nextFocus(ct);
	}
	
	class Card extends Panel {
		CardLayout cl;
		
		public Card() {
			cl = new CardLayout();
			setLayout(cl);
			
			Button b1 = new Button("Button11");
			Button b2 = new Button("Button2");
			Button b3 = new Button("Button3");
			Button b4 = new Button("Button4");
			Button b5 = new Button("Button5");
			Button b6 = new Button("Button6");
			
			add(b1, "Center");
			add(b2, "Center");
			add(b3, "Center");
			add(b4, "Center");
			add(b5, "Center");
			add(b6, "Center");			
		}
	}	
	 
	public static void main(String[] args) {
		
		CardTest1 f = new CardTest1();
		
		f.setTitle("CardTest1");
		f.setSize(300,300);
		f.setVisible(true);		
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});
	}

}
