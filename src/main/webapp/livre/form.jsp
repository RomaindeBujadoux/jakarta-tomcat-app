<%--
  Created by IntelliJ IDEA.
  User: baptiste
  Date: 11/09/2025
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Edition Livre</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/livre">
            <label>Titre</label>
            <input type="text" name="titre">
            <label>Numero ISBN</label>
            <input type="text" name="isbn">
            <label>Date de publication</label>
            <input type="date" name="datePublication">
            <label>Auteur</label>
            <input type="text" name="auteur">
            <button type="submit">Valider</button>
        </form>
    </body>
</html>