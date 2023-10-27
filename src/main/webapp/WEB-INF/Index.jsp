<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<ul class="nav bg-dark text-light py-3">
	  <li class="nav-item">
	    <a class="nav-link active text-light" aria-current="page" href="index">Voir tous les tapis</a>
	  </li>
	  <li class="nav-item">
	    <a class="nav-link text-light" href="CreateTapisServlet">Créer un tapis</a>
	  </li>
	  <li class="nav-item">
	    <a class="nav-link text-light" href="ModifierTapisServlet">Éditer Un Tapis</a>
	  </li>
	   <li class="nav-item">
    	<a class="nav-link text-light" href="CreateCompany">Voir tous les abonnés</a>
  		</li>
	</ul>
	
<h1 class="text-center my-5">Liste de tous les tapis : </h1>
 <section class="container my-5">
		<div class="row justify-content-center align-items-center">
		<c:forEach items="${tapisArray}" var="tapisItem">
		  <div class="col-md-3 d-flex justify-content-center align-items-center">
		    Nom Du Tapis : ${tapisItem.name}
		    <button type="button" class="btn btn-success my-5 ms-3"><a class="text-light text-decoration-none" href="ModifierTapisServlet?id=${tapisItem.id}">EDIT</a></button>
		  </div>
		</c:forEach>
		</div>
	</section>  
</body>
</html>