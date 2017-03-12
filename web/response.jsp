<%-- 
    Document   : response
    Created on : Dec 21, 2014, 12:34:28 PM
    Author     : Ajinkya
--%>

<%@page import="javax.naming.Context"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>






<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

InitialContext initialContext = new InitialContext();

Context context = (Context) initialContext.lookup("java:comp/env");

//The JDBC Data source that we just created

DataSource ds = (DataSource) context.lookup("formdata");

Connection connection = ds.getConnection();

 

if (connection == null)

{

throw new SQLException("Error establishing connection!");

}

String query = "SELECT Child_Name FROM child_birth_details";

 

PreparedStatement statement = connection.prepareStatement(query);

ResultSet rs = statement.executeQuery();

 

while (rs.next())

{

out.print(rs.getString("name") + "< br >");

}

%>
        
        
        
        
        
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name"/> <h1>Hello,<jsp:getProperty name="mybean" property="name" /> !</h1>
    </body>
</html>
