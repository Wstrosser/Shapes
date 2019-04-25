package shapes;

import java.awt.Graphics;

public abstract class Shape {
	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	@Override
	public abstract String toString();
        
        public abstract void draw(Graphics g);
}