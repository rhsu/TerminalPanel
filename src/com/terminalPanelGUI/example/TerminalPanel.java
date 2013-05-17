package com.terminalPanelGUI.example;

import com.terminalPanelGUI.AbstractTerminal;
import com.terminalPanelGUI.UniversalPanelLauncher;

/**
 *
 * @author rhsu
 */
public class TerminalPanel extends AbstractTerminal
{
	public TerminalPanel()
	{
		super();
	}
	
	public static void main(String[] args)
	{
		UniversalPanelLauncher.Launch(new TerminalPanel());
	}
}
