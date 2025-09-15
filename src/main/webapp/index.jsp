<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!-- Page affichant la liste des livres de la bibliotheque -->
<html>
<head>
    <title>Jakarta Biblio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body class="container py-4">
<div class="d-flex justify-content-around align-items-center mb-4">
    <h2 class="m-0">Biblio Jakarta</h2>
    <div>
        <a class="btn btn-primary me-2" href="${pageContext.request.contextPath}/livre/form.jsp">Ajouter Livre</a>
        <a class="btn btn-secondary" href="${pageContext.request.contextPath}/auteur/form.jsp">Ajouter Auteur</a>
    </div>
</div>

<h2>Liste des livres</h2>
<table class="table table-striped">
    <thead>
        <tr>
            <th>Auteur</th>
            <th>Titre</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="livre" items="${livres}">
        <tr>
            <td>
                <c:choose>
                    <c:when test="${livre.auteur != null}">${livre.auteur.nom}</c:when>
                    <c:otherwise>-</c:otherwise>
                </c:choose>
            </td>
            <td>
                ${livre.titre}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
