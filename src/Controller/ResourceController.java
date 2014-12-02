/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import view.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.AddResource;

/**
 *
 * @author dsindhusha
 */
public class ResourceController {
  
   
  
    
    
    public void addResource(AddResource rc)
    {
       try
           {
                  AddResource ar=new AddResource();
                   PreparedStatement pst;
                 Class.forName("com.mysql.jdbc.Driver");
                 System.out.println("connected");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
                 String query;
                 query = "Insert into resources(ProjectId,ResourceId,Name,Dailycost,Type)values(?,?,?,?,?)";
                 pst = con.prepareStatement(query);
                
                 pst.setString(1,rc.getProjectid());
                 pst.setString(2,rc.getResourceid());
                 pst.setString(3,rc.Name);
                 pst.setString(4,rc.Dailycost);
                 pst.setString(5,rc.Resourcetype);
                 pst.execute();
                 JOptionPane.showMessageDialog(null,"saved");
            }
            catch(SQLException | HeadlessException e)
                {
                   JOptionPane.showMessageDialog(null, e);
                } catch (ClassNotFoundException ex) {
           Logger.getLogger(AddResourceMenuItem.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
