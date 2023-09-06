package maze;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel extends JPanel {

	Panel() {

		this.setPreferredSize(new Dimension(550, 550));

		this.setBackground(Color.black);

	}

	@Override
	public void paint(Graphics a) {

		super.paint(a);

		Graphics2D graph = (Graphics2D) a;
				
		
////////////////////////////////////////////////3D lines//////////////////////////////////////////////////////////////////
		
		
//		// right lines
//		graph.setStroke(new BasicStroke(1));
//		graph.setColor(Color.gray);
//		for (int i = 0; i < 810; i = i + 5) {
//			graph.drawLine(402, 400, 800, 3 + i);
//		}
//		// left lines
//		for (int i = 0; i < 810; i = i + 5) {
//			graph.drawLine(400, 400, 0, 3 + i);
//		}
//
//
//		//center
//		graph.setColor(Color.gray);
//		for (int i = 0; i < 810; i = i + 16) {
//			graph.setStroke(new BasicStroke(2));
//			// lower
//			graph.drawLine(400, 400, 0 + i, 800);
//			// upper
//			graph.drawLine(400, 400, 0 + i, 0);
//		}
//
		
/////////////////////////////////////////////////////////squares/////////////////////////////////////////////////////////


		// squares
		graph.setStroke(new BasicStroke(25));
		// squares color
		graph.setColor(Color.gray);
		for (int i = 0; i < 450; i = i + 50) {

			graph.setColor(Color.gray);
			graph.setStroke(new BasicStroke(25));
			graph.drawRect(352 - i, 350 - i, 100 + i * 2, 100 + i * 2);
			graph.setStroke(new BasicStroke(2));
			graph.setColor(Color.white);
			graph.drawRect(352 - i, 350 - i, 100 + i * 2, 100 + i * 2);
		}

		graph.setColor(Color.gray);
		// angel line
		graph.setStroke(new BasicStroke(6));

		// right
		// upper line
		graph.drawLine(800, 3, 400, 400);
		// lower line
		graph.drawLine(800, 800, 400, 400);

		// left
		// upper line
		graph.drawLine(3, 0, 400, 400);
		// lower line
		graph.drawLine(0, 800, 400, 400);

		// center square
		graph.setColor(Color.white);
		graph.fillRect(352, 350, 100, 100);

		// name
		
		graph.setColor(Color.gray);
		graph.setFont(new Font("JFrame Project", Font.ROMAN_BASELINE, 14));
		graph.drawString("Ahmad JFrame", 353, 400);

		// signature
		graph.setColor(Color.gray.darker());
		graph.fillRect(10, 10, 205, 80);
		graph.setFont(new Font("Ahmad Naji", Font.ITALIC | Font.BOLD, 13));
		graph.setColor(Color.white);
		graph.drawString("//Ahmad Mohamad Naji\\\\", 13, 25);
		graph.drawString("//Computer Science Department\\\\", 13, 45);
		graph.drawString("//2nd Class\\\\", 13, 65);
		graph.drawString("//Computer Graphics Project\\\\", 13, 85);

	}
	
}