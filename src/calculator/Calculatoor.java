
package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Calculatoor extends JFrame implements ActionListener  {
    
    static double a=0,b=0;
    static double result=0;
    static int operator=0;
    String ON="ON",OFF="OFF";
    static boolean c=false;
    
    
    JPanel p1 = new JPanel();
    JPanel p2=new JPanel(); 
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    
    JButton b1 = new JButton("AC");
    JButton b2 = new JButton("OFF");
    JButton b3 = new JButton("DEL");
    JButton b4 = new JButton("÷");
    JButton b5 = new JButton("7");
    JButton b6 = new JButton("8");
    JButton b7 = new JButton("9");
    JButton b8 = new JButton("X");
    JButton b9 = new JButton("4");
    JButton b10 = new JButton("5");
    
    JButton b11 = new JButton("6");
    JButton b12 = new JButton("-");
    JButton b13 = new JButton("1");
    JButton b14 = new JButton("2");
    JButton b15 = new JButton("3");
    
    JButton b16 = new JButton("+");
    JButton b17 = new JButton("0");
    JButton b18 = new JButton("00");
    JButton b19 = new JButton(".");
    JButton b20 = new JButton("=");
    
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); 
      
        String s1;
        
         if(e.getSource()==b2){
            
            if(c){
                b2.setText("OFF");
                  b2.setForeground(new Color(246, 153, 6));
                c=false;
            }else if(c==false){
                 b2.setText("ON");
                   b2.setForeground(Color.WHITE);
                 c=true;
            }

        }
         
        /*******************************************************/
        
        if(c==false){
            
        
        if(e.getSource()==b13){
            s1=t1.getText()+"1";
            t1.setText(s1);
             t1.setText("");
            t1.setText("1");
        }
       
        if(e.getSource()==b14){
            s1=t1.getText()+"2";
            t1.setText(s1);
             
        }
        if(e.getSource()==b15){
            s1=t1.getText()+"3";
            t1.setText(s1);
             
        }
        if(e.getSource()==b9){
            s1=t1.getText()+"4";
            t1.setText(s1);
             
        }
        if(e.getSource()==b10){
            s1=t1.getText()+"5";
            t1.setText(s1);
             
        }
        if(e.getSource()==b11){
            s1=t1.getText()+"6";
            t1.setText(s1);
            
        }
        if(e.getSource()==b5){
            s1=t1.getText()+"7";
            t1.setText(s1);
             
        }
        if(e.getSource()==b6){
            s1=t1.getText()+"8";
            t1.setText(s1);
         
           
        }
        if(e.getSource()==b7){
            s1=t1.getText()+"9";
            t1.setText(s1);
            
            
        }
        
        if(e.getSource()==b1){
            //AC
            t1.setText("");
            t2.setText("");
        }
       
        if(e.getSource()==b3){
            String s =t1.getText();
            t1.setText("");
            for(int i=0;i<s.length()-1;i++){
    
            t1.setText(t1.getText()+s.charAt(i));
            
}
        }
        
        if(e.getSource()==b17){
            s1=t1.getText()+"0";
            t1.setText(s1);
             
             
        }
        if(e.getSource()==b18){
            s1=t1.getText()+"00";
            t1.setText(s1);
            
            
        }
        if(e.getSource()==b19){
           
            s1=t1.getText()+".";
            t1.setText(s1);
            
            
        }
        if(e.getSource()==b4){
           
           a=Double.parseDouble(t1.getText());
            s1=t1.getText()+"÷";
            t2.setText(s1);
            operator=1;
            t1.setText("");
        }
        if(e.getSource()==b8){
            a=Double.parseDouble(t1.getText());
            s1=t1.getText()+"x";
            t2.setText(s1);
            operator=2;
            t1.setText("");
            
        }
        if(e.getSource()==b12){
            a=Double.parseDouble(t1.getText());
            s1=t1.getText()+"-";
            t2.setText(s1);
            operator=3;
            t1.setText("");
        }
        if(e.getSource()==b16){
            a=Double.parseDouble(t1.getText());
            s1=t1.getText()+"+";
            t2.setText(s1);
            operator=4;
            t1.setText("");
            
        }
        if(e.getSource()==b20){
            
            b=Double.parseDouble(t1.getText());
           
            t2.setText(t2.getText()+""+t1.getText()+"=");
             t1.setText("");
              switch(operator){
            case 1:
                result=a/b;
                break;
            case 2:
                result=a*b;
                break;    
            case 3:
                result=a-b;
                break;    
            case 4:
                result=a+b;
                break;    
        }
          int value = (int)result;    
     
          double value3 = (double)value;
           
          if(result == value3){
              t1.setText(""+value); 
          
          }else{
            
               t1.setText(""+Math.round(result*1000000)/1000000.0); 
               
          }
          
     
        }
        }
        
        
        
  
    }
     /*******************************************************/
    
    public void Create_The_Frame(){
        this.setTitle("Calculator");
        this.setSize(480,650);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300,300);
        this.setResizable(true);
        this.setVisible(true);
        this.setLayout(new GridLayout(2,1));
        try {
            File myFile = new File("image2.jpg");
            Image img = ImageIO.read(myFile);
            this.setIconImage(img);
        } catch (IOException ex) {
             Logger.getLogger(Calculatoor.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }
     /*******************************************************/
    public void Add_Action_Listener(){
        
           
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
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
        }
             /*******************************************************/
     
    public void Create_absolute_Layout(){
         p1.setLayout(null);
         p1.setBackground(Color.BLACK);
         p2.setBackground(Color.BLACK);
         p1.setBorder(BorderFactory.createLineBorder(null));
        
         p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         this.add(p1);
         
    }
    
     /*******************************************************/
     public void Create_GridLayout_Layout(){
         p2.setLayout(new GridLayout(5,4));
         this.add(p2);
     }
     
      /*******************************************************/
     public void font_Size_Of_Buuttons(){
          b1.setFont(new Font("",Font.BOLD, 20));
          b2.setFont(new Font("",Font.BOLD, 20));
          b3.setFont(new Font("",Font.BOLD, 20));
          b4.setFont(new Font("",Font.BOLD, 35));
          b5.setFont(new Font("",Font.BOLD, 20));
          b6.setFont(new Font("",Font.BOLD, 20));
          b7.setFont(new Font("",Font.BOLD, 20));
          b8.setFont(new Font("",Font.BOLD, 25));
          b9.setFont(new Font("",Font.BOLD, 20));
          b10.setFont(new Font("",Font.BOLD, 20));
          b11.setFont(new Font("",Font.BOLD, 20));
          b12.setFont(new Font("",Font.BOLD, 40));
          b13.setFont(new Font("",Font.BOLD, 20));
          b14.setFont(new Font("",Font.BOLD, 20));
          b15.setFont(new Font("",Font.BOLD, 20));
          b16.setFont(new Font("",Font.BOLD, 35));
          b17.setFont(new Font("",Font.BOLD, 20));
          b18.setFont(new Font("",Font.BOLD, 20));
          b19.setFont(new Font("",Font.BOLD, 20));
          b20.setFont(new Font("",Font.BOLD, 35));
     }
     
      /*******************************************************/
     public void Set_Back_Ground_For_Buttons (){
         b1.setBackground( new Color(159, 159, 159));
         b1.setForeground(Color.BLACK);
         b1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
      
         
         b2.setBackground( new Color(159, 159, 159));
         b2.setForeground(new Color(246, 153, 6));
         b2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b3.setBackground( new Color(159, 159, 159));
         b3.setForeground(Color.BLACK);
         b3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b4.setBackground( new Color(246, 153, 6));
         b4.setForeground(Color.WHITE);
         b4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b5.setBackground( new Color(49, 49, 49));
         b5.setForeground(Color.WHITE);
         b5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b6.setBackground( new Color(49, 49, 49));
         b6.setForeground(Color.WHITE);
         b6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b7.setBackground( new Color(49, 49, 49));
         b7.setForeground(Color.WHITE);
         b7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b8.setBackground( new Color(246, 153, 6));
         b8.setForeground(Color.WHITE);
         b8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b9.setBackground( new Color(49, 49, 49));
         b9.setForeground(Color.WHITE);
         b9.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
         
         b10.setBackground( new Color(49, 49, 49));
         b10.setForeground(Color.WHITE);
         b10.setBorder(BorderFactory.createLineBorder(new Color(0, 0,0)));
         
         b11.setBackground( new Color(49, 49, 49));
         b11.setForeground(Color.WHITE);
         b11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b12.setBackground( new Color(246, 153, 6));
         b12.setForeground(Color.WHITE);
         b12.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
         
         b13.setBackground( new Color(49, 49, 49));
         b13.setForeground(Color.WHITE);
         b13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b14.setBackground( new Color(49, 49, 49));
         b14.setForeground(Color.WHITE);
         b14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b15.setBackground( new Color(49, 49, 49));
         b15.setForeground(Color.WHITE);
         b15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b16.setBackground( new Color(246, 153, 6));
         b16.setForeground(Color.WHITE);
         b16.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b17.setBackground( new Color(49, 49, 49));
         b17.setForeground(Color.WHITE);
         b17.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b18.setBackground( new Color(49, 49, 49));
         b18.setForeground(Color.WHITE);
         b18.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b19.setBackground( new Color(49, 49, 49));
         b19.setForeground(Color.WHITE);
         b19.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         b20.setBackground( new Color(246, 153, 6));
         b20.setForeground(Color.WHITE);
         b20.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
         
         
         
         
         
     }
     
        /*******************************************************/
     public void Add_Buttons(){
         p2.add(b2);       p2.add(b1);     p2.add(b3);      p2.add(b4);
         p2.add(b5);       p2.add(b6);     p2.add(b7);      p2.add(b8);
         p2.add(b9);       p2.add(b10);    p2.add(b11);     p2.add(b12);
         p2.add(b13);      p2.add(b14);    p2.add(b15);     p2.add(b16);
         p2.add(b17);      p2.add(b18);    p2.add(b19);     p2.add(b20);
     }
     
      /*******************************************************/
     public void Add_Text_Field1(){
         t1.setBounds(20,50,400,100);
         t1.setFont(new Font("",Font.BOLD, 50));
         t1.setForeground(Color.WHITE);
         t1.setBackground(Color.BLACK);
         t1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         p1.add(t1);
     }
      /*******************************************************/
     public void Add_Text_Field2(){
         t2.setBounds(20,20,400,30);
         t2.setFont(new Font("",Font.PLAIN,20));
         t2.setForeground(Color.WHITE);
         t2.setBackground(Color.BLACK);
         t2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         p1.add(t2);
     }
      /*******************************************************/
     
    
    public Calculatoor(){
        
        Create_The_Frame();
        Create_absolute_Layout();
        Create_GridLayout_Layout();
        Add_Buttons();
        font_Size_Of_Buuttons();
        Add_Text_Field1();
        Add_Text_Field2();
        Set_Back_Ground_For_Buttons();
        Add_Action_Listener();
       
     
        
    }
    
    
    
}
