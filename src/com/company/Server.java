package com.company;

import javax.swing.*;

public class Server extends JFrame {
	Server()
	{
		setSize(500,600);
		setVisible(true);
	}
	public static void main(String []args)
	{
		new ServerClass().setVisible(true);
	}
}
