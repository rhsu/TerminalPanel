package demo;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tester
{	
	public static void createAndShowGUI()
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel p = new TerminalPanel();
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
