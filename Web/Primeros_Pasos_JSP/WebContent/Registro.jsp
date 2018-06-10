<html>
<body>

<h2> Usuarios Registrados</h2>

Usuario Confirmado:<br><br>

Nombre: <%= request.getParameter("nombre") %> &nbsp; Apellido: <%= request.getParameter("apellido") %> 

<br> <br>


Fecha y Hora De Registro <jsp:include page="Fecha.jsp"></jsp:include>




</body>

</html>