package _04_Intro_To_Enums;

import java.util.Random;

import javax.swing.JOptionPane;

public class States {
public static void main(String[] args) {
	int randy = new Random().nextInt(5);
	StatesOfMatter state = StatesOfMatter.SOLID;
	switch(randy) {
	case 0:
		state = StatesOfMatter.SOLID;
		break;
	case 1:
		state = StatesOfMatter.LIQUID;
		break;
	case 2:
		state = StatesOfMatter.GAS;
		break;
	case 3:
		state = StatesOfMatter.PLASMA;
		break;
	case 4:
		state = StatesOfMatter.BOSE_EINSTEIN_CONDENSATE;
		break;
	}
	switch(state) {
	case SOLID:
		JOptionPane.showMessageDialog(null, "Not that bad");
		break;
	case LIQUID:
		JOptionPane.showMessageDialog(null, "a little warmer");
		break;
	case GAS:
		JOptionPane.showMessageDialog(null, "OW!! HOT");
		break;
	case PLASMA:
		JOptionPane.showMessageDialog(null, "Where did my hands go, and where is there black stuff on the floor?");
		break;
	case BOSE_EINSTEIN_CONDENSATE:
		JOptionPane.showMessageDialog(null, "I think I have frostbite");
		break;
		
	}
}
}
