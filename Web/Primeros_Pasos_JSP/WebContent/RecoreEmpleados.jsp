<%@page import="java.sql.*"%>
<%@page import="Z.corp.Com.Empleado"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
      <%
      
      ArrayList<Empleado> datos= new ArrayList<Empleado>();
      
      
      Class.forName("org.mariadb.jdbc.Driver");
      
      try{
    	  
    	  Connection miConnection= DriverManager.getConnection("jdbc:mariadb://localhost:3302/proyecto_jsp", "root", "Amv97135");
    	  
    	  Statement  miStatement=miConnection.createStatement();
    	  
    	  String instruccionSql="SELECT * FROM EMPLEADOS";
    	  
    	  ResultSet rs= miStatement.executeQuery(instruccionSql);
    	  
    	  while(rs.next()){
    		  
    		  datos.add(new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
    	  }
    	  
    	  rs.close();
    	  
    	  miConnection.close();
    	  
      }catch(Exception e){
    	  
    	  out.println("Hay un error");
    	  
    	  
      }
      
      pageContext.setAttribute("losEmpleados", datos);
      
      
      
      
      %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>

.titulostabla{

font-weight: bold;


}

</style>
</head>
<body>

<c:set var="x" value="854">  </c:set>

<table border="1">


<tr class="titulostabla"><td>Nombre</td><td>Apellido</td><td>Puesto</td><td>Salario</td><td>Bono</td></tr>

  <c:forEach var="EmpTemp" items="${losEmpleados }">
 
 <tr>
	<td> ${EmpTemp.nombre }</td><td> ${EmpTemp.apellido }</td><td> ${EmpTemp.puesto }</td><td> 
	
	 <c:choose>
	   <c:when test="${EmpTemp.salario>40000 && EmpTemp.salario<=50000 }">${EmpTemp.salario +2000 }</c:when>
	
	   <c:otherwise>${EmpTemp.salario}</c:otherwise>
	 </c:choose>
	</td>
	<td><c:out value="${x}"></c:out> </td>

</tr>

  </c:forEach>

</table>


</body>
</html>

<c:if test="${EmpTemp.salario<40000 }">5000 </c:if>
































