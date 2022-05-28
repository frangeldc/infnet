<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Bebidas</h2>
	  
	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirma��o!</strong> ${mensagem}
		</div>	  
	  </c:if>

	  <form action="/bebida/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>Descri��o:</label>
	      <input type="text" class="form-control" placeholder="Entre com a descri��o da bebida" name="descricao" value="Primeira bebida">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Valor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor da bebida" name="valor" value="999">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Peso:</label>
	      <input type="text" class="form-control" placeholder="Entre com o peso da bebida" name="peso" value="150">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Marca:</label>
	      <input type="text" class="form-control" placeholder="Entre com a marca da bebida" name="marca" value="Teste marca">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Caracter�sticas:</label>
			<div class="checkbox">
			  <label><input type="checkbox" value="true" name="importada">Importada</label>
			</div>
			<div class="checkbox">
			  <label><input type="checkbox" value="true" name="gelada">Gelada</label>
			</div>
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>