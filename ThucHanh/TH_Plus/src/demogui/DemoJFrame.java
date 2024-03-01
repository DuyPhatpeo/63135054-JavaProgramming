package demogui;

// Bai 1
import javax.swing.JFrame;
public class DemoJFrame extends JFrame{
	public DemoJFrame()	{
		setTitle("Demo	JFrame");	//Tiêu đề JFrame
		setSize(300,	200);	//Kích thước của JFrame
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Thoát chương trình khi click	nút exit
		setLocationRelativeTo(null);	//Canh giữa màn hình
		setResizable(false);	//không cho phép thay đổi kích thước JFrame
		//các thuộc tính khác JFrame
	}
		public static void main(String[]	args)	{
			new DemoJFrame().setVisible(true);	//Hiển thị JFrame
	}
}
