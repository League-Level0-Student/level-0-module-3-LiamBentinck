import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String bun = JOptionPane.showInputDialog("are you happy?");
		if (bun.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you are doing.");

		}
		else {
			String sit = JOptionPane.showInputDialog("do you want to be happy?");
			if (sit.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
			}
			else {
				JOptionPane.showMessageDialog(null, "change something!!!");
			}
		}

	}
}