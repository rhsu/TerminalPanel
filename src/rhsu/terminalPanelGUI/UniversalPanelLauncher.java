package rhsu.terminalPanelGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rhsu
 */
public class UniversalPanelLauncher
{
	public static void Launch(final JPanel panel)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
            public void run() 
			{
				JFrame myFrame = new UniversalFrame(panel);
            }
        });
	}
}
