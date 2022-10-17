import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="p33.class" width=300 height=150></applet>*/
public class p33 extends Applet implements AdjustmentListener
  {
  int a,b,c;
  Panel p;
  Canvas cnv;
  Scrollbar sb1,sb2,sb3;
  public void init()
	{
	setBackground(Color.white);
	cnv= new Canvas();
	p=new Panel();
	setLayout(new GridLayout(4,1));
	sb1= new Scrollbar(Scrollbar.HORIZONTAL,50,5,0,255);
	sb2= new Scrollbar(Scrollbar.HORIZONTAL,50,5,0,255);
	sb3= new Scrollbar(Scrollbar.HORIZONTAL,50,5,0,255);
	
	sb1.addAdjustmentListener(this);
	add(sb1);
	sb2.addAdjustmentListener(this);
	add(sb2);
	sb3.addAdjustmentListener(this);
	add(sb3);
	cnv.setSize(30,30);
        p.add(cnv);
	add(p);
	}

public void adjustmentValueChanged(AdjustmentEvent ae)
   {
   a=sb1.getValue();
   b=sb2.getValue();
   c=sb3.getValue();
   
   cnv.setBackground(new Color(a,b,c));
   repaint();
   }
 }
