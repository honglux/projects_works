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
	$dish_order_id = $_GET['dish_order_id'];
	$add_or_del = $_POST['add_or_del'];
	$dish_amount = 0;
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
		
		<?php
			$query = "SELECT * FROM rest.order_dish WHERE order_id = ".$order_id." and dish_id = ".$dish_order_id;
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
			if($add_or_del=='+')
			{
				if($row['dish_amount']==null)
				{
					$excu_quer = "INSERT INTO `rest`.`order_dish` (`order_id`, `dish_id`, `dish_amount`) VALUES ('".$order_id."', '".$dish_order_id."', '1');";
				}
				else
				{
					$dish_amount = $row['dish_amount'];
					print "1$dish_amount ".$dish_amount;
					$dish_amount = (int)$dish_amount + 1;
					print "2$dish_amount ".$dish_amount;
					$excu_quer = "UPDATE `rest`.`order_dish` SET `dish_amount`='".$dish_amount."' WHERE `order_id`='".$order_id."' and `dish_id`='".$dish_order_id."';";
				}
			}
			else if($add_or_del=='-')
			{
				if($row['dish_amount']==null || $row['dish_amount']<=0)
				{
					$excu_quer = "SELECT * FROM rest.order_dish;";
				}
				else
				{
					$dish_amount = $row['dish_amount'];
					print "1$dish_amount ".$dish_amount;
					$dish_amount = (int)$dish_amount - 1;
					print "2$dish_amount ".$dish_amount;
					$excu_quer = "UPDATE `rest`.`order_dish` SET `dish_amount`='".$dish_amount."' WHERE `order_id`='".$order_id."' and `dish_id`='".$dish_order_id."';";
				}
			}
		?>
		<?php
			$result = $dbh->query($excu_quer);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			//$row = $result->fetch();
			header("Location: order.php?order_id=$order_id");
			$dbh = null;
			exit;
		?>
		



	</body>
</html>