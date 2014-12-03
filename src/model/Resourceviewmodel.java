/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author sharma parul
 */
public class Resourceviewmodel {
    
     public String Name;
      public String Dailycost;
      public String Resourcetype;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDailycost() {
        return Dailycost;
    }

    public void setDailycost(String Dailycost) {
        this.Dailycost = Dailycost;
    }

    public String getResourcetype() {
        return Resourcetype;
    }

    public void setResourcetype(String Resourcetype) {
        this.Resourcetype = Resourcetype;
    }
}
