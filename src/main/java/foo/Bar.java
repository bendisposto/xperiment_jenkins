package foo;
public class Bar {
	
	private final String s;
	private boolean b,french;
	
	public Bar(String s) {
		this(s,false,false);
	}
	
	public Bar(String s, boolean b,boolean french) {
		this.s = s;
		this.b = b;
		this.french = french;
	}
	
	
	public String getText() {
		return (french?"le ":"")+s+(b?"Bar":"bar");
	}
	
	
	
}
