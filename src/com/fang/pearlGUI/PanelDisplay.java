package com.fang.pearlGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;
import java.awt.image.*;
import java.util.LinkedList;
/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class PanelDisplay extends JPanel
{
	protected JImagePanel imagePanel = null;
	
	public PanelDisplay()
	{
		imagePanel = new JImagePanel();
		initGUI();
	}

	public JPanel getImagePanel()
	{
		return imagePanel;
	}
	
	public void setCurResultImage(int[] bufImage,int w,int h)
	{
		imagePanel.setImage(bufImage,w,h);
	}
	public void setCurResultImageOmni( BufferedImage bufImage)
	{
		imagePanel.setImage(bufImage);
	}
	public BufferedImage getCurResultImage()
	{
		BufferedImage tempimage = null;
		BufferedImage bufImage = imagePanel.getCurImage();
		if (bufImage != null)
		{
			int width = bufImage.getWidth(), height = bufImage.getHeight();
			tempimage = new BufferedImage(width, height, bufImage.getType());
			tempimage.getGraphics().drawImage(bufImage, 0, 0, width, height,
					null);
		}
		return tempimage;

	}
	
	/**
	 * @Title: getX
	 * @Description: TODO 获得中心点
	 * @param @param a块号
	 * @param @return a块的中心点X
	 */
	public int getX(int x) {
		return x;
	}

	/**
	 * @Title: getY
	 * @Description: TODO 获得中心点
	 * @param @param a
	 * @param @return a块的中心点Y
	 */
	public int getY(int y) {
		return y;
	}
	public JImagePanel getJImagePanel(){
		
		
		return imagePanel;
	}
	private void initGUI()
	{
		try
		{
			BorderLayout thisLayout = new BorderLayout();
			this.setLayout(thisLayout);
			this.add(imagePanel, BorderLayout.CENTER);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
