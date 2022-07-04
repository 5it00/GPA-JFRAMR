package javapp;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GPA extends Mainlogin  implements  ActionListener {
	public static  JButton button;
	 int numberOfSubjects;
	 int NowEnter;
	String enter;
	JTextField Hours = new JTextField();
	JTextField Mark = new JTextField();
	final JComponent[] inputs = new JComponent[] {
	new JLabel("Hours"),Hours,new JLabel("The Mark"), Mark,
	 };
 Font font = new Font("Courier", Font.BOLD,24);
 Font font1 = new Font("Courier", Font.BOLD,20);
 Font font2= new Font("Courier", Font.BOLD,18);
	GPA(){	
JFrame frame = new JFrame("GPA CALCULATION");
 frame.setBounds(20,20,400, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
  JLabel label = new JLabel("WELCOME SWEETY ^_^ ::");
label.setBounds(100,0,400,40);
label.setFont(font);
JLabel labeel = new JLabel(userText +".");
labeel.setBounds(100,0,400,40);
labeel.setFont(font1);
 JLabel label2 = new JLabel("*********************************************************");
 JLabel label22 = new JLabel("*********************************************************");
 JLabel label23 = new JLabel("*********************************************************");
JLabel label3 = new JLabel("GPA CALCULATION . ");
label3.setBounds(100,0,400,40);
label3.setFont(font2);
  button = new JButton("\n"+"START");
 button.setBounds(50, 300, 100, 30);
  frame.add(label);
   frame.add(labeel);
  frame.add(label2);
  frame.add(label22);
  frame.add(label23);
 frame.add(label3);
  frame.add(button);
  frame.setLocation(500, 250);
  frame.setVisible(true);
button.addActionListener(this);
}

	 public  void getnumberofsubjct()
		{
			 enter = JOptionPane.showInputDialog("Enter # of subject you have :");
			numberOfSubjects =Integer.parseInt(enter);
			int[] hours = new int[numberOfSubjects];
			double[] marks= new double[numberOfSubjects];
			
					for(int i = 0;i<numberOfSubjects;i++){
					NowEnter = JOptionPane.showConfirmDialog(null, inputs, "Enter Hours and Mark ", JOptionPane.PLAIN_MESSAGE);
					if(NowEnter==JOptionPane.OK_OPTION){
						hours[i]=Integer.parseInt(Hours.getText());
						marks[i]=Double.parseDouble(Mark.getText());
						Hours.setText("");
				        Mark.setText("");

					}
				}
							double GPA =0.0;
							double summation=0.0;
							double summationn=0.0;
							for(int i = 0;i<numberOfSubjects;i++){
								double tmp = marks[i]*hours[i];
								summation+=tmp;
								summationn+=hours[i];
							}
							GPA = summation / summationn;
						JOptionPane.showMessageDialog(null, "The GENERAL POINT AVG :  "+GPA);

							System.out.println(GPA);

			
		

}
	 public void actionPerformed(ActionEvent e)
	 {
	 	if(e.getSource()==button)
	 	{

	 		getnumberofsubjct();
	 	
	 	
	 	}}

	  

	
}