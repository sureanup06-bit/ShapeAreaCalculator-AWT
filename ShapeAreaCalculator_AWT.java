import java.awt.*;
import java.awt.event.*;


//ui     :- f1,l1,l2,l3,b1,b2,choice c

//ui2    :- f2,l4,switche,b3

//circle :- f2,l5,l6,l7,t1,b4,

class ShapeAreaCalculator_AWT
{
    Frame f1,f2;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
    Choice c;
    Button b1,b2,b3,b4,b5;
    TextField t1,t2;

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

                String switche;
                switche = c.getItem(c.getSelectedIndex());

                switch(switche)
                {
                    case "CIRCLE" :

                            t1 = new TextField();
                            t1.setBounds(180,100,90,20);

                            l6 = new Label("");
                            l6.setBounds(20,150,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter radius of the circle :");
                            l5.setBounds(20,100,150,20);

                            b4 = new Button("Calculate");
                            b4.setBounds(70,200,60,20);

                            b5 = new Button("clear");
                            b5.setBounds(160,200,60,20);

                            b5.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e)
                                {
                                    t1.setText("");
                                    l6.setText("");
                                    l6.setVisible(false);
                                }
                            });

                            b4.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e)
                                {
                                    if (t1.getText().isEmpty() || Double.parseDouble(t1.getText()) < 0)
                                    {
                                        l7 = new Label("Error : Invalid input ! ");
                                        l7.setBounds(20,150,200,20);
                                        f2.add(l7);
                                    }
                                    else
                                    {
                                        Double r = Double.parseDouble(t1.getText());
                                        double area = 22.0/7*r*r ;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Circle is :"+" "+(float)area);
                                    }
                                }
                            });                            
                            f2.add(b4);
                            f2.add(b5);
                            f2.add(l5);
                            f2.add(l6);
                            f2.add(t1);
                            break;


                    case "SQUAIR" :
                            t1 = new TextField();
                            t1.setBounds(180,100,90,20);

                            l6 = new Label("");
                            l6.setBounds(20,150,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter radius of the squair :");
                            l5.setBounds(20,100,150,20);

                            b4 = new Button("Calculate");
                            b4.setBounds(70,200,60,20);

                            b5 = new Button("clear");
                            b5.setBounds(160,200,60,20);

                            b5.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e)
                                {
                                    t1.setText("");
                                    l6.setText("");
                                    l6.setVisible(false);
                                }
                            });

                            b4.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e)
                                {
                                    if (t1.getText().isEmpty() || Double.parseDouble(t1.getText()) < 0)
                                    {
                                        l7 = new Label("Error : Invalid input ! ");
                                        l7.setBounds(20,150,200,20);
                                        f2.add(l7);
                                    }
                                    else
                                    {
                                        Double s = Double.parseDouble(t1.getText());
                                        double area = s*s ;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Squair is :"+" "+(float)area);
                                    }
                                }
                            });                            
                            f2.add(b4);
                            f2.add(b5);
                            f2.add(l5);
                            f2.add(l6);
                            f2.add(t1);
                            break;

                    case "RECTANGLE" :

                            t1 = new TextField();
                            t1.setBounds(190,100,90,20);

                            t2 = new TextField();
                            t2.setBounds(190,150,90,20);

                            l6 = new Label("");
                            l6.setBounds(20,200,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter Length of the Rectangle :");
                            l5.setBounds(20,100,163,20);

                            l8 = new Label("Enter Bredth of the Rectangle :");
                            l8.setBounds(20,150,163,20);

                            b4 = new Button("Calculate");
                            b4.setBounds(70,250,60,20);

                            b5 = new Button("clear");
                            b5.setBounds(160,250,60,20);

                            b5.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e)
                                {
                                    t1.setText("");
                                    t2.setText("");
                                    l6.setText("");
                                    l6.setVisible(false);
                                }
                            });

                            b4.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e)
                                {
                                    if (t1.getText().isEmpty() || t2.getText().isEmpty() || Double.parseDouble(t1.getText()) < 0 || Double.parseDouble(t2.getText()) < 0)
                                    {
                                        l7 = new Label("Error : Invalid input ! ");
                                        l7.setBounds(20,200,200,20);
                                        f2.add(l7);
                                    }
                                    else
                                    {
                                        Double l = Double.parseDouble(t1.getText());
                                        Double b =Double.parseDouble(t2.getText());
                                        double area = l*b ;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Rectangle is :"+" "+(float)area);
                                    }
                                }
                            });                            
                            f2.add(b4);
                            f2.add(b5);
                            f2.add(l5);
                            f2.add(l6);
                            f2.add(l8);
                            f2.add(t1);
                            f2.add(t2);
                            break;

                    case "TRIANGLE" :

                            t1 = new TextField();
                            t1.setBounds(190,100,90,20);

                            t2 = new TextField();
                            t2.setBounds(190,150,90,20);

                            l6 = new Label("");
                            l6.setBounds(20,200,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter Length of the Triangle :");
                            l5.setBounds(20,100,163,20);

                            l8 = new Label("Enter Bredth of the Bredth :");
                            l8.setBounds(20,150,163,20);

                            b4 = new Button("Calculate");
                            b4.setBounds(70,250,60,20);

                            b5 = new Button("clear");
                            b5.setBounds(160,250,60,20);

                            b5.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e)
                                {
                                    t1.setText("");
                                    t2.setText("");
                                    l6.setText("");
                                    l6.setVisible(false);
                                }
                            });

                            b4.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e)
                                {
                                    if (t1.getText().isEmpty() || t2.getText().isEmpty() || Double.parseDouble(t1.getText()) < 0 || Double.parseDouble(t2.getText()) < 0)
                                    {
                                        l7 = new Label("Error : Invalid input ! ");
                                        l7.setBounds(20,200,200,20);
                                        f2.add(l7);
                                    }
                                    else
                                    {
                                        Double l = Double.parseDouble(t1.getText());
                                        Double b =Double.parseDouble(t2.getText());
                                        double area = (l*b)/2;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Triangle is :"+" "+(float)area);
                                    }
                                }
                            });                            
                            f2.add(b4);
                            f2.add(b5);
                            f2.add(l5);
                            f2.add(l6);
                            f2.add(l8);
                            f2.add(t1);
                            f2.add(t2);
                            break;

                    case "PARALLELOGRAM" :
                        t1 = new TextField();
                            t1.setBounds(210,100,70,20);

                            t2 = new TextField();
                            t2.setBounds(210,150,70,20);

                            l6 = new Label("");
                            l6.setBounds(20,200,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter Height of the Parallelogram :");
                            l5.setBounds(20,100,182,20);

                            l8 = new Label("Enter Bredth of the Parallelogram :");
                            l8.setBounds(20,150,182,20);

                            b4 = new Button("Calculate");
                            b4.setBounds(70,250,60,20);

                            b5 = new Button("clear");
                            b5.setBounds(160,250,60,20);

                            b5.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e)
                                {
                                    t1.setText("");
                                    t2.setText("");
                                    l6.setText("");
                                    l6.setVisible(false);
                                }
                            });

                            b4.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e)
                                {
                                    if (t1.getText().isEmpty() || t2.getText().isEmpty() || Double.parseDouble(t1.getText()) < 0 || Double.parseDouble(t2.getText()) < 0)
                                    {
                                        l7 = new Label("Error : Invalid input ! ");
                                        l7.setBounds(20,200,200,20);
                                        f2.add(l7);
                                    }
                                    else
                                    {
                                        Double h = Double.parseDouble(t1.getText());
                                        Double b =Double.parseDouble(t2.getText());
                                        double area = h*b;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Parallelogram is :"+" "+(float)area);
                                    }
                                }
                            });                            
                            f2.add(b4);
                            f2.add(b5);
                            f2.add(l5);
                            f2.add(l6);
                            f2.add(l8);
                            f2.add(t1);
                            f2.add(t2);
                            break;

                }

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