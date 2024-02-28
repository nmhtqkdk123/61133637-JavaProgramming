package Hieu61133637;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
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

	/**
	 * Create the frame.
	 */
	
	private String PlusHandler(String a, String b) {
		double valA, valB;
		try {
			valA = Double.parseDouble(a);
			valB = Double.parseDouble(b);
		} catch(NumberFormatException e) {
			return "Dữ liệu vừa nhập không hợp lệ. Vui lòng nhập lại!";
		}
		Calculator cal = new Calculator(valA, valB);
		return String.valueOf(cal.Plus());
	}
	
	private String MinusHandler(String a, String b) {
		double valA, valB;
		try {
			valA = Double.parseDouble(a);
			valB = Double.parseDouble(b);
		} catch(NumberFormatException e) {
			return "Dữ liệu vừa nhập không hợp lệ. Vui lòng nhập lại!";
		}
		Calculator cal = new Calculator(valA, valB);
		return String.valueOf(cal.Minus());
	}
	
	private String MultiplyHandler(String a, String b) {
		double valA, valB;
		try {
			valA = Double.parseDouble(a);
			valB = Double.parseDouble(b);
		} catch(NumberFormatException e) {
			return "Dữ liệu vừa nhập không hợp lệ. Vui lòng nhập lại!";
		}
		Calculator cal = new Calculator(valA, valB);
		return String.valueOf(cal.Multiply());
	}
	
	private String DivideHandler(String a, String b) {
		double valA, valB;
		try {
			valA = Double.parseDouble(a);
			valB = Double.parseDouble(b);
		} catch(NumberFormatException e) {
			return "Dữ liệu vừa nhập không hợp lệ. Vui lòng nhập lại!";
		}
		
		if(valA == 0 || valB == 0) return "NaN";
		Calculator cal = new Calculator(valA, valB);
		return String.valueOf(cal.Minus());
	}
	
	public MainWindow() {
		setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblNewLabel.setBounds(30, 60, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblNhpB.setBounds(30, 100, 60, 14);
		contentPane.add(lblNhpB);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		txtA.setBounds(100, 58, 320, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		txtB.setColumns(10);
		txtB.setBounds(100, 98, 320, 20);
		contentPane.add(txtB);
		
		JButton btnPlus = new JButton("Cộng");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(PlusHandler(txtA.getText(), txtB.getText()));
			}
		});
		btnPlus.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnPlus.setBounds(30, 150, 89, 30);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("Trừ");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(MinusHandler(txtA.getText(), txtB.getText()));
			}
		});
		btnMinus.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnMinus.setBounds(129, 151, 89, 30);
		contentPane.add(btnMinus);
		
		JButton btnMultiply = new JButton("Nhân");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(MultiplyHandler(txtA.getText(), txtB.getText()));
			}
		});
		btnMultiply.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnMultiply.setBounds(228, 151, 89, 30);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("Chia");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(DivideHandler(txtA.getText(), txtB.getText()));
			}
		});
		btnDivide.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnDivide.setBounds(327, 151, 89, 30);
		contentPane.add(btnDivide);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lblKtQu.setBounds(30, 210, 60, 14);
		contentPane.add(lblKtQu);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		txtResult.setColumns(10);
		txtResult.setBounds(100, 208, 320, 20);
		contentPane.add(txtResult);
	}
}
