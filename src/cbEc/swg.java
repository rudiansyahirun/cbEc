package cbEc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class swg {

	private JFrame frame;
	private JTextField fieldName;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	JLabel lblOptionText = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swg window = new swg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class RadioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton btn = (JRadioButton) e.getSource();
			lblOptionText.setText("You choose " + btn.getText());
		}
		
	}

	/**
	 * Create the application.
	 */
	public swg() {
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
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(38, 25, 46, 14);
		frame.getContentPane().add(lblName);
		
		fieldName = new JTextField();
		fieldName.setBounds(38, 47, 154, 20);
		frame.getContentPane().add(fieldName);
		fieldName.setColumns(10);
		
		JLabel lblHello = new JLabel("");
		lblHello.setBounds(70, 78, 279, 14);
		frame.getContentPane().add(lblHello);
		
		JButton btnGreet = new JButton("Greet");
		btnGreet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHello.setText("Hello " + fieldName.getText());
			}
		});
		btnGreet.setBounds(202, 46, 89, 23);
		frame.getContentPane().add(btnGreet);

		JLabel lblToggle = new JLabel("Off");
		lblToggle.setBounds(48, 143, 46, 14);
		frame.getContentPane().add(lblToggle);
		
		JCheckBox chckbxToggle = new JCheckBox("Toggle");
		chckbxToggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = (chckbxToggle.isSelected()) ? "On" : "Off";
				lblToggle.setText(text);
			}
		});
		chckbxToggle.setBounds(38, 113, 97, 23);
		frame.getContentPane().add(chckbxToggle);
		
		RadioListener optionListener = new RadioListener();
		
		JRadioButton rdbtnOption1 = new JRadioButton("option1");
		buttonGroup.add(rdbtnOption1);
		rdbtnOption1.setBounds(178, 117, 77, 23);
		frame.getContentPane().add(rdbtnOption1);
		rdbtnOption1.addActionListener(optionListener);
		
		JRadioButton rdbtnOption2 = new JRadioButton("option2");
		buttonGroup.add(rdbtnOption2);
		rdbtnOption2.setBounds(178, 142, 77, 23);
		frame.getContentPane().add(rdbtnOption2);
		rdbtnOption2.addActionListener(optionListener);
		
		JRadioButton rdbtnOption3 = new JRadioButton("option3");
		buttonGroup.add(rdbtnOption3);
		rdbtnOption3.setBounds(178, 168, 77, 23);
		frame.getContentPane().add(rdbtnOption3);
		rdbtnOption3.addActionListener(optionListener);
		
		lblOptionText.setBounds(188, 198, 116, 14);
		frame.getContentPane().add(lblOptionText);
		
	}
}
