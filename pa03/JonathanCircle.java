package pa03;

import java.awt.Color;

public class JonathanCircle extends CircleShape{
	
	public JonathanCircle(){
		super();
		this.color = new Color(0,0,0);
	}
	
	public static void main (String[] args){
		JonathanCircle x = new JonathanCircle();
		System.out.println("my circle is "+x);
	}

	public String toString(){
		return "JonathanCircle:"+super.toString();
	}
}