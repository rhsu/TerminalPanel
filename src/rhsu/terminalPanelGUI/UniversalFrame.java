package rhsu.terminalPanelGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * A frame, which can hold any JPanel.
 * Also includes a jMenuBar with a Menu (along with its items).
 */
public class UniversalFrame extends JFrame
{
	/**
	 * The menu bar
	 */
	private JMenuBar jMenuBar;
	/**
	 * The file menu
	 */
	private JMenu fileMenu;
	/**
	 * An array of menu items
	 */
	private JMenuItem[] menuItems;
	
	/**
	 * Constructs a Universal Frame
	 * @param panel the panel to attach to the Frame
	 */
	public UniversalFrame(JPanel panel)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.initMenu();
		this.add(panel);
		this.pack();
	}
	
	/**
	 * Initializes the menu items
	 */
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

		menuItems[3].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt) 
			{
				System.exit(0);
			}
		});
		
		//set the text of fileMenu
		fileMenu.setText("File");
			
        jMenuBar.add(fileMenu);
		setJMenuBar(jMenuBar);
	}
}
