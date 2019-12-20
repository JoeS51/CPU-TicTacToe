import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.awt.event.ActionEvent;

public class TicTacToe {

	JFrame frame;
	private static String[][] a = new String[3][3];
	private static int O;
	private static int X;
	
	/**
	 * Launch the application.
	 */
	public JFrame get() {
		return frame;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				for(int i =0; i <3;i++) {
					for(int j = 0; j<3;j++) {
						a[i][j] = "";
					}
				}
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblPlayerTurn = new JLabel("Player Turn: ");
		lblPlayerTurn.setBounds(12, 25, 114, 16);
		frame.getContentPane().add(lblPlayerTurn);
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setBounds(86, 25, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
			
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(117, 53, 66, 60);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						button.setText("X");
						lblNewLabel.setText("2");
						a[0][1] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						button.setText("O");
						lblNewLabel.setText("1");
						a[0][1] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();

						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button.setBounds(179, 53, 66, 60);
		frame.getContentPane().add(button);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						btnNewButton.setText("X");
						lblNewLabel.setText("2");
						a[0][0] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						btnNewButton.setText("O");
						lblNewLabel.setText("1");
						a[0][0] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button_1.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						button_1.setText("X");
						lblNewLabel.setText("2");
						a[0][2] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();

						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						button_1.setText("O");
						lblNewLabel.setText("1");
						a[0][2] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_1.setBounds(241, 53, 66, 60);
		frame.getContentPane().add(button_1);
		
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button_2.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						button_2.setText("X");
						lblNewLabel.setText("2");
						a[1][0] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						button_2.setText("O");
						lblNewLabel.setText("1");
						a[1][0] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_2.setBounds(117, 111, 66, 60);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button_3.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						button_3.setText("X");
						lblNewLabel.setText("2");
						a[1][1] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						button_3.setText("O");
						lblNewLabel.setText("1");
						a[1][1] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_3.setBounds(179, 111, 66, 60);
		frame.getContentPane().add(button_3);
			
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button_4.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						button_4.setText("X");
						lblNewLabel.setText("2");
						a[1][2] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						button_4.setText("O");
						lblNewLabel.setText("1");
						a[1][2] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_4.setBounds(241, 111, 66, 60);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button_5.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						button_5.setText("X");
						lblNewLabel.setText("2");
						a[2][0] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						button_5.setText("O");
						lblNewLabel.setText("1");
						a[2][0] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_5.setBounds(117, 168, 66, 60);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button_6.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						button_6.setText("X");
						lblNewLabel.setText("2");
						a[2][1] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						button_6.setText("O");
						lblNewLabel.setText("1");
						a[2][1] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_6.setBounds(179, 168, 66, 60);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button_7.getText()!="") {
					System.out.println("choose a different spot");
				}
				else {
					if(lblNewLabel.getText().indexOf('1') != -1) {
						button_7.setText("X");
						lblNewLabel.setText("2");
						a[2][2] = "X";
						if(isWon("X")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("X wins");
							X++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
					else {
						button_7.setText("O");
						lblNewLabel.setText("1");
						a[2][1] = "O";
						if(isWon("O")) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
							System.out.println("O wins");
							O++;
							stats();
						}
						if(full()) {
							frame.dispose();
							TicTacToe newUser = new TicTacToe();
							newUser.get().setVisible(true);
						}
					}
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_7.setBounds(241, 168, 66, 60);
		frame.getContentPane().add(button_7);
		
		JLabel lblTicTacToe = new JLabel("Tic Tac Toe 1 v 1");
		lblTicTacToe.setBounds(154, 13, 135, 16);
		frame.getContentPane().add(lblTicTacToe);
		
		JButton btnComputer = new JButton("COMPUTER");
		btnComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				TicTacToeCPU newUser = new TicTacToeCPU();
				newUser.get().setVisible(true);
			}
		});
		btnComputer.setBounds(8, 54, 108, 25);
		frame.getContentPane().add(btnComputer);
		
		
	}
	public boolean isWon(String s) {
		boolean result = false;
		if(a[0][0].equals(s)) {
			if(a[0][1].equals(s)) {
				if(a[0][2].equals(s)) {
					result = true;
				}
			}
			if(a[1][1].equals(s)) {
				if(a[2][2].equals(s)) {
						result = true;
				}
			}
			if(a[1][0].equals(s)) {
				if(a[2][0].equals(s)) {
					result = true;
				}
			}
		}
		if(a[1][0].equals(s)){
			if(a[1][1].equals(s)) {
				if(a[1][2].equals(s)) {
					result = true;
				}
			}
		}
		if(a[2][0].equals(s)) {
			if(a[2][1].equals(s)) {
				if(a[2][2].equals(s)) {
					result = true;
				}
			}
			if(a[1][1].equals(s)) {
				if(a[0][2].equals(s)) {
					result = true;
				}
			}
		}
		if(a[0][1].equals(s)) {
			if(a[1][1].equals(s)) {
				if(a[2][1].equals(s)) {
					result = true;
				}
			}
		}
		if(a[0][2].equals(s)) {
			if(a[1][2].equals(s)) {
				if(a[2][2].equals(s)) {
					result =  true;
				}
			}
		}
		if(result) {
			for(int i = 0; i< 3;i++) {
				for(int j = 0; j<3;j++) {
					a[i][j] = "";
				}
			}
			return true;
		}
		return false;
	}
	public static boolean full() {
		for(int i =0; i <3;i++) {
			for(int j = 0; j<3;j++) {
				if(a[i][j].equals("")) {
					return false;
				}
			}
		}
		for(int i = 0; i< 3;i++) {
			for(int j = 0; j<3;j++) {
				a[i][j] = "";
			}
		}
		return true;
	}
	public static void stats() {
		System.out.println("");
		System.out.println("RECORD");
		System.out.println(" X | O");
		System.out.println(" "+X+" | "+ O);
	}
}
