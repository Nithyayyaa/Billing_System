package billingsystem;



import java.awt.event.*;


import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Parent_billingclass implements calculategst,calculatesub,calculatetotal //implementing interface
{
    public double Television;
    public double Air_conditioner;
    public double Washing_machine;
    public double refrigerator;
    public double dishwasher;
    public double sound;
    public double oven;
    public double GST;
    
    public double pTelevision=50000;
    public double pAir_conditioner=30000;
    public double pWashing_machine=25000;
    public double prefrigerator=12000;
    public double pdishwasher=40000;
    public double psound=8000;
    public double poven=15000;
    
    public  double subtotal;
    public double total;
    
 
    
    	public double amt()
   	 {  
    	 subtotal=Television +Air_conditioner+Washing_machine+refrigerator+dishwasher+sound+oven;
   		 
   		 return subtotal;
   	 }
   	
   	public double gstamt(double sub)
   	 {  
   		GST=(sub*18/100)/100;
   		 
   		 return GST;
   	 }
   	
   	
   	public double total2(double sub,double g)
   	 {   
   		 total=sub+g;
   		 
   		 return total;
   	 }
  
	
	//======Exit======/
   	
public JFrame Frame1;
	
	public void Exit()
	{
		Frame1=new JFrame();
		if(JOptionPane.showConfirmDialog(Frame1,"Are you sure you want to exit","Billing System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
		{
			System.exit(0);
		}
	}
	


//====Numbers only======//

public void Numbersonly(java.awt.event.KeyEvent evt)   //To make sure one can only type in numbers and not alphabets
{
	char iNUmber=evt.getKeyChar();
	if(!(Character.isDigit(iNUmber))||(iNUmber==KeyEvent.VK_BACK_SPACE)||(iNUmber==KeyEvent.VK_BACK_SPACE))
	{
		evt.consume();
	}
		
}

}

