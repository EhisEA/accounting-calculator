/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author EMMANUEL AYEMERE
 */
public class Main  {

    
    String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    String url = "jdbc:sqlserver://DESKTOP-IE4NO74;databaseName=cbt";
    String user= "emmy";
    String pass = "emmy";
    
     public Main(){
        
       
    
     try{
        ResultSet rs ;
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pass);
        String sql = "create table voe(fvvv varchar(8000), ho int)";//"select * from subject";
        PreparedStatement pst= con.prepareStatement(sql);
        /*pst.setString(1, regText.getText() );
        pst.setString(2, nameText.getText() );
        pst.setString(3, "hey");//.getSelectionModel() );
        pst.setString(4, "hey");//departmentText.toString() );
        */
      // pst.executeQuery();
        
        rs=pst.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getString("name"));
//            }

        
        }
        catch(Exception e){
           JFrame j = new JFrame();
           JOptionPane.showMessageDialog(j, e); 
        }
         
    }
  /*  String i;
    JPanel panel = new JPanel();
    JScrollPane scroll= new JScrollPane(panel);
    Font font1= new Font("Times New Roman", Font.BOLD, 32);
    Font font2= new Font("Times New Roman", Font.BOLD, 32);
    Font font3= new Font("Times New Roman", Font.BOLD, 32);
    Font font4= new Font("Times New Roman", Font.BOLD, 32);
    Font font5= new Font("Times New Roman", Font.BOLD, 32);
   
    
    public void addComponent(){
       
        setSize(600,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(scroll);
        
        panel.setLayout(null);
        //++++++++++++++++1111111111111111111111
        JLabel title=new JLabel("Accounting");
        title.setBounds(200,20,300,40);
        title.setFont(font1);
        panel.add(title);
        
        //++++++++++++++++++++222222222222222222
        JTextField total = new JTextField(i);
        total.setBounds(100,100,400,30);
        total.enableInputMethods(false);
        panel.add(total);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    */
    public static void main(String[] args) {
        Main m = new Main();
    }
}
