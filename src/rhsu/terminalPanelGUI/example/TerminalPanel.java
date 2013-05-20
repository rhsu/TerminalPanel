package rhsu.terminalPanelGUI.example;

import rhsu.terminalPanelGUI.AbstractTerminal;
import rhsu.terminalPanelGUI.UniversalPanelLauncher;

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
