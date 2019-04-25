package shapes;

import java.awt.Graphics;
import java.util.Random;

public class Circle extends Shape {
	protected int x, y, radius;

	public Circle(int x, int y, int radius) {
		super("Circle");
		this.x = x;
		this.y = y;
		this.radius = radius;
		// fill in parameters here
	}

	@Override
	public String toString() {
		return "Circle x: " + x + " y: " + y + " radius: " + radius; // resplace with your code
	}

	public static Circle getRandomCircle() {
		int MAX_X = 640, MAX_Y = 480;
		Random r = new Random();
		int rad = 0;
		int x = r.nextInt(MAX_X);
		int y = r.nextInt(MAX_Y);
		int holdx = 0, holdy = 0;
                while(x+holdx>=MAX_X||x-holdx<=0||holdx==0){
                holdx = r.nextInt(MAX_X-x);
                }
                while(y+holdy>=MAX_Y||y-holdy<=0||holdy==0){
                holdy = r.nextInt(MAX_Y-y);
                }
                rad = smllNumber(holdx, holdy);
                

		return new Circle(x, y, rad); // replace with your code
	}
        public static int smllNumber(int x, int y){
        if (x>y)return y;
        else return x;
        }
        

    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, radius, radius);
    }

}