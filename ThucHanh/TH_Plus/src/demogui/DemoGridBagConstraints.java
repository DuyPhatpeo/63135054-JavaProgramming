package demogui;

// Bài 9b
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
public class DemoGridBagConstraints extends JPanel	{
	protected void makebutton(String name, GridBagLayout gridbag, GridBagConstraints	c)	{
		JButton	button	=	new JButton(name);
		gridbag.setConstraints(button,	c);
		add(button);
	}
	public DemoGridBagConstraints()	{
		GridBagLayout	gridbag	=	new GridBagLayout();
		GridBagConstraints	c	=	new GridBagConstraints();
		setFont(new Font("SansSerif",	Font.PLAIN,	14));
		setLayout(gridbag);
		c.fill =	GridBagConstraints.BOTH;
		c.weightx =	1.0;
		makebutton("Button1",	gridbag,	c);
		makebutton("Button2",	gridbag,	c);
		makebutton("Button3",	gridbag,	c);
		c.gridwidth =	GridBagConstraints.REMAINDER;	//end	row
		makebutton("Button4",	gridbag,	c);
		c.weightx =	0.0;																//reset	to	the	default
		makebutton("Button5",	gridbag,	c);	//another	row
		c.gridwidth =	GridBagConstraints.RELATIVE;	//next-to-last	in	row
		makebutton("Button6",	gridbag,	c);
		c.gridwidth =	GridBagConstraints.REMAINDER;	//end	row
		makebutton("Button7",	gridbag,	c);
		c.gridwidth =	1;																//reset	to	the	default
		c.gridheight =	2;
		c.weighty =	1.0;
		makebutton("Button8",	gridbag,	c);
		c.weighty =	0.0;																//reset	to	the	default
		c.gridwidth =	GridBagConstraints.REMAINDER;	//end	row
		c.gridheight =	1;															//reset to	the	default
		makebutton("Button9",	gridbag,	c);
		makebutton("Button10",	gridbag,	c);
		setSize(500,	300);
	}
	public static void main(String	args[])	{
		JFrame	f	=	new JFrame("GridBag	Layout");
		DemoGridBagConstraints	ex	=	new DemoGridBagConstraints();					
		f.add(ex);								
		f.addWindowListener((WindowListener) new WindowAdapter()	{	
			@Override
			 public void windowClosing(WindowEvent	e)	{
			 System.exit(0);
			 }
		});
		f.pack();
		f.setSize(f.getPreferredSize());
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
