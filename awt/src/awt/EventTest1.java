package awt;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest1 extends Frame implements WindowListener, MouseListener {
	TextArea ta;
	
	public EventTest1() {
		ta = new TextArea(10,10);
		ta.setEditable(true);
		add(ta,"North");
		
		ta.addMouseListener(this);
		addWindowListener(this);
		setSize(300,300);
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		ta.append("windowOpened\n");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(ABORT);		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		ta.append("windowIconified\n");		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		ta.append("windowDeiconified\n");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		ta.append("windowActivated\n");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		ta.append("windowDeactivated\n");	
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ta.append("mouseClicked\n");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		ta.append("mousePressed\n");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		ta.append("mouseReleased\n");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		ta.append("mouseEntered\n");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ta.append("mouseExited\n");
	}

	public static void main(String[] args) {
		EventTest1 et = new EventTest1();
	}
}
