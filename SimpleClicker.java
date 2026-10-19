import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener, MouseMotionListener {
	private int xClick = -11;
	private int yClick = -11;
    
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
		addMouseMotionListener (this);
    }

	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(10.0f));
		if(xClick != -11 && yClick != -11){
			g.setColor(Color.red);
			g.drawOval(xClick - 50 , yClick - 50, 100, 100);
	}
}
    public void mouseDragged(MouseEvent event){

	}

	public void mouseMoved(MouseEvent event){
		this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();
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
