/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {

      //g.setColor(Color.red);
      //g.fillOval(100, 100, 50, 50);
      //g.setColor(Color.pink);
      //g.fillOval(50, 50, 50, 50);
    this.drawBullsEye(g);

   }
   public void drawBullsEye(Graphics g){
      g.setColor(Color.red);
      g.fillOval(100, 100, 150, 150);
      g.setColor(Color.black);
      g.fillOval(125, 125, 100, 100);
      g.setColor(Color.red);
      g.fillOval(150, 150, 50, 50);

   }

   public void olympicRings(Graphics g){
      

   }

}
