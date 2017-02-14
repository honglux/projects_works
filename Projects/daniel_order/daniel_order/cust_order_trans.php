 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	}
	$customer_id = $_GET['cust_id'];
	$rest = $_POST['rest'];
	$sub_but = $_POST['sub_but'];
	
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	<?php
		$query = "SELECT * FROM rest.orders
				JOIN rest.rests USING(rest_id)
				WHERE customer_id = ".$customer_id." and rest_name = '".$rest."' and statu = 'US'";
		$query3 = "SELECT * FROM rest.rests
				WHERE rest_name = '".$rest."'";
		
	?>
	<?php
		if($sub_but == 'submit')
		{
			$result = $dbh->query($query3);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
			$rest_id = $row['rest_id'];
			//print $rest_id."rest_id";
			
			$result = $dbh->query($query);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
			if($row['order_id'] == null)
			{
				print "null expected";
				$query2 = "INSERT INTO `rest`.`orders` (`rest_id`, `customer_id`, `statu`) 
						VALUES ('".$rest_id."', '".$customer_id."', 'US');";
				$result = $dbh->query($query2);
				if (!$result) 
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				$result = $dbh->query($query);
				if (!$result) 
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				$row = $result->fetch();
				$order_id = $row['order_id'];
				header("Location: order.php?order_id=$order_id");
				$dbh = null;
				exit;
			}
			else
			{
				$order_id = $row['order_id'];
				header("Location: order.php?order_id=$order_id");
				$dbh = null;
				exit;
			}
		}
		else if($sub_but == 'I want to change my information!')
		{
			header("Location: cust_info_chang.php?customer_id=".$customer_id);
			$dbh = null;
			exit;
		}
		else if($sub_but == 'Log out!')
		{
			header("Location: index.php");
			$dbh = null;
			exit;
		}
		
	?>
	
	
	

	</body>
</html>