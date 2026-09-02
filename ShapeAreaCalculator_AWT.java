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
    TextField t1,t2,t3;

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

                                    try
                                    {
                                    Double r = Double.parseDouble(t1.getText());
                                    if(r == 0)
                                    {
                                        l6.setText("Error : Length cannot be zero");
                                        l6.setVisible(true);
                                    }
                                    else
                                    {
                                        double area = 22.0/7*r*r ;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Circle is :"+" "+(float)area);
                                    }
                                    }
                                    catch (Exception l)                                        {
                                            
                                        l6.setText("Error : Invalid input !");
                                        l6.setVisible(true);
                                        f2.add(l6);
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
                                    try 
                                    {
                                        Double s = Double.parseDouble(t1.getText());
                                        if (s == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                        double area = s*s ;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Squair is :"+" "+(float)area);
                                        return;
                                        }   
                                    }
                                    catch (Exception l)
                                    {
                                        l6.setText("Error : Invalid input !");
                                        l6.setVisible(true);
                                        f2.add(l6);
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
                            t1.setBounds(197,100,83,20);

                            t2 = new TextField();
                            t2.setBounds(197,150,83,20);

                            l6 = new Label("");
                            l6.setBounds(20,200,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter Length of the Rectangle :");
                            l5.setBounds(20,100,170,20);

                            l8 = new Label("Enter Bredth of the Rectangle :");
                            l8.setBounds(20,150,170,20);

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
                                    try{
                                        Double l = Double.parseDouble(t1.getText());
                                        Double b =Double.parseDouble(t2.getText());
                                        if(l == 0 || b == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                            double area = l*b ;
                                            l6.setVisible(true);
                                            l6.setText("The Area Of Rectangle is :"+" "+(float)area);
                                        }
                                    }
                                    catch(Exception ex){
                                        l6.setText("Error : Invalid input !");
                                        l6.setVisible(true);
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

                            l8 = new Label("Enter Bredth of the Triange:");
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
                                    try
                                    {
                                        Double l = Double.parseDouble(t1.getText());
                                        Double b =Double.parseDouble(t2.getText());
                                        if (l == 0 || b == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                        double area = (l*b)/2;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Triangle is :"+" "+(float)area);
                                        }
                                    }
                                    catch(NumberFormatException ex)
                                    {
                                        l6.setText("Error : Invalid input");
                                        l6.setVisible(true);
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
                            l5.setBounds(20,100,185,20);

                            l8 = new Label("Enter Bredth of the Parallelogram :");
                            l8.setBounds(20,150,185,20);

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
                                    try 
                                    {
                                        Double h = Double.parseDouble(t1.getText());
                                        Double b =Double.parseDouble(t2.getText());
                                        if (h == 0 || b == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                        double area = h*b;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Parallelogram is :"+" "+(float)area);
                                        }
                                    }
                                    catch(NumberFormatException ex)
                                    {
                                        l6.setText("Error : Invalid input");
                                        l6.setVisible(true);
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

                    case "ROMBUS" :
                    
                            t1 = new TextField();
                            t1.setBounds(210,100,70,20);

                            t2 = new TextField();
                            t2.setBounds(210,150,70,20);

                            l6 = new Label("");
                            l6.setBounds(20,200,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter Height of the Rombus :");
                            l5.setBounds(20,100,182,20);

                            l8 = new Label("Enter Base of the Rombus :");
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
                                    try
                                    {
                                        Double h = Double.parseDouble(t1.getText());
                                        Double b =Double.parseDouble(t2.getText());
                                        if (h == 0 || b == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                        double area = h*b;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Rombus is :"+" "+(float)area);
                                        }
                                    } 
                                    catch(NumberFormatException ex)
                                    {
                                        l6.setText("Error : Invalid input");
                                        l6.setVisible(true);
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

                    case "TRAPEZIUM" :

                            t1 = new TextField();
                            t1.setBounds(210,100,70,20);

                            t2 = new TextField();
                            t2.setBounds(210,150,70,20);

                            t3 = new TextField();
                            t3.setBounds(210,200,70,20);

                            l6 = new Label("");
                            l6.setBounds(20,250,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter Lenght of first paralle side :");
                            l5.setBounds(20,100,182,20);

                            l8 = new Label("Enter Lenght of first paralle side :");
                            l8.setBounds(20,150,182,20);

                            l9 = new Label("Enter Height of the Trapezium :");
                            l9.setBounds(20,200,182,20);

                            b4 = new Button("Calculate");
                            b4.setBounds(70,300,60,20);

                            b5 = new Button("clear");
                            b5.setBounds(160,300,60,20);

                            b5.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e)
                                {
                                    t1.setText("");
                                    t2.setText("");
                                    t3.setText("");
                                    l6.setText("");
                                    l6.setVisible(false);
                                }
                            });

                            b4.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e)
                                {   
                                    try
                                    {
                                        Double l1 = Double.parseDouble(t1.getText());
                                        Double l2 =Double.parseDouble(t2.getText());  
                                        Double height = Double.parseDouble(t3.getText());
                                        if (l1 == 0 || l2 == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        if (height == 0)
                                        {
                                            l6.setText("Error : Height cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                        double area = ((l1+l2)*height)/2; 
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Trapezium is :"+" "+(float)area);
                                        }
                                    }
                                    catch(NumberFormatException ex)
                                    {
                                        l6.setText("Error : Invalid input");
                                        l6.setVisible(true);
                                    }
                                }
                            });                            
                            f2.add(b4);
                            f2.add(b5);
                            f2.add(l5);
                            f2.add(l6);
                            f2.add(l8);
                            f2.add(l9);
                            f2.add(t1);
                            f2.add(t2);
                            f2.add(t3);
                            break;

                    case "KITE" :

                            t1 = new TextField();
                            t1.setBounds(190,100,90,20);

                            t2 = new TextField();
                            t2.setBounds(190,150,90,20);

                            l6 = new Label("");
                            l6.setBounds(20,200,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter Length of First digonal :");
                            l5.setBounds(20,100,163,20);

                            l8 = new Label("Enter Length of second digonal:");
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
                                    try
                                    {
                                        Double d1 = Double.parseDouble(t1.getText());
                                        Double d2 =Double.parseDouble(t2.getText());
                                        if (d1 == 0 || d2 == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                        double area = (d2*d1)/2;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Kite is :"+" "+(float)area);
                                        }
                                    }
                                    catch(NumberFormatException ex)
                                    {
                                        l6.setText("Error : Invalid input !");
                                        l6.setVisible(true);
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
                    case "ELLIPSE" :

                            t1 = new TextField();
                            t1.setBounds(210,100,78,20);

                            t2 = new TextField();
                            t2.setBounds(210,150,78,20);

                            l6 = new Label("");
                            l6.setBounds(20,200,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter Length of Semi-Major axis :");
                            l5.setBounds(20,100,185,20);

                            l8 = new Label("Enter Length of Semi-Minor axis :");
                            l8.setBounds(20,150,185,20);

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
                                    try
                                    {
                                        Double sma1 = Double.parseDouble(t1.getText());
                                        Double sma2 =Double.parseDouble(t2.getText());
                                        if (sma1 == 0 || sma2 == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                        double area = sma1*sma2*(22.0/7) ;
                                        l6.setVisible(true);
                                        l6.setText("The Area Of Ellipse is :"+" "+(float)area);
                                        }
                                    }
                                    catch (NumberFormatException ex)
                                    {
                                        l6.setText("Error : Invalid input !");
                                        l6.setVisible(true);
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

                    case "HEXAGON" :
                            
                            
                            t1 = new TextField();
                            t1.setBounds(180,100,90,20);

                            l6 = new Label("");
                            l6.setBounds(20,150,200,20);
                            l6.setVisible(false);

                            l5 = new Label("Enter lenght of the side :");
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
                                    try
                                    {                                    
                                        Double side = Double.parseDouble(t1.getText());
                                        double area = ((3*1.73)/2)*side*side ;
                                        if (side == 0)
                                        {
                                            l6.setText("Error : Length cannot be zero");
                                            l6.setVisible(true);
                                        }
                                        else
                                        {
                                            l6.setVisible(true);
                                            l6.setText("The Area Of Hexagon is :"+" "+(float)area);
                                        }
                                    }
                                    catch(NumberFormatException ex)
                                    {
                                        l6.setText("Error : Invalid input !");
                                        l6.setVisible(true);
                                    }
                                }
                            });                            
                            f2.add(b4);
                            f2.add(b5);
                            f2.add(l5);
                            f2.add(l6);
                            f2.add(t1);
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