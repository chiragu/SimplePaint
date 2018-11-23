package com.chiragus.SimplePaint;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * A simple paint program with a pencil and eraser
 * 
 * @author Chirag Uttamsingh
 * @version 2017.09 - initial implementation
 * @since 2017.09
 */
public class SimplePaint {
	
	// Main ---------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		// Create and launch application
		JPanel paintPanel;
		JFrame UXPaintFrame;
		paintPanel = new PaintUXPanel();
		UXPaintFrame = new JFrame("UX-Paint: " + new SimpleDateFormat("MM/dd/yyyy").format(new Date()));
		
		UXPaintFrame.add(paintPanel);
		UXPaintFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
		
		UXPaintFrame.setSize(600,500);
		UXPaintFrame.setVisible(true);
	}
	
}
