package formativeSubmission;

public class Complex {

	double real;
	double imag;
	
	public Complex()
	{
		real = 0;
		imag = 0;
	}
	
	public Complex(double _real, double _imag)
	{
		real = _real;
		imag = _imag;
	}
	
	
	
	public double imag()
	{
		return imag;
	}

	public double real() 
	{
		return real;
	}
	
	public double magnitude()
	{
		double realNum = Math.pow(real, 2);
		double imagNum = Math.pow(imag, 2);
		
		double answer = realNum + imagNum;
		double result = Math.sqrt(answer);
		
		return result;
	}
	
	public double argument()
	{
		double ansA = Math.atan2(imag, real);
		
		return ansA; 
	}
	
	public Complex add(Complex complex)
	{
		double answer1 = this.real + complex.real;
		double answer2 = this.imag + complex.imag;
		
		complex.real = answer1;
		complex.imag = answer2;
		return complex;	
	}
	
	public String toString()
	{
		if(real == 0.0)
		{
			String imagString = Double.toString(imag);
			System.out.println("j" +imagString);
			return "j" +imagString; 
		}
		if(imag == 0.0)
		{
			String realString = Double.toString(real);
			System.out.println(realString);
			return realString; 
		}
		if(imag < 0.0)
		{
			String realString = Double.toString(real);
			double fix = Math.abs(imag);
			String imagString = Double.toString(fix);
			
			return realString + " - " + "j" +imagString;
		}
		else
		{
			String realString = Double.toString(real);
			String imagString = Double.toString(imag);
			System.out.println(realString + " + " + "j" +imagString);
			return realString + " + " + "j" +imagString;
		}
		
	}
	//"1.2 + j3.4"
	


}
