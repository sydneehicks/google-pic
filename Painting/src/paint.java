
import javax.swing.*;

public class paint {
	public static void main(String [] args) {
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painting g = new painting();
		f.add(g);
		f.setSize(400,250);
		f.setVisible(true);
	}
}
