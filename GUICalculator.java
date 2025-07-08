import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUICalculator extends JFrame implements ActionListener 
{
  String num1;//operator 1
  String num2;//operator 2
  String result; // to store final

  JTextField tf; // Display to Show
  JButton b1Button, b2Button, b3Button, b4Button, b5Button, b6Button, b7Button, b8Button, b9Button, b0Button,
      plusButton, subButton, MultiplyButton, DivideButton, ModuloButton, resultButton, pointButton, clearButton; 
// Button implementation
  GUICalculator() {
    JFrame f = new JFrame("My Calculator");
    f.setSize(200, 300);

    JPanel panel = new JPanel();
    panel.setBackground(Color.BLUE);
    panel.setBounds(0, 0, 200, 300);
    f.add(panel);

    tf = new JTextField(10); // Assign to class variable
    panel.add(tf);

    clearButton = new JButton("C");
    panel.add(clearButton);
    clearButton.addActionListener(this);

    b1Button = new JButton("1"); // ✅ add the variable name
    panel.add(b1Button);
    b1Button.addActionListener(this);

    b2Button = new JButton("2");
    panel.add(b2Button);
    b2Button.addActionListener(this);

    b3Button = new JButton("3");
    panel.add(b3Button);
    b3Button.addActionListener(this);

    b4Button = new JButton("4");
    panel.add(b4Button);
    b4Button.addActionListener(this);

    b5Button = new JButton("5");
    panel.add(b5Button);
    b5Button.addActionListener(this);

    b6Button = new JButton("6");
    panel.add(b6Button);
    b6Button.addActionListener(this);

    b7Button = new JButton("7");
    panel.add(b7Button);
    b7Button.addActionListener(this);

    b8Button = new JButton("8");
    panel.add(b8Button);
    b8Button.addActionListener(this);

    b9Button = new JButton("9");
    panel.add(b9Button);
    b9Button.addActionListener(this);

    b0Button = new JButton("0");
    panel.add(b0Button);
    b0Button.addActionListener(this);

    plusButton = new JButton("+");
    panel.add(plusButton);
    plusButton.addActionListener(this);

    subButton = new JButton("-");
    panel.add(subButton);
    subButton.addActionListener(this);

    MultiplyButton = new JButton("*");
    panel.add(MultiplyButton);
    MultiplyButton.addActionListener(this);

    DivideButton = new JButton("/");
    panel.add(DivideButton);
    DivideButton.addActionListener(this);

    ModuloButton = new JButton("%");
    panel.add(ModuloButton);
    ModuloButton.addActionListener(this);

    pointButton = new JButton(".");
    panel.add(pointButton);
    pointButton.addActionListener(this);

    resultButton = new JButton("=");
    resultButton.addActionListener(this); // Corrected wrong button name
    panel.add(resultButton);

    tf.setEditable(true);
    f.setResizable(false);
   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) { // Fixed method name (was lowercase)
    if (e.getSource() == b0Button)
     {
      String current = tf.getText();
      current += "0";
      tf.setText(current);
    }
    if (e.getSource() == b1Button) 
    {
      String current = tf.getText();
      current += "1";
      tf.setText(current);
    }
    if (e.getSource() == b2Button) 
    {
      String current = tf.getText();
      current += "2";
      tf.setText(current);
    }
    if (e.getSource() == b3Button)
     {
      String current = tf.getText();
      current += "3";
      tf.setText(current);
    }
    if (e.getSource() == b4Button) 
    {
      String current = tf.getText();
      current += "4";
      tf.setText(current);
    }
    if (e.getSource() == b5Button) 
    {
      String current = tf.getText();
      current += "5";
      tf.setText(current);
    }
    if (e.getSource() == b6Button)
     {
      String current = tf.getText();
      current += "6";
      tf.setText(current);
    }
    if (e.getSource() == b7Button)
    {
      String current = tf.getText();
      current += "7";
      tf.setText(current);
    }
    if (e.getSource() == b8Button)
    {
      String current = tf.getText();
      current += "8";
      tf.setText(current);
    }
    if (e.getSource() == b9Button)
     {
      String current = tf.getText();
      current += "9";
      tf.setText(current);
    }


    if(e.getSource()==pointButton)
    {
      String current=tf.getText();
      current+=".";
      tf.setText(current);
    }

    if (e.getSource() == clearButton)
     {
      tf.setText(" ");
    }





    if(e.getSource()==plusButton)
    {
      String current=tf.getText();
      current+="+";
      tf.setText(current);
    }
    if(e.getSource()==subButton)
    {
      String current=tf.getText();
      current+="-";
      tf.setText(current);
    }


      if (e.getSource() == MultiplyButton)
       {
      String current = tf.getText();
      current += "*";
      tf.setText(current);
    }

      if (e.getSource() == DivideButton)
       {
      String current = tf.getText();
      current += "/";
      tf.setText(current);
    }

      if (e.getSource() == ModuloButton)
       {
      String current = tf.getText();
      current += "%";
      tf.setText(current);
    }



        
   
      






      if (e.getSource() == resultButton) 
      {
      try {
        String input = tf.getText().trim(); // Example: "15+20"
        char operator = ' ';
        int operatorIndex = -1;

        // Step 1: Find the operator and its position
        for (int i = 0; i < input.length(); i++) {
          char ch = input.charAt(i);
          if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
            operator = ch;
            operatorIndex = i;
            break;
          }
        }

        // Step 2: If operator found, extract parts
        if (operatorIndex != -1) {
          String part1 = input.substring(0, operatorIndex);
          String part2 = input.substring(operatorIndex + 1);

          double num1 = Double.parseDouble(part1);
          double num2 = Double.parseDouble(part2);
          double result = 0;

          // Step 3: Perform operation
          switch (operator) {
            case '+':
              result = num1 + num2;
              break;
            case '-':
              result = num1 - num2;
              break;
            case '*':
              result = num1 * num2;
              break;
            case '/':
              if (num2 != 0)
                result = num1 / num2;
              else {
                tf.setText(" Undefined");
                return;
              }
              break;
            case '%':
              result = num1 % num2;
              break;
          }

          tf.setText(String.valueOf(result));
        } else {
          tf.setText("Invalid Input");
        }

      } catch (Exception ex) {
        tf.setText("Error");
      }
     }





      }

    
  
  

  public static void main(String[] args) {
    new GUICalculator();
  }
}
