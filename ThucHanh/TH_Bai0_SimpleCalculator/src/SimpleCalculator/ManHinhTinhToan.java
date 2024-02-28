package SimpleCalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtKQ;

	
	public ManHinhTinhToan() {
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setBounds(37, 46, 162, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setBounds(37, 85, 162, 29);
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNhpSTh);
		
		txta = new JTextField();
		txta.setBounds(209, 46, 264, 29);
		txta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setBounds(209, 85, 264, 29);
		txtb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtb.setColumns(10);
		contentPane.add(txtb);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			//Xử lý cộng
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		btnCong.setBounds(40, 144, 85, 39);
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			//Xử lý trừ
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnTru.setBounds(135, 146, 85, 37);
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			//Xử lý nhân
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setBounds(230, 146, 85, 37);
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			//Xử lý chia
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setBounds(325, 146, 85, 37);
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán:");
		lblKtQuTnh.setBounds(37, 224, 162, 29);
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblKtQuTnh);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setBounds(219, 224, 254, 26);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
	}
	//Viết hàm
		void HamXuLyCong() {
			//Lấy dữ liệu tự điều khiển
			String str_A = txta.getText();
			String str_B = txtb.getText();
			//Chuyển kiểu dữ liệu
			Double soA = Double.parseDouble(str_A);
			Double soB = Double.parseDouble(str_B);
			//tinhtoan
			Double tong = soA + soB;
			//hiển thị kết quả
			txtKQ.setText(String.valueOf(tong));
		}
		void HamXuLyTru() {
			//Lấy dữ liệu tự điều khiển
			String str_A = txta.getText();
			String str_B = txtb.getText();
			//Chuyển kiểu dữ liệu
			Double soA = Double.parseDouble(str_A);
			Double soB = Double.parseDouble(str_B);
			//tinhtoan
			Double tong = soA - soB;
			//hiển thị kết quả
			txtKQ.setText(String.valueOf(tong));
		}
		void HamXuLyNhan() {
			//Lấy dữ liệu tự điều khiển
			String str_A = txta.getText();
			String str_B = txtb.getText();
			//Chuyển kiểu dữ liệu
			Double soA = Double.parseDouble(str_A);
			Double soB = Double.parseDouble(str_B);
			//tinhtoan
			Double tong = soA * soB;
			//hiển thị kết quả
			txtKQ.setText(String.valueOf(tong));
		}
		void HamXuLyChia() {
			//Lấy dữ liệu tự điều khiển
			String str_A = txta.getText();
			String str_B = txtb.getText();
			//Chuyển kiểu dữ liệu
			Double soA = Double.parseDouble(str_A);
			Double soB = Double.parseDouble(str_B);
			//tinhtoan
			Double tong = soA / soB;
			//hiển thị kết quả
			txtKQ.setText(String.valueOf(tong));
		}
}
