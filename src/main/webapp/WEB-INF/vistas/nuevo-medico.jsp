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
                <a class="navbar-brand" href="home">Consultas medicas</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="medicos">Volver al panel medicos</a></li>
            </ul>
        </div>
    </nav>
    <!-- Navbar -->
</header>
<div class = "container">
    <main>
        <form method="post" action="crear-medico" modelAttribute="medicos">
            <div class="container">
                <h1>MEDICO</h1>
                <div class="form-group">
                    <label for="nombre">Nombre y apellido</label>
                    <input type="text" class="form-control" id="nombre" path="nombre" name="nombre">
                </div>
                <div class="form-group">
                    <label for="especialidad">Especialidad</label>
                    <input type="text" class="form-control"  id="especialidad" path="especialidad" name="especialidad">
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <a href="home">
            <button class="btn btn-secondary">Cancel</button>
        </a>
    </main>
</div>
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
