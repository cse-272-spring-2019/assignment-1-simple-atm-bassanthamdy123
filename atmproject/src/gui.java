
import bank.client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class gui extends JFrame {
    JButton Button1 = new JButton("validate");
    JButton Button2 = new JButton("0");
    JButton Button3 = new JButton("1");
    JButton Button8 = new JButton("2");
    JButton Button7 = new JButton("3");
    JButton Button9 = new JButton("4");
    JButton Button5 = new JButton("5");
    JButton Button6 = new JButton("6");
    JButton Button10 = new JButton("7");
    JButton Button11 = new JButton("8");
    JButton Button12 = new JButton("9");
    
    JLabel label1 =new JLabel("enter your id");
    JTextField Text1 = new JTextField (50);
    
    client a = new client("5337", "bassant", "hamdy", 0);
    
    
    public gui()
            {
                
                setLayout(null);
                add(label1);
                label1.setBounds(50, 50, 100, 30);
                add(Text1);
                Text1.setBounds(120, 50, 170, 30);
                add(Button1);
                Button1.setBounds(320, 120, 120, 120);
                add(Button2);
                Button2.setBounds(120, 100, 50, 50);
                add(Button3);
                Button3.setBounds(180, 100, 50, 50);
                add(Button8);
                Button8.setBounds(240, 100, 50, 50);
                add(Button7);
                Button7.setBounds(120, 160, 50, 50);
                add(Button9);
                Button9.setBounds(180, 160, 50, 50);
                add(Button5);
                Button5.setBounds(240, 160, 50, 50);
                add(Button6);
                Button6.setBounds(120, 220, 50, 50);
                add(Button10);
                Button10.setBounds(180, 220, 50, 50);
                add(Button11);
                Button11.setBounds(240, 220, 50, 50);
                add(Button12);
                Button12.setBounds(120, 280, 50, 50);
                
               
               
               Button1.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        String y=Text1.getText();
                      if(y.equals(a.getAccount().getAccountnumber()))
        {
            Home m =new Home(a);
            m.setVisible(true);
            setVisible(false);
            m.setSize(800,900);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "error");
        }
                    }
                     
            });
               Button2.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"0");
                    }
                     
            });
               Button3.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"1");
                    }
                     
            });
               Button8.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"2");
                    }
                     
            });
               Button7.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"3");
                    }
                     
            });
               Button9.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"4");
                    }
                     
            });
               Button5.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"5");
                    }
                     
            });
               Button6.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"6");
                    }
                     
            });
               Button10.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"7");
                    }
                     
            });
               Button11.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"8");
                    }
                     
            });
               Button12.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        Text1.setText(Text1.getText()+"9");
                    }
                     
            });

    
    
}

    
}
    
