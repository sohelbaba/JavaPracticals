import java.applet.*;
import java.awt.*;

public class Applet_Example extends Applet {

   public String c1;
   public void paint (Graphics g) {


       c1 = getParameter("background-color");
     // g.drawString(c, 10, 26)
       Color c = new Color(255);
	  setBackground(c);
   }
}