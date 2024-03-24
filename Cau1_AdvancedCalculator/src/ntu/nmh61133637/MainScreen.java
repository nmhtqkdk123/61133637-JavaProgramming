package ntu.nmh61133637;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblFirstNum;
	private JLabel lblSecondNum;
	private String temp;
	private String operator;
	
	private void insertNum(String num) {
		if(temp.charAt(0) != '0') temp+=num;
		else temp = temp.replaceFirst("0", num);
		if(lblFirstNum.isVisible()) lblFirstNum.setText(temp);
		else lblSecondNum.setText(temp);
		System.out.println(lblFirstNum.getText());
		System.out.println(lblSecondNum.getText());
	}
	
	private void toggleNum(boolean check) {
		if(check) {
			lblFirstNum.setVisible(false);
			lblSecondNum.setVisible(true);
			temp = lblSecondNum.getText();
		} else {
			lblFirstNum.setVisible(true);
			lblSecondNum.setVisible(false);
			temp = "0";
			lblSecondNum.setText(temp);
		}
	}
	
	private void removeNum(boolean check) {
		if(check) {
			if(lblFirstNum.isVisible()) lblFirstNum.setText("0");
			else lblSecondNum.setText("0");
			temp = "0";
		} else {
			temp = removeLastChar(temp);
			if(lblFirstNum.isVisible()) lblFirstNum.setText(temp);
			else lblSecondNum.setText(temp);
		}
	}
	
	private void EqualHandle(String a, String b) {
		double numA, numB;
		toggleNum(false);
		try {
			numA = Double.parseDouble(a);
			numB = Double.parseDouble(b);
		} catch(NumberFormatException e) {
			lblFirstNum.setText("Dữ liệu vừa nhập không hợp lệ. Vui lòng nhập lại!");
			return;
		}
		Calculator calculate = new Calculator(numA, numB);
		DecimalFormat df = new DecimalFormat("#.##");
		double result;
		switch(operator) {
			case "+": 
				result = calculate.Plus();
				if(result % 1 > 0) lblFirstNum.setText(String.valueOf(df.format(result)));
				else lblFirstNum.setText(String.valueOf((int)result));
			break;
			case "-": 
				result = calculate.Minus();
				if(result % 1 > 0) lblFirstNum.setText(String.valueOf(df.format(result)));
				else lblFirstNum.setText(String.valueOf((int)result));
			break;
			case "x": 
				result = calculate.Multiply();
				if(result % 1 > 0) lblFirstNum.setText(String.valueOf(df.format(result)));
				else lblFirstNum.setText(String.valueOf((int)result));
			break;
			case "÷": 
				result = calculate.Divide();
				if(result % 1 > 0) lblFirstNum.setText(String.valueOf(df.format(result)));
				else lblFirstNum.setText(String.valueOf((int)result));
			break;
		}
	}
	
	private void PercentHandle() {
		temp = String.valueOf(Double.parseDouble(temp)/100);
		if(lblFirstNum.isVisible()) lblFirstNum.setText(temp);
		else lblSecondNum.setText(temp);
	}
	
	private void toggleNegative() {
		if(temp.charAt(0) != '-') temp = insertFirst(temp, "-");
		else temp = temp.replaceFirst("-", "");
		if(lblFirstNum.isVisible()) lblFirstNum.setText(temp);
		else lblSecondNum.setText(temp);
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setTitle("Advanced Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblFirstNum = new JLabel("0");
		temp = lblFirstNum.getText();
		lblFirstNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstNum.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblFirstNum.setBounds(10, 50, 414, 40);
		contentPane.add(lblFirstNum);
		
		lblSecondNum = new JLabel("0");
		lblSecondNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSecondNum.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSecondNum.setBounds(10, 50, 414, 40);
		lblSecondNum.setVisible(false);
		contentPane.add(lblSecondNum);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = btnPlus.getText();
				toggleNum(true);
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPlus.setBorder(new RoundedBorder(10));
		btnPlus.setBackground(UIManager.getColor("Button.light"));
		btnPlus.setBounds(194, 101, 50, 50);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = btnMinus.getText();
				toggleNum(true);
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMinus.setBorder(new RoundedBorder(10));
		btnMinus.setBackground(UIManager.getColor("Button.light"));
		btnMinus.setBounds(254, 101, 50, 50);
		contentPane.add(btnMinus);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = btnMultiply.getText();
				toggleNum(true);
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMultiply.setBorder(new RoundedBorder(10));
		btnMultiply.setBackground(UIManager.getColor("Button.light"));
		btnMultiply.setBounds(314, 101, 50, 50);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("÷");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = btnDivide.getText();
				toggleNum(true);
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDivide.setBorder(new RoundedBorder(10));
		btnDivide.setBackground(UIManager.getColor("Button.light"));
		btnDivide.setBounds(374, 101, 50, 50);
		contentPane.add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EqualHandle(lblFirstNum.getText(), lblSecondNum.getText());
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnEqual.setBorder(new RoundedBorder(10));
		btnEqual.setBackground(UIManager.getColor("Button.light"));
		btnEqual.setBounds(374, 162, 50, 50);
		contentPane.add(btnEqual);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnOne.getText());
			}
		});
		btnOne.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOne.setBorder(new RoundedBorder(10));
		btnOne.setBackground(UIManager.getColor("Button.light"));
		btnOne.setBounds(194, 284, 50, 50);
		contentPane.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnTwo.getText());
			}
		});
		btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnTwo.setBorder(new RoundedBorder(10));
		btnTwo.setBackground(UIManager.getColor("Button.light"));
		btnTwo.setBounds(254, 284, 50, 50);
		contentPane.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnThree.getText());
			}
		});
		btnThree.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnThree.setBounds(314, 284, 50, 50);
		btnThree.setBorder(new RoundedBorder(10));
		btnThree.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnFour.getText());
			}
		});
		btnFour.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnFour.setBorder(new RoundedBorder(10));
		btnFour.setBackground(UIManager.getColor("Button.light"));
		btnFour.setBounds(194, 223, 50, 50);
		contentPane.add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnFive.getText());
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnFive.setBorder(new RoundedBorder(10));
		btnFive.setBackground(UIManager.getColor("Button.light"));
		btnFive.setBounds(254, 223, 50, 50);
		contentPane.add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnSix.getText());
			}
		});
		btnSix.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSix.setBorder(new RoundedBorder(10));
		btnSix.setBackground(UIManager.getColor("Button.light"));
		btnSix.setBounds(314, 223, 50, 50);
		contentPane.add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnSeven.getText());
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSeven.setBorder(new RoundedBorder(10));
		btnSeven.setBackground(UIManager.getColor("Button.light"));
		btnSeven.setBounds(194, 162, 50, 50);
		contentPane.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnEight.getText());
			}
		});
		btnEight.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnEight.setBorder(new RoundedBorder(10));
		btnEight.setBackground(UIManager.getColor("Button.light"));
		btnEight.setBounds(254, 162, 50, 50);
		contentPane.add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnNine.getText());
			}
		});
		btnNine.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNine.setBorder(new RoundedBorder(10));
		btnNine.setBackground(UIManager.getColor("Button.light"));
		btnNine.setBounds(314, 162, 50, 50);
		contentPane.add(btnNine);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(btnZero.getText());
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnZero.setBorder(new RoundedBorder(10));
		btnZero.setBackground(UIManager.getColor("Button.light"));
		btnZero.setBounds(254, 345, 50, 50);
		contentPane.add(btnZero);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeNum(false);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnClear.setBorder(new RoundedBorder(10));
		btnClear.setBackground(UIManager.getColor("Button.light"));
		btnClear.setBounds(314, 345, 50, 50);
		contentPane.add(btnClear);
		
		JButton btnAllClear = new JButton("AC");
		btnAllClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeNum(true);
			}
		});
		btnAllClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAllClear.setBorder(new RoundedBorder(10));
		btnAllClear.setBackground(UIManager.getColor("Button.light"));
		btnAllClear.setBounds(374, 345, 50, 50);
		contentPane.add(btnAllClear);
		
		JButton btnComma = new JButton(",");
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertNum(".");
			}
		});
		btnComma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnComma.setBorder(new RoundedBorder(10));
		btnComma.setBackground(UIManager.getColor("Button.light"));
		btnComma.setBounds(194, 345, 50, 50);
		contentPane.add(btnComma);
		
		JButton btnNegative = new JButton("±");
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toggleNegative();
			}
		});
		btnNegative.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNegative.setBorder(new RoundedBorder(10));
		btnNegative.setBackground(UIManager.getColor("Button.light"));
		btnNegative.setBounds(374, 284, 50, 50);
		contentPane.add(btnNegative);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PercentHandle();
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPercent.setBorder(new RoundedBorder(10));
		btnPercent.setBackground(UIManager.getColor("Button.light"));
		btnPercent.setBounds(374, 223, 50, 50);
		contentPane.add(btnPercent);
	}
	private static String removeLastChar(String s) {
	    return (s == null || s.length() == 1)
	      ? "0" 
	      : (s.substring(0, s.length() - 1));
	}
	private static String insertFirst(String s, String ss) {
		StringBuilder sb = new StringBuilder(s);
		sb.insert(0, ss);
		System.out.print(s);
		return sb.toString();
	}
}
