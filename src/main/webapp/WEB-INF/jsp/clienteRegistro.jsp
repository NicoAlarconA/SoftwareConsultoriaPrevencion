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

<form method="post" action="save">

Nombre: <input type="text" name="nombre_cliente"> <br />
Rut: <input type="text" name="rut_cliente"> <br />
Rubro: <input type="text" name="rubro_cliente"> <br />
Direccion: <input type="text" name="direccion_cliente"> <br />
Fono: <input type="text" name="fono_cliente"> <br />
Email: <input type="text" name="email_cliente"> <br />

<input type="submit" value="Crear">

</form>

 <a href="perfilprofesional">volver</a>

</body>
</html>