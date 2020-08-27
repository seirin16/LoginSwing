package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainMenu extends JPanel {

	public MainMenu() {
		setLayout(null);

		JTextField textField = new JTextField();
		textField.setBounds(237, 56, 333, 50);
		add(textField);

	}
}
