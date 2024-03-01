package demogui;


// Bài 7
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class DemoGridLayout extends JFrame{
	public DemoGridLayout()	{
		setTitle("GridLayout");
		setSize(300,	250);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		setResizable(false);	
		setLayout(new GridLayout(7,3,5,5)); //row=7,	column=3,	h=5,	v=5
		for (int i	=	1;	i	<=20;	i++)	{
			add(new JButton("Button	"+i));
		}
	}
	public static void main(String[]	args)	{
		new DemoGridLayout().setVisible(true);
	}
}
