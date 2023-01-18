import javax.swing.*;
public class Ex_3 {
    public int number;
    public String numberStr , printChar = "";
    public static void main(String[] args) {
        Ex_3 object = new Ex_3();
        JTextArea outputTextArea = new JTextArea();
        String output = "";

        while(true) {
            //Input and Parse Int
            object.numberStr = JOptionPane.showInputDialog("Enter Number : ");
            object.number = Integer.parseInt(object.numberStr);

            if(object.number == -1) {
                break;
            }

            //Set Output
            output = object.printChar(object.number);
            outputTextArea.setText(output);
        }
        //Output
        JOptionPane.showMessageDialog(null , outputTextArea , "Histogram" , JOptionPane.QUESTION_MESSAGE);
        //Exit
        System.exit(0);
    }

    //Print *
    public String printChar(int number) {
        String star = "*";

        for(int n = 1; n < number; n++) {
            star += "*";
        }

        return printChar += number + " : " + star + "\n";
    }
}