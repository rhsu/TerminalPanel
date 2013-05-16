package com.terminalPanelGUI;

import javax.swing.JFrame;

/**
 *An extension of JFrame. A simple frame that displays a given Terminal Panel.
 */
public class TerminalFrame extends JFrame
{
	/**
	 * Constructs a TerminalFrame object
	 * @param p The terminal panel to add to the frame
	 */
	public TerminalFrame(TerminalPanel p)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(p);
		this.pack();
		this.setVisible(true);
	}
}
