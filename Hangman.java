import javax.swing.JOptionPane;

public class Hangman {
	
	String palabra;
	int letras;
	static int lives=6;
	
	public static String Pregunta(){
		String palabra = JOptionPane.showInputDialog("Give me a word");
		return palabra;
	}
	
	public static int NumeroLetras(String a){
		int numero = a.length();
		return numero;
	}
	
	public static void Play(char[] a, int b, int c, String d){
		int guessed=0;
		System.out.println("The word has "+b+" letters.");
		StringBuilder spaces = new StringBuilder();
		for(int i=0;i<b;i++){
			spaces.append("_");
		}
		System.out.println(spaces);
		while(c>0 && guessed<b){
			int t=0;
			String letra1 = JOptionPane.showInputDialog("Give me a letter");
			char letra = letra1.charAt(0);
			for(int i=0;i<a.length;i++){
				if(letra==a[i]){
					System.out.println("Your letter is in position "+i);
					guessed=guessed+1;
					t=1;
					spaces.setCharAt(i, letra);
					System.out.println(spaces);
				}
			}
			if(t==0){
				c=c-1;
				System.out.println("You lost a life! you have "+c +" remaining.");
				if(c==0){
					JOptionPane.showMessageDialog(null, "YOU LOST!!");
				}
			}
			if(guessed==b){
				System.out.println("You won! the word was: "+d);
			}
		}
	}
	
	public static void main(String[] args) {
		String palabra = Pregunta();
		int num=NumeroLetras(palabra);
		char[] stringToCharArray = palabra.toCharArray();
		Play(stringToCharArray, num, lives, palabra );
		

	}

}
