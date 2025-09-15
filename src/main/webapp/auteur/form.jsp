<%--
  Created by IntelliJ IDEA.
  User: baptiste
  Date: 11/09/2025
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edition Auteur</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/auteur">
    <label>Nom</label>
    <input type="text" name="nom">
    <label>Prenom</label>
    <input type="text" name="prenom">
    <label>Nationalité</label>
    <input type="text" name="nationalite">
    <button type="submit">Valider</button>
</form>
</body>
</html>