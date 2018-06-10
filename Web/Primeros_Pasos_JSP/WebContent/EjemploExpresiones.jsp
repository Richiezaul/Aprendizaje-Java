<%@page import="jsp_Methos.Verifica_Par_Or_impar"%>
<html>
<body>

<h1>

Ejemplo Expresiones
</h1>

Combirtiendo A Mayuscula <%= new String("Richie").toUpperCase()%>

<br>

La Suma de 5 + 7 es = <%= 5+7 %>

<br>

10 Es Mayor Que 100: <%= 10>100 %>

<br>

verifica si el numero 85 es par <%= new Verifica_Par_Or_impar().par(85) %>


</body>


</html>