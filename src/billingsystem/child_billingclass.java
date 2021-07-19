package billingsystem;

public class child_billingclass extends Parent_billingclass {    //inheritance 
	
	public child_billingclass()//constructor
	{
		Television=0;
	    Air_conditioner=0;
	    Washing_machine=0;
	    refrigerator=0;
	    dishwasher=0;
	    sound=0;
	    oven=0;	
		
	}
	
	
	public child_billingclass(double Telivision,double Air_conditioner,double Washing_machine,double refrigerator,double dishwasher,double sound,double oven) 
	{
		this.Television=Telivision;     //Parameterised Constructor
	    this.Air_conditioner=Air_conditioner;
	    this.Washing_machine=Washing_machine;
	    this.refrigerator=Washing_machine;
	    this.dishwasher=dishwasher;
	    this.sound=sound;
	    this.oven=oven;	
	}

	
}
