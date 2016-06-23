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
    	setTitle("珍珠自动分级系统");
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

        jButton1.setFont(new java.awt.Font("宋体", 1, 18));
        jButton1.setText("将珍珠分成两类");
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

        jButton2.setFont(new java.awt.Font("宋体", 1, 18)); 
        jButton2.setText("将珍珠分为四类");
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

        jButton3.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jButton3.setText("将珍珠分为八类");
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
        jTextArea1.setFont(new java.awt.Font("宋体", 1, 18));
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

        jButton4.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jButton4.setText("开始分类");
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
        jTextArea2.setFont(new java.awt.Font("宋体", 1, 18));
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

        pack();
    }                       

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        jTextArea2.setText("第1类："+"\n"+"8点差米型"+"\n"+"8点二档冲头"+"\n"+"8点高档米珠"+"\n"+"8点中档米珠"+"\n\n"
				+ "第2类："+"\n"+"8点短螺纹"+"\n"+"8点高档颗头螺纹"+"\n"+"8点高档面光"+"\n"+"10点四面光");
    }                                        

    private void jButton2ActionPerformed(ActionEvent evt) {  
    	jTextArea2.setText("第3类："+"\n"+"8点差米型"+"\n"+"8点高档米珠"+"\n"+"8点中档米珠"+"\n\n"
				+ "第4类："+"\n"+"8点二档冲头"+"\n\n"
				+"第5类："+"\n"+"8点短螺纹"+"\n"+"8点高档面光"+"\n\n"
				+"第6类："+"\n"+"8点高档颗头螺纹"+"\n"+"10点四面光");
        
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
