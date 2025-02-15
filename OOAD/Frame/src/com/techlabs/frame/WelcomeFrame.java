package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WelcomeFrame extends JFrame {

	public WelcomeFrame() {

		setTitle("Shubham");
		setSize(1024, 768);
		JTextField tf = new JTextField();
		tf.setBounds(500, 200, 100, 50);
		tf.setEditable(false);
		JButton b = new JButton();
		b.setBounds(500, 300, 80, 50);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to Javatpoint.");
			}
		});
		add(b);
		add(tf);
		
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.blue);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

}
