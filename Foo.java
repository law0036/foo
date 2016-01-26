public class Foo {
	public static void main (String[] args) {
		String out = "";	
		if (args.length == 0) {
			out += "Empty Arguments";
		} else {
			for(int i = 0; i < args.length; i++) {
				out += args[i] + " ";
			}
			out = out.trim();
		}	
		System.out.println(out);
	}
}