package screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Game2 {

	private JFrame frame;
	private JTextArea textArea = new JTextArea();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game2 window = new Game2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game2() {
		initialize();
	}
	
	
	/**
	 * Update GUI
	 */
	public void addText(String text){
		textArea.append(text);
		textArea.append("\n");
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea.setBounds(15, 16, 607, 319);
		frame.getContentPane().add(textArea);

	}

}
