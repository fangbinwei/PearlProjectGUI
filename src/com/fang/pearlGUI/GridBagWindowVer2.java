package com.fang.pearlGUI;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import libsvmAPI.*;

/**
 * @author FangBinwei
 */
public class GridBagWindowVer2 extends JFrame {
	public static int classFlag=0;
	public static Boolean stopFlag=false;

    public GridBagWindowVer2() {
    	setTitle("�����Զ��ּ�ϵͳ");
        initComponents();
    }

                       
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jButton1 = new JButton();
        jButton2 = new JButton();
//        jButton3 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton4 = new JButton();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jScrollPane3 = new JScrollPane();
        jTextArea3 = new JTextArea();
        jScrollPane4 = new JScrollPane();
        jTextArea4 = new JTextArea();
        jScrollPane5 = new JScrollPane();
        jTextArea5 = new JTextArea();
        jScrollPane6 = new JScrollPane();
        jTextArea6 = new JTextArea();
        jScrollPane7 = new JScrollPane();
        jTextArea7 = new JTextArea();
        jScrollPane8 = new JScrollPane();
        jTextArea8 = new JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        getContentPane().setLayout(new GridBagLayout());
        //�����ఴť
        jButton1.setFont(new java.awt.Font("����", 1, 24));
        jButton1.setText("������ֳ�����");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jButton1, gridBagConstraints);
        
        //�����ఴť
        jButton2.setFont(new java.awt.Font("����", 1, 24)); 
        jButton2.setText("������ֳ�����");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jButton2, gridBagConstraints);

//        jButton3.setFont(new java.awt.Font("����", 1, 24)); 
//        jButton3.setText("������ֳɰ���");
//        jButton3.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                jButton3ActionPerformed(evt);
//            }
//        });

//        gridBagConstraints = new GridBagConstraints();
//        gridBagConstraints.gridx = 9;
//        gridBagConstraints.gridy = 1;
//        gridBagConstraints.gridwidth = 3;
//        gridBagConstraints.gridheight = 3;
//        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
//        gridBagConstraints.weightx = 0.1;
//        gridBagConstraints.weighty = 0.1;
//        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
//        getContentPane().add(jButton3, gridBagConstraints);

        //��ʼ���ఴť
        jButton4.setFont(new java.awt.Font("����", 1, 24)); // NOI18N
        jButton4.setText("��ʼ����");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.insets = new java.awt.Insets(60, 30, 60, 30);
        getContentPane().add(jButton4, gridBagConstraints);

        //
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setFont(new java.awt.Font("����", 1, 18));
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setText("8�������");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane1, gridBagConstraints);
        
        
        
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setFont(new java.awt.Font("����", 1, 18));
        jTextArea2.setEditable(false);
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setText("8���е�����");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane2, gridBagConstraints);
        
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setFont(new java.awt.Font("����", 1, 18));
        jTextArea3.setEditable(false);
        jScrollPane3.setViewportView(jTextArea3);
        jTextArea3.setText("8��ߵ�����");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane3, gridBagConstraints);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setFont(new java.awt.Font("����", 1, 18));
        jTextArea4.setEditable(false);
        jScrollPane4.setViewportView(jTextArea4);
        jTextArea4.setText("8�������ͷ");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane4, gridBagConstraints);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setFont(new java.awt.Font("����", 1, 18));
        jTextArea5.setEditable(false);
        jScrollPane5.setViewportView(jTextArea5);
        jTextArea5.setText("8�������");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane5, gridBagConstraints);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setFont(new java.awt.Font("����", 1, 18));
        jTextArea6.setEditable(false);
        jScrollPane6.setViewportView(jTextArea6);
        jTextArea6.setText("8��ߵ����");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane6, gridBagConstraints);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setFont(new java.awt.Font("����", 1, 18));
        jTextArea7.setEditable(false);
        jScrollPane7.setViewportView(jTextArea7);
        jTextArea7.setText("8��ߵ���ͷ����");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane7, gridBagConstraints);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setFont(new java.awt.Font("����", 1, 18));
        jTextArea8.setEditable(false);
        jScrollPane8.setViewportView(jTextArea8);
        jTextArea8.setText("10�������");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane8, gridBagConstraints);
        
        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setFont(new java.awt.Font("����", 1, 18));
        jTextArea9.setEditable(false);
        jScrollPane9.setViewportView(jTextArea9);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(30, 30, 30, 30);
        getContentPane().add(jScrollPane9, gridBagConstraints);
        
        
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
    	classFlag=2;
    	jTextArea1.setBackground(Color.gray);
    	jTextArea2.setBackground(Color.gray);
    	jTextArea3.setBackground(Color.gray);
    	jTextArea4.setBackground(Color.gray);
    	jTextArea5.setBackground(Color.orange);
    	jTextArea6.setBackground(Color.orange);
    	jTextArea7.setBackground(Color.orange);
    	jTextArea8.setBackground(Color.orange);
//        jTextArea2.setText("��1�ࣺ"+"\n"+"8�������"+"\n"+"8�������ͷ"+"\n"+"8��ߵ�����"+"\n"+"8���е�����"+"\n\n"
//				+ "��2�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ���ͷ����"+"\n"+"8��ߵ����"+"\n"+"10�������");
    }                                        

    private void jButton2ActionPerformed(ActionEvent evt) { 
    	classFlag=4;
    	jTextArea1.setBackground(Color.gray);
    	jTextArea2.setBackground(Color.gray);
    	jTextArea3.setBackground(Color.gray);
    	jTextArea4.setBackground(Color.BLUE);
    	jTextArea5.setBackground(Color.orange);
    	jTextArea6.setBackground(Color.orange);
    	jTextArea7.setBackground(Color.green);
    	jTextArea8.setBackground(Color.green);
//    	jTextArea2.setText("��3�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ�����"+"\n"+"8���е�����"+"\n\n"
//				+ "��4�ࣺ"+"\n"+"8�������ͷ"+"\n\n"
//				+"��5�ࣺ"+"\n"+"8�������"+"\n"+"8��ߵ����"+"\n\n"
//				+"��6�ࣺ"+"\n"+"8��ߵ���ͷ����"+"\n"+"10�������");
        
    } 
//    private void jButton3ActionPerformed(ActionEvent evt) {                                         
//        
//    }         
    
    private void jButton4ActionPerformed(ActionEvent evt) {
//    	if(stopFlag){
//    		stopFlag=false;
//    		jButton4.setText("��ʼ����");
//    		
//    	}
    	if(!stopFlag){
    		
    		if(classFlag==0){
    			JOptionPane.showMessageDialog(null, "��ȷ��������ֳɼ���","��ʾ", JOptionPane.WARNING_MESSAGE);
    			
    		}
    		if(classFlag==2){
    			
    			int result=JOptionPane.showConfirmDialog(null,"�Ƿ�ȷ��������ֳ�����","��ʾ", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    			System.out.println(result);
    			//click yes
    			if(result==0){
    				//��ʼ���з������ ��ť׼�����stop
    				stopFlag=true;
    				jButton4.setText("ֹͣ");
    				String modelFile = "normalTrainData.model";
    				String[] testArgs = {"DataSet/train/ForModel/normalTestData", modelFile, "DataSet/train/ForModel/result"};//directory of test file, model file, result file
    				Double accuracy;
    				try {
    					accuracy = svm_predict.main(testArgs);
    					System.out.println("SVM Classification is done! The accuracy is " + accuracy);
    					jTextArea9.setText("�������������Ϊ"+svm_predict.getTotal()+"��\n"+
    							"�ֳ�����"+"\n"+
    							"������ȷ������Ϊ"+svm_predict.getCorrect()+"��\n"+
    							"��ȷ��Ϊ"+accuracy*100+"%");
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    				
    			}
    			//click no
    			if(result==1){
    				
    			}
    		}
    		if(classFlag==4){
    			
    			int result=JOptionPane.showConfirmDialog(null,"�Ƿ�ȷ��������ֳ�����","��ʾ", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    			System.out.println(result);
    		}
    	}
    	
    	
    }   

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GridBagWindowVer2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
//    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    
    
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration                   

}
