package com.lab9.roiboon;
/**
 * @author Roiboon Chaiyachit
 */

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class DistanceConverter extends JFrame {
	
	private JPanel 				mainPane;
	private UnitConverter 		unitConverter;
	private JLabel 				equalLabel;
	private JTextField 			rightTextField;
	private JTextField 			leftTextField;
	private JComboBox<Object> 	leftComboBox;
	private JComboBox<Object> 	rightComboBox;

	/*
	 Initial Distance Converter value and unit converter
	 * */
	public DistanceConverter() {
		setTitle("Distance Converter");
		unitConverter = new UnitConverter();
		initComponent();
	}
	
	/**
	 Initial value all of the component
	 */
	public void initComponent(){
		mainPane 		= new JPanel();
		leftTextField 	= new JTextField();
		leftTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				typeValue(Choice.LEFT);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				typeValue(Choice.LEFT);
			}
		});
		leftTextField.setColumns(10);
		leftComboBox	= new JComboBox<Object> (Length.values());
		leftComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				typeValue(Choice.LEFT);
			}
		});
		equalLabel 		= new JLabel("=");
		rightTextField 	= new JTextField();
		rightTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				typeValue(Choice.RIGHT);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				typeValue(Choice.RIGHT);
			}
		});
		rightTextField.setColumns(10);
		rightComboBox	= new JComboBox<Object> (Length.values());
		rightComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				typeValue(Choice.RIGHT);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 80);
		setContentPane(mainPane);
		mainPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		mainPane.add(leftTextField);
		mainPane.add(leftComboBox);
		mainPane.add(equalLabel);
		mainPane.add(rightTextField);
		mainPane.add(rightComboBox);
		
	}
	
	/**
	 * @param choice is a enum that contained user's deicsion to type the input on the left or on the right texfield
	 * this program will convert unit automatically depend on user choice.
	 * So when user's input is not a number or user remove thier input, Program will set the both side of textfield to be empty 
	 * */
	
	public void typeValue(Choice choice) {
		if(choice.equals(Choice.LEFT)){
			try {
				double amount = Double.parseDouble(leftTextField.getText());
				if(amount > 0) {
					Length fromUnit = (Length) leftComboBox.getSelectedItem();
					Length toUnit = (Length) rightComboBox.getSelectedItem();
					String result = String.valueOf(String.format("%.6f", unitConverter.convert(amount, fromUnit, toUnit)));
					rightTextField.setText(result);
				}
				else {
					rightTextField.setText("");
				}
			} catch(NumberFormatException e){
					rightTextField.setText("");
			}
		}
		else if(choice.equals(Choice.RIGHT)) {
			try {
				double amount = Double.parseDouble(rightTextField.getText());
				if(amount > 0) {
					Length fromUnit = (Length) rightComboBox.getSelectedItem();
					Length toUnit = (Length) leftComboBox.getSelectedItem();
					String result = String.valueOf(String.format("%.6f", unitConverter.convert(amount, fromUnit, toUnit)));
					leftTextField.setText(result);
				}
				else {
					leftTextField.setText("");
				}
			} catch(NumberFormatException e){
				leftTextField.setText("");
			}
		}
	}
	
	/**Run application
	 * @param args not use*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DistanceConverter frame = new DistanceConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
