import javax.swing.JOptionPane;

public class YoSoy196 {
	public long lower,
			   upper,
			   lychrel,
			   nonlychrel,
			   palindrome;
	public YoSoy196(long a,long b){
		this.lower=a;
		this.upper=b;
		this.lychrel=0;
		this.nonlychrel=0;
		this.palindrome=0;
	}
	
	public void getLych(long number){
		long x = number;
		long iterations = 0;
		while (iterations <= 30){
			long reversex = reverse(x);
			if (x == reversex){
				System.out.println("The number " + number + " became a palindrome after: " + iterations + " iterations.");
				if (iterations == 0){
					this.palindrome += 1;
				}
				this.nonlychrel += 1;
				break;
			}
			else if (iterations == 30){
				System.out.println("The number " + number + " didn't become a palindrome after 30 iterations, so it is a Lychrel number.");
				this.lychrel += 1;
				break;
			}
			else {
				x = x + reversex;
				iterations +=1;
			}
		}
	}
	
	public long reverse(long number){
		long reversingN = number;
		long reversed = 0;
		while (reversingN != 0){
			reversed = reversed * 10 + reversingN % 10;
			reversingN = reversingN / 10;
		}
		return reversed;
	}

	
	public void orderingLych(){
		for(long step = this.lower; step <= this.upper; step += 1){
			this.getLych(step);
		}
	System.out.println("The range calculated from: " + this.lower + " inclusive, to: " + this.upper
				+ " inclusive. ");
	System.out.println("The quantity of natural palindromes is: " + this.palindrome + "."); 
	System.out.println("The quantity of Lychrel numbers was: " + this.lychrel + ".");
	System.out.println("The quantity of non-Lychrel numbers was: " + this.nonlychrel + ".");
	}
	
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Give me a number");
		long numero1 = Long.parseLong(num1);
		String num2 = JOptionPane.showInputDialog("Give me another number");
		long numero2 = Long.parseLong(num2);
		YoSoy196 a = new YoSoy196(numero1,numero2);
		a.orderingLych();
	}
}
