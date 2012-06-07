package foo;
public class Bar {
	
	private final String s;
	private boolean b;
	
	public Bar(String s) {
		this(s,false);
	}
	
	public Bar(String s, boolean b) {
		this.s = s;
		this.b = b;
	}
	
	
	public String getText() {
		return s+(b?"Bar":"bar");
	}
	
	
	
}