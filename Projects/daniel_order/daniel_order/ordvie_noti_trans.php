 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 

	$order_id = $_GET['order_id'];
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
					WHERE order_id = ".$order_id;
			$result = $dbh->query($query);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
			$boss_id = $row['boss_id'];
			print $boss_id;
		?>
		<?php
			if($sub_but=="I GOT IT!")
			{
				$query = "UPDATE `rest`.`orders` SET `statu`='N' WHERE `order_id`='".$order_id."'";
				$result = $dbh->query($query);
				if (!$result) 
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
			}
			header("Location: notice.php?boss_id=$boss_id");
			$dbh = null;
			exit;
		?>

	</body>
</html>