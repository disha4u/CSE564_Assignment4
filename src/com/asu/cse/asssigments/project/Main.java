package com.asu.cse.asssigments.project;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
*@author Ramachandra Sai
*@author Disha Agarawal
*@author Harshit 
*/
public class Main extends JFrame  {

	
	
	/**
	* Overriding paint component from JPanel
	* @param PlotPanel object
	* @param Source object
	*/
	Main()
	{
		BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);
        Dimension preferred = new Dimension();
		preferred.setSize(Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2, Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
		Drawable drawable=new Drawable();
		Writable writable=new Writable();
		
		drawable.setPreferredSize(new Dimension(preferred.width/2,preferred.height));
		writable.setPreferredSize(new Dimension(preferred.width/2,preferred.height));
//		drawable.setMinimumSz(new Dimension(400,400));
		writable.setPreferredSize(new Dimension(400,400));
		StatusBar statusBar=new StatusBar();
		JMenu fileOption = new JMenu("File");
		JMenu helpOption = new JMenu("Help");
		JMenuBar menuBar = new JMenuBar();
		fileOption.add(new JMenuItem("New"));
		fileOption.add(new JMenuItem("Save"));
		fileOption.add(new JMenuItem("Load"));
        menuBar.add(fileOption);
        menuBar.add(helpOption);
        add(menuBar,BorderLayout.NORTH);
        add(drawable,BorderLayout.CENTER);
        add(writable,BorderLayout.WEST);
        add(statusBar,BorderLayout.SOUTH);
        setTitle("CSE564 Final Project");
		setPreferredSize(preferred);
        pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
		
	
    }


	/**
	* the function is called as the project is started
	* @param String[] args
	*/
	public static void main(String[] args)
	{
		Main m=new Main();
		
		
	}
	

}