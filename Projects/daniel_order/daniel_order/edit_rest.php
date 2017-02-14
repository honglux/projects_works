 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$rest_id = $_GET['rest_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
	<h1>Edit your restaurant here:</h1>
	
	<?php
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
	?>
	
	<?php
		print "<form action='edires_resman_trans.php?rest_id=".$rest_id."' method='post'>";
		print "Name(no space):	<input name='rest_name' type='text' value='".$row['rest_name']."'>	Address:	<input name='rest_address' type='text' value='".$row['rest_address']."'>";
		print "<br>";
		print "<br>";
		print "Open Time:	<input name='open_time' type='text' value='".$row['open_time']."'>	Close Time:	<input name='close_time' type='text' value='".$row['close_time']."'>";
		print "<br>";		
		print "<br>";
		print "<input name='sub_but' type='submit' value='Submit'>	<input name='sub_but' type='submit' value='Cancel'>";
		print "</form>";
	?>


	</body>
</html>