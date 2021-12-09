import javax.swing.JOptionPane;

public class Main {
	public static void main(String args[]) {
		JOptionPane
			 .showMessageDialog(
						null,
						"Welcome to the Scouting simulator \n"
								+ " The point is to test your luck and Good Luck to all of you! \n"
								+ "It gonna take a minute to load so give it some time");
		// JOptionPane.showMessageDialog(null, "at least this works");
		Scout S = new Scout();
		S.settings();
	}
}
