package com.lambda.tuto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	
	public static void main(String[] args) {
		//window : object JFrame
		JFrame frame=new JFrame("My Window");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());

		
		//create button and add JFrame
		JButton button=new JButton("Click me!!");
		
		button.addActionListener(e->{
			System.out.println("Button click");
			JOptionPane.showMessageDialog(null, "clicked");
			
		});
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}

}
