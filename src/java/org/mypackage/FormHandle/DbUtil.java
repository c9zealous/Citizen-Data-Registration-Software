/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.FormHandle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ajinkya
 */
public class DbUtil {
     private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public  DbUtil()
    {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/formdata","root","password");
        st=con.createStatement();    
        System.out.println("Hello");
    }catch(Exception ex){
    System.out.println(ex);
}
    }
          
    public void close()
        {
        if(rs!=null){
            try{
                rs.close();
            }catch(SQLException e){
                
            }
        }
        if(st!=null){
            try{
                st.close();
            }catch(SQLException e){
                
            }
        }        
        if(con!=null){
            try{
                con.close();
            }catch(SQLException e){
                
            }    
        }
        }
        
     public ResultSet getResult(String query)
     {
         System.out.println("Hello");
        try{
            System.out.println("Hello");
            rs=st.executeQuery(query);
            System.out.println("Hello");
            if(rs!=null)
                return rs;
        }catch(Exception e){
            
        }
        return null;
    }
      public void addData(String s){
        try {
            st.executeUpdate(s);
        } catch (SQLException ex) {
            Logger.getLogger(org.mypackage.FormHandle.DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
