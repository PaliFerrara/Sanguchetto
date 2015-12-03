<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Bootstrap Test</title>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script><!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container theme-showcase" role="main">

		<!-- Main jumbotron for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h1>Nuevo Ingrediente/Condimento</h1>
			<p></p>
		</div>
		

		<div class="page-header">
			<h1>Dar de Alta un nuevo Ingrediente</h1>
			<form class="form-horizontal">
			  <div class="form-group">
	 			 <label for="nombreIngrediente" class="col-sm-2 control-label">Nombre</label>
	 			 <div class="col-sm-10">
	 			 	<input type="text" class="form-control" id="nombreIngrediente"/>
	 			 </div>
	 		  </div>
	 		  <div class="form-group">
			   	 <label for="precioIngrediente" class="col-sm-2 control-label">Precio</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="precioIngrediente" />
			    </div>
			   </div>
			 </form>
		</div>
	</div>
</body>
</html>