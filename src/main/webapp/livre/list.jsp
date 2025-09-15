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
<body>
	<h1>Liste de livres</h1>
	<table class="table table-striped">
    <thead>
        <tr>
            <th>Livre</th>
        </tr>
    </thead>
    <tbody>
    	<c:forEach var="livre" items="${livres}">
        <tr>
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