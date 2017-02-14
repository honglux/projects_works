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
	
		<h1>Change your information here:</h1>
	
		<?php
			$query = "SELECT * FROM rest.boss WHERE boss_id = ".$boss_id;
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
			
			print "<form action='boscha_boss_trans.php?boss_id=".$boss_id."' method='post'>";
			
			print "<p>Your name: <input type='text' name='boss_name' value='".$row['boss_name']."'> </p>";
			print "<p>Your address: <input type='text' name='boss_address' value='".$row['boss_address']."'> </p>";
			print "<p>Your age: <input type='text' name='boss_age' value='".$row['boss_age']."'> </p>";
			print "<p>Your gender: <input type='text' name='boss_gender' value='".$row['boss_gender']."'> </p>";
			print "<p>Your SSN: <input type='text' name='boss_ssn' value='".$row['boss_ssn']."'> </p>";
			
			print "<input name='sub_but' type='submit' value='Submit'>	";
			print "<input name='sub_but' type='submit' value='Cancel'>	";
			
			print "</form>";
			
			
			$dbh = null;
		?>
	
	
	
	

	</body>
</html>