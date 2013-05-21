package rhsu.terminalPanelGUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author rhsu
 */
public class UniversalFrame extends JFrame
{
	private JMenuBar jMenuBar;
	private JMenu fileMenu;
	private JMenuItem[] menuItems;
	
	public UniversalFrame(JPanel panel)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.initMenu();
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
	
	private void initMenu()
	{
		jMenuBar = new JMenuBar();
		fileMenu = new JMenu();
		menuItems = new JMenuItem[4];
		
		//initialize JMenuItems and add to file menu
		for(int i = 0; i < menuItems.length; i++)
		{
			menuItems[i] = new JMenuItem();
			fileMenu.add(menuItems[i]);
		}
		
		//set the text of each menu item
		menuItems[0].setText("New");
		menuItems[1].setText("Open");
		menuItems[2].setText("Save");
		menuItems[3].setText("Close");

		//set the text of fileMenu
		fileMenu.setText("File");
	
        jMenuBar.add(fileMenu);
		setJMenuBar(jMenuBar);
	}
}
