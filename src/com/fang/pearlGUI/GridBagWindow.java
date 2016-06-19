package com.fang.pearlGUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;



public class GridBagWindow extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JPanel  desktop;
	private JScrollPane scrollPane;
	
	public void layOut(){
		
		button1=new JButton("分两类");
		button2=new JButton("分四类");
		button3=new JButton("分八类");
		button4=new JButton("文字显示板");
		button5=new JButton("开始分类");
		desktop = new JPanel();
		
		
		
		Container contentPane = getContentPane();
		GridBagLayout gridBag = new GridBagLayout();
//		desktop.setLayout(layout);
		contentPane.setLayout(gridBag);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
//		scrollPane = new JScrollPane(desktop, v, h);
		scrollPane = new JScrollPane(v, h);
		this.add(scrollPane);
		
		
		GridBagConstraints c = new GridBagConstraints();
		   //setting a default constraint value
		c.fill =GridBagConstraints.HORIZONTAL;
		
		c.gridx = 0; //x grid position
		c.gridy = 0; //y grid position
		c.gridwidth=1;
		c.gridheight=1;
		gridBag.setConstraints(button1, c);
		this.add(button1);
		
		c.gridx = 5; //x grid position
		c.gridy = 0; //y grid position
		c.gridwidth=1;
		c.gridheight=1;
		gridBag.setConstraints(button2, c);
		this.add(button2);
		
	}

	
	public static void main(String[] args) {
		GridBagWindow main =new GridBagWindow();
		main.layOut();
		main.pack();
		main.setVisible(true);
	}
}
