package com.book.headfirst.chapter2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingObserverExample {
	JFrame jFrame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		jFrame = new JFrame();

		JButton button = new JButton("할까? 말까?");
		// button.addActionListener(new AngelListener());
		// button.addActionListener(new DevilListener());
		button.addActionListener(event -> System.out.println("하지마 후회할걸?"));
		button.addActionListener(event -> System.out.println("그냥 저질러버렷"));

		jFrame.getContentPane().add(BorderLayout.CENTER, button);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.getContentPane().add(BorderLayout.CENTER, button);
		jFrame.pack();
		jFrame.setVisible(true);
	}

	static class AngelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("하지마 후회할걸?");
		}
	}

	static class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("그냥 저질러버렷");
		}
	}
}
