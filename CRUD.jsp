<%@page import="vo.Produtos"%>
<%@page import="ctr.ProdutosProcess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ProvaBE</title>
<link rel="stylesheet" href="crud.css">
</head>
<body>
	<%
	//Recebendo os dados
	String id = request.getParameter("id");
	String nome = request.getParameter("nome");
	String descricao = request.getParameter("descricao");
	Float valor = request.getParameter("valor");
	Float quantidade = request.getParameter("quantidade");
	//Carregando os dados do arquivo
	ProdutosProcess.abrir();
	%>
	<form>
		<label>Id</label><input type="number" name="id" required/>
		<label>nome</label><input type="text" name="autor" required/>
		<label>descrição</label><input type="text"	name="titulo" required/>
		<label>valor</label><input type="number" step="any" name="preco" required/>
		<button type="submit">Enviar</button>
	</form>
	<div class="msg">
		<%
		
</body>
</html>