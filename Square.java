package cpp_1;

public class Square {
	
	private boolean empty;
	
	private String mark;
	
	public Square() {
		empty = true;
		mark = "[]";
	
	}
	
	public void setEmpty( boolean x) {
		empty  = x;
	}
	public boolean getEmpty() {
		return empty;
	}
	public void setMark(String a) {
		mark = a;
		empty = false;
	}
	public String getMark() {
		return mark;
	}
}
