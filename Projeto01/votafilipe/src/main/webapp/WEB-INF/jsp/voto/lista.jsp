<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Bebidas</h2>

	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>

	  <form action="/bebida" method="get">
	    <button type="submit" class="btn btn-primary">Nova</button>
	  </form>
	  
	  <hr>
	<c:if test="${not empty lista}">		
		<h2>Total de Bebidas: ${lista.size()}</h2>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Descrição</th>
		        <th>Valor</th>
		        <th>Peso</th>
		        <th>Marca</th>
		        <th>Importada</th>
		        <th>Gelada</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="b" items="${lista}">
			      <tr>
			        <td>${b.id}</td>
			        <td>${b.descricao}</td>
			        <td>${b.valor}</td>
			        <td>${b.peso}</td>
			        <td>${b.marca}</td>
			        <td>${b.importada}</td>
			        <td>${b.gelada}</td>
		        	<td><a href="/bebida/${b.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem bebidas cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>