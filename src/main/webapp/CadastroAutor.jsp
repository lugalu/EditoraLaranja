<%--
  Created by IntelliJ IDEA.
  User: luizj
  Date: 12/4/2020
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Autor</title>
    <link rel="stylesheet" href="css/Style.css">
    <link rel="stylesheet" href="css/RegisterStyle.css">
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
<br>
<div class="Cadastro">
    <form action="AutorController" method="POST">
        <input type="text" name="nome" placeholder="nome" required/>
        <input type="text" name="email" placeholder="email" required/>
        <input type="text" name="telefone" placeholder="telefone" required/>
        <input type="text" name="cpf" placeholder="cpf" required/>

        <button type="submit" id="buttonSub" name="buttonSub" value="ADD">Enviar</button>
    </form>
</div>

</body>
</html>
