package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	public static void main(String[] args) {
		Zodiac signs = Zodiac.AQUARIUS;
		String[] options = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

		int input = JOptionPane.showOptionDialog(null, "Choose the month you were born in", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	int randy = new Random().nextInt(12);
	switch(choice) {
	case "January":
		JOptionPane.showMessageDialog(null, "Aries");
		break;
	case "Febuary":
		JOptionPane.showMessageDialog(null, "Taurus");
		break;
	case "March":
		JOptionPane.showMessageDialog(null, "Gemini");
		break;
	case "April":
		JOptionPane.showMessageDialog(null, "Cancer");
		break;
	case "May":
		JOptionPane.showMessageDialog(null, "Leo");
		break;
	case "June":
		JOptionPane.showMessageDialog(null, "Virgo");
		break;
	case "July":
		JOptionPane.showMessageDialog(null, "Libra");
		break;
	case "August":
		JOptionPane.showMessageDialog(null, "Scorpio");
		break;
	case "September":
		JOptionPane.showMessageDialog(null, "Sagittarious");
		break;
	case "October":
		JOptionPane.showMessageDialog(null, "Capricorn");
		break;
	case "November":
		JOptionPane.showMessageDialog(null, "Aquarius");
		break;
	case "December":
		JOptionPane.showMessageDialog(null, "Pisces");
		break;
	
		
	}
	// 3. Make a main method to test your method
	
	}
}
