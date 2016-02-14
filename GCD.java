import javax.swing.JOptionPane;

public class GCD {
	
	public static void divisor(int a,int b){
		int divisor;
		if(a>b){
			divisor = b;
		}
		else
			divisor=a;
		while((a%divisor)!=0 || (b % divisor)!= 0){
			divisor--;
		}
		System.out.println("The greatest common divisor between "+a+" and "+b+" is: "+divisor);
	}

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Give me a number");
		int numero1 = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Give me another number");
		int numero2 = Integer.parseInt(num2);
		divisor(numero1,numero2);

	}

}
