package ntu.nmh61133637;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;

public class MainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JLabel lblFirstNum = new JLabel("0");
		lblFirstNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstNum.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblFirstNum.setBounds(10, 50, 414, 40);
		contentPane.add(lblFirstNum);
		
		JLabel lblSecondNum = new JLabel("");
		lblSecondNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSecondNum.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSecondNum.setBounds(10, 50, 414, 40);
		contentPane.add(lblSecondNum);
		
		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnThree.setBounds(314, 284, 50, 50);
		btnThree.setBorder(new RoundedBorder(10));
		btnThree.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(btnThree);
		
		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSix.setBorder(new RoundedBorder(10));
		btnSix.setBackground(UIManager.getColor("Button.light"));
		btnSix.setBounds(314, 223, 50, 50);
		contentPane.add(btnSix);
		
		JButton btnNine = new JButton("7");
		btnNine.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNine.setBorder(new RoundedBorder(10));
		btnNine.setBackground(UIManager.getColor("Button.light"));
		btnNine.setBounds(314, 162, 50, 50);
		contentPane.add(btnNine);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMultiply.setBorder(new RoundedBorder(10));
		btnMultiply.setBackground(UIManager.getColor("Button.light"));
		btnMultiply.setBounds(314, 101, 50, 50);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("÷");
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDivide.setBorder(new RoundedBorder(10));
		btnDivide.setBackground(UIManager.getColor("Button.light"));
		btnDivide.setBounds(374, 101, 50, 50);
		contentPane.add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnEqual.setBorder(new RoundedBorder(10));
		btnEqual.setBackground(UIManager.getColor("Button.light"));
		btnEqual.setBounds(374, 162, 50, 50);
		contentPane.add(btnEqual);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnClear.setBorder(new RoundedBorder(10));
		btnClear.setBackground(UIManager.getColor("Button.light"));
		btnClear.setBounds(314, 345, 50, 50);
		contentPane.add(btnClear);
		
		JButton btnAllClear = new JButton("AC");
		btnAllClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAllClear.setBorder(new RoundedBorder(10));
		btnAllClear.setBackground(UIManager.getColor("Button.light"));
		btnAllClear.setBounds(374, 345, 50, 50);
		contentPane.add(btnAllClear);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMinus.setBorder(new RoundedBorder(10));
		btnMinus.setBackground(UIManager.getColor("Button.light"));
		btnMinus.setBounds(254, 101, 50, 50);
		contentPane.add(btnMinus);
		
		JButton btnEight = new JButton("8");
		btnEight.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnEight.setBorder(new RoundedBorder(10));
		btnEight.setBackground(UIManager.getColor("Button.light"));
		btnEight.setBounds(254, 162, 50, 50);
		contentPane.add(btnEight);
		
		JButton btnFive = new JButton("5");
		btnFive.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnFive.setBorder(new RoundedBorder(10));
		btnFive.setBackground(UIManager.getColor("Button.light"));
		btnFive.setBounds(254, 223, 50, 50);
		contentPane.add(btnFive);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnTwo.setBorder(new RoundedBorder(10));
		btnTwo.setBackground(UIManager.getColor("Button.light"));
		btnTwo.setBounds(254, 284, 50, 50);
		contentPane.add(btnTwo);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPlus.setBorder(new RoundedBorder(10));
		btnPlus.setBackground(UIManager.getColor("Button.light"));
		btnPlus.setBounds(194, 101, 50, 50);
		contentPane.add(btnPlus);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSeven.setBorder(new RoundedBorder(10));
		btnSeven.setBackground(UIManager.getColor("Button.light"));
		btnSeven.setBounds(194, 162, 50, 50);
		contentPane.add(btnSeven);
		
		JButton btnFour = new JButton("4");
		btnFour.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnFour.setBorder(new RoundedBorder(10));
		btnFour.setBackground(UIManager.getColor("Button.light"));
		btnFour.setBounds(194, 223, 50, 50);
		contentPane.add(btnFour);
		
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOne.setBorder(new RoundedBorder(10));
		btnOne.setBackground(UIManager.getColor("Button.light"));
		btnOne.setBounds(194, 284, 50, 50);
		contentPane.add(btnOne);
		
		JButton btnComma = new JButton(",");
		btnComma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnComma.setBorder(new RoundedBorder(10));
		btnComma.setBackground(UIManager.getColor("Button.light"));
		btnComma.setBounds(194, 345, 50, 50);
		contentPane.add(btnComma);
		
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnZero.setBorder(new RoundedBorder(10));
		btnZero.setBackground(UIManager.getColor("Button.light"));
		btnZero.setBounds(254, 345, 50, 50);
		contentPane.add(btnZero);
		
		JButton btnNegative = new JButton("±");
		btnNegative.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNegative.setBorder(new RoundedBorder(10));
		btnNegative.setBackground(UIManager.getColor("Button.light"));
		btnNegative.setBounds(374, 284, 50, 50);
		contentPane.add(btnNegative);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPercent.setBorder(new RoundedBorder(10));
		btnPercent.setBackground(UIManager.getColor("Button.light"));
		btnPercent.setBounds(374, 223, 50, 50);
		contentPane.add(btnPercent);
	}
}
