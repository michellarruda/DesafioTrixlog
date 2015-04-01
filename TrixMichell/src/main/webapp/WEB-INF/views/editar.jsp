<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<title>Desafio Trixlog | Michell Arruda</title>
</head>
<body>
	<div style="margin: 0 auto; width: 50%; margin-top: 50px;">
		<div>
			<div class="well bs-component">
				<c:url var="userRegistration" value="saveUser.html" />
				<form:form id="registerForm" modelAttribute="location" method="post" action="update?id=${location.id}" class="form-horizontal">
					<fieldset>
						<legend>Atualizar</legend>
						<div class="form-group">
							<form:label path="latitude" class="col-md-3 control-label">Latitude</form:label>
							<div class="col-md-9">
								<form:input path="latitude" value="${locationObject.latitude}" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<form:label path="longitude" class="col-md-3 control-label">Longitude</form:label>
							<div class="col-md-9">
								<form:input path="longitude" value="${locationObject.longitude}" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<form:label path="name" class="col-md-3 control-label">Nome</form:label>
							<div class="col-md-9">
								<form:input path="name" value="${locationObject.name}" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-9 col-md-offset-3">
								<a href="home" class="btn btn-danger">Cancelar</a> <input type="submit" value="Atualizar" class="btn btn-success" />
							</div>
						</div>
					</fieldset>
				</form:form>
			</div>
		</div>
	</div>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>