package com.fang.pearlGUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * @author FangBinwei
 */
public class GridBagWindow extends JFrame {

    public GridBagWindow() {
    	setTitle("�����Զ��ּ�ϵͳ");
        initComponents();
    }

                       
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton4 = new JButton();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        getContentPane().setLayout(new GridBagLayout());

        jButton1.setFont(new java.awt.Font("����", 1, 18));
        jButton1.setText("������ֳ�����");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("����", 1, 18)); 
        jButton2.setText("�������Ϊ����");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
        jButton3.setText("�������Ϊ����");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jButton3, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setFont(new java.awt.Font("����", 1, 18));
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("����", 1, 18)); // NOI18N
        jButton4.setText("��ʼ����");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 30, 30);
        getContentPane().add(jButton4, gridBagConstraints);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setFont(new java.awt.Font("����", 1, 18));
        jScrollPane2.setViewportView(jTextArea2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane2, gridBagConstraints);
        
        
        
        
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

        pack();
    }                       

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        jTextArea2.setText("��1�ࣺ"+"\n"+"8�������"+"\n"+"8�������ͷ"+"\n"+"8��ߵ�����"+"\n"+"8���е�����"+"\n\n"
				+ "��2�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ���ͷ����"+"\n"+"8��ߵ����"+"\n"+"10�������");
    }                                        

    private void jButton2ActionPerformed(ActionEvent evt) {  
    	jTextArea2.setText("��3�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ�����"+"\n"+"8���е�����"+"\n\n"
				+ "��4�ࣺ"+"\n"+"8�������ͷ"+"\n\n"
				+"��5�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ����"+"\n\n"
				+"��6�ࣺ"+"\n"+"8��ߵ���ͷ����"+"\n"+"10�������");
        
    } 
    private void jButton3ActionPerformed(ActionEvent evt) {                                         
        
    }                                        

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GridBagWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration                   

}
