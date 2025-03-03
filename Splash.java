
package employeemanagementsystem;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Splash  extends JFrame implements ActionListener{
    Splash(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(100,20,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,55));
        heading.setForeground(Color.white);
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/front.jpg"));
        Image i2;
        i2 = i1.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1350,800);
        add(image);
        
        JButton clickhere=new JButton("Click Here To Continue");
        clickhere .setBounds(500,550 ,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.white);
        
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        setSize(1450,750);
        setLocation(0,0);
        setVisible(true);
        
        /*while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
    
            }
            catch(Exception e){
            }
            heading.setVisible(true);
             try{
                Thread.sleep(500);
    
            }
            catch(Exception e){
            }
        }*/
            
        
    }
    public void actionPerformed(ActionEvent ae ){
        setVisible(false);
        new Login();
        
    }




    public static void main(String args[]){
        new  Splash();
        
    }
}
