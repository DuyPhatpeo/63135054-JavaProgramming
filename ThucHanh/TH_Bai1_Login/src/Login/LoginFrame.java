package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtPass;

	public LoginFrame() {
		setTitle("ĐĂNG NHẬP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(60, 55, 152, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(60, 157, 152, 47);
		contentPane.add(lblMtKhu);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(222, 55, 387, 47);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(222, 157, 387, 47);
		contentPane.add(txtPass);
		
		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý đăng nhập
				XuLyDangNhap();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(261, 289, 198, 47);
		contentPane.add(btnLogin);
	}
	
	//Hàm xử lý
		void XuLyDangNhap() {
			String strTen = txtLogin.getText();
			String strPass = txtPass.getText();
			if(strTen.equals("63CNTT") && strPass.equals("123")) {
				//Hiển thị trang chủ
				HomeFrame home = new HomeFrame();
				home.setVisible(true);
				home.setLocation(538,272);
				//ẩn form đăng nhập;
				this.setVisible(false);
			}else {
				//báo lỗi
				//Xóa khi lỗi
				txtLogin.setText("");
				txtPass.setText("");
				//Hiển thị thông báo
				JOptionPane hopthoai = new JOptionPane();
				hopthoai.showMessageDialog(this, "Đăng nhập thất bại");
			}
			
		}

}
