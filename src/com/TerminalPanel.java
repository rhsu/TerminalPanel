package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 */
public class TerminalPanel extends javax.swing.JPanel
{

	/**
	 * Creates a new Terminal Panel
	 */
	public TerminalPanel()
	{
		initComponents();
		textField.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				String input = textField.getText();
				//textArea.setText(processBasicInput(input));
				input = processBasicInput(input);
				
				if(input != null)
				{
					textArea.append(input + "\n");
				}
				
				textField.selectAll();
				textArea.setCaretPosition(textArea.getDocument().getLength());
				
				//textField.selectAll();
				//textArea.setCaretPosition(textArea.getDocument().getLength());
			}
		});
	}

	/**
	 * Processes the command `clear` to clean the screen and `exit` to exit.
	 * @param text the user input
	 */
	private String processBasicInput(String text)
	{
		if(text.equalsIgnoreCase("clear"))
		{
			textArea.setText("");
			return null;
		}
		else if(text.equalsIgnoreCase("exit"))
		{
			System.exit(0);
		}
		return text;
	}
	
	/**
	 * Override this method to provide other functionality to the JPanel
	 * @param text the text to process
	 * @param textArea access to the textArea 
	 */
	public void processInput(String text, JTextArea textArea)
	{
		
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        textField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        scrollPane.setViewportView(textArea);

        add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));
        add(textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 30));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables

	static int ctr = 0;
}
