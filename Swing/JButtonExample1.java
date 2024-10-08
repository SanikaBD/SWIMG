package Swing;
import java.awt.*;
import javax.swing.*;
public class JButtonExample1 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("JButton Example1");
		JButton b=new JButton(new ImageIcon("C:\\custom.png"));
		frame.add(b);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		}
		}
