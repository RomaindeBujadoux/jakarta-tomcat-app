<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!-- Page affichant la liste des livres de la bibliotheque -->
<html>
<head>
    <title>Jakarta Biblio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body class="container py-4">
<div class="d-flex justify-content-around">
    <h2>Biblio Jakarta</h2>
    <form method="post" action="livre/form.jsp" class="mb-4">
        <button type="submit" class="btn btn-primary">Ajouter Livre</button>
    </form>
    <form method="get" action="livre" class="mb-4">
        <button type="submit" class="btn btn-primary">Liste Livres</button>
    </form>
    <form method="post" action="auteur/form.jsp" class="mb-4">
        <button type="submit" class="btn btn-primary">Ajouter Auteur</button>
    </form>
    <form method="get" action="auteur" class="mb-4">
        <button type="submit" class="btn btn-primary">Liste Auteurs</button>
    </form>
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
                    ${livre}
            </td>
            <td>
                    ${livre}
            </td>
            <td>
                <button>Editer</button>
            </td>
            <td>
                <button>Supprimer</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
