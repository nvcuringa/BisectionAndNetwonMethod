//Nick Curinga
//CS 301
public class Program1{

	public static void main(String[] args) {
		
        double c = BisectionMethod(0,100);  
          
         NewtonsMethod(c);  
	}
	
	public static double BisectionMethod(double a,double b)
	{	
		double c = 0;    

       while( Math.abs(a-b) > 1)
       {
    	   System.out.println("a: " +a);
    	   System.out.println("b: " +b); 
    	   System.out.println();	  
    	   c = (a+b)/2;
    	  
        	if(fOf(a) * fOf(c) < 0)
        	{
        		b = c;
        	}
        	else if(fOf(b) * fOf(c) < 0)
        	{	
        		a = c;	   
        	}	
       }
       return c;
	}
       
	
	public static double fOf(double x)
	{
		double fOf = (x-30) * (x-30) * (x-60) * (x-60) * ((x * x) - 2 ) -10;
		return fOf;
	}
	
	public static double dfOf(double x)
	{
		double dfOf = 2*(x - 30)*(x - 60)*((3*x*x*x) - (180*x*x) + (1796*x) + 180);
		return dfOf;
	}
	
	public static void NewtonsMethod(double c)
	{
		double xn = c;
	    double xnPlusOne  = xn - (fOf(xn)/dfOf(xn));
	    System.out.println("x"+0+": "+xn);	
		int n = 1;

		while(Math.abs(xnPlusOne-xn) > 0.00000001)
		{
			xn = xnPlusOne;
			System.out.println("x"+n+": "+xn);	
			xnPlusOne = xn - (fOf(xn)/dfOf(xn));
			if(dfOf(xn) <= 0.00001)
			{
				System.out.println("Warning f'(x) is approaching zero");
				System.exit(0);
			}
			n++;
		}
		
		
	}

}
