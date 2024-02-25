package ChuongTrinh;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ChuongTrinhChinh {
	public static void main (String[] args) {
		JFrame f = new JFrame(); // Tao mot the hien (doi tuong) cua lop
		f.setTitle("Vi du JFrame"); // tieu de cua so
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200); // kich thuoc cua so
		
		
		//Qui dinh loai bo cuc(Layout)
		f.setLayout(new FlowLayout());
		
		// Tao mot nut bam
		JButton btnOK = new JButton("Nhấn tôi đi");
		JButton btnKhac = new JButton("Nhấn tôi nữa");

		
		//gan len form
		f.add(btnOK);
		f.add(btnKhac);
		
		f.show(); // hien cua so

	}
}

