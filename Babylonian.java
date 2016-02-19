import javax.swing.JOptionPane;

public class Babylonian {
	
	public static void Babylonian(double a){
		double num1 = a/2;
		double num2 = a+1;
		while(num1!=num2){
			double num3 = a / num1;
			num2 = num1;
			num1= (num1+num3)/2;
		}
		System.out.println(num1);
	}

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Give me a number");
		double numero1 = Double.parseDouble(num1);
		Babylonian(numero1);

	}

}
