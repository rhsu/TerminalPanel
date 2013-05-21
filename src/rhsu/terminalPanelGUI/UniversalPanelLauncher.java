package rhsu.terminalPanelGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *A class to launch a Universal Frame
 */
public class UniversalPanelLauncher
{
	/**
	 * A public function to constructs a Universal Frame
	 * @param panel the Panel to attach to the Frame
	 */
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
