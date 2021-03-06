package javapp;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	 
	public class Mainlogin extends JFrame implements ActionListener {
		 public static    String userText;
	    public static  String pwdText;
	    Container container = getContentPane();
	    JLabel label = new JLabel("LOGIN SCREEN");
	    Font font = new Font("Courier", Font.BOLD,18);
	    JLabel userLabel = new JLabel("USERNAME");
	    JLabel passwordLabel = new JLabel("PASSWORD");
	   JTextField userTextField = new JTextField();
	    JPasswordField passwordField = new JPasswordField();
	    JButton loginButton = new JButton("LOGIN");
	    JButton resetButton = new JButton("RESET");
	    JCheckBox showPassword = new JCheckBox("Show Password");
	 
	 
	   Mainlogin() {
	        setLayoutManager();
	        setLocationAndSize();
	        addComponentsToContainer();
	        addActionEvent();
	 
	    }
	 
	    public void setLayoutManager() {
	        container.setLayout(null);
	    }
	 
	    public void setLocationAndSize() {
	        label.setBounds(100,0,400,40);
	        label.setFont(font);
	        userLabel.setBounds(50, 150, 100, 30);
	        passwordLabel.setBounds(50, 220, 100, 30);
	        userTextField.setBounds(150, 150, 150, 30);
	        passwordField.setBounds(150, 220, 150, 30); 
	        showPassword.setBounds(150, 250, 150, 30);
	        loginButton.setBounds(50, 300, 100, 30);
	        resetButton.setBounds(200, 300, 100, 30);
	        
	 
	 
	    }
	 
	    public void addComponentsToContainer() {
	        container.add(label);
	        container.add(userLabel);
	        container.add(passwordLabel);
	        container.add(userTextField);
	        container.add(passwordField);
	        container.add(showPassword);
	        container.add(loginButton);
	        container.add(resetButton);
	    
	    }
	 
	    public void addActionEvent() {
	        loginButton.addActionListener(this);
	        resetButton.addActionListener(this);
	        showPassword.addActionListener(this);
	    }
	 
	 
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        //Coding Part of LOGIN button
	        if (e.getSource() == loginButton) {
	       
	            userText = userTextField.getText();
	            pwdText = passwordField.getText();
	            if (userText.equalsIgnoreCase("KHITAM SALIM WADI") && pwdText.equalsIgnoreCase("9988")) {
	                JOptionPane.showMessageDialog(this, "Login Successful");
					new GPA();
	          
	            } else {
	                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
	            }
	           
	        }
	    
	        //Coding Part of RESET button
	        if (e.getSource() == resetButton) {
	            userTextField.setText("");
	            passwordField.setText("");
	        }
	       //Coding Part of showPassword JCheckBox
	        if (e.getSource() == showPassword) {
	            if (showPassword.isSelected()) {
	                passwordField.setEchoChar((char) 0);
	            } else {
	                passwordField.setEchoChar('*');
	            }}
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Mainlogin frame = new Mainlogin();
	        frame.setTitle("Login Form");
	        frame.setVisible(true);
	        frame.setBounds(10, 10, 370, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	 
	}

}
