<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Bootstrap core CSS -->
	<link href="css/bootstrap.min.css" rel="stylesheet" >
	<!-- Bootstrap theme -->
	<link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
<div class = "container">
	<main>
		<a href="nueva-consulta">
			<button type="submit" class="btn btn-primary">Nueva consulta</button>
		</a>
		<table class="table">
			<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Nombre Paciente</th>
				<th scope="col">Fecha Creacion</th>
				<th scope="col">Fecha Turno</th>
				<th scope="col">Nombre del medico</th>
				<th scope="col">Obra social</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach var="consulta" items="${consultas}">
				<tr>
					<th scope="row">${consulta.id}</th>
					<td>${consulta.paciente.nombre}</td>
					<td>${consulta.fechaCreacion}</td>
					<td>${consulta.fechaTurno}</td>
					<td>${consulta.medico.nombre}</td>
					<td>${consulta.descripcion}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
	<footer>
		<h2>FOOTER</h2>
	</footer>
</div>
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>