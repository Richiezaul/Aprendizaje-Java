<%@page import="Z.corp.Com.Conexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Z.corp.Com.Productos"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%
    
    ArrayList<Productos> datos= new ArrayList<Productos>();
    
    try{
    	
    	ResultSet rSet=new Conexion().table_Sql();
    	
    	while(rSet.next()){
    		
    		datos.add(new Productos(rSet.getString(1),rSet.getString(2),rSet.getString(3),
    				  rSet.getString(4),rSet.getString(5),rSet.getString(6),rSet.getString(7)));
    		
    	}
    	
    }catch(Exception e){
    	
    	out.println(equals(e.getMessage()));
    	
    }
    
   pageContext.setAttribute("losProductos", datos);
    
    
    
    
    %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style >

.titulo{

font-weight: bold;



}



</style>
</head>
<body>

<table border="1">

<tr class="titulo"  ><td>Codigo Articulo</td><td>Seccion</td><td>Nombre Articulo</td><td>Precio</td><td>Fecha</td><td>Importado</td><td>Pais De Origen</td></tr>

<c:forEach var="produ_datos" items="${losProductos}" >


	<tr> 
	
	<td>${produ_datos.codigo_Articulo }</td><td>${produ_datos.seccion}</td><td> ${produ_datos.nombre_Articulo }</td><td> ${produ_datos.precio } 
	</td><td>${produ_datos.fecha }</td><td> ${produ_datos.importado }</td><td> ${produ_datos.pais_origen }</td>
	
	<tr>





</table>




</c:forEach>

</body>
</html>




























