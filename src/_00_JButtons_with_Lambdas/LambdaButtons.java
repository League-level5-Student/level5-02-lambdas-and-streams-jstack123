package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		addNumbers.addActionListener((e)-> {
			Random random = new Random();
			int r1 = random.nextInt(40);
			int r2 = random.nextInt(40);
			int answer = r1 + r2;
			JOptionPane.showMessageDialog(null, r1 + " + " + r2 + " = " + answer);
		});
		randNumber.addActionListener((e)-> {
			Random random = new Random();
			int r = random.nextInt(100);
			JOptionPane.showMessageDialog(null, "Random Number: " + r);
		});
		tellAJoke.addActionListener((e)-> {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
			JOptionPane.showMessageDialog(null, "He didn't");
		});
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
