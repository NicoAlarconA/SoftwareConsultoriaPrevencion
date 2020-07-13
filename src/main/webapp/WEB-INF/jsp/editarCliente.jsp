<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" action="/NuevoEjercicioModulo4/guardaCambio">


<form:hidden path="id_cliente" />
Nombre: <form:input path="nombre_cliente"/> <br />
Rut: <form:input path="rut_cliente"/> <br />
Rubro: <form:input path="rubro_cliente"/> <br />
Direccion: <form:input path="direccion_cliente"/> <br />
Fono: <form:input path="fono_cliente"/> <br />
Email: <form:input path="email_cliente"/> <br />

<input type="submit" value="Actualizar">

</form:form>
</body>
</html>