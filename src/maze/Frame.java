package maze;

import javax.swing.JFrame;

public class Frame extends JFrame {

	Panel panel;

	Frame() {

		panel = new Panel();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

}
