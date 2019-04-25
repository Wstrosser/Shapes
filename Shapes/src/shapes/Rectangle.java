package shapes;

import java.awt.Graphics;
import java.util.Random;

public class Rectangle extends Shape {
	protected int x, y, w, h;

	public Rectangle(int x, int y, int width, int height) {
		super("Rectangle");
		this.x = x;
		this.y = y;
		this.w = width;
		this.h = height;
		// fill in parameters here
	}

	@Override
	public String toString() {
		return "Rectangle x: " + x + " y: " + y + " width: " + w + " height: " + h; // replace with your code

	}

	public static Rectangle getRandomRectangle() {
		int MAX_X = 640, MAX_Y = 480;
		Random r = new Random();
		int x = r.nextInt(MAX_X);
		int w = r.nextInt(MAX_X - x);
		int y = r.nextInt(MAX_Y);
		int h = r.nextInt(MAX_Y - y);

		// TODO Auto-generated method stub
		return new Rectangle(x, y, w, h);
	}
        public void draw(Graphics g){
            g.drawRect(x, y, w, h);
        }
}