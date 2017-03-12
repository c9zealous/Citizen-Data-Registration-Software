/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.FormHandle;
 import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ajinkya
 */
public class FormServlet extends HttpServlet {
    String DateOfBirth;
    String ChildName;
    String HChildName;
    String BirthType;
    String Sex;
    String BirthPlaceType;
    String HospitalName;
    String PlaceOfBirth;
    String HPlaceOfBirth;
    String PlaceOfAddress;
    String HPlaceOfAddress;
    String InformantName;
    String HInformantName;
    String InformantAddress;
    String HInformantAddress;
    String AttentionType;
    String DeliveryMethod;
    String BirthMark;
    String FatherName;
    String HFatherName;
    String Education;
    String Occupation;
    String MotherName;
    String HMotherName;
    String MEducation;
    String MOccupation;
    String MAdd;
    String HMAdd;
    String AddOfParent;
    String HAddOfParent;
    String Country;
    String State;
    String District;
    String Taluka;
    String City;
    String RegUnit;
    String Religion;
    String BirthWeight;
    String LiveChild;
    String TimeOfMarriage;
    String TimeOfChildBirth;
    String PregDur;
    String MAadharCard;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormServlet</title>");             
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FormServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            out.println("DateOfBirth="+DateOfBirth);
            out.println("ChildName="+ChildName);
            out.println("HChildName="+HChildName);
            out.println("BirthType="+BirthType);
            out.println("Sex="+Sex);
            out.println("BirthPlaceType="+BirthPlaceType);
            out.println("HospitalName="+HospitalName);
            out.println("PlaceOfBirth="+PlaceOfBirth);
            out.println("HPlaceOfBirth="+HPlaceOfBirth);
            out.println("PlaceOfAddress="+PlaceOfAddress);
            out.println("HPlaceOfAddress="+HPlaceOfAddress);
            out.println("InformantName="+InformantName);
            out.println("HInformantName="+HInformantName);
            out.println("InformantAddress="+InformantAddress);
            out.println("HInformantAddress="+HInformantAddress);
            out.println("AttentionType="+AttentionType);
            out.println("DeliveryMethod="+DeliveryMethod);
            out.println("BirthMark="+BirthMark);
            out.println("FatherName="+FatherName);
            out.println("HFatherName="+HFatherName);
            out.println("Education="+Education);   
            out.println("Occupation="+Occupation);
            out.println("MotherName="+MotherName);
            out.println("HMotherName="+HMotherName);
            out.println("MEducation="+MOccupation);
            out.println("MAdd="+MAdd);
            out.println("HMAdd="+HMAdd);
            out.println("AddOfParent="+AddOfParent);
            out.println("HAddOfParent="+HAddOfParent);
            out.println("Country="+Country);
            out.println("State="+State);
            out.println("District="+District);
            out.println("Taluka="+Taluka);
            out.println("City="+City);
            out.println("RegUnit="+RegUnit);
            out.println("Religion="+Religion);
            out.println("MAadharcard="+MAadharCard);
            DbUtil d=new DbUtil();
            String query="select Attention_Type_ID from attention_type";
            int attenid=0;
            ResultSet r;
            r = d.getResult(query);
            try{
                while(r.next()){
                    attenid=r.getInt("Attention_Type_ID");
                }
            }catch(Exception e){
            
            }
            attenid+=1;
            /* query="select Birth_Place_UID from birth_place_details";
            int birthuid=0;
            r=d.getResult(query);
            try{
                while(r.next()){
                    birthuid=r.getInt("Birth_Place_UID");
                }
            }catch(Exception e){

            }
            birthuid+=1;
            query="select Birth_Type_ID from birth_type_details";
            int birthid=0;
            r=d.getResult(query);
            try{
                while(r.next()){
                    birthid=r.getInt("Birth_Type_ID");
                }
            }catch(Exception e){

            }
            birthid+=1;
            query="select Delivery_Type_ID from delivery_type";
            int deliveryid=0;
            r=d.getResult(query);
            try{
                while(r.next()){
                    deliveryid=r.getInt("Delivery_Type_ID");
                }
            }catch(Exception e){

            }
            deliveryid+=1;
            query="select UID_Of_Mother from parents_info_details";
            int motheruid=0;
            r=d.getResult(query);
            try{
                while(r.next()){
                    motheruid=r.getInt("UID_Of_Mother");
                }
            }catch(Exception e){

            }
            motheruid+=1;
            query="select Unique_ID from child_birth_deails";
            int uid=0;
            r=d.getResult(query);
            try{
                while(r.next()){
                    uid=r.getInt("Unique_ID");
                }
            }catch(Exception e){

            }
            uid+=1; */
            query="insert into attention_type values('"+attenid+"','"+AttentionType+"')";
            d.addData(query);
            query="insert into birth_place_details values('"+attenid+"','"+RegUnit+"','"+Taluka+"','"+District+"','"+State+"','"+Country+"')";
            d.addData(query);
            query="insert into birth_type_details values('"+attenid+"','"+BirthType+"')";
            d.addData(query);
            query="insert into delivery_type values('"+attenid+"','"+DeliveryMethod+"')";
            d.addData(query);
            query="insert into parents_info_details values('"+MotherName+"','"+AddOfParent+"',"+TimeOfChildBirth+",'"+MEducation+"','"+MAadharCard+"')";
            d.addData(query);
            query="insert into child_birth_details values("+attenid+",'"+ChildName+"','"+BirthType+"','"+Sex+"','"+attenid+"','"+HospitalName+"','"+MAadharCard+"','"+InformantName+"','"+InformantAddress+"','"+attenid+"','"+attenid+"',"+PregDur+",'"+BirthMark+"','"+DateOfBirth+"')";    
            d.addData(query);
            d.close();                                           
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        DateOfBirth=request.getParameter("DateOfBirth");
        ChildName=request.getParameter("ChildName");
        HChildName=request.getParameter("HChildName");
        BirthType=request.getParameter("BirthType");
        Sex=request.getParameter("Sex");
        BirthPlaceType=request.getParameter("BirthPlaceType");
        HospitalName=request.getParameter("HospitalName");
        PlaceOfBirth=request.getParameter("PlaceOfBirth");
        HPlaceOfBirth=request.getParameter("HPlaceOfBirth");
        PlaceOfAddress=request.getParameter("PlaceOfAddress");
        HPlaceOfAddress=request.getParameter("HPlaceOfAddress");
        InformantName=request.getParameter("InformantName");
        HInformantName=request.getParameter("HInformantName");
        InformantAddress=request.getParameter("InformantAddress");
        HInformantAddress=request.getParameter("HInformantAddress");
        AttentionType=request.getParameter("AttentionType");
        DeliveryMethod=request.getParameter("DeliveryMethod");
        BirthMark=request.getParameter("BirthMark");
        FatherName=request.getParameter("FatherName");
        HFatherName=request.getParameter("HFatherName");
        Education=request.getParameter("Education");
        Occupation=request.getParameter("Occupation");
        MotherName=request.getParameter("MotherName");
        HMotherName=request.getParameter("HMotherName");
        MEducation=request.getParameter("MEducation");
        MOccupation=request.getParameter("MOccupation");
        MAdd=request.getParameter("MAdd");
        HMAdd=request.getParameter("HMAdd");
        AddOfParent=request.getParameter("AddOfParent");
        HAddOfParent=request.getParameter("HAddOfParent");
        Country=request.getParameter("Country");
        State=request.getParameter("State");
        District=request.getParameter("District");
        Taluka=request.getParameter("Taluka");
        City=request.getParameter("City");
        RegUnit=request.getParameter("RegUnit");
        Religion=request.getParameter("Religion");
        BirthWeight=request.getParameter("BirthWeight");
        LiveChild=request.getParameter("LiveChild");
        TimeOfMarriage=request.getParameter("TimeOfMarriage");
        TimeOfChildBirth=request.getParameter("TimeOfChildBirth");
        PregDur=request.getParameter("PregDur");
        MAadharCard=request.getParameter("MAadharCard");
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
