package com.terminalPanelGUI;

import com.terminalPanelGUI.example.TerminalPanelExample;
import javax.swing.JFrame;

/**
 *
 * @author rhsu
 */
public class UniversalPanelLauncher
{		
	public static void main(String[] args)
	{				
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
            public void run() 
			{
				JFrame myFrame = new UniversalFrame(new TerminalPanelExample());
            }
        });
	}
}
