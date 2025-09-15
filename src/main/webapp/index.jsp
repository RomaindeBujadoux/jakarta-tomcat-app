<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!-- Page affichant la liste des livres de la bibliotheque -->
<html>
<head>
    <title>Jakarta Biblio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<h2>Ajouter un livre</h2>
<form method="post" action="livre">
    <input type="text" name="titre" placeholder="Titre"/>
    <input type="text" name="auteur" placeholder="Auteur"/>
    <button type="submit">Enregistrer</button>
</form>

<h2>Liste des livres</h2>
<table>
    <thead>
        <tr>
            <th>Livre</th>
            <th>Auteur</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="livre" items="${livre}">
        <tr>
            <td>${livre.titre}</td>
            <td>${livre.auteur}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
