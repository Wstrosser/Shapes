/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author aorlichenko
 */
public class ShapesPrimer extends JPanel implements ActionListener {

    public final static int WIDTH = 640;
    public final static int HEIGHT = 480;
    JButton add;
    JButton clear, rectangle, circle;
    ArrayList<StringWithPosition> strings = new ArrayList<StringWithPosition>();
    ArrayList<Shape> shapes = new ArrayList<>();
    public ShapesPrimer(JButton add, JButton clear, JButton circle, JButton rectangle) {
        super();
        
        this.add = add;
        this.clear = clear;
        this.circle = circle;
        this.rectangle = rectangle;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, WIDTH, HEIGHT);
        //g.drawRect(100, 100, 40, 40);
        //g.drawOval(150, 50, 30, 30);
//        for (StringWithPosition s : strings) {
//            s.draw(g);
//        }
        for (Shape s : shapes){
            s.draw(g);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == add) {
        } else if (source == clear) {
            shapes.clear();
        } else if (source == rectangle){
            shapes.add(Rectangle.getRandomRectangle());
        } else if (source == circle) {
            shapes.add(Circle.getRandomCircle());
        }
        repaint();
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("ShapesPrimer");
        
        Container pane = frame.getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        JButton add = new JButton("Add String");
        JButton clear = new JButton("Clear");
        JButton circle = new JButton("Circle");
        JButton rectangle = new JButton("Rectangle");
        
        ShapesPrimer display = new ShapesPrimer(add, clear, circle, rectangle);
        
        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        buttons.add(circle);
        buttons.add(rectangle);
        buttons.add(clear);
        
        add.addActionListener(display);
        circle.addActionListener(display);
        clear.addActionListener(display);
        rectangle.addActionListener(display);
        
        frame.add(buttons);
        frame.add(display);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
