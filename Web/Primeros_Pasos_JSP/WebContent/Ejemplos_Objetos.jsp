<html>
<body>

<h2>Objetos Predefinidos Jsp</h2>


Peticion Datos del Navegador: <%= request.getHeader("User-Agent") %>

<br><br><br>

Peticion de idioma Utilizado: <%=request.getLocale() %>

<br><br><br>

<%=request.getSession() %>



</body>

</html>