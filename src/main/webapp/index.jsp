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
	<script src="js/bootstrap.min.js"></script>
	<!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container theme-showcase" role="main">

		<!-- Main jumbotron for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h1>Arm&aacute; tu Sanguchetto</h1>
			<p></p>
		</div>

		<div class="page-header">
			<h1>Eleg&iacute; Ingrediente</h1>
		</div>
		<div>
	<!--  		<label>Eleg&iacute; Ingrediente</label>-->
			<div class="checkbox">
  				<label><input type="checkbox" value="queso">Queso</label>
			</div>
			<div class="checkbox">
  				<label><input type="checkbox" value="Jamon">Jam&oacute;n</label>
			</div>
			<div class="checkbox">
  				<label><input type="checkbox" value="Tomate">Tomate</label>
			</div>
			<div class="checkbox">
  				<label><input type="checkbox" value="Lechuga">Lechuga</label>
			</div>
			<div class="checkbox">
  				<label><input type="checkbox" value="Mayonesa">Mayonesa</label>
			</div>
			<datalist></datalist>
			<button>Agregar</button>
		</div>
		 </br>
		<form class="form-inline">
		  <div class="form-group">
		  	<label>TOTAL</label>
		    <label class="sr-only" for="exampleInputAmount">Amount (in dollars)</label>
		    <div class="input-group">
		      <div class="input-group-addon">$</div>
		      <input type="text" class="form-control" id="exampleInputAmount" placeholder="Amount">
		      <div class="input-group-addon">.00</div>
		    </div>
		  </div>
		  </br>
		  </br>
		  <div>
		  <button type="submit" class="btn btn-lg btn-primary">Confirmar</button>
		  <button type="button" class="btn btn-lg btn-warning">Cancelar</button>
		  </div>
		</form>


	</div>

</body>
</html>