package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		String i = choice;
		switch(i) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "PROGRAMMING!!!!");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Really, school?");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "I'm getting the hang of this");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Half Way Through!");
			break;
		case"Thursday":
			JOptionPane.showMessageDialog(null, "ALMOST THERE!");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "FINALLY!!");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "WEEKEND!!!!!!!!!!!!");
			break;
		}
	}
}
