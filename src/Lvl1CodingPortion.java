import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lvl1CodingPortion implements ActionListener {
	JFrame frame = new JFrame();	
	JPanel panel= new JPanel();
	JButton butt1 = new JButton();
	JButton butt2= new JButton();
	JButton butt3= new JButton();
	JButton butt4= new JButton();
	static Lvl1CodingPortion object= new Lvl1CodingPortion();
public static void main(String[] args) {
	
	object.run();
}
void run(){

frame.setVisible(true);
panel.setVisible(true);
butt1.setVisible(true);
frame.add(panel);
panel.add(butt1);
panel.add(butt2);
panel.add(butt3);
panel.add(butt4);
butt1.setBackground(Color.YELLOW);
butt1.setOpaque(true);
butt2.setBackground(Color.RED);
butt2.setOpaque(true);
butt3.setBackground(Color.BLUE);
butt3.setOpaque(true);
butt4.setBackground(Color.GREEN);
butt4.setOpaque(true);
butt1.addActionListener(this);
butt2.addActionListener(this);
butt3.addActionListener(this);
butt4.addActionListener(this);
frame.pack();


}
void speak(String words){
	try{
		
		Runtime.getRuntime().exec("say "+words);
	}catch(IOException e){
		e.printStackTrace();
	}
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
System.out.println(e.getSource());
if (e.getSource().equals(butt1)) {
	object.speak("YELLOW");
}
if (e.getSource().equals(butt2)) {
	object.speak("RED");
}
if (e.getSource().equals(butt3)) {
	object.speak("BLUE");
}
if (e.getSource().equals(butt4)) {
	object.speak("GREEN");
}
}
}
