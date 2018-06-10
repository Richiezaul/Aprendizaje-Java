<html>
<body>

<h1>

Ejemplos Declaraciones

</h1>

<%!

int resultado;


public int metodoSuma(int num1, int num2){
	
	
	resultado= num1 + num2;
	
	return resultado;
	

	
}

public int metodoResta(int num1, int num2){
	
	
	resultado= num1 - num2;
	
	return resultado;
	

	
}

public int metodoMultiplica(int num1, int num2){
	
	
	resultado= num1 * num2;
	
	return resultado;
	

	
}

public int metodoDivide(int num1, int num2){
	
	
	resultado= num1 / num2;
	
	return resultado;
	

	
}



%>

El resultado de la suma es <%= metodoSuma(20,5)  %>

<br>

El resultado de la Resta es <%= metodoResta(20,5)  %>

<br>

El resultado de la Multiplicacion es <%=metodoMultiplica(20,5)%>

<br>

El resultado de la Divicion es <%=metodoDivide(20,5) %>




</body>

</html>




























