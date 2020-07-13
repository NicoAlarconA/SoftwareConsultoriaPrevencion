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
<h1>Lista de clientes</h1>  
<table border="2" width="70%" cellpadding="2">  
	<tr>
		<th>Id</th><th>Nombre</th><th>Rut</th><th>Rubro</th><th>Direccion</th><th>Fono</th><th>Email</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="cli" items="${lista}">   
   <tr>  
	   <td>${cli.id_cliente}</td>  
	   <td>${cli.nombre_cliente}</td>  
	   <td>${cli.rut_cliente}</td>  
	   <td>${cli.rubro_cliente}</td>
	   <td>${cli.direccion_cliente}</td>  
	   <td>${cli.fono_cliente}</td> 
	   <td>${cli.email_cliente}</td>  
	   <td><a href="editcli/${cli.id_cliente}">Editar</a></td>  
	   <td><a href="deletecli/${cli.id_cliente}">Eliminar</a></td>  	   
	
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
   <a href="clienteRegistro">Agregar nuevo cliente</a> 
   
   <a href="perfilprofesional">volver</a>
</body>
</html>