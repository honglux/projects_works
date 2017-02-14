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
		$query = "SELECT * FROM rest.orders WHERE order_id = '".$order_id."';";
		$result = $dbh->query($query);
		if (!$result) 
		{
			print "1 execution error: </br>";
			$error = $dbh->errorInfo();
			print($error[2]);
			exit;
		}
		$row = $result->fetch();
		$customer_id = $row['customer_id'];
	?>
	<?php
		if($sub_but=="back")
		{
			$excu_quer = "SELECT * FROM rest.orders;";
		}
		else if($sub_but=="clear")
		{
			$excu_quer = "UPDATE `rest`.`order_dish` SET `dish_amount`='0' WHERE `order_id`='".$order_id."';";
		}
		else if($sub_but=="submit")
		{
			$excu_quer = "UPDATE `rest`.`orders` SET `statu`='SUN' WHERE `order_id`='".$order_id."';";
		}
	?>
	<?php
		$result = $dbh->query($excu_quer);
		if (!$result) 
		{
			print "2 execution error: </br>";
			$error = $dbh->errorInfo();
			print($error[2]);
			exit;
		}
		if($sub_but=="clear")
		{
			header("Location: order.php?order_id=$order_id");
			$dbh = null;
			exit;
		}
		else if($sub_but == "submit")
		{
			print "<script>
					alert('Success!!');
				</script>";
			header("refresh:1;url=customer.php?cust_id=".$customer_id);
			$dbh = null;
			exit;
		}
		else if($sub_but == "back")
		{
			header("Location: customer.php?cust_id=".$customer_id);
			$dbh = null;
			exit;
		}
		
	?>
	
	</body>
</html>