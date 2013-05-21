package rhsu.terminalPanelGUI.example;

import rhsu.terminalPanelGUI.AbstractTerminal;
import rhsu.terminalPanelGUI.UniversalPanelLauncher;

/**
 *An example implementation of Abstract Terminal.
 * By default, this application echoes user input and can process basic commands
 * such as `clear` and `exit`.
 */
public class TerminalPanel extends AbstractTerminal
{
	/**
	 * initializes the Abstract Terminal default constructor.
	 */
	public TerminalPanel()
	{
		super();
	}
	
	/**
	 * Main method. This file can be executed
	 * @param args 
	 */
	public static void main(String[] args)
	{
		UniversalPanelLauncher.Launch(new TerminalPanel());
	}
}
