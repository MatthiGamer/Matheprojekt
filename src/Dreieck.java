
public class Dreieck {

public float x, y, z, s;
public double quadratwurzel, alpha, beta, gamma;
	
	public Dreieck(float a, float b, float c) {
		
		x = a;
		y = b;
		z = c;
		s = (a+b+c)/2;
		quadratwurzel = Math.sqrt(s*(s-x)*(s-y)*(s-z));
		alpha = Math.cos((-x*2 + y*2 + z*2)/(2*y*z));
		beta = (y*Math.sin(alpha)/x);
		gamma = 180 - alpha - beta;
	}
	
	public Double flaeche() {	
		
		return quadratwurzel;
	}
	
	public float umfang() {
		
		return x + y + z;
		
	}
	
	public double alpha() {
		
		return alpha;
		
	}
	
	public double beta() {
		
		return beta;
		
	}

	public double gamma() {
	
		return gamma;
	
	}
}
