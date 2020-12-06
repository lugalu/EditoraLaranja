<%--
  Created by IntelliJ IDEA.
  User: luizj
  Date: 12/5/2020
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastro de livro</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/Style.css">
    <link rel="stylesheet" href="css/RegisterStyle.css">
</head>
<body>

<nav class="navbar">
    <ul>
        <li><a href="index.jsp">Home </a></li>|
        <li><a href="Livros.jsp">Livros </a></li>|
        <li><a href="Catalogo.jsp">Catálogo </a></li>|
        <li><a href="Livraria.jsp">Livrarias </a></li>|
        <li><a href="Autor.jsp">Autor </a></li>|
        <li><a href="Jornal.jsp">Jornal</a></li>
    </ul>
</nav>
<br>

<div class="Cadastro">
    <form action="LivroController" method="POST">
        <input type="text" name="titulo" placeholder="Título" required/>
        <input type="text" name="descricao" placeholder="Descricao"/>
        <input type="text" name="categoria" placeholder="Categoria" required/>
        <br>
        <select>
            <c:forEach items="${autores}" var="autor">
                <option value="${autor.getID()}">${autor.getName()}</option>
            </c:forEach>
        </select>
        <br>
        <button type="submit" value="Add">Enviar</button>
    </form>
</div>


</body>
</html>
