package rhsu.terminalPanelGUI.example;

import rhsu.terminalPanelGUI.AbstractTerminal;
import rhsu.terminalPanelGUI.UniversalPanelLauncher;

/**
 *An example game that demonstrates example usage of the state machine design.
 * 
 *The game prompts the user to enter a number. Then input a smaller input.
 * Error checking is included.
 */
public class TerminalPanelExample extends AbstractTerminal
{
	/**
	 * Constructor
	 */
	public TerminalPanelExample()
	{		
		super();
		dummy = 0;
		
		textArea.append("Enter a number: \n");
	}
	
	/**
	 * This function is overriden to allow manipulation of states
	 * @param text the text the user provides
	 * @return null if there is nothing to echo.
	 */
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
	
	/**
	 * A dummy variable to hold the user's input
	 */
	private int dummy;
	
	/**
	 * The first state.
	 * 
	 * attempts to read in the user entered data.
	 * Transitions to State1() if successful
	 */
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
	
	/**
	 * The second state
	 * 
	 * Processes the smaller number
	 * 
	 * Transitions to state2 if successful.
	 */
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
	
	/**
	 * The final state.
	 * Allows the processing of reset.
	 */
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
	
	/**
	 * Main method
	 * @param args args 
	 */
	public static void main(String[] args)
	{
		UniversalPanelLauncher.Launch(new TerminalPanelExample());
	}
}
