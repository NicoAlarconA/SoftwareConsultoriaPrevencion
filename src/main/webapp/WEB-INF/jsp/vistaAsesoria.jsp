<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Asesorias</title>
</head>
<body>

	<header><h1>Asesorias Solicitadas</h1></header>  
<table border="2" width="70%" cellpadding="2">  
	<tr>
		<th>Id</th><th>Tipo Asesoria</th><th>Nombre Empresa</th><th>Detalle Asesoria</th><th>Fecha Asesoria</th><th>ID Empresa</th><th>ID Profesional</th><th>Estado Asesoria</th><th>Crear Asesoria</th>
	</tr>  
   <c:forEach var="lista" items="${listaAsesoria}">   
   <tr>  
	   <td>${lista.id_asesoria}</td>  
	   <td>${lista.tipo_asesoria}</td>  
	   <td>${lista.nombre_empresa}</td>  
	   <td>${lista.detalle_asesoria}</td>
	   <td>${lista.fecha_asesoria}</td>  
	   <td>${lista.id_cliente}</td> 
	   <td>${lista.id_profesional}</td>  
	   <td>${lista.estado_asesoria}</td> 
	   <td><a href="creasolicitudasesoria/${cli.id_asesoria}">Crear</a></td> 	   
	
   </tr>
   </c:forEach>  
   </table>  
    
    <a href="perfilprofesional">volver</a>


</body>
</html>