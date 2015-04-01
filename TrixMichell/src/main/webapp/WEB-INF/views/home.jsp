<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<title>Desafio Trixlog | Michell Arruda</title>
</head>
<body>

	<div class="container" style="text-align: center;">

		<h1>Desafio Trixlog</h1>

		<c:if test="${!empty locationList}">
			<table class="table table-striped table-hover table-bordered">
				<tr style="background-color: #ddd; color: gray; text-align: center;">
					<td class="col-md-2">Latitude</td>
					<td class="col-md-2">Longitude</td>
					<td class="col-md-3">Nome</td>
					<td class="col-md-2">Data de Criação</td>
					<td colspan="2" class="col-md-1">Operações</td>
				</tr>
				<c:forEach items="${locationList}" var="user">
					<tr style="text-align: center;">
						<fmt:parseDate value="${user.created}" pattern="yyyy-MM-dd" var="date" />
						<td><c:out value="${user.latitude}" /></td>
						<td><c:out value="${user.longitude}" /></td>
						<td><c:out value="${user.name}" /></td>
						<td><fmt:formatDate value="${date}" pattern="dd/MM/yyyy" /></td>
						<td colspan="2"><a href="edit?id=${user.id}"> <span class="glyphicon glyphicon-pencil"
								style="color: green;"></span>
						</a> <a href="delete?id=${user.id}"> <span class="glyphicon glyphicon-trash"
								style="color: red; margin-left: 15px;"></span></a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

		<a href="new" class="btn btn-primary" style="width: 200px;">Cadastrar</a>

	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</body>
</html>