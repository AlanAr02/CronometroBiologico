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
                <li><a href="home">Volver a consultas</a></li>
            </ul>
        </div>
    </nav>
    <!-- Navbar -->
</header>
<div class = "container">
    <main>
        <form method="post" action="crear-consulta" modelAttribute="consultas">
            <div class="container">
                <h1>RECEPCIONISTA</h1>
                <div class="form-group">
                    <label for="nombreRecepcionista">Nombre y apellido</label>
                    <input type="text" class="form-control" id="nombreRecepcionista" path="nombreRecepcionista" name="nombreRecepcionista">
                </div>
                <div class="form-group">
                    <label>Fecha que atendio</label>
                    <input type="date" class="form-control"  id="fechaCreacion" path="fechaCreacion" name="fechaCreacion">
                </div>
            </div>
            <div class="container">
                <h1>PACIENTE</h1>
                <div class="form-group">
                    <label for="nombrePaciente">Nombre y apellido</label>
                    <input type="text" class="form-control" id="nombrePaciente" path="nombrePaciente" name="nombrePaciente">
                </div>
                <div class="form-group">
                    <label for="edadPaciente">Edad</label>
                    <input type="number" class="form-control"  id="edadPaciente" path="edadPaciente" name="edadPaciente">
                </div>
            </div>
            <div class="container">
                <h1>MEDICO</h1>
                <div class="form-group">
                    <label>Medico</label>
                    <select class="form-control" id="medico.id" path="medico.id" name="medico.id">
                        <option selected>Seleccione una opcion</option>
                        <c:forEach var="medico" items="${medicos}">
                            <option value="${medico.id}">${medico.nombre}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="container">
                <h1>Fecha turno</h1>
                <div class="form-group">
                    <label>Fecha turno</label>
                    <input type="date" class="form-control" id="fechaTurno" path="fechaTurno" name="fechaTurno">
                </div>
            </div>
            <div class="container">
                <h1>Sintomas</h1>
                <div class="form-group">
                    <label for="descripcion">Sintomas</label>
                    <input type="text"  class="form-control"  id="descripcion" path="descripcion" name="descripcion">
                </div>
            </div>
            <div class="container">
                <h1>Obra social</h1>
                <div class="form-group">
                    <label for="tieneObraSocialPaciente.id">Seleccione obra social</label>
                    <select class="form-control" id="tieneObraSocialPaciente.id" path="tieneObraSocialPaciente.id" name="tieneObraSocialPaciente.id">
                        <option selected>Seleccione una opcion</option>
                        <c:forEach var="obrasocial" items="${obrasociales}">
                            <option value="${obrasocial.id}">${obrasocial.nombre}</option>
                        </c:forEach>
                    </select>
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