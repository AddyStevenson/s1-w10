import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener {
	private int xClick = -11;
	private int yClick = -11;
    
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }

	public void paintComponent(Graphics g){
		if(xClick != -11 && yClick != -11)
			g.drawOval(xClick, yClick, 100, 100);
	}
    
    public void mouseClicked (MouseEvent event) {
		System.out.println ("You're tickling me!");
		this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();

	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}
