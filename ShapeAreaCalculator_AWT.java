import java.awt.*;
import java.awt.event.*;

class ShapeAreaCalculator_AWT
{
    Frame f1,f2;
    Label l1,l2,l3,l4;
    Choice c;
    Button b1,b2,b3;

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
                String data = "The Shape You Selected is :" + "  " +c.getItem(c.getSelectedIndex());
                l3.setText(data);
            }
        });

        l2 = new Label("Select A shape :");
        l2.setBounds(30,100,90,20);

        c = new Choice();
        c.add("CIRCLE");
        c.add("SQUAIR");
        c.add("RECTANGLE");
        c.add("TRIANGLE");
        c.add("PARALLELOGRAM");
        c.add("ROMBUS");
        c.add("TRAPEZIUM");
        c.add("KITE");
        c.add("ELLIPSE");
        c.add("HEXAGON"); 
        c.setBounds(140,100,130,40);

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

                l4 = new Label(c.getItem(c.getSelectedIndex()) + " " + "AREA CALCULATER");
                l4.setBounds(50,50,220,20);

                b3 = new Button("Home");
                b3.setBounds(250,370,40,20);
                b3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        f1.setVisible(true);
                        f2.setVisible(false);
                    }
                });

                f2.add(l4);
                f2.add(b3);
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