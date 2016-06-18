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
		    "������ֳ�����", "�������Ϊ����"
		  };
	private int count = 0;
	
	public MainFrame(){
		this.setTitle("�����Զ��ּ�ϵͳ");
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
		
		startButton = new JButton("��ʼ����");
		desktop.add(startButton);
		
		description =new JTextArea();
		description.setEditable(false);
		description.setText("��1�ࣺ"+"\n"+"8�������"+"\n"+"8�������ͷ"+"\n"+"8��ߵ�����"+"\n"+"8���е�����"+"\n\n"
				+ "��2�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ���ͷ����"+"\n"+"8��ߵ����"+"\n"+"10�������");
		selectBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectBox.getSelectedIndex()==0){
					description.setText("��1�ࣺ"+"\n"+"8�������"+"\n"+"8�������ͷ"+"\n"+"8��ߵ�����"+"\n"+"8���е�����"+"\n\n"
							+ "��2�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ���ͷ����"+"\n"+"8��ߵ����"+"\n"+"10�������");
				}
				if(selectBox.getSelectedIndex()==1){
					description.setText("��3�ࣺ"+"\n"+" 8�������"+"\n"+"8��ߵ�����"+"\n"+"8���е�����"+"\n\n"
							+ "��4�ࣺ"+"\n"+"8�������ͷ"+"\n\n"
							+"��5�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ����"+"\n\n"
							+"��6�ࣺ"+"\n"+"8��ߵ���ͷ����"+"\n"+"10�������");
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
		menu.setText("�ļ�");
		menuBar.add(menu);
	    final JMenuItem exitMenuItem=new JMenuItem("�˳�");
		menu.add(exitMenuItem);
		exitMenuItem.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		
		});
		final JMenu helpMenu=new JMenu("����");
		menuBar.add(helpMenu);
		final JMenuItem aboutMenuItem=new JMenuItem("��������") ;
		helpMenu.add( aboutMenuItem);
		// Ϊ"��������"JMenuItem�˵�������¼�������
		aboutMenuItem.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				 JOptionPane.showMessageDialog(null,"��Ȩ���У��㽭��ҵ��ѧ��Ϣ����ѧԺ","�����Զ��ּ�ϵͳ",JOptionPane.INFORMATION_MESSAGE ); //��ʾ��ʾ��Ϣ  
			}
		});
	}
	
	public static void main(String[] args) {
		MainFrame main =new MainFrame();
		main.setVisible(true);
	}
}
