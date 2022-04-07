<?php
ini_set('display_errors', 1);
error_reporting(E_ALL);
?>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Assignment 4 deals with creating an online portfolio and creating a client-side validation example.">
	<meta name="author" content="Ronald Tang">
	<link rel="icon" href="favicon.ico">

	<title>LIS 4381 - Simple Calculator</title>
		<?php include_once("../css/include_css.php"); ?>
</head>
<body>

	<?php include_once("../global/nav.php"); ?>
	<div class="container">
		<div class="starter-template">
					<div class="page-header">
						<?php include_once("global/header.php"); ?>	
					</div>
					<?php
if (!empty($_POST)){
    $num1 = $_POST['num1'];
    $num2 = $_POST['num2'];
    $calcu = $_POST['calcu'];
	
	if (preg_match('/^[-+]?[0-9]*\.?[0-9]+$/', $num1) && preg_match('/^[-+]?[0-9]*\.?[0-9]+$/', $num2))
	//if(is_numeric($num1) && is_numeric($num2))
	{
    {
		echo '<h2>'."$calcu".'</h2>';
	}

	function AddNum($x,$y)
	{
		echo "$x" . " + " . "$y" . " = ";
		echo $x + $y;
	}
	
	function SubtractNum($x, $y)
	{
		echo "$x" . " - " . "$y" . " = ";
		echo $x - $y;
	}

	function MultiplyNum($x, $y)
	{
		echo "$x" . " * " . "$y" . " = ";
		echo $x * $y;
	}

	function DivideNum($x, $y)
	{
		if($y == 0)
		{
			echo "Cannot divide by zero!";
		}
		else
		{
			echo "$x" . " / " . "$y" . " = ";
			echo $x / $y;
		}
	}

	function PowerNum($x,$y)
	{
		echo "$x" . " raised to the power of " . "$y" . " = ";
		echo pow($x, $y);
	}
	
	//call functions
	if($calcu == 'addition')
	{
		AddNum($num1, $num2);
	}
	else if($calcu == 'subtraction')
	{
		SubtractNum($num1, $num2);
	}
	else if($calcu == 'multiplication')
	{
		MultiplyNum($num1, $num2);
	}
	else if($calcu == 'division')
	{
		DivideNum($num1, $num2);
	}
	else if($calcu == 'exponentiation')
	{
		PowerNum($num1, $num2);
	}
	else
	{
		echo "Must select an operation";
	}
	?>		
	<p>
	<?php
	}
	else
	{
		echo "Must enter valid number.";
	}
}
else
{
	header('Location: index.php');
}
	?>
	</p>
	<?php include_once "global/footer.php";?>

	</div>
</div>

<!-- Bootstrap JavaScript
	================================================== -->
	<!-- Placed at end of document so pages load faster -->
	<?php include_once("../js/include_js.php"); ?>
</body>
</html>


