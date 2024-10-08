package Swing;
import java.awt.*;
import javax.swing.*;
public class JButtonExample {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Button Example");
		JButton b=new JButton();
		b.setPreferredSize(new Dimension(100,30));
		frame.add(b);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		}
}
