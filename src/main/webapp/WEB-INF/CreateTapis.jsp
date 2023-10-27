<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
<form method="POST" class="my-5">
    <div class="mb-3 row justify-content-center align-items-center">
	    <div class= "col-md-4 ">
		      <label class="form-label">Créer Un Tapis :</label>
		      <input type="text" class="form-control" placeholder="Nom du tapis" name="NOM_TAPIS">
		      <button type="Submit" class="btn btn-success my-5">CREATE</button>
	   	</div>
	</div>
</form>
</body>
</html>