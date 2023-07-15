

package online_voting_system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class votepage extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5;
    int a,b,c,d;
    
    
    votepage(){
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("online_voting_system/icons/Shivsena.png"));
          Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_FAST);
         ImageIcon i3=new ImageIcon(i2);
         JLabel l1=new JLabel(i3);
         l1.setBounds(50,50,300,200);
         add(l1);
         
         ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("online_voting_system/icons/NCP.png"));
          Image i5=i4.getImage().getScaledInstance(300,200,Image.SCALE_FAST);
         ImageIcon i6=new ImageIcon(i5);
         JLabel l2=new JLabel(i6);
         l2.setBounds(1000,50,300,200);
         add(l2);
         
         ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("online_voting_system/icons/BJP.jpg"));
          Image i8=i7.getImage().getScaledInstance(300,200,Image.SCALE_FAST);
         ImageIcon i9=new ImageIcon(i8);
         JLabel l3=new JLabel(i9);
         l3.setBounds(1000,350,300,200);
         add(l3);
         
         ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("online_voting_system/icons/INC.jpg"));
          Image i11=i10.getImage().getScaledInstance(300,200,Image.SCALE_FAST);
         ImageIcon i12=new ImageIcon(i11);
         JLabel l4=new JLabel(i12);
         l4.setBounds(50,350,300,200);
         add(l4);
         
         
        b1=new JButton("VOTE");
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.addActionListener(this);
        b1.setBounds(120,260,150,50);
        add(b1);
        
         b2=new JButton("VOTE");
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));
        b2.addActionListener(this);
        b2.setBounds(1070,260,150,50);
        add(b2);
                
        b3=new JButton("VOTE");
        b3.setFont(new Font("Tahoma",Font.PLAIN,20));
        b3.addActionListener(this);
        b3.setBounds(120,560,150,50);
        add(b3);
                
        b4=new JButton("RESULTS");
        b4.setFont(new Font("Tahoma",Font.PLAIN,20));
        b4.addActionListener(this);
        b4.setBounds(600,300,150,70);
        add(b4);
                
        b5=new JButton("VOTE");
        b5.setFont(new Font("Tahoma",Font.PLAIN,20));
        b5.addActionListener(this);
        b5.setBounds(1070,560,150,50);
        add(b5);
                
         setBounds(0,0,1600,700);
         getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args){
       new votepage();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
      if(e.getSource()==b1) { 
        a=a+1;
      
        JOptionPane.showMessageDialog(null,"Your vote is added to shivsena");
        
    }
      if(e.getSource()==b2) { 
        b=b+1;
     
        JOptionPane.showMessageDialog(null,"Your vote is added to NCP\n Thanks for Vote!!");
    }
    if(e.getSource()==b3) { 
        c=c+1;
     
        JOptionPane.showMessageDialog(null,"Your vote is added to INC\n Thanks for Vote!!");
    }
    if(e.getSource()==b5) { 
        d=d+1;
      
        JOptionPane.showMessageDialog(null,"Your vote is added to BJP\n Thanks for Vote!!");
    }
    if(e.getSource()==b4) { 
       
     
        JOptionPane.showMessageDialog(null,"shivsena="+a+" NCP="+b+" INC="+c+" BJP="+d);
    }
}

}

