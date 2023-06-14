package GUIProject.hust.soict.dsai.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;
    public AWTAccumulator(){
        setLayout(new GridLayout(2,2)); //khung
        add(new Label("Enter an Integer: ")); //thanh phan dau tien cua khung

        tfInput = new TextField(10); //thanh phan de user nhap
        add(tfInput);
        tfInput.addActionListener(new TFInputListener()); //action nghe thay de su dung

        add(new Label("The Accumulated Sum is: "));

        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("AWT Accumulator");
        setSize(350,120);
        setVisible(true); //kha nang hien thi cua khung
    }

    public static void main(String[] args){
        new AWTAccumulator();

    }

    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}
