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
<header>
    <!-- Navbar -->
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Consultas medicas</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="home">Consultas</a></li>
                <li><a href="medicos">Medicos</a></li>
                <li><a href="obras-sociales">Obras sociales</a></li>
            </ul>
        </div>
    </nav>
    <!-- Navbar -->
</header>
<div class = "container">
    <main>
        <a href="nueva-obrasocial">
            <button type="submit" class="btn btn-primary">Nueva obra social</button>
        </a>
        <table class="table" style="margin-top: 70px">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Nombre de la obra social</th>
            </tr>
            </thead>
            <tbody>
              <!--ACA TIENE QUE TRAER LOS DATOS DE LA OBRA SOCIAL, O SEA ID Y NOMBRE DE LA OBRA SOCIAL-->
            </tbody>
        </table>
    </main>
</div>
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>