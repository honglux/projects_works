 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$customer_id = $_GET['customer_id'];
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
		<h1>Change your information here:</h1>
	
		<?php
			$query = "SELECT * FROM rest.customer WHERE customer_id = ".$customer_id;
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
			
			print "<form action='cuscha_cust_trans.php?customer_id=".$customer_id."' method='post'>";
			
			print "<p>Your name: <input type='text' name='customer_name' value='".$row['customer_name']."'> </p>";
			print "<p>Your address: <input type='text' name='customer_address' value='".$row['customer_address']."'> </p>";
			print "<p>Your age: <input type='text' name='customer_age' value='".$row['customer_age']."'> </p>";
			print "<p>Your gender: <input type='text' name='customer_gender' value='".$row['customer_gender']."'> </p>";
			print "<p>Your SSN: <input type='text' name='customer_ssn' value='".$row['customer_ssn']."'> </p>";
			
			print "<input name='sub_but' type='submit' value='Submit'>	";
			print "<input name='sub_but' type='submit' value='Cancel'>	";
			
			print "</form>";
			
			
			$dbh = null;
		?>
	
	
	
	

	</body>
</html>