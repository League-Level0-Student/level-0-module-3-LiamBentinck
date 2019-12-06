package _05_horoscope;

import javax.swing.JOptionPane;

public class star {
	public static void main(String[] args) {
		String lit = JOptionPane.showInputDialog("whats your zodiac sign? The Liam reaserch center wants to know stuff about you that we dont know. We totally dont stalk you to learn all the stuff we already know about you.");
		if (lit.equals("aries")) {
			JOptionPane.showMessageDialog(null, "you will eat carrots in five minutes.");
		}
		if (lit.equals("taurus")) {
			JOptionPane.showMessageDialog(null, "you will eat carrots today.");
		}
		if (lit.equals("gemini")) {
			JOptionPane.showMessageDialog(null, "you will eat apples today.");
		}
		if (lit.equals("cancer")) {
			JOptionPane.showMessageDialog(null, "you will eat nuts today.");
		}
		if (lit.equals("leo")) {
			JOptionPane.showMessageDialog(null, "you will eat jello today.");
		}
		if (lit.equals("virgo")) {
			JOptionPane.showMessageDialog(null, "you will eat cars today.");
		}
		if (lit.equals("libra")) {
			JOptionPane.showMessageDialog(null, "you will eat peoples today.");
		}
		if (lit.equals("scorpia")) {
			JOptionPane.showMessageDialog(null, "you will eat choclates today.");
		}
		if (lit.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null, "you will eat today.");
		}
		if (lit.equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "you will watch carrots today.");
		}
		if (lit.equals("aquarius")) {
			JOptionPane.showMessageDialog(null, "you will spit on carrots today.");
		}
		if (lit.equals("pisces")) {
			JOptionPane.showMessageDialog(null, "you will do something with carrots today. I hope. Whatever.");
		} 
			
	}
}
