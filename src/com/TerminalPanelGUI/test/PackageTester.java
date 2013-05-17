package com.terminalPanelGUI.test;

import com.terminalPanelGUI.TerminalFrame;
import com.terminalPanelGUI.example.TerminalPanel;

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
				TerminalFrame terminalFrame = new TerminalFrame(new TerminalPanel());
            }
        });
	}
}
