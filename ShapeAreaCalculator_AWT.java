import java.awt.*;
import java.awt.event.*;

class ShapeAreaCalculator_AWT
{
    Frame f1;
    Label l1,l2,l3;
    List list1;
    Button b1;

    ShapeAreaCalculator_AWT()
    {
        f1 = new Frame("Main Menu");
        f1.setSize(300,400);
        f1.setLayout(null);

        l1 = new Label("SHAPE AREA CALCULATER");
        l1.setBounds(70,50,158,20);
        
        l2 = new Label("Select A shape :");
        l2.setBounds(30,100,90,20);

        list1 = new List(4,false);
        list1.add("Circle");
        list1.add("Squair");
        list1.add("Rectangle");
        list1.add("Triangle");
        list1.add("Parallelogram");
        list1.add("Rombus");
        list1.add("Trapezium");
        list1.add("Kite");
        list1.add("Ellipse");
        list1.add("Hexagon"); 
        list1.setBounds(140,100,100,60);

        l3 = new Label("The Shape You Selected is :");
        l3.setBounds(20,200,265,20);

        b1 = new Button("Calculate");
        b1.setBounds(110,250,60,20);

        f1.add(l1);
        f1.add(l2);
        f1.add(list1);
        f1.add(l3);
        f1.add(b1);
        f1.setVisible(true);

    }
    public static void main(String[] args) 
    {
        new ShapeAreaCalculator_AWT();    
    }
}