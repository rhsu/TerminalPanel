package rhsu.terminalPanelGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rhsu
 */
public class UniversalFrame extends JFrame
{
	public UniversalFrame(JPanel panel)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
}
