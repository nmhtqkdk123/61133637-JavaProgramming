package Hieu61133637;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	private void LoginHandler(String user, String pass) {
		AccountInfo info = new AccountInfo();
		if(info.Login(user, pass) == 1) {
			this.setVisible(false);
			MainWindow mainWindow = new MainWindow();
			mainWindow.setVisible(true);
		}
		else if(info.Login(user, pass) == 0) JOptionPane.showMessageDialog(this, "Mật khẩu không đúng, vui lòng nhập lại");
		else if(info.Login(user, pass) == -1) JOptionPane.showMessageDialog(this, "Sai thông tin đăng nhập, vui lòng kiểm tra lại!");
	}
	
	/**
	 * Create the frame.
	 */
	public LoginWindow() {
		setTitle("Đăng nhập vào hệ thống quản lý bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 260);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên tài khoản");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblNewLabel.setBounds(50, 50, 100, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblMtKhu.setBounds(50, 90, 100, 20);
		contentPane.add(lblMtKhu);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(160, 51, 210, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.requestFocus();
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(160, 91, 210, 20);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginHandler(txtUsername.getText(), txtPassword.getText());
				
			}
		});
		btnLogin.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnLogin.setBounds(170, 134, 110, 30);
		contentPane.add(btnLogin);
	}
}
