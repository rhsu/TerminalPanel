package com.terminalPanelGUI.test;

import com.terminalPanelGUI.TerminalFrame;
import com.terminalPanelGUI.example.TerminalPanelExample;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rhsu
 */
public class UniversalPanelLauncher extends JFrame
{
	public UniversalPanelLauncher(JPanel panel)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{				
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
            public void run() 
			{
				JFrame myFrame = new UniversalPanelLauncher(new TerminalPanelExample());
            }
        });
	}
}
