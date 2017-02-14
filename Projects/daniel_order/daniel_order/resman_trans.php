 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	//$boss_id=$_GET['boss_id'];
	$rest_id = $_GET['rest_id'];
	$edit = $_POST['edit'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
		<?php
			if($edit == "Edit dishes")
			{
				//print $boss_id;
				header("Location: edit_dish.php?rest_id=".$rest_id);
				$dbh = null;
				exit;
			}
			else if($edit == "Edit this resturant")
			{
				header("Location: edit_rest.php?rest_id=".$rest_id);
				$dbh = null;
				exit;
			}
			else if($edit == "See previous orders")
			{
				header("Location: prev_order.php?rest_id=".$rest_id);
				$dbh = null;
				exit;
			}
			else if($edit == "Close this restaurant!")
			{
				header("Location: close_ensure.php?rest_id=".$rest_id);
				$dbh = null;
				exit;
			}
			else if($edit == "Back")
			{
				$query = "SELECT * FROM rest.rests WHERE rest_id = ".$rest_id;
				$result = $dbh->query($query);
				if (!$result) 
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				$row = $result->fetch();
				header("Location: boss.php?boss_id=".$row['boss_id']);
				$dbh = null;
				exit;
			}
			
		?>
		





	</body>
</html>