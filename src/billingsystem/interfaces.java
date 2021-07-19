package billingsystem;


interface calculatesub 
{
	double amt();
}

interface calculategst
{
	double gstamt(double sub);
}

interface calculatetotal
{
	double total2(double sub,double g);
}

