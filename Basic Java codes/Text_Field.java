import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class p25 extends Applet implements TextListener
    {
    TextArea ta1,ta2;
    TextField tf1,tf2;
    
    public void init()
	{
	setBackground(Color.white);
	setForeground(Color.blue);
	ta1=new TextArea(10,20);
	add(ta1);
	ta2=new TextArea(10,20);
	add(ta2);
	
	tf1=new TextField(20);
	add(tf1);
	tf2=new TextField(20);
	add(tf2);
	tf1.setEditable(false);
	tf1.addTextListener(this);
	tf2.addTextListener(this);
	ta1.addTextListener(this);
	ta1.addTextListener(this);
	}
	public void textValueChanged(TextEvent te)
	 {
	 ta1.append("TextEvent1 :"+tf2.getText() +"\n");
	 tf1.setText(tf2.getText()); 
	 ta2.append("TextEvent2 :"+tf1.getText() +"\n");
	 }
	
}
