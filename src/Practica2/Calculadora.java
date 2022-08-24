package Practica2;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Calculadora extends JFrame implements ActionListener {
    private JTextField textField,textField2;
    private JButton addition,substraction,multiplication,division,percent,result;
    private JLabel label,label1;
    double result1;

public Calculadora() {
	setTitle("Calculadora");
	setLayout(null);
	textField = new JTextField();
	textField.setBounds(50,50,130,50);
	textField.setFont(new Font("Arial",Font.BOLD,50));
	textField.setBackground(new Color(0,0,0));
	add(textField);
	
    textField2 = new JTextField();
    textField2.setBounds(220,50,130,50);
	textField2.setFont(new Font("Arial",Font.BOLD,50));
	textField2.setBackground(new Color(0,0,0));
	add(textField2);
	
	label = new JLabel();
	label.setBounds(185,50,50,50);
	label.setFont(new Font("Arial",Font.BOLD,30));
	add(label);

	label1 = new JLabel();
	label1.setBounds(200,400,150,50);
	label1.setFont(new Font("Arial",Font.BOLD,25));
	label1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	add(label1);

	addition= new JButton("+");
	addition.setBounds(50,120,130,50);
	addition.addActionListener(this);
	addition.setFont(new Font("Arial",Font.BOLD,50));
	addition.setBackground(new Color(255,165,0));
	add(addition);


	substraction= new JButton("-");
	substraction.setBounds(50,220,130,50);
	substraction.setFont(new Font("Arial",Font.BOLD,50));
	substraction.setBackground(new Color(255,165,0));
	substraction.addActionListener(this);
	add(substraction);
	
	multiplication= new JButton("*");
	multiplication.setBounds(220,120,130,50);
	multiplication.addActionListener(this);
	multiplication.setFont(new Font("Arial",Font.BOLD,50));
	multiplication.setBackground(new Color(255,165,0));
	add(multiplication);
	
	division= new JButton("/");
	division.setBounds(220,220,130,50);
	division.addActionListener(this);
	division.setFont(new Font("Arial",Font.BOLD,50));
	division.setBackground(new Color(255,165,0));
	add(division);

    percent= new JButton("%"); //Function percent
	percent.setBounds(130,300,130,50);
	percent.addActionListener(this);
	percent.setFont(new Font("Arial",Font.BOLD,50));
	percent.setBackground(new Color(255,165,0));
	add(percent);
	
	result= new JButton("=");
	result.setBounds(50,400,130,50);
	result.addActionListener(this);
	result.setFont(new Font("Arial",Font.BOLD,50));
	result.setBackground(new Color(255,165,0));
	add(result);
	}

public void actionPerformed(ActionEvent e) {
	double num1=0,num2=0;
	if (textField.getText().isEmpty()==true || textField2.getText().isEmpty()==true ) {
			JFrame jFrame = new JFrame();
			JOptionPane.showMessageDialog(jFrame,"LLene los dos campos para continuar");
	}
	try {
		num1=Integer.parseInt(textField.getText());
		num2=Integer.parseInt(textField2.getText());
	}catch (NumberFormatException nfe) {
		System.out.println("No metas letras");
	}
	if (e.getSource()==addition) {
			label.setText("+");
		} else if (e.getSource()==substraction) {
		label.setText("-");
		}else if (e.getSource()==division) {
		label.setText("/");		
		}else if (e.getSource()==multiplication) {
		label.setText("*");
        }else if (e.getSource()==percent) {
        label.setText("%");
		}
	if (e.getSource()==result) {
		String operation=label.getText();
		switch (operation) {
		case "+":
			result1=num1+num2;
			label1.setText(""+result1);
			break;
		case "-":
			result1=num1-num2;
			label1.setText(""+result1);
			break;
		case "*":
			result1=num1*num2;
			label1.setText(""+result1);
			break;
		case "/":
			result1=num1/num2;
			label1.setText(""+result1);
			break;

    case "%":
			result1=num1* num2 /100;
			label1.setText(""+result1);
			break;
		default:
			JFrame jFrame = new JFrame();
			JOptionPane.showMessageDialog(jFrame,"Escoge una operacion");
		break;
		}
	}
}


public static void main (String[] args) {
	Calculadora calculadora = new Calculadora();
	calculadora.setBounds(0,0,400,500);
	calculadora.setVisible(true);
	calculadora.setResizable(false);
	calculadora.setLocationRelativeTo(null);
	calculadora.getContentPane().setBackground(new Color(0,0,0));
}
}
