package old;

/**
 * Class to launch a default terminal.
 */
public class OldPackageTester
{		
	public static void main(String[] args) 
	{
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
            public void run() 
			{
				OldTerminalFrame terminalFrame = new OldTerminalFrame(new OldTerminalPanelExample());
            }
        });
	}
}
