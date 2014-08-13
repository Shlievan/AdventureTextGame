package screens;

import gamestuff.GameControl;
import gamestuff.Player;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

import javax.swing.JLabel;

import java.awt.TextArea;

import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class Game {

	private JFrame frmFunAdventureGame;
	
	
	private TextArea textArea = new TextArea();
	private JProgressBar pgrbar_MANA = new JProgressBar();
	private JProgressBar pgrBar_HEALTH = new JProgressBar();
	private JProgressBar pgrBar_EXP = new JProgressBar();
	private Player player;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frmFunAdventureGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
	}
	
	public void updateBars(int health, int mana, int exp){
		pgrbar_MANA.setValue(mana);
		pgrBar_HEALTH.setValue(health);
		pgrBar_EXP.setValue(exp);
	}
	

	public void addText(String text){
		textArea.append(text);
		textArea.append("\n");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFunAdventureGame = new JFrame();
		frmFunAdventureGame.setTitle("Fun Adventure Game");
		frmFunAdventureGame.getContentPane().setBackground(Color.GRAY);
		frmFunAdventureGame.setBounds(100, 100, 800, 600);
		frmFunAdventureGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn_NORTHEAST = new JButton("NE");
		btn_NORTHEAST.setForeground(Color.WHITE);
		btn_NORTHEAST.setBackground(Color.LIGHT_GRAY);
		btn_NORTHEAST.setBounds(128, 362, 53, 29);
		frmFunAdventureGame.getContentPane().setLayout(null);

		JButton btn_NORTHWEST = new JButton("NW");
		btn_NORTHWEST.setForeground(Color.WHITE);
		btn_NORTHWEST.setBackground(Color.LIGHT_GRAY);
		btn_NORTHWEST.setBounds(10, 362, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_NORTHWEST);
		
		JButton btn_NORTH = new JButton("N");
		btn_NORTH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_NORTH.setForeground(Color.WHITE);
		btn_NORTH.setBackground(Color.LIGHT_GRAY);
		btn_NORTH.setBounds(76, 362, 43, 29);
		frmFunAdventureGame.getContentPane().add(btn_NORTH);
		frmFunAdventureGame.getContentPane().add(btn_NORTHEAST);
		
		JButton btn_WEST = new JButton("W");
		btn_WEST.setForeground(Color.WHITE);
		btn_WEST.setBackground(Color.LIGHT_GRAY);
		btn_WEST.setBounds(10, 399, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_WEST);
		
		JButton btn_EAST = new JButton("E");
		btn_EAST.setForeground(Color.WHITE);
		btn_EAST.setBackground(Color.LIGHT_GRAY);
		btn_EAST.setBounds(128, 399, 53, 29);
		frmFunAdventureGame.getContentPane().add(btn_EAST);
		
		JButton btn_SOUTHWEST = new JButton("SW");
		btn_SOUTHWEST.setForeground(Color.WHITE);
		btn_SOUTHWEST.setBackground(Color.LIGHT_GRAY);
		btn_SOUTHWEST.setBounds(10, 436, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_SOUTHWEST);
		
		JButton btn_SOUTH = new JButton("S");
		btn_SOUTH.setForeground(Color.WHITE);
		btn_SOUTH.setBackground(Color.LIGHT_GRAY);
		btn_SOUTH.setBounds(76, 436, 43, 29);
		btn_SOUTH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmFunAdventureGame.getContentPane().add(btn_SOUTH);
		
		JButton btn_SOUTHEAST = new JButton("SE");
		btn_SOUTHEAST.setForeground(Color.WHITE);
		btn_SOUTHEAST.setBackground(Color.LIGHT_GRAY);
		btn_SOUTHEAST.setBounds(128, 436, 53, 29);
		frmFunAdventureGame.getContentPane().add(btn_SOUTHEAST);
		
		
		textArea.setBounds(10, 10, 560, 346);
		frmFunAdventureGame.getContentPane().add(textArea);
		
		
		
		
		pgrbar_MANA.setValue(player.getMana());
		pgrbar_MANA.setMaximum(player.getMaxMana());
		pgrbar_MANA.setToolTipText("Mana");
		pgrbar_MANA.setStringPainted(true);
		pgrbar_MANA.setForeground(Color.BLUE);
		pgrbar_MANA.setBounds(424, 362, 146, 20);
		frmFunAdventureGame.getContentPane().add(pgrbar_MANA);
		
		
		pgrBar_HEALTH.setStringPainted(true);
		pgrBar_HEALTH.setValue(player.getHealth());
		pgrBar_HEALTH.setMaximum(player.getMaxHealth());
		pgrBar_HEALTH.setToolTipText("Health");
		pgrBar_HEALTH.setBackground(Color.BLACK);
		pgrBar_HEALTH.setForeground(Color.RED);
		pgrBar_HEALTH.setBounds(263, 362, 146, 20);
		frmFunAdventureGame.getContentPane().add(pgrBar_HEALTH);
		
		
		pgrBar_EXP.setValue(0);
		pgrBar_EXP.setMaximum(player.getExpNeeded());
		pgrBar_EXP.setStringPainted(true);
		pgrBar_EXP.setToolTipText("Experience");
		pgrBar_EXP.setForeground(Color.ORANGE);
		pgrBar_EXP.setBounds(10, 481, 560, 20);
		frmFunAdventureGame.getContentPane().add(pgrBar_EXP);
		
		JButton btn_INVENTORY = new JButton("Inventory");
		btn_INVENTORY.setBounds(576, 10, 115, 29);
		frmFunAdventureGame.getContentPane().add(btn_INVENTORY);
		
		JButton btn_EXIT = new JButton("Quit");
		btn_EXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_EXIT.setBounds(576, 248, 115, 29);
		frmFunAdventureGame.getContentPane().add(btn_EXIT);
		
		JButton btn_Save = new JButton("Save");
		btn_Save.setBounds(576, 95, 115, 29);
		frmFunAdventureGame.getContentPane().add(btn_Save);
		
		JButton btn_LOAD = new JButton("Load");
		btn_LOAD.setBounds(576, 140, 115, 29);
		frmFunAdventureGame.getContentPane().add(btn_LOAD);
		
		JButton btn_STATS = new JButton("Stats");
		btn_STATS.setBounds(576, 50, 115, 29);
		frmFunAdventureGame.getContentPane().add(btn_STATS);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(263, 389, 307, 2);
		frmFunAdventureGame.getContentPane().add(separator);
		
		JLabel lblKeys = new JLabel("Keys:");
		lblKeys.setBounds(273, 399, 43, 20);
		frmFunAdventureGame.getContentPane().add(lblKeys);
		
		JLabel lbl_KEYS = new JLabel("null");
		lbl_KEYS.setBounds(320, 399, 69, 20);
		frmFunAdventureGame.getContentPane().add(lbl_KEYS);
		
		JButton btn_NEW = new JButton("New Game");
		btn_NEW.setBounds(576, 203, 115, 29);
		frmFunAdventureGame.getContentPane().add(btn_NEW);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(576, 185, 115, 2);
		frmFunAdventureGame.getContentPane().add(separator_1);
		
		JButton btn_addHealth = new JButton("+H");
		btn_addHealth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.modifyHealth(5);
				
			}
		});
		btn_addHealth.setBounds(576, 293, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_addHealth);
		
		JButton btn_subHealth = new JButton("-H");
		btn_subHealth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.modifyHealth(-5);
				System.out.println("-5 health");
			}
		});
		btn_subHealth.setBounds(576, 327, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_subHealth);
		
		JButton btn_subMana = new JButton("-M");
		btn_subMana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.modifyMana(5);
			}
		});
		btn_subMana.setBounds(634, 327, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_subMana);
		
		JButton btn_addMana = new JButton("+M");
		btn_addMana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.modifyMana(-5);
			}
		});
		btn_addMana.setBounds(634, 293, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_addMana);
		
		JButton btn_addExp = new JButton("+E");
		btn_addExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.modifyExp(5);
			}
		});
		btn_addExp.setBounds(576, 362, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_addExp);
		
		JButton btn_subExp = new JButton("-E");
		btn_subExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.modifyExp(-5);
			}
		});
		btn_subExp.setBounds(634, 362, 57, 29);
		frmFunAdventureGame.getContentPane().add(btn_subExp);
	}
}
