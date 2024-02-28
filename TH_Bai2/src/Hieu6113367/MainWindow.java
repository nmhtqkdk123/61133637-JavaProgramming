package Hieu6113367;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtResult;
	private JTextField txtC;
	
	private void CalculateHandler(String a, String b, String c) {
		double valA, valB, valC;
		try {
			valA = Double.parseDouble(a);
			valB = Double.parseDouble(b);
			valC = Double.parseDouble(c);
		} catch(NumberFormatException e) {
			txtResult.setText("Dữ liệu vừa nhập không hợp lệ. Vui lòng nhập lại!");
			return;
		}
		QECalculator calculate = new QECalculator(valA, valB, valC);
		txtResult.setText(calculate.Calculate());
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblNewLabel.setBounds(30, 40, 60, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblNhpB.setBounds(30, 71, 60, 20);
		contentPane.add(lblNhpB);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		txtA.setBounds(100, 41, 300, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		txtB.setColumns(10);
		txtB.setBounds(100, 71, 300, 20);
		contentPane.add(txtB);
		
		JButton btnCalculate = new JButton("Tính toán");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculateHandler(txtA.getText(), txtB.getText(), txtC.getText());
			}
		});
		btnCalculate.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnCalculate.setBounds(170, 134, 100, 30);
		contentPane.add(btnCalculate);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kết quả:");
		lblNewLabel_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(30, 185, 60, 20);
		contentPane.add(lblNewLabel_1_1);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		txtResult.setColumns(10);
		txtResult.setBounds(100, 185, 300, 20);
		contentPane.add(txtResult);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblNhpC.setBounds(30, 102, 60, 20);
		contentPane.add(lblNhpC);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		txtC.setColumns(10);
		txtC.setBounds(100, 103, 300, 20);
		contentPane.add(txtC);
	}

}
