<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="My online portfolio which showcases my skills and projects using various softwares, languages, and tools.">
		<meta name="author" content="Ronald Tang">
    <link rel="icon" href="favicon.ico">

		<title>LIS4381 - Skill Set 14</title>		
		<?php include_once("../css/include_css.php"); ?>			
 
  
</head>

  <body>

		<?php include_once("../global/nav.php"); ?>

		<div class="container">
			<div class="starter-template">
				<div class="page-header">
					<?php include_once("global/header.php"); ?>	
				</div>



					<br>

					<h2>Perform Calculation</h2>

					<br>

							
					<form method="post" role="form" class="form-horizontal" action="process_functions.php">
								<div class="form-group">
										<label class="control-label col-sm-3" for="num1">Number 1:</label>
										<div class="col-sm-6">
												<input type="number" class="form-control" name="num1" id="num1" placeholder="Enter number 1" />
										</div>
								</div>

						<div class="form-group">
										<label class="control-label col-sm-3" for="num2">Number 2:</label>
										<div class="col-sm-6">
										<input type="number" class="form-control" name="num2" id="num2"  placeholder="Enter number 2"/>
									</div>
									</div>

 				<div class="form-group">
				 <div class="col-sm-12">
				  <label class="checkbox-inline">
				  
				  	<input type="radio" name="operation" id="addition" value="addition" checked="true">addition</label>

					  <label class="checkbox-inline">

					  <input type="radio" name="operation" id="subtraction" value="subtraction">subtraction</label>

					  <label class="checkbox-inline">
					  <input type="radio" name="operation" id="multiplication" value="multiplication">multiplication</label>

					  <label class="checkbox-inline">
					  <input type="radio" name="operation" id="division" value="division">division</label>

					  <label class="checkbox-inline">
					  <input type="radio" name="operation" id="exponentiation" value="exponentiation">exponentiation</label>

		</div>
		</div>
  		
			  <div class="form-group">
									<div class="col-sm-12">
									<button type="submit" class="btn btn-default">Calculate</button>
										</div>
								</div>

							</form>

							<br>

				<?php include_once "global/footer.php"; ?>

			</div> <!-- starter-template -->
    </div> <!-- end container -->

		<!-- Bootstrap JavaScript
				 ================================================== -->
		<!-- Placed at end of document so pages load faster -->		
		<?php include_once("../js/include_js.php"); ?>			

			<script>
				$(document).ready(function(){
					$('#myTable').DataTable({
						responsive: true
					});
				});
			</script>


  </body>
</html>