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
        <form>
            <div class="container">
                <h1>RECEPCIONISTA</h1>
                <div class="form-group">
                    <label for="exampleInputNameRecepcionista">Nombre y apellido</label>
                    <input type="text" class="form-control" id="exampleInputNameRecepcionista" aria-describedby="emailHelp" placeholder="Enter email">
                </div>
                <div class="form-group">
                    <label for="exampleInputDateFechaAtencion">Fecha que atendio</label>
                    <input type="date" class="form-control" id="exampleInputDateFechaAtencion" aria-describedby="emailHelp" placeholder="Enter email">
                </div>
            </div>
            <div class="container">
                <h1>PACIENTE</h1>
                <div class="form-group">
                    <label for="exampleInputNamePacient">Nombre y apellido</label>
                    <input type="text" class="form-control" id="exampleInputNamePacient" aria-describedby="emailHelp" placeholder="Enter email">
                </div>
                <div class="form-group">
                    <label for="exampleInputAgePacient">Edad</label>
                    <input type="number" class="form-control" id="exampleInputAgePacient" aria-describedby="emailHelp" placeholder="Enter email">
                </div>
            </div>
            <div class="container">
                <h1>MEDICO</h1>
                <div class="form-group">
                    <label for="selectMedic">Medico</label>
                    <select type="text" class="form-control" id="selectMedic" aria-describedby="emailHelp" placeholder="Enter email">
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
                    <label for="fechaTurno">Fecha turno</label>
                    <input type="date" class="form-control" id="fechaTurno" aria-describedby="emailHelp" placeholder="Enter email">
                </div>
            </div>
            <div class="container">
                <h1>¿Que le paso al paciente?</h1>
                <div class="form-group">
                    <label for="sintomas">Sintomas</label>
                    <textarea type="text"  id="sintomas" aria-describedby="emailHelp" placeholder="Enter email"></textarea>
                </div>
            </div>
            <div class="container">
                <h1>¿Tiene obra social?</h1>
                <div class="form-group">
                    <label>Seleccione obra social</label>
                    <select type="text" class="form-control" aria-describedby="emailHelp" placeholder="Enter email">
                        <option selected>Seleccione una opcion</option>
                        <option>No poseo obra social</option>
                        <option>OSECAT</option>
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