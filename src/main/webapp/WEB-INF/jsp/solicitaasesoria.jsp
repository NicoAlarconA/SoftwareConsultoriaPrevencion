<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solicita Asesoria</title>
</head>
<body>

<header>
	<h1>Solicita Asesoria</h1>
</header>

<section class="wrapper">
	
	  <h1>Solicitud</h1>  
       <form:form method="post" action="solicitudAsesoria">    
        <table >    
         <tr>    
          <td>Tipo Asesoria: </td>   
          <td><form:input path="tipo_asesoria"  /></td>  
         </tr>    
         <tr>    
          <td>Nombre Empresa :</td>    
          <td><form:input path="nombre_empresa" /></td>  
         </tr>   
         <tr>    
          <td>Detalle Solicitud :</td>    
          <td><form:input path="detalle_asesoria" /></td>  
         </tr>   
         <tr>    
          <td>Fecha: </td>   
          <td><form:input id="datepicker-1" path="fecha_asesoria" /></td>  
         </tr>    
         <tr>   
          <td>Id Cliente</td> 
          <td><form:input path="id_cliente" /></td>  
         </tr>    
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Agregar" /></td>    
         </tr>    
        </table>    
       </form:form>   

</section>

<a href="perfilcliente">Volver</a>

</body>
</html>