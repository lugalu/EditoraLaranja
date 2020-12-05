<%--
  Created by IntelliJ IDEA.
  User: luizj
  Date: 12/4/2020
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editora Laranja</title>
    <link rel="stylesheet" href="css/Style.css">
    <link rel="stylesheet" href="css/LivrosStyle.css">
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
</nav>
<input type="text" class="search" placeholder="Pesquisar"/>
<label></label>

<br>
<div class="filter">
    <label>Ordernar por: </label>
    <select name="ordernar" id="ordernar">
        <option value="bestSeller">Mais vendidos</option>
        <option value="worstSeller">Menos vendidos</option>
        <option value="AlphabetDescending">Ordem A-Z</option>
        <option value="AlphabetAscending">Ordem Z-A</option>
    </select>
</div>
</body>
</html>
