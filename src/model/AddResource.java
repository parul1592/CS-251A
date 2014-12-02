/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Controller.ResourceController;
import view.*; 
/**
 *
 * @author dsindhusha
 */

public class AddResource {
     private final AddResourceMenuItem frame = new AddResourceMenuItem();
      public AddResource() {
          
      }
      public String Name;
      public String Dailycost;
      public String Resourceid;
      public String Projectid;
      public String Resourcetype;
      
   public String getName() {
		return Name;
	}
	public String getDailycost() {
		return Dailycost;
	}
        public String getResourceid() {
		return Resourceid;
	}
  public String getProjectid() {
		return Projectid;
  }
       public String getResourcetype()
       {
		return Resourcetype;
	}
       public void setName(String str) {
		this.Name = str;
 
	}
	public void setDailycost(String str) {
		this.Dailycost = str;
 
	}
        public void  setResourceid(String str) {
		this.Resourceid = str;
 
	}
  public void  setProjectid(String str) {
		this.Projectid = str;
  }
       public void setResourcetype(String str)
       {
		this.Resourcetype = str;
 
	}
     
   
}

        

       