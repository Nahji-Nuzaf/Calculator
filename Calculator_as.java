//import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




class close extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}

class Calculator implements ActionListener{
    
    TextField tf;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,
            b24,b25,b26,b27,b28,b29,b30;
    
    String fv, sv, op,mfv,msv,mop,pm;
    Double fdv,sdv,tot,mfdv,msdv,pmv;
    
    Calculator(){
        Frame f = new Frame();
        f.addWindowListener(new close());
        f.setBackground(Color.LIGHT_GRAY);
        f.setTitle("Calculator");
        f.setResizable(false);
        f.setSize(350,500);
        f.setLocationRelativeTo(null);
        
        Font f1 = new Font("Poppins", Font.BOLD, 27);
        Font f2 = new Font("Poppins", Font.BOLD, 20);
        Font f3 = new Font("Poppins", Font.BOLD, 40);
        

        MenuBar mb = new MenuBar();
        
        Menu m1 = new Menu("View");
//                m1.setFont(f3);

        Menu m2 = new Menu("Edit");        
//                m2.setFont(f3);

        Menu m3 = new Menu("Help");
//                m3.setFont(f3);
        MenuItem mi1 = new MenuItem("View Help F1");
        MenuItem mi2 = new MenuItem("About Calculator");
        m3.add(mi1);
        m3.add(mi2);
        
        Menu m4 = new Menu("Creator");
        MenuItem mi3 = new MenuItem("Nahji Nuzaf");        
        MenuItem mi4 = new MenuItem("200330600748");
        m4.add(mi3);
        m4.add(mi4);
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);        
        mb.add(m4);

        f.setMenuBar(mb);
        
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout gl = new GridLayout(6, 5, 8, 8);
        p2.setLayout(gl);
        p2.setBackground(Color.LIGHT_GRAY);
        
        tf = new TextField(13);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(Color.black);
        tf.setBackground(Color.white);
        tf.setText("0");
        
        p1.add(tf);
        
        b1 = new Button("MC");
        b2 = new Button("MR");
        b3 = new Button("MS");
        b4 = new Button("M+");
        b5 = new Button("M-");
        b6 = new Button("<-");
        b7 = new Button("CE");
        b8 = new Button("C");
        b9 = new Button("+/-");
        b10 = new Button("SQRT");
        b11 = new Button("7");
        b12 = new Button("8");
        b13 = new Button("9");
        b14 = new Button("/");
        b15 = new Button("%");
        b16 = new Button("4");
        b17 = new Button("5");
        b18 = new Button("6");
        b19 = new Button("*");
        b20 = new Button("1/x");   ///
        b21 = new Button("1");
        b22 = new Button("2");
        b23 = new Button("3");
        b24 = new Button("-");
        b25 = new Button("x²");
        b26 = new Button("0");
        b27 = new Button("00");
        b28 = new Button(".");
        b29 = new Button("+");
        b30 = new Button("=");
        
        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.BLACK);
        b4.setBackground(Color.BLACK);
        b5.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
        b10.setBackground(Color.LIGHT_GRAY);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.LIGHT_GRAY);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setBackground(Color.LIGHT_GRAY);
        b16.setBackground(Color.LIGHT_GRAY);
        b17.setBackground(Color.LIGHT_GRAY);
        b18.setBackground(Color.LIGHT_GRAY);
        b19.setBackground(Color.LIGHT_GRAY);
        b20.setBackground(Color.LIGHT_GRAY);
        b21.setBackground(Color.LIGHT_GRAY);
        b22.setBackground(Color.LIGHT_GRAY);
        b23.setBackground(Color.LIGHT_GRAY);
        b24.setBackground(Color.LIGHT_GRAY);
        b25.setBackground(Color.LIGHT_GRAY);
        b26.setBackground(Color.LIGHT_GRAY);
        b27.setBackground(Color.LIGHT_GRAY);
        b28.setBackground(Color.LIGHT_GRAY);
        b29.setBackground(Color.LIGHT_GRAY);
        b30.setBackground(Color.CYAN);
        
        
        
        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
        b7.setFont(f2);
        b8.setFont(f2);
        b9.setFont(f2);
        b10.setFont(f2);
        b11.setFont(f1);
        b12.setFont(f1);
        b13.setFont(f1);
        b14.setFont(f3);
        b15.setFont(f1);
        b16.setFont(f1);
        b17.setFont(f1);
        b18.setFont(f1);
        b19.setFont(f3);
        b20.setFont(f2);
        b21.setFont(f1);
        b22.setFont(f1);
        b23.setFont(f1);
        b24.setFont(f3);
        b25.setFont(f1);
        b26.setFont(f1);
        b27.setFont(f1);
        b28.setFont(f1);
        b29.setFont(f3);
        b30.setFont(f3);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);
        p2.add(b29);
        p2.add(b30);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);
        
        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);

        f.setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent d){
        
        if (tf.getText().equals("0")) {
            tf.setText("");
        }
        
        Object o = d.getSource(); 
        
            //numbers
        
        if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        }else if(o.equals(b12)){
            tf.setText(tf.getText() + b12.getLabel());
        }else if(o.equals(b13)){
            tf.setText(tf.getText() + b13.getLabel());
        }else if(o.equals(b16)){
            tf.setText(tf.getText() + b16.getLabel());
        }else if(o.equals(b17)){
            tf.setText(tf.getText() + b17.getLabel());
        }else if(o.equals(b18)){
            tf.setText(tf.getText() + b18.getLabel());
        }else if(o.equals(b21)){
            tf.setText(tf.getText() + b21.getLabel());
        }else if(o.equals(b22)){
            tf.setText(tf.getText() + b22.getLabel());
        }else if(o.equals(b23)){
            tf.setText(tf.getText() + b23.getLabel());
        }else if(o.equals(b26)){
            tf.setText(tf.getText() + b26.getLabel());
        }else if(o.equals(b27)){
            tf.setText(tf.getText() + b27.getLabel());
        }else if(o.equals(b28)){
            tf.setText(tf.getText() + b28.getLabel());
            
            //marks
            
        }else if(o.equals(b8)){ //C
            
            tf.setText("0");

        }else if(o.equals(b7)){ //CE
            
            tf.setText("0");

        }else if(o.equals(b6)){ //Backspace
            
            tf.setText(tf.getText().substring(0, tf.getText().length() - 1)); 
            
        }else if(o.equals(b9)){ //Plus or Minus

            pm = tf.getText();
            pmv = Double.parseDouble(pm);
            pmv = -pmv;
            tf.setText(String.valueOf(pmv));
            
        }else if(o.equals(b14)){ //DIVISION (/)
            
            fv = tf.getText();
            op = b14.getLabel();
            tf.setText("");
            
        }else if(o.equals(b15)){ //PERCENTAGE (%)
            
            fv = tf.getText();
            op = b15.getLabel();
            tf.setText("");
            
        }else if(o.equals(b19)){ //MULTIPLICATION (*)
            
            fv = tf.getText();
            op = b19.getLabel();
            tf.setText("");
            
        }else if(o.equals(b20)){ //1 upon x (1/x)
            
            fv = tf.getText();
            op = b20.getLabel();
//            tf.setText("");
            
        }else if(o.equals(b10)){ //SQURE ROOT (√)
            
            fv = tf.getText();
            op = b10.getLabel();
//            tf.setText("");
           
        }else if(o.equals(b24)){ //MINUS (-)
            
            fv = tf.getText();
            op = b24.getLabel();
            tf.setText("");
            
        }else if(o.equals(b25)){ //POWER OF 2 (X²)
            
            fv = tf.getText();
            op = b25.getLabel();
//            tf.setText("");
            
        }else if(o.equals(b29)){ //PLUS (+)
            
            fv = tf.getText();
            op = b29.getLabel();
            tf.setText("");
            
        }else if(o.equals(b30)){ //EQUAL (=)
            
            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);
            tf.setText("");
            
            
            if (op.equals("/")) {
                
                tot = fdv / sdv;
                tf.setText(tot  + "");
                
            } else if (op.equals("%")) {  
                
                tot = fdv /100 * sdv ;
                tf.setText(tot  + "");
                
            } else if (op.equals("*")) {
                
                tot = fdv * sdv;
                tf.setText(tot  + "");
                
            } else if (op.equals("1/x")) {
                
                tot = 1 / fdv;
                tf.setText(tot  + "");
                
            }else if (op.equals("SQRT")) { 
                
                tot = fdv ;
                tf.setText(Math.sqrt(tot)  + "");
                
                
            } else if (op.equals("-")) {
                
                tot = fdv - sdv;
                tf.setText(tot  + "");
                
            } else if (op.equals("x²")) {
                
                tot = fdv * fdv;
                tf.setText(tot  + "");
                
            }else if (op.equals("+")) {
                
                tot = fdv + sdv;
                tf.setText(tot  + "");
                
            } 
 
            //Memory Buttons
            
        }else if(o.equals(b1)){  //Memory Clear
            
            tf.setText("0");

        }else if(o.equals(b4)){ //Memory Plus
            
            mfv = tf.getText();
            mop = b4.getLabel();
            tf.setText("");
//            System.out.println(mfv);

        }else if(o.equals(b5)){ //Memory Minus
            
            mfv = tf.getText();
            mop = b5.getLabel();
            tf.setText("");
//            System.out.println(mfv);

        }else if(o.equals(b2)){ //Memory Recall

            msv = tf.getText();

            mfdv = Double.parseDouble(mfv);
            msdv = Double.parseDouble(msv);
            tf.setText("");
            
            if (mop.equals("M+")) {
                
                tot = mfdv + msdv;
                tf.setText(tot  + "");
                
            } else if (mop.equals("M-")) {  
                
                tot = mfdv - msdv;
                tf.setText(tot  + "");
                
            }
            
        }
        
    }
}

public class Calculator_as {
    public static void main(String[] args) {
        new Calculator();
    }
}
