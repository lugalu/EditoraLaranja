<%--
  Created by IntelliJ IDEA.
  User: luizj
  Date: 12/4/2020
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt">
<head>
    <title>Editora Laranja</title>
    <link rel="stylesheet" href="css/Style.css">
    <link rel="stylesheet" href="css/LivrosStyle.css">
    <script src="js/livro.js"></script>
</head>
<body>
<nav class = "navbar">
    <ul>
        <li><a href="index.jsp">Home </a></li>|
        <li><a href="Livros.jsp">Livros </a></li>|
        <li><a href="Catalogo.jsp">Catálogo </a></li>|
        <li><a href="Livraria.jsp">Livrarias </a></li>|
        <li><a href="Autor.jsp">Autor </a></li>|
        <li><a href="Jornal.jsp">Jornal</a></li>
    </ul>
    <ul id="ulRight">
        <li><form method="Post" action="LivroController">
            <button type="submit" id="buttonSub" name="buttonSub" value="Register">Cadastro Livro</button>
        </form></li>
    </ul>
</nav>


<div>
    <c:choose>
        <c:when test="${autores != null}">
            <form action="LivroController" method="get" style="display: none">
                <input type="submit" value="Recarregar Livros"/>
            </form>
        </c:when>
        <c:when test="${autores == null}">
            <form action="LivroController" method="get" name="reload-books" style="display: none">
                <input type="submit" value="Recarregar Livros"/>
            </form>
        </c:when>
    </c:choose>



</div>



<c:forEach items="${livros}" var="livro">
    <div class="cell">
        <div class="cell-container">
            <img class="cell-image" src="${livro.image}">
            <div class="cell-information">
                <label class="cell-title">${livro.titulo}</label>
                <c:forEach items="${autores}" var="autor">
                    <c:if test="${autor.autorId == livro.idAutor}">
                        <label class="cell-subtitle">${autor.nome}</label>
                    </c:if>
                </c:forEach>
            </div>
            <button class="cell-button" type="button">+ Ver Detalhes</button>
        </div>
    </div>
</c:forEach>



</body>
</html>
