package com.terminalPanelGUI.test;

import com.terminalPanelGUI.TerminalFrame;
import com.terminalPanelGUI.TerminalPanel2;

/**
 * Class to launch a default terminal.
 */
public class PackageTester
{		
	public static void main(String[] args) 
	{
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
            public void run() 
			{
				TerminalFrame terminalFrame = new TerminalFrame(new TerminalPanel2());
            }
        });
	}
}
