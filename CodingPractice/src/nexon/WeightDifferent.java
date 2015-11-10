package nexon;

public class WeightDifferent {
	
public static double CalcWeight(double latitude, double mass){
	double X = 6387.0 * Math.cos(latitude);
	double Y = 6261.0 * Math.sin(latitude);
	
	double disFromCore = Math.sqrt(X * X + Y * Y);
	
	double result = mass * 6387.0 * 6387.0 / (disFromCore * disFromCore);
	return result;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
