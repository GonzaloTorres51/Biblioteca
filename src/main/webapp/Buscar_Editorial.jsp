
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
    </head>
    <body>
        <center><h2>Editoriales</h2></center>
        
        <form action="Buscar_editorial_Controller" method="post">
            <div id="form_botones">
                <input type="text" id="buscarEditorial" name="buscarEditorial" placeholder="Buscar"/>
                <button type="submit">Buscar</button>
        </form>
        ${respuesta} <!-- espera una respuesta de JAVA generalmente de CONTROLLER -->
    </body>
</html>
