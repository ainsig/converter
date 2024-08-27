/*
 *Author: Arlo Insigne
 * CMIS 242
 * Purpose: Write a program that converts miles to kilometers and Fahrenheit to Celsius
 * October 28, 2022
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunConverter {
    public static void main(String[] args) {

            //Creating the buttons that will be placed in the frame
            JButton convertTemp = new JButton("Temperature Converter");
            JButton convertDistance = new JButton("Distance Converter");
            JButton exitProgram = new JButton("Exit");


            //Creating the frame where everything will go
            JFrame window = new JFrame("Welcome to Converter");

            //Adding listener to the convertTemp button
            TempConverter tcListener = new TempConverter(window);
            convertTemp.addActionListener(tcListener);

            //Add listener to the convertDistance button
            DistConverter dcListener = new DistConverter(window);
            convertDistance.addActionListener(dcListener);

            //Add listener to the exitProgram button
            ExitProgram epListener = new ExitProgram(window);
            exitProgram.addActionListener(epListener);

            JPanel content = new JPanel();
            content.setLayout(new BorderLayout());

            content.add(convertTemp, BorderLayout.WEST);
            content.add(convertDistance, BorderLayout.EAST);
            content.add(exitProgram, BorderLayout.SOUTH);

            window.setContentPane(content);
            window.setSize(350, 200);
            window.setLocation(300, 400);
            window.setVisible(true);

    }

    public static class TempConverter implements ActionListener{

        private JFrame window = null;
        public TempConverter(JFrame frame) {

            window = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            double in = 0;
            String input =  JOptionPane.showInputDialog("Input fahrenheit temperature to convert",
                    null);

            if(input.isEmpty()){
                Converter c = new Converter();
                in = c.getInput();
            } else {
                in = Double.parseDouble(input);
            }

            TemperatureConverter temp = new TemperatureConverter(in);

            String originalOutput = String.valueOf(temp.getInput());

            JOptionPane.showMessageDialog(null, originalOutput + " F equals " +
                    temp.convert() + " C");
        }
    }

    public static class DistConverter extends JFrame implements ActionListener {
        private JFrame window = null;
        public DistConverter(JFrame frame){
            window = frame;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            double in = 0;

            String input =  JOptionPane.showInputDialog("Input miles to convert", null);

            if(input.isEmpty()){
                Converter c = new Converter();
                in = c.getInput();
            } else {
                in = Double.parseDouble(input);
            }

            DistanceConverter distance = new DistanceConverter(in);

            distance.setInput(in);

            String originalOutput = String.valueOf(distance.getInput());

            JOptionPane.showMessageDialog(null,  originalOutput + " miles equals " +
                    distance.convert() + " kilometers");


        }
    }

    public static class ExitProgram implements ActionListener{

        private JFrame window = null;
        public ExitProgram(JFrame frame) {
            window = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
