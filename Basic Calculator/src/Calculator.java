import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton ButtonOne;
    private JButton ButtonTwo;
    private JButton ButtonThree;
    private JButton ButtonFour;
    private JButton ButtonFive;
    private JButton ButtonSix;
    private JButton ButtonSeven;
    private JButton ButtonEight;
    private JButton ButtonNine;
    private JButton ButtonZero;
    private JButton ButtonPlus;
    private JButton ButtonMinus;
    private JButton ButtonDevise;
    private JButton ButtonMultiply;
    private JButton ButtonDot;
    private JButton ButtonClear;
    private JButton ButtonEqual;


    private void getOperator (String ButtonText){
        math_operator = ButtonText.charAt(0);
        total1 = total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public Calculator() {

        ButtonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonOneText = textDisplay.getText() + ButtonOne.getText();
                textDisplay.setText(ButtonOneText);
            }
        });
        ButtonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonTwoText = textDisplay.getText() + ButtonTwo.getText();
                textDisplay.setText(ButtonTwoText);
            }
        });
        ButtonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonThreeText = textDisplay.getText() + ButtonThree.getText();
                textDisplay.setText(ButtonThreeText);
            }
        });
        ButtonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonFourText = textDisplay.getText() + ButtonFour.getText();
                textDisplay.setText(ButtonFourText);
            }
        });
        ButtonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonFiveText = textDisplay.getText() + ButtonFive.getText();
                textDisplay.setText(ButtonFiveText);
            }
        });

        ButtonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonSixText = textDisplay.getText() + ButtonSix.getText();
                textDisplay.setText(ButtonSixText);
            }
        });
        ButtonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonSevenText = textDisplay.getText() + ButtonSeven.getText();
                textDisplay.setText(ButtonSevenText);
            }
        });
        ButtonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonEightText = textDisplay.getText() + ButtonEight.getText();
                textDisplay.setText(ButtonEightText);
            }
        });
        ButtonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonNineText = textDisplay.getText() + ButtonNine.getText();
                textDisplay.setText(ButtonNineText);
            }
        });
        ButtonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ButtonZeroText = textDisplay.getText() + ButtonZero.getText();
                textDisplay.setText(ButtonZeroText);
            }
        });
        ButtonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }
                else if(textDisplay.getText().contains(".")){
                    ButtonDot.setEnabled(false);
                }
                else{
                    String ButtonDotText = textDisplay.getText() + ButtonDot.getText();
                    textDisplay.setText(ButtonDotText);
                }
                ButtonDot.setEnabled(true);
            }
        });

        ButtonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_text = ButtonPlus.getText();
                getOperator(Button_text);
            }
        });

        ButtonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_text = ButtonMinus.getText();
                getOperator(Button_text);
            }
        });
        ButtonDevise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_text = ButtonDevise.getText();
                getOperator(Button_text);
            }
        });
        ButtonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button_text = ButtonMultiply.getText();
                getOperator(Button_text);
            }
        });
        ButtonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        ButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
