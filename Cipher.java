package cipherTdd.com.example;

class Cipher{
	
	public static void main(String[] args) {
	String mode = args[0];
	String text = args[1];
	String cipher = args[2];
	String str;
	double n = converttoAscii(cipher);
	
	if(mode.equals("encrypt")) {
		str= encrypt(text, n);
	}
	else {
		str= decrypt(text,n);
	}
	
}
	public static String encrypt(String text, double n) {
	StringBuffer res = new StringBuffer();
	for (int k=0; k<text.length();k++) {
		if(Character.isUpperCase(text.charAt(k))){
			char c = (char) (65+((int)text.charAt(k)+ n-65)%26);
			res.append(c);
		}
		else {
			char c = (char) (97+((int)text.charAt(k)+ n-97)%26);
			res.append(c);
		}
	}
		return res.toString();
	}
	public static String decrypt(String text, double n) {
		StringBuffer res = new StringBuffer();
		for (int k=0; k<text.length();k++) {
			if(Character.isUpperCase(text.charAt(k))){
				char c= (char)((text.charAt(k)-n-65)%26+65);
				if(c < 'A') {
                    c = (char)(text.charAt(k)-n+26);
                }
				res.append(c);
			}
			else {char c= (char)((text.charAt(k)-n-97)%26+65);
			if(c < 'a') {
                c = (char)(text.charAt(k)-n+26);
            }
			res.append(c);
			}}
			return res.toString();
		

	}
	
	public static double converttoAscii(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int acval = s.charAt(i);
			sum = acval+sum;
			
		}
		return sum;
	}
	}