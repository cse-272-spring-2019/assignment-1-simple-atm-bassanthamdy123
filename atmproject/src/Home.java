
import bank.client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Home extends JFrame{
    JButton Button1= new JButton("withdraw");
    JButton Button2= new JButton("deposit");
    JButton Button3= new JButton("balance");
    JButton Button4= new JButton("previous");
    JButton Button5= new JButton("next");
    JLabel label1= new JLabel ("empty");
    
    int index;
    client a;
    
    
    
    
    
    public Home (client a)
            
    {
       this.a = a; 
        setLayout(null);
        
        add(Button1);
        Button1.setBounds(200, 80, 100, 30);
        
        add(Button2);
        Button2.setBounds(200, 200, 100, 30);
        
        add(Button3);
        Button3.setBounds(200, 320, 100, 30);
        
        add(Button4);
        Button4.setBounds(200, 440, 100, 30);
        
        add(Button5);
        Button5.setBounds(200, 560, 100, 30);
        
        add(label1);
        label1.setBounds(300,40,300,50);
        
        Button1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String c = JOptionPane.showInputDialog(null, "enter amount");
        a.getAccount().withdraw(Float.parseFloat(c));
        index=a.getAccount().getHistory().size()-1;
            }
            
        }
       
        );
        Button2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String c = JOptionPane.showInputDialog(null, "enter amount");
        a.getAccount().deposit(Float.parseFloat(c));
        index=a.getAccount().getHistory().size()-1;
                
            }
            
        }
       
        );
        Button3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(a.getAccount().getBalance() + "");
        index=a.getAccount().getHistory().size()-1;
            }
            
        }
        );
        Button4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(a.getAccount().getHistory().get(index ).getAmount() + " "+a.getAccount().getHistory().get(index ).getMytype().name());
index--;
        if (index < 0) {
            label1.setText("there is no more TRANSACTIONS");
        } 
            }
            
        }
        );
        Button5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(a.getAccount().getHistory().get(index ).getAmount() + " "+a.getAccount().getHistory().get(index ).getMytype().name());
index++;
 if (index > a.getAccount().getHistory().size()-1) {
           label1.setText("there is no more TRANSACTIONS");
 }
                
            }
            
        }
        );
        
    }
    
    
    
    
    
    
}
