<%--
  Created by IntelliJ IDEA.
  User: baptiste
  Date: 11/09/2025
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Livres</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body class="container py-4">
<h1 class="mb-4">Liste des livres</h1>
    <div class="table-responsive">
        <table class="table table-striped align-middle">
            <thead>
                <tr>
                    <th>Titre</th>
                    <th>ISBN</th>
                    <th>Date de publication</th>
                    <th class="text-end">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="livre" items="${livres}">
                    <tr>
                        <td>${livre.titre}</td>
                        <td>${livre.isbn}</td>
                        <td>${livre.datePublication}</td>
                        <td class="text-end">
                            <button type="button" class="btn btn-sm btn-secondary" disabled>Editer</button>
                            <button type="button" class="btn btn-sm btn-danger" disabled>Supprimer</button>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>