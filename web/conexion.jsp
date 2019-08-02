<%@ page import="java.sql.*"%>

<%

        Connection conectar =null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost/Auto","root","");
        out.print("Conectado");
        }catch(Exception ex)
        {
            out.println(ex.getMessage());
        }
    
    %>