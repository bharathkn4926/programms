package string_programs;

public class ReverseAString {
	
	String ReverseString(String s) {
		String original=s;
		String reverse="";
		for(int i=original.length();i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		ReverseAString rs=new ReverseAString();
		System.out.println(rs.ReverseString("Bharath"));
	}

}
