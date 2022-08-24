package Practica2;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Calculadora extends JFrame implements ActionListener {
     private JTextField textField,textField2;
     private JButton addition,substraction,multiplication,division,percent, exponente, result;
     private JLabel label,label1;
     double result1;
 
public Calculadora() {
	   setTitle("Calculadora - Grupo 03");
	   setLayout(null);
	   textField = new JTextField();
	   textField.setBounds(50,50,130,50);
	   textField.setFont(new Font("Arial",Font.BOLD,50));
	   add(textField);
	   
       textField2 = new JTextField();
       textField2.setBounds(220,50,130,50);
	   textField2.setFont(new Font("Arial",Font.BOLD,50));
	   add(textField2);
	   
	   label = new JLabel();
	   label.setBounds(185,50,50,50);
	   label.setFont(new Font("Arial",Font.BOLD,30));
	   add(label);
	   
	   label1 = new JLabel();
	   label1.setBounds(175,300,100,150);
	   label1.setFont(new Font("Arial",Font.BOLD,25));
	   add(label1);
	   
	   
	   addition= new JButton("+");
	   addition.setBounds(50,120,130,50);
	   addition.addActionListener(this);
	   addition.setFont(new Font("Arial",Font.BOLD,50));
	   add(addition);

   	   
	   substraction= new JButton("-");
	   substraction.setBounds(50,220,130,50);
	   substraction.setFont(new Font("Arial",Font.BOLD,50));
	   substraction.addActionListener(this);
	   add(substraction);
	   
	   multiplication= new JButton("*");
	   multiplication.setBounds(220,120,130,50);
	   multiplication.addActionListener(this);
	   multiplication.setFont(new Font("Arial",Font.BOLD,50));
	   add(multiplication);
	   
	   
	   division= new JButton("/");
	   division.setBounds(220,220,130,50);
	   division.addActionListener(this);
	   division.setFont(new Font("Arial",Font.BOLD,50));
	   add(division);

       percent= new JButton("%"); //Function percent
	   percent.setBounds(50,300,130,50);
	   percent.addActionListener(this);
	   percent.setFont(new Font("Arial",Font.BOLD,50));
	   add(percent);

	   exponente= new JButton("exp"); //Function percent
	   exponente.setBounds(220,300,130,50);
	   exponente.addActionListener(this);
	   exponente.setFont(new Font("Arial",Font.BOLD,50));
	   add(exponente);
	   
	   result= new JButton("=");
	   result.setBounds(50,400,300,50);
	   result.addActionListener(this);
	   result.setFont(new Font("Arial",Font.BOLD,50));
	   add(result);
	   
	   
	  }

public void actionPerformed(ActionEvent e) {
	   double num1=0,num2=0;
	   if (textField.getText().isEmpty()==true || textField2.getText().isEmpty()==true ) {
			JFrame jFrame = new JFrame();
			JOptionPane.showMessageDialog(jFrame,"LLene los dos campos para poder continuar");
	   }
	   try {
		   num1=Integer.parseInt(textField.getText());
		   num2=Integer.parseInt(textField2.getText());
	}catch (NumberFormatException nfe) {
		System.out.println("No introduzcas letras");
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
		}else if (e.getSource()==exponente) {
			label.setText("exp");
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
		case "exp":
			result1= Math.pow(num1, num2);
			label1.setText(""+result1);
		default:
			JFrame jFrame = new JFrame();
			JOptionPane.showMessageDialog(jFrame,"Escoge solo una operacion");
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
}
}
