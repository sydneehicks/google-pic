package google.pic;

import javax.swing.JFrame;

public class paint {
	public static void main(String [] args) {
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		googlepic g = new googlepic();
		f.add(g);
		f.setSize(400,250);
		f.setVisible(true);
	}
}
