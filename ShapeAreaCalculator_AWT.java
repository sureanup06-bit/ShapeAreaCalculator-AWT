import java.awt.*;
import java.awt.event.*;

class ShapeAreaCalculator_AWT
{
    Frame f1,f2;
    Label l1,l2,l3,l4;
    Choice c;
    Button b1,b2;

    ShapeAreaCalculator_AWT()
    {
        f1 = new Frame("Main Menu");
        f1.setSize(300,400);
        f1.setLayout(null);

        l1 = new Label("SHAPE AREA CALCULATER");
        l1.setBounds(70,50,158,20);
        
        b2 = new Button("Select");
        b2.setBounds(40,150,60,20);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String data = "The Shape You Selected is :" + "    " +c.getItem(c.getSelectedIndex());
                l3.setText(data);
            }
        });

        l2 = new Label("Select A shape :");
        l2.setBounds(30,100,90,20);

        c = new Choice();
        c.add("Circle");
        c.add("Squair");
        c.add("Rectangle");
        c.add("Triangle");
        c.add("Parallelogram");
        c.add("Rombus");
        c.add("Trapezium");
        c.add("Kite");
        c.add("Ellipse");
        c.add("Hexagon"); 
        c.setBounds(140,100,100,40);

        l3 = new Label("The Shape You Selected is :");
        l3.setBounds(20,200,265,20);

        b1 = new Button("Calculate");
        b1.setBounds(110,250,60,20);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                f2 = new Frame("Calculater");
                f2.setSize(300,400);
                f2.setLayout(null);

                l4 = new Label(c.getItem(c.getSelectedIndex()) + " " + "Area calculater");
                l4.setBounds(70,50,158,20);


                f2.add(l4);
                f1.setVisible(false);
                f2.setVisible(true);
 
            }
        });

        f1.add(l1);
        f1.add(l2);
        f1.add(c);
        f1.add(l3);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);

    }
    public static void main(String[] args) 
    {
        new ShapeAreaCalculator_AWT();    
    }
}