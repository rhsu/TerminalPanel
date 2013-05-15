/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

import com.TerminalPanelGUI.TerminalFrame;
import com.TerminalPanelGUI.TerminalPanel;

/**
 *
 */
public class TerminalPanel2 extends TerminalPanel
{
	public TerminalPanel2()
	{
		super();
	}
	
	@Override
	public String processInput(String s)
	{
		if(s.equalsIgnoreCase("test"))
		{
			System.out.println("Went into here");
			textArea.append("this worked");
		}
		return s;
	}
	
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
            public void run() 
			{
				TerminalPanel p2 = new TerminalPanel2();
				TerminalFrame terminalFrame = new TerminalFrame(p2);
            }
        });
	}
}
