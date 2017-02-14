 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$boss_id = $_GET['boss_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
	<h1>Edit your restaurant here:</h1>
	
	<?php
		print "<form action='newres_resman_trans.php?boss_id=".$boss_id."' method='post'>";
		print "Name(no space):	<input name='rest_name' type='text' value=''>	Address:	<input name='rest_address' type='text' value=''>";
		print "<br>";
		print "<br>";
		print "Open Time:	<input name='open_time' type='text' value=''>	Close Time:	<input name='close_time' type='text' value=''>";
		print "<br>";		
		print "<br>";
		print "<input name='sub_but' type='submit' value='Submit'>	<input name='sub_but' type='submit' value='Cancel'>";
		print "</form>";
	?>


	</body>
</html>