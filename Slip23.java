//Q1
import java.util.Scanner;
class MyNumber
{
	private int no;
  	MyNumber()
   	{
   	   no=0;
        }
        MyNumber(int no)
        {
          this.no=no;
        }
	void negative()
	{
          if(no<0)
          System.out.println(+no+ "is Negative");
  	}
	void Positive()
	{
          if(no>0)
          System.out.println(+no+ "Number is Positive");
   	}
	void Zero()
	{
  	  if(no==0)
  	  System.out.println(+no+ "Number is Zero");
   	}
 	void Odd()
 	{
  	  if(no%2!=0)
  	  System.out.println(+no+ "Number is Odd");
 	}
	void Even()
	{
 	   if(no%2==0)
 	   System.out.println(+no+ "Number is Even");
  	}
 
 	public static void main(String [] args) 
 	{
   		System.out.println("Enter the number ");
   		Scanner s=new Scanner(System.in);
   		int no=s.nextInt();
   		MyNumber m=new MyNumber(no);
  		m.Positive(); 
  		m.negative(); 		
  		m.Even();   		
  		m.Odd();
   		m.Zero();  		
 }
}
//Q2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip23
{
    private JFrame frame;
    private JTextField amountField;
    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JLabel resultLabel;

    public Slip23() 
    {
        frame = new JFrame("Currency Converter");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        amountField = new JTextField(10);
        fromCurrency = new JComboBox<>(new String[] { "SGD", "USD", "EUR" });
        toCurrency = new JComboBox<>(new String[] { "SGD", "USD", "EUR" });
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Converted Amount: ");

        frame.add(new JLabel("Amount:"));
        frame.add(amountField);
        frame.add(new JLabel("From:"));
        frame.add(fromCurrency);
        frame.add(new JLabel("To:"));
        frame.add(toCurrency);
        frame.add(convertButton);
        frame.add(resultLabel);

        convertButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                convertCurrency();
            }
        });

        frame.setVisible(true);
    }

    private void convertCurrency() 
    {
        try {
            double amount = Double.parseDouble(amountField.getText());
            String from = fromCurrency.getSelectedItem().toString();
            String to = toCurrency.getSelectedItem().toString();

            double convertedAmount = convert(amount, from, to);
            resultLabel.setText("Converted Amount: " + String.format("%.2f", convertedAmount));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }

    private double convert(double amount, String from, String to)
     {
        double usdAmount = 0;
        if (from.equals("SGD")) 
        {
            usdAmount = amount / 1.41;
        } else if (from.equals("USD"))
        {
            usdAmount = amount;
        } 
        else if (from.equals("EUR")) 
        {
            usdAmount = amount / 0.92;
        }

        if (to.equals("SGD"))
        {
            return usdAmount * 1.41;
        } 
        else if (to.equals("USD")) 
        {
            return usdAmount;
        } 
        else if (to.equals("EUR"))
        {
            return usdAmount * 0.92;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new Slip23());
    }
}
