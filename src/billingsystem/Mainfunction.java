package billingsystem;

//So inside Billing System we have 5 files
//child_billingsystem
//interface
//MainFunction
//Parent_billingsytem
//Oops_billingSystem

import java.awt.EventQueue;

import javax.swing.JFrame;



public class Mainfunction extends Oops_BillingSystem 
{
	JFrame frmBillingSystem;


	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oops_BillingSystem window = new Oops_BillingSystem();
					window.frmBillingSystem.setVisible(true);
					
				
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				}
			      
		});
		
		

}
}


