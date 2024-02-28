package pt2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PT2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtKqX1;
	private JTextField txtKqX2;

	
	public PT2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X^2 +");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(134, 63, 58, 35);
		contentPane.add(lblNewLabel);
		
		txta = new JTextField();
		txta.setBounds(65, 68, 58, 29);
		contentPane.add(txta);
		txta.setColumns(10);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyPT2();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(196, 138, 85, 21);
		contentPane.add(btnTinh);
		
		txtb = new JTextField();
		txtb.setColumns(10);
		txtb.setBounds(202, 68, 58, 29);
		contentPane.add(txtb);
		
		JLabel lblNewLabel_1 = new JLabel("X +");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(270, 63, 58, 35);
		contentPane.add(lblNewLabel_1);
		
		txtc = new JTextField();
		txtc.setColumns(10);
		txtc.setBounds(338, 68, 58, 29);
		contentPane.add(txtc);
		
		JLabel lblNewLabel_1_1 = new JLabel("= 0");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(406, 63, 58, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("X1");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(55, 178, 58, 35);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("X2");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(55, 242, 58, 35);
		contentPane.add(lblNewLabel_1_3);
		
		txtKqX1 = new JTextField();
		txtKqX1.setColumns(10);
		txtKqX1.setBounds(144, 180, 252, 35);
		contentPane.add(txtKqX1);
		
		txtKqX2 = new JTextField();
		txtKqX2.setColumns(10);
		txtKqX2.setBounds(144, 252, 252, 35);
		contentPane.add(txtKqX2);
	}

	void XuLyPT2() {
	    String stra = txta.getText();
	    String strb = txtb.getText();
	    String strc = txtc.getText();

	    // Kiểm tra tính hợp lệ của các hệ số nhập vào
	    if(stra.isEmpty() || strb.isEmpty() || strc.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ hệ số a, b, c", "Lỗi", JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    try {
	        Double a = Double.parseDouble(stra);
	        Double b = Double.parseDouble(strb);
	        Double c = Double.parseDouble(strc);

	        if(a == 0) {
	            JOptionPane.showMessageDialog(null, "Hệ số a phải khác 0 để đây là phương trình bậc 2", "Lỗi", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        Double x1,x2;
	        Double delta = b*b - 4*a*c;

	        if(delta > 0) {
	            x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            txtKqX1.setText("x1 = "+String.valueOf(x1));
	            txtKqX2.setText("x2 = "+String.valueOf(x2));
	        } else if(delta == 0){
	            x1 = -b / (2 * a);
	            txtKqX1.setText("x = "+String.valueOf(x1));
	            txtKqX2.setText("");
	        } else {
	            txtKqX1.setText("Phương trình không có nghiệm");
	            txtKqX2.setText("");
	        }
	    } catch(NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Hãy nhập các hệ số là số thực", "Lỗi", JOptionPane.ERROR_MESSAGE);
	    }
	}

}
