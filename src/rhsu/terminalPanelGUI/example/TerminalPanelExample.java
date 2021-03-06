/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rhsu.terminalPanelGUI.example;

import rhsu.terminalPanelGUI.AbstractTerminal;
import rhsu.terminalPanelGUI.UniversalPanelLauncher;

/**
 *
 * @author rhsu
 */
public class TerminalPanelExample extends AbstractTerminal
{
	public TerminalPanelExample()
	{		
		super();
		dummy = 0;
		
		textArea.append("Enter a number: \n");
	}
	
	@Override
	protected String processInput(String text)
	{
		switch(state)
		{
			case 0:
				State0();
				break;
			case 1:
				State1();
				break;
			case 2:
				State2();
				return (text.equalsIgnoreCase("reset") ? null : text);
		}
		return null;
	}
	
	private int dummy;
	
	private void State0()
	{
		try
		{
			dummy = Integer.parseInt(textField.getText());
			state = 1;
			
			//output user input
			textArea.append(textField.getText() + "\n");
			
			//prompt for next state
			textArea.append("Enter a smaller number: \n");
		}
		catch(NumberFormatException e)
		{
			//output user input
			textArea.append(textField.getText() + "\n");
			
			textArea.append("Invalid entry. Try again \n");
			state = 0;
		}
	}
	
	private void State1()
	{
		try
		{

			if(Integer.parseInt(textField.getText()) < dummy)
			{
				state = 2;
				
				//output user input
				textArea.append(textField.getText() + "\n");
				
				//prompt for next state
				textArea.append("done!" + "\n");
			}
			else
			{
				state = 1;
				
				//output user input
				textArea.append(textField.getText() + "\n");
				
				//prompt for next state
				textArea.append("Enter a smaller number: \n");
			}
		}
		catch(NumberFormatException e)
		{
			//output user input
			textArea.append(textField.getText() + "\n");
			
			textArea.append("Invalid entry. Try again \n");
			state = 2;
		}
	}
	
	private void State2()
	{
		if(textField.getText().equalsIgnoreCase("reset"))
		{
			state = 0;
			textArea.append("Enter a number: \n");
		}
		else
		{
			state = 2;
		}
	}
	
	public static void main(String[] args)
	{
		UniversalPanelLauncher.Launch(new TerminalPanelExample());
	}
}
