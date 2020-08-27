package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Login extends JPanel {

	public Login(Runnable onLogin) {

		JButton btnAcceder = new JButton("ACCEDER");
		btnAcceder.setBounds(0, 200, 450, 100);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setBounds(0, 0, 95, 95);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);

		JTextField textField = new JTextField();
		textField.setBounds(100, 0, 350, 95);
		add(textField);

		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1.setBounds(0, 100, 95, 95);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);

		JTextField textField_1 = new JTextField();
		textField_1.setBounds(100, 100, 350, 95);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel label = new JLabel("");
		label.setBounds(0, 200, 95, 100);
		add(label);
		
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usuario = textField.getText();
				String contraseña = "ALVARO";
				if (textField_1.getText().equals(contraseña) && usuario.length() > 3) {
					onLogin.run();
				} else {
					JOptionPane.showMessageDialog(null, "ACCESO INVALIDO");
				}

			}
		});
		add(btnAcceder);
	}
}
