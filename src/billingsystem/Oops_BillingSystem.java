package billingsystem;



import javax.swing.JFrame;


import javax.swing.JPanel;
import javax.swing.border.LineBorder;



import java.awt.Color;


import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;

import java.util.*;
import java.text.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Oops_BillingSystem extends Parent_billingclass

{
     JFrame frmBillingSystem;
	private JTextField txttelevision;
	private JTextField txtac;
	private JTextField txtref;
	private JTextField txtwm;
	private JTextField txtdish;
	private JTextField txtss;
	private JTextField txtoven;
	private JTextField txtsub;
	private JTextField txtgst;
	private JTextField txttot;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	/**
	 * Launch the application.
	 */
	Oops_BillingSystem(JFrame frmBillingSystem)
	{   
		this.frmBillingSystem=frmBillingSystem;
	}

	/**
	 * Create the application.
	 */
	public Oops_BillingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBillingSystem = new JFrame();
		frmBillingSystem.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {

				txttelevision.setEnabled(false);
				txttelevision.setText("0");
				

				txtac.setEnabled(false);
				txtac.setText("0");
				

				txtwm.setEnabled(false);
				txtwm.setText("0");
				

				txtref.setEnabled(false);
				txtref.setText("0");
				

				txtdish.setEnabled(false);
				txtdish.setText("0");
				
		
				txtss.setEnabled(false);
				txtss.setText("0");
				

				txtoven.setEnabled(false);
				txtoven.setText("0");
				

				txtsub.setEnabled(false);
				txtsub.setText("0");
				

				txtgst.setEnabled(false);
				txtgst.setText("0");
				

				txttot.setEnabled(false);
				txttot.setText("0");
			}
			
		});
		frmBillingSystem.setTitle("Billing System");
		frmBillingSystem.setBounds(0,0, 1192, 738);
		frmBillingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBillingSystem.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 1156, 75);
		panel.setBorder(new LineBorder(Color.BLUE, 5));
		frmBillingSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NA Electronics Store Bill");
		lblNewLabel_1.setBounds(376, 24, 359, 40);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 30));
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(1231, 11, 86, 20);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.BLUE, 5));
		panel_1.setBounds(10, 108, 671, 358);
		frmBillingSystem.getContentPane().add(panel_1);
		
		JCheckBox chtelevision = new JCheckBox("Television");
		chtelevision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chtelevision.isSelected())
				{
					txttelevision.setEnabled(true);
					txttelevision.setText("");
					txttelevision.requestFocus();
				}
				else
				{
					txttelevision.setEnabled(false);
					txttelevision.setText("0");
				}
			}
		});
		chtelevision.setBounds(19, 46, 97, 23);
		panel_1.add(chtelevision);
		
		JCheckBox chairConditioner = new JCheckBox("Air conditioner");
		chairConditioner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chtelevision.isSelected())
				{
					txtac.setEnabled(true);
					txtac.setText("");
					txtac.requestFocus();
				}
				else
				{
					txtac.setEnabled(false);
					txtac.setText("0");
				}
			}
			
		});
		chairConditioner.setBounds(19, 86, 97, 23);
		panel_1.add(chairConditioner);
		
		JCheckBox chrefrigerator = new JCheckBox("Refrigerator");
		chrefrigerator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chtelevision.isSelected())
				{
					txtref.setEnabled(true);
					txtref.setText("");
					txtref.requestFocus();
				}
				else
				{
					txtref.setEnabled(false);
					txtref.setText("0");
				}
			}
		});
		chrefrigerator.setBounds(19, 129, 97, 23);
		panel_1.add(chrefrigerator);
		
		JCheckBox chwashing = new JCheckBox("Washing Machine");
		chwashing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chtelevision.isSelected())
				{
					txtwm.setEnabled(true);
					txtwm.setText("");
					txtwm.requestFocus();
				}
				else
				{
					txtwm.setEnabled(false);
					txtwm.setText("0");
				}
			}
		});
		chwashing.setBounds(19, 174, 135, 23);
		panel_1.add(chwashing);
		
		JCheckBox chdishwasher = new JCheckBox("Dishwasher");
		chdishwasher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chtelevision.isSelected())
				{
					txtdish.setEnabled(true);
					txtdish.setText("");
					txtdish.requestFocus();
				}
				else
				{
					txtdish.setEnabled(false);
					txtdish.setText("0");
				}
			}
		});
		chdishwasher.setBounds(19, 220, 97, 23);
		panel_1.add(chdishwasher);
		
		JCheckBox chsound = new JCheckBox("Sound System");
		chsound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chtelevision.isSelected())
				{
					txtss.setEnabled(true);
					txtss.setText("");
					txtss.requestFocus();
				}
				else
				{
					txtss.setEnabled(false);
					txtss.setText("0");
				}
			}
		});
		chsound.setBounds(19, 266, 97, 23);
		panel_1.add(chsound);
		
		JCheckBox choven = new JCheckBox("Microwave Oven");
		choven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chtelevision.isSelected())
				{
					txtoven.setEnabled(true);
					txtoven.setText("");
					txtoven.requestFocus();
				}
				else
				{
					txtoven.setEnabled(false);
					txtoven.setText("0");
				}
			}
		});
		choven.setBounds(19, 313, 116, 23);
		panel_1.add(choven);
		
		txttelevision = new JTextField();
		txttelevision.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				child_billingclass Onlynumbers=new child_billingclass();// Exception Handling
				try {
					Onlynumbers.Numbersonly(e);
					
				} 
				catch (NumberFormatException ex) 
				{
					JOptionPane.showConfirmDialog(null,"Billing System Error");
				}
					
			}
					
				
			}
		);
		txttelevision.setBounds(178, 47, 86, 20);
		panel_1.add(txttelevision);
		txttelevision.setColumns(10);
		
		txtac = new JTextField();
		txtac.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				child_billingclass Onlynumbers=new child_billingclass();//Exception Handling
				try {
					Onlynumbers.Numbersonly(e);
					
				} 
				catch (NumberFormatException ex) 
				{
					JOptionPane.showConfirmDialog(null,"Billing System Error");
				}
			}
		});
		txtac.setColumns(10);
		txtac.setBounds(178, 87, 86, 20);
		panel_1.add(txtac);
		
		txtref = new JTextField();
		txtref.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				child_billingclass Onlynumbers=new child_billingclass();
				try {
					Onlynumbers.Numbersonly(e);
					
				} 
				catch (NumberFormatException ex) 
				{
					JOptionPane.showConfirmDialog(null,"Billing System Error");
				}
			}
		});
		txtref.setColumns(10);
		txtref.setBounds(178, 130, 86, 20);
		panel_1.add(txtref);
		
		txtwm = new JTextField();
		txtwm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				child_billingclass Onlynumbers=new child_billingclass();
				try {
					Onlynumbers.Numbersonly(e);
					
				} 
				catch (NumberFormatException ex) 
				{
					JOptionPane.showConfirmDialog(null,"Billing System Error");
				}
			}
		});
		txtwm.setColumns(10);
		txtwm.setBounds(178, 175, 86, 20);
		panel_1.add(txtwm);
		
		txtdish = new JTextField();
		txtdish.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				child_billingclass Onlynumbers=new child_billingclass();
				try {
					Onlynumbers.Numbersonly(e);
					
				} 
				catch (NumberFormatException ex) 
				{
					JOptionPane.showConfirmDialog(null,"Billing System Error");
				}
			}
		});
		txtdish.setColumns(10);
		txtdish.setBounds(178, 221, 86, 20);
		panel_1.add(txtdish);
		
		txtss = new JTextField();
		txtss.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {//overriding
				child_billingclass Onlynumbers=new child_billingclass();
				try {
					Onlynumbers.Numbersonly(e);
					
				} 
				catch (NumberFormatException ex) 
				{
					JOptionPane.showConfirmDialog(null,"Billing System Error");
				}
			}
		});
		txtss.setColumns(10);
		txtss.setBounds(178, 267, 86, 20);
		panel_1.add(txtss);
		
		txtoven = new JTextField();
		txtoven.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {  //overriding
				child_billingclass Onlynumbers=new child_billingclass();
				try {
					Onlynumbers.Numbersonly(e);
					
				} 
				catch (NumberFormatException ex) 
				{
					JOptionPane.showConfirmDialog(null,"Billing System Error");
				}
			}
		});
		txtoven.setColumns(10);
		txtoven.setBounds(178, 314, 86, 20);
		panel_1.add(txtoven);
		
		JLabel lblNewLabel_2 = new JLabel("List Of Electronics ");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2.setBounds(19, 11, 123, 25);
		panel_1.add(lblNewLabel_2);
		
		txtsub = new JTextField();
		txtsub.setBounds(548, 47, 86, 20);
		panel_1.add(txtsub);
		txtsub.setColumns(10);
		
		JLabel labelsub = new JLabel("Subtotal");
		labelsub.setBounds(438, 46, 86, 20);
		panel_1.add(labelsub);
		labelsub.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		txtgst = new JTextField();
		txtgst.setBounds(548, 109, 86, 20);
		panel_1.add(txtgst);
		txtgst.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("GST");
		lblNewLabel_1_1_1.setBounds(438, 108, 86, 20);
		panel_1.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		txttot = new JTextField();
		txttot.setBounds(548, 164, 86, 20);
		panel_1.add(txttot);
		txttot.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Total");
		lblNewLabel_1_1_1_1.setBounds(438, 163, 86, 20);
		panel_1.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(171, 267, 1, 2);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(188, 11, 73, 25);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Unit Price");
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(304, 11, 73, 25);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("50,000");
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(304, 44, 73, 25);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("30,000");
		lblNewLabel_2_1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1_1_2.setBounds(304, 84, 73, 25);
		panel_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("25,000");
		lblNewLabel_2_1_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1_1_3.setBounds(304, 127, 73, 25);
		panel_1.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("12,000");
		lblNewLabel_2_1_1_4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1_1_4.setBounds(304, 178, 73, 25);
		panel_1.add(lblNewLabel_2_1_1_4);
		
		JLabel lblNewLabel_2_1_1_5 = new JLabel("40,000");
		lblNewLabel_2_1_1_5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1_1_5.setBounds(304, 224, 73, 25);
		panel_1.add(lblNewLabel_2_1_1_5);
		
		JLabel lblNewLabel_2_1_1_6 = new JLabel("8,000");
		lblNewLabel_2_1_1_6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1_1_6.setBounds(304, 264, 73, 25);
		panel_1.add(lblNewLabel_2_1_1_6);
		
		JLabel lblNewLabel_2_1_1_7 = new JLabel("15,000");
		lblNewLabel_2_1_1_7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2_1_1_7.setBounds(304, 311, 73, 25);
		panel_1.add(lblNewLabel_2_1_1_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(Color.BLUE, 5));
		panel_2.setBounds(698, 108, 468, 580);
		frmBillingSystem.getContentPane().add(panel_2);
		
		JTextArea textreceipt = new JTextArea();
		textreceipt.setBounds(38, 24, 394, 524);
		panel_2.add(textreceipt);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.BLUE, 5));
		panel_3.setBounds(10, 480, 399, 208);
		frmBillingSystem.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JCheckBox ch0 = new JCheckBox("0%");
		ch0.setSelected(true);
		buttonGroup.add(ch0);
		ch0.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		ch0.setForeground(Color.DARK_GRAY);
		ch0.setBounds(33, 50, 127, 23);
		panel_3.add(ch0);
		
		JCheckBox ch15 = new JCheckBox("15%");
		buttonGroup.add(ch15);
		ch15.setForeground(Color.DARK_GRAY);
		ch15.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		ch15.setBounds(33, 91, 127, 23);
		panel_3.add(ch15);
		
		JCheckBox ch10 = new JCheckBox("10%");
		
			
		buttonGroup.add(ch10);
		ch10.setForeground(Color.DARK_GRAY);
		ch10.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		ch10.setBounds(252, 50, 127, 23);
		panel_3.add(ch10);
		
		JCheckBox ch20 = new JCheckBox("20%");
		buttonGroup.add(ch20);
		ch20.setForeground(Color.DARK_GRAY);
		ch20.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		ch20.setBounds(252, 91, 127, 23);
		panel_3.add(ch20);
		
		JCheckBox ch25 = new JCheckBox("25%");
		buttonGroup.add(ch25);
		ch25.setForeground(Color.DARK_GRAY);
		ch25.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		ch25.setBounds(33, 141, 127, 23);
		panel_3.add(ch25);
		
		JCheckBox ch30 = new JCheckBox("30%");
		buttonGroup.add(ch30);
		ch30.setForeground(Color.DARK_GRAY);
		ch30.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		ch30.setBounds(252, 141, 127, 23);
		panel_3.add(ch30);
		
		JLabel lblNewLabel = new JLabel("DISCOUNT");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 15));
		lblNewLabel.setBounds(134, 11, 110, 32);
		panel_3.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("RECEIPT");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			   int recno=1576+(int)(Math.random()*8743);//reference number which is randomly generated
			   //getting date and time
			   Calendar timer=Calendar.getInstance();
			   timer.getTime();
			   SimpleDateFormat ttime=new SimpleDateFormat("HH:mm:ss");
			   ttime.format(timer.getTime());	
			   
			   SimpleDateFormat tdate=new SimpleDateFormat("dd-MM-yyyy");
			   tdate.format(timer.getTime());
			   
			   //printing
			   textreceipt.append("\t\t\t\t Billing System\n" + "Reference number:\t\t\t"+recno+
					   "\n==================================================================\n"+
					   "Television:\t\t\t" + txttelevision.getText()+"\n\n"+
					   "Air Conditioner:\t\t\t" + txtac.getText()+"\n\n"+
					   "Refrigerator:\t\t\t"+txtref.getText()+"\n\n"+
					   "Washing Machine:\t\t" + txtwm.getText()+"\n\n"+
					   "Dishwasher:\t\t\t" + txtdish.getText()+"\n\n"+
					   "Sound System:\t\t\t" + txtss.getText()+"\n\n"+
					   "Microwave Oven:\t\t" + txtoven.getText()+"\n\n"+
					   "\n==================================================================\n"+
					   "Subtotal:\t\t\t"+ txtsub.getText()+"\n\n"+
					   "GST:\t\t\t"+ txtgst.getText()+"\n\n"+
					   "Total:\t\t\t"+ txttot.getText()+"\n\n"+
					   "\n==================================================================\n"+
					   "\nDate: "+ tdate.format(timer.getTime())+
					   "\nTime:" + ttime.format(timer.getTime())+
					   "\n\t\tThank You"+
					   "\n\t\t Please do shop again here"
					   
					   );
			   
			   
			   
			   
			   
			}
		});
		btnNewButton.setBounds(478, 533, 145, 42);
		frmBillingSystem.getContentPane().add(btnNewButton);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 new Thread()//new thread
				 {
					 public void run()
					 {
				
				
				  child_billingclass ob1=new child_billingclass();
				  ob1.Television=ob1.pTelevision * Double.parseDouble(txttelevision.getText());//Calculating the cost of each product
				  ob1.Air_conditioner=ob1.pAir_conditioner * Double.parseDouble(txtac.getText());
				  ob1.Washing_machine=ob1.pWashing_machine * Double.parseDouble(txtwm.getText());
				  ob1.dishwasher=ob1.pdishwasher* Double.parseDouble(txtdish.getText());
				  ob1.refrigerator=ob1.prefrigerator * Double.parseDouble(txtref.getText());
				  ob1.sound=ob1.psound * Double.parseDouble(txtss.getText());
				  ob1.oven=ob1.poven * Double.parseDouble(txtoven.getText());
				  
				  
				
						double isub,igst,itotal;
						
				  if(ch0.isSelected())
				  {
					  isub=ob1.amt();
					  igst=ob1.gstamt(isub);
					  itotal=ob1.total2(isub,igst);
					  
					  String subtotal=String.format("Rs%.2f",isub);
					  txtsub.setText(subtotal);
					  
					  String gstt=String.format("Rs%.2f",igst);
					  txtgst.setText(gstt);
					  
					  String tot=String.format("Rs%.2f",itotal);
					  txttot.setText(tot);  
				  }
				  
				  //==========10%========//
				  
				  if(ch10.isSelected()) // calculate discount
				  {
					  isub=ob1.amt();
					  igst=ob1.gstamt(isub);
					  itotal=ob1.total2(isub,igst);
					  
					  itotal=itotal-((itotal*10)/100);
					  
					  String subtotal=String.format("Rs%.2f",isub);
					  txtsub.setText(subtotal);
					  
					  String gstt=String.format("Rs%.2f",igst);
					  txtgst.setText(gstt);
					  
					  String tot=String.format("Rs%.2f",itotal);
					  txttot.setText(tot);  
				  }
				
		
		//==========15%=====
					if(ch15.isSelected())
					  {
						  isub=ob1.amt();
						  igst=ob1.gstamt(isub);
						  itotal=ob1.total2(isub,igst);
						  itotal=itotal-((itotal*15)/100);
						  
						  String subtotal=String.format("Rs%.2f",isub);
						  txtsub.setText(subtotal);
						  
						  String gstt=String.format("Rs%.2f",igst);
						  txtgst.setText(gstt);
						  
						  String tot=String.format("Rs%.2f",itotal);
						  txttot.setText(tot);  
					  }
					
				
	
			//========20%===
			if(ch20.isSelected())
			  { 
				isub=ob1.amt();
			  igst=ob1.gstamt(isub);
			  itotal=ob1.total2(isub,igst);
				  itotal=itotal-((itotal*20)/100);
				  
				  String subtotal=String.format("Rs%.2f",isub);
				  txtsub.setText(subtotal);
				  
				  String gstt=String.format("Rs%.2f",igst);
				  txtgst.setText(gstt);
				  
				  String tot=String.format("Rs%.2f",itotal);
				  txttot.setText(tot);  
			  }
			
			
			//=======25%
			if(ch25.isSelected())
			  {
				 isub=ob1.amt();
				  igst=ob1.gstamt(isub);
				  itotal=ob1.total2(isub,igst);
				  itotal=itotal-((itotal*25)/100);
				  
				  String subtotal=String.format("Rs%.2f",isub);
				  txtsub.setText(subtotal);
				  
				  String gstt=String.format("Rs%.2f",igst);
				  txtgst.setText(gstt);
				  
				  String tot=String.format("Rs%.2f",itotal);
				  txttot.setText(tot);  
			  }
			
			////=======30%
			
			if(ch30.isSelected())
			  {
				  isub=ob1.amt();
				  igst=ob1.gstamt(isub);
				  itotal=ob1.total2(isub,igst);
				  itotal=itotal-((itotal*30)/100);
				  
				  String subtotal=String.format("Rs%.2f",isub);
				  txtsub.setText(subtotal);
				  
				  String gstt=String.format("Rs%.2f",igst);
				  txtgst.setText(gstt);
				  
				  String tot=String.format("Rs%.2f",itotal);
				  txttot.setText(tot);  
			  }
			
			}
				 }.start();
		}
	});




		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTotal.setBounds(478, 480, 145, 42);
		frmBillingSystem.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			
			{
				
				Thread thread = new Thread(new Runnable() {     //Creating Thread and running it
					public void run() {
						txttelevision.setText("");
						txtac.setText("");
						txtref.setText("");
						txtwm.setText("");
						txtdish.setText("");
						txtss.setText("");
						txtoven.setText("");
						txtsub.setText("");
						txtgst.setText("");
						txttot.setText("");
						textreceipt.setText(null);
						chtelevision.setSelected(false);
						chrefrigerator.setSelected(false);
						chwashing.setSelected(false);
						chsound.setSelected(false);
						choven.setSelected(false);
						chdishwasher.setSelected(false);				
						chairConditioner.setSelected(false);
						ch0.setSelected(true);
						ch10.setSelected(false);
						ch15.setSelected(false);
						ch20.setSelected(false);
						ch25.setSelected(false);
						ch30.setSelected(false);
					
					}
				});
				thread.start();
				   	
			
			}
			});
		btnReset.setBounds(478, 586, 145, 42);
		frmBillingSystem.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				child_billingclass exit= new child_billingclass();
				
				try
				{
					exit.Exit();
				}
				catch (NumberFormatException e2)
				{
					JOptionPane.showConfirmDialog(null,"Billing System has error");
				
				
				}
		    }
				
			
		});
			
		btnExit.setBounds(478, 639, 145, 42);
		frmBillingSystem.getContentPane().add(btnExit);
	}
	}

	
	
	
	 
	
	
		
			
	