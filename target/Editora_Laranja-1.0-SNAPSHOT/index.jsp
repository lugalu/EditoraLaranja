<%--
  Created by IntelliJ IDEA.
  User: luizj
  Date: 12/4/2020
  Time: 8:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editora Laranja</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="css/Style.css">
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

    <div class = "imageDiv">
        <img src="assets\livro1.jpg">
        <div class="center"><pre> Visualizar os <br>  dez livros <br> mais vendidos</pre></div>
        <button class="buttonOffset">Ir agora</button>
    </div>

    <div class = "imageDiv">
        <img src="assets\livraria.jpg">
        <div class="center"><pre>  Veja aqui uma  <br> Pré-visualização <br>  do catálogo  </pre></div>
        <button class="buttonOffset">Ir agora</button>
    </div>

    <div class = "imageDiv">
        <img src="assets\catalogo.jpg">
        <div class = "center"><pre> Acompanhe a <br> situação das <br>  livrarias  </pre></div>
        <button class="buttonOffset">Ir agora</button>
    </div>
</body>
</html>
