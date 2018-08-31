package com.techlabs.chaptertwo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	
	JFrame frame;
	
	public static void main(String args[])
	{
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListner());
		button.addActionListener(new DevilListner());
		frame.getContentPane().add(BorderLayout.CENTER, button);
	}
	
	class AngelListner implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("Don,t do it, you might regret it!");
		}
	}


	class DevilListner implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("Come on, do it!");
		}
	}

}
