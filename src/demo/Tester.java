package demo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 */
public class Tester extends JPanel
{
	protected JTextField textField;
	
	public Tester()
	{
		textField = new JTextField(2000);
	}
	
	public static void createAndShowGUI()
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel p = new UseThisPanel();
		frame.add(p);

		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
            public void run() 
			{
                createAndShowGUI();
            }
        });
	}
}
