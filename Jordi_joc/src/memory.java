import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class memory extends JFrame {
	static boolean primer = true;
	static int primerBtn = -1;
	static int primerBtnHint = -1;
	static int segundoBtnHint = -1;
	static String numeroPrimer = "";
	static JLabel lblIntents;
	static int[] array = new int[24];
	static int intentosNum = 0;
	static JButton[] BtnArray = new JButton[24];
	static int[] arrayFet = new int[24];
	static JButton btnComenzar;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newGame() {
		for (int i = 0; i < arrayFet.length; i++) {
			arrayFet[i] = -1;
		}
		btnComenzar.setVisible(false);
		for (int i = 0; i < BtnArray.length; i++) {
			BtnArray[i].setVisible(true);
		}
		for (int i = 0; i < BtnArray.length; i++) {
			BtnArray[i].setText("?");
		}
		for (int i = 0; i < array.length; i++) {
			array[i]=0;
		}
		boolean semaforo = true;
		int pos = 0;
		while (semaforo) {
			int contador = 0;
			int numero = (int) (Math.random() * 12) + 1;
			for (int i = 0; i < array.length; i++) {
				if (numero == array[i]) {
					contador++;
				}
			}
			if (contador < 2) {
				array[pos] = numero;
				pos++;
				if (pos == 24) {
					semaforo = false;
				}
			}
		}
		primer = true;
		primerBtn = -1;
		primerBtnHint = -1;
		segundoBtnHint = -1;
		String numeroPrimer = "";
		intentosNum = 0;
		lblIntents.setText("Intents: " + intentosNum);
	}

	public static void main(String[] args) {
		for (int i = 0; i < arrayFet.length; i++) {
			arrayFet[i] = -1;
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memory frame = new memory();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public memory() {
		setTitle("Memory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//crear array aleatori
		boolean semaforo = true;
		int pos = 0;
		while (semaforo) {
			int contador = 0;
			int numero = (int) (Math.random() * 12) + 1;
			for (int i = 0; i < array.length; i++) {
				if (numero == array[i]) {
					contador++;
				}
			}
			if (contador < 2) {
				array[pos] = numero;
				pos++;
				if (pos == 24) {
					semaforo = false;
				}
			}
		}
		// crear butons
		JButton button_0 = new JButton("2");
		button_0.setBounds(10, 27, 89, 23);
		contentPane.add(button_0);

		JButton button_1 = new JButton("1");
		button_1.setBounds(111, 27, 89, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton("1");
		button_2.setBounds(210, 27, 89, 23);
		contentPane.add(button_2);

		JButton button_3 = new JButton("1");
		button_3.setBounds(309, 27, 89, 23);
		contentPane.add(button_3);

		JButton button_4 = new JButton("1");
		button_4.setBounds(10, 59, 89, 23);
		contentPane.add(button_4);

		JButton button_5 = new JButton("1");
		button_5.setBounds(111, 61, 89, 23);
		contentPane.add(button_5);

		JButton button_6 = new JButton("1");
		button_6.setBounds(210, 61, 89, 23);
		contentPane.add(button_6);

		JButton button_7 = new JButton("1");
		button_7.setBounds(309, 61, 89, 23);
		contentPane.add(button_7);

		JButton button_8 = new JButton("1");
		button_8.setBounds(10, 98, 89, 23);
		contentPane.add(button_8);

		JButton button_9 = new JButton("1");
		button_9.setBounds(111, 95, 89, 23);
		contentPane.add(button_9);

		JButton button_10 = new JButton("1");
		button_10.setBounds(210, 95, 89, 23);
		contentPane.add(button_10);

		JButton button_11 = new JButton("1");
		button_11.setBounds(309, 95, 89, 23);
		contentPane.add(button_11);

		JButton button_12 = new JButton("1");
		button_12.setBounds(210, 200, 89, 23);
		contentPane.add(button_12);

		JButton button_13 = new JButton("1");
		button_13.setBounds(309, 200, 89, 23);
		contentPane.add(button_13);

		JButton button_14 = new JButton("1");
		button_14.setBounds(111, 200, 89, 23);
		contentPane.add(button_14);

		JButton button_15 = new JButton("1");
		button_15.setBounds(10, 203, 89, 23);
		contentPane.add(button_15);

		JButton button_16 = new JButton("1");
		button_16.setBounds(10, 164, 89, 23);
		contentPane.add(button_16);

		JButton button_17 = new JButton("1");
		button_17.setBounds(111, 166, 89, 23);
		contentPane.add(button_17);

		JButton button_18 = new JButton("1");
		button_18.setBounds(210, 166, 89, 23);
		contentPane.add(button_18);

		JButton button_19 = new JButton("1");
		button_19.setBounds(309, 166, 89, 23);
		contentPane.add(button_19);

		JButton button_20 = new JButton("1");
		button_20.setBounds(309, 132, 89, 23);
		contentPane.add(button_20);

		JButton button_21 = new JButton("1");
		button_21.setBounds(210, 132, 89, 23);
		contentPane.add(button_21);

		JButton button_22 = new JButton("1");
		button_22.setBounds(111, 132, 89, 23);
		contentPane.add(button_22);

		JButton button_23 = new JButton("1");
		button_23.setBounds(10, 132, 89, 23);
		contentPane.add(button_23);

		System.out.println(Arrays.toString(array));

		BtnArray[0] = button_0;
		BtnArray[1] = button_1;
		BtnArray[2] = button_2;
		BtnArray[3] = button_3;
		BtnArray[4] = button_4;
		BtnArray[5] = button_5;
		BtnArray[6] = button_6;
		BtnArray[7] = button_7;
		BtnArray[8] = button_8;
		BtnArray[9] = button_9;
		BtnArray[10] = button_10;
		BtnArray[11] = button_11;
		BtnArray[12] = button_12;
		BtnArray[13] = button_13;
		BtnArray[14] = button_14;
		BtnArray[15] = button_15;
		BtnArray[16] = button_16;
		BtnArray[17] = button_17;
		BtnArray[18] = button_18;
		BtnArray[19] = button_19;
		BtnArray[20] = button_20;
		BtnArray[21] = button_21;
		BtnArray[22] = button_22;
		BtnArray[23] = button_23;

		for (int i = 0; i < BtnArray.length; i++) {
			BtnArray[i].setText("?");
		}

		BtnArray[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 0;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 1;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 2;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 3;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 4;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 5;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 6;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 7;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 8;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 9;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 10;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 11;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 12;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 13;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 14;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 15;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 16;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 17;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 18;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 19;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[20].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 20;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[21].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 21;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[22].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 22;
				MetodeBoto(numeroBTN);
			}
		});
		BtnArray[23].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numeroBTN = 23;
				MetodeBoto(numeroBTN);
			}
		});

		lblIntents = new JLabel("Intents: 0");
		lblIntents.setBounds(53, 267, 89, 14);
		contentPane.add(lblIntents);

		btnComenzar = new JButton("Comenzar");
		btnComenzar.setBounds(309, 263, 116, 23);
		btnComenzar.setVisible(false);
		contentPane.add(btnComenzar);
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newGame();
			}
		});
	}

	public static void MetodeBoto(int numeroBTN) {
		if (primerBtnHint != -1) {
			BtnArray[primerBtnHint].setText("?");
			BtnArray[segundoBtnHint].setText("?");
		}
		boolean checkNum = true;
		for (int i = 0; i < arrayFet.length; i++) {
			if (numeroBTN == arrayFet[i]) {
				checkNum = false;
				break;
			}
		}
		if (checkNum) {
			if (primer) {
				BtnArray[numeroBTN].setText(String.valueOf(array[numeroBTN]));
				numeroPrimer = String.valueOf(array[numeroBTN]);
				primer = false;
				primerBtn = numeroBTN;
			} else if (primerBtn != numeroBTN) {
				intentosNum++;
				lblIntents.setText("Intents: " + intentosNum);
				BtnArray[numeroBTN].setText(String.valueOf(array[numeroBTN]));
				primer = true;
				if (String.valueOf(array[numeroBTN]).equals(String.valueOf(array[primerBtn]))) {
					int posicionFet = -1;
					for (int i = 0; i < arrayFet.length; i++) {
						if (arrayFet[i] == -1) {
							posicionFet = i;
							break;
						}
					}
					if (posicionFet == 22) {
						System.out.println("hola");
						btnComenzar.setVisible(true);
						for (int i = 0; i < BtnArray.length; i++) {
							BtnArray[i].setVisible(false);
						}
					}
					arrayFet[posicionFet] = numeroBTN;
					arrayFet[posicionFet + 1] = primerBtn;
					primerBtnHint = -1;
					segundoBtnHint = -1;
				} else {
					primerBtnHint = primerBtn;
					segundoBtnHint = numeroBTN;
				}
			}
		}
	}
}
