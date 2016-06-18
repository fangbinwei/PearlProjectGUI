package com.fang.pearlGUI;

import java.awt.Color;
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



public class MainFrame extends JFrame {
	private JPanel desktop;
	private JScrollPane scrollPane;
	private JButton startButton;
	private JTextArea description;
	private JComboBox selectBox;
	private JPanel picture;
	private String[] selection = {
		    "将珍珠分成两类", "将珍珠分为四类"
		  };
	private int count = 0;
	
	public MainFrame(){
		this.setTitle("珍珠自动分级系统");
		this.setBounds(0, 0, 700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		desktop = new JPanel();
//		desktop.setPreferredSize(new Dimension(750, 720));
		GridBagLayout layout = new GridBagLayout();
		desktop.setLayout(layout);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		scrollPane = new JScrollPane(desktop, v, h);
		this.add(scrollPane);
		
		selectBox = new JComboBox();
		for(int i = 0; i < 2; i++){
			
			selectBox.addItem(selection[count++]);
		}
		desktop.add(selectBox);
		
		JPanel blankPanel=new JPanel();
		desktop.add(blankPanel);
		
		startButton = new JButton("开始分类");
		desktop.add(startButton);
		
		description =new JTextArea();
		description.setEditable(false);
		description.setText("第1类："+"\n"+"8点差米型"+"\n"+"8点二档冲头"+"\n"+"8点高档米珠"+"\n"+"8点中档米珠"+"\n\n"
				+ "第2类："+"\n"+"8点短螺纹"+"\n"+"8点高档颗头螺纹"+"\n"+"8点高档面光"+"\n"+"10点四面光");
		selectBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectBox.getSelectedIndex()==0){
					description.setText("第1类："+"\n"+"8点差米型"+"\n"+"8点二档冲头"+"\n"+"8点高档米珠"+"\n"+"8点中档米珠"+"\n\n"
							+ "第2类："+"\n"+"8点短螺纹"+"\n"+"8点高档颗头螺纹"+"\n"+"8点高档面光"+"\n"+"10点四面光");
				}
				if(selectBox.getSelectedIndex()==1){
					description.setText("第3类："+"\n"+" 8点差米型"+"\n"+"8点高档米珠"+"\n"+"8点中档米珠"+"\n\n"
							+ "第4类："+"\n"+"8点二档冲头"+"\n\n"
							+"第5类："+"\n"+"8点短螺纹"+"\n"+"8点高档面光"+"\n\n"
							+"第6类："+"\n"+"8点高档颗头螺纹"+"\n"+"10点四面光");
				}
				
			}
		});
		desktop.add(description);
		
		picture=new JPanel();
//		picture.setBackground(Color.BLACK);
		desktop.add(picture);
		
		
		
		GridBagConstraints gridBagConstraints= new GridBagConstraints();
		gridBagConstraints.fill=GridBagConstraints.BOTH;
		
		
		gridBagConstraints.gridwidth=2;
		gridBagConstraints.weightx=0;
		gridBagConstraints.weighty=0;
		layout.setConstraints(selectBox, gridBagConstraints);
		
		gridBagConstraints.gridwidth=2;
		gridBagConstraints.weightx=1;
		gridBagConstraints.weighty=0;
		layout.setConstraints(blankPanel, gridBagConstraints);
		
		gridBagConstraints.gridwidth=0;
		gridBagConstraints.weightx=0;
		gridBagConstraints.weighty=0;
		layout.setConstraints(startButton, gridBagConstraints);
		
		
		
		gridBagConstraints.gridwidth=2;
		gridBagConstraints.weightx=0;
		gridBagConstraints.weighty=1;
		layout.setConstraints(description, gridBagConstraints);
		
		gridBagConstraints.gridwidth=3;
		gridBagConstraints.weightx=0;
		gridBagConstraints.weighty=1;
		layout.setConstraints(picture, gridBagConstraints);
		//////////////////////////////////////////////////////////
		final JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		final JMenu menu = new JMenu();
		menu.setText("文件");
		menuBar.add(menu);
	    final JMenuItem exitMenuItem=new JMenuItem("退出");
		menu.add(exitMenuItem);
		exitMenuItem.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		
		});
		final JMenu helpMenu=new JMenu("帮助");
		menuBar.add(helpMenu);
		final JMenuItem aboutMenuItem=new JMenuItem("关于作者") ;
		helpMenu.add( aboutMenuItem);
		// 为"关于作者"JMenuItem菜单项添加事件监听器
		aboutMenuItem.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				 JOptionPane.showMessageDialog(null,"版权所有：浙江工业大学信息工程学院","珍珠自动分级系统",JOptionPane.INFORMATION_MESSAGE ); //显示提示信息  
			}
		});
	}
	
	public static void main(String[] args) {
		MainFrame main =new MainFrame();
		main.setVisible(true);
	}
}
