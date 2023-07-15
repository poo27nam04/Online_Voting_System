

package online_voting_system;

import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class Online_Voting_System  extends JFrame implements ActionListener{
    Online_Voting_System()
    {
        setBounds(0,0,1400,700);
        getContentPane().setBackground(Color.PINK);
        JLabel l1=new JLabel("Welcome to \n");
        l1.setFont(new Font("Tahoma",Font.BOLD,40));
        l1.setBounds(150,230,300,100);
        add(l1);
       
       JLabel l2=new JLabel(" Online Voting System 2021");
        l2.setFont(new Font("Tahoma",Font.BOLD,40));
        l2.setBounds(50,300,700,100);
        add(l2);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("online_voting_system/icons/vote2.jpg"));
         Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_FAST);
         ImageIcon i3=new ImageIcon(i2);
         JLabel l3=new JLabel(i3);
        l3.setBounds(700,200,500,300);
        add(l3);
        
        
        JButton b1=new JButton("NEXT->");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma",Font.BOLD,20));
        b1.setBounds(250,500,200,80);
        add(b1);
        
        
        
        
        
        
        
        
       
        setLayout(null);
        setVisible(true);
    }

    
    public static void main(String[] args) {
       
        new Online_Voting_System();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
                new mylogin().setVisible(true);
      
    }
    
}
