<%@include file="conexion.jsp"%>

<%
    String user= request.getParameter("user");
    String pass= request.getParameter("pass");
    
    String consulta="INSERT INTO Usuarios (usu_nombre, usu_pass) VALUES (?,?)";
    
    
    try{
    PreparedStatement ps = conectar.prepareStatement(consulta);
    
    ps.setString(1, user);
    ps.setString(2, pass);
    
    ps.executeUpdate();
    
    out.println("yes");
    
    }catch(Exception ex){
        
        out.println(ex.getMessage());
    }
    
    %>