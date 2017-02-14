 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$dish_id=$_GET['dish_id'];
	$rest_id = $_GET['rest_id'];
	$sub_but = $_POST['sub_but'];
	$dish_price = $_POST['dish_price'];
	$chan_dish_name = $_POST['dish_name'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
	<?php
		if($sub_but == 'Delete This Dish!!!')
		{
			$excu_query = "DELETE FROM `rest`.`rest_to_dish` WHERE `rest_id`='".$rest_id."' and `dish_id`='".$dish_id."'";
			$result = $dbh->query($excu_query);
			if (!$result)
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			
			$query = "SELECT * FROM rest.orders
					WHERE rest_id = ".$rest_id." and statu = 'US'";
			$result2 = $dbh->query($query);
			if (!$result2)
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			while($row = $result2->fetch())
			{
				$excu_query2 = "DELETE FROM `rest`.`order_dish` WHERE `dish_id`='".$dish_id."' and `order_id`='".$row['order_id']."'";
				$result3 = $dbh->query($excu_query2);
				if (!$result3)
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
			}
			
			print "<script>
					alert('Success!!');
				</script>";
			header("refresh:1;url=edit_dish.php?rest_id=".$rest_id);
			$dbh = null;
			exit;
		}
		else if($sub_but == 'Submit')
		{
			if($dish_price == '' || $chan_dish_name == '')
			{
				print "<script>
						alert('Invalid input!!');
					</script>";
				header("refresh:1;url=edit_dish_detail.php?rest_id=".$rest_id."&dish_id=".$dish_id);
				$dbh = null;
				exit;
			}
			
			$query2 = "SELECT * FROM rest.dish WHERE dish_id = ".$dish_id;
			$result4 = $dbh->query($query2);
			if (!$result4)
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row2 = $result4->fetch();
			
			if($chan_dish_name == $row2['dish_name'])
			{
				//print "aaaaaaaaaaa";
				$excu_query3 = "UPDATE `rest`.`rest_to_dish` SET `dish_price`='".$dish_price."' WHERE `rest_id`='".$rest_id."' and `dish_id`='".$dish_id."'";
				$result5 = $dbh->query($excu_query3);
				if (!$result5)
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				
				
				
				print "<script>
						alert('Success!!');
					</script>";
				header("refresh:1;url=edit_dish.php?rest_id=".$rest_id);
				$dbh = null;
				exit;
			}
			else if($chan_dish_name != $row2['dish_name'])
			{
				$query3 = "SELECT * FROM rest.rest_to_dish
						JOIN rest.dish USING(dish_id)
						WHERE rest_id = ".$rest_id." and  dish_name = '".$chan_dish_name."'";
				$result6 = $dbh->query($query3);
				if (!$result6)
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				$row3 = $result6->fetch();
				if($row3['dish_id'] != null)
				{
					print "<script>
							alert('You already have this dish!!');
						</script>";
					header("refresh:1;url=edit_dish.php?rest_id=".$rest_id);
					$dbh = null;
					exit;
				}
				else
				{
					$query4 = "SELECT * FROM rest.dish WHERE dish_name = '".$chan_dish_name."'";
					$result7 = $dbh->query($query4);
					if (!$result7)
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					$row4 = $result7->fetch();
					if($row4['dish_id'] != null)
					{
						///////////////////
						$excu_query4 = "UPDATE `rest`.`rest_to_dish` SET `dish_id`='".$row4['dish_id']."' , `dish_price`='".$dish_price."' WHERE `rest_id`='".$rest_id."' and `dish_id`='".$dish_id."'";
						$result8 = $dbh->query($excu_query4);
						if (!$result8)
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						
						$query = "SELECT * FROM rest.orders
								WHERE rest_id = ".$rest_id." and statu = 'US'";
						$result2 = $dbh->query($query);
						if (!$result2)
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						while($row = $result2->fetch())
						{
							$excu_query2 = "DELETE FROM `rest`.`order_dish` WHERE `dish_id`='".$dish_id."' and `order_id`='".$row['order_id']."'";
							$result3 = $dbh->query($excu_query2);
							if (!$result3)
							{
								print "execution error: </br>";
								$error = $dbh->errorInfo();
								print($error[2]);
								exit;
							}
						}
						
						print "<script>
								alert('Success!!');
							</script>";
						header("refresh:1;url=edit_dish.php?rest_id=".$rest_id);
						$dbh = null;
						exit;
						//$excu_query42 = ""
					}
					else
					{
						$excu_query7 = "DELETE FROM `rest`.`rest_to_dish` WHERE `rest_id`='".$rest_id."' and `dish_id`='".$dish_id."'";
						$result12 = $dbh->query($excu_query7);
						if (!$result12)
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						
						$query = "SELECT * FROM rest.orders
								WHERE rest_id = ".$rest_id." and statu = 'US'";
						$result2 = $dbh->query($query);
						if (!$result2)
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						while($row = $result2->fetch())
						{
							$excu_query2 = "DELETE FROM `rest`.`order_dish` WHERE `dish_id`='".$dish_id."' and `order_id`='".$row['order_id']."'";
							$result3 = $dbh->query($excu_query2);
							if (!$result3)
							{
								print "execution error: </br>";
								$error = $dbh->errorInfo();
								print($error[2]);
								exit;
							}
						}
						
						$excu_query5 = "INSERT INTO `rest`.`dish` (`dish_name`) VALUES ('".$chan_dish_name."');";
						$result9 = $dbh->query($excu_query5);
						if (!$result9)
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						
						$query5 = "SELECT * FROM rest.dish WHERE dish_name = '".$chan_dish_name."'";
						$result10 = $dbh->query($query5);
						if (!$result10)
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						$row5 = $result10->fetch();
						$chan_dish_id = $row5['dish_id'];
						
						$excu_query6 = "INSERT INTO `rest`.`rest_to_dish` (`rest_id`, `dish_id`, `dish_price`) VALUES ('".$rest_id."', '".$chan_dish_id."', '".$dish_price."');";
						$result11 = $dbh->query($excu_query6);
						if (!$result11)
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						print "<script>
								alert('Success!!');
							</script>";
						header("refresh:1;url=edit_dish.php?rest_id=".$rest_id);
						$dbh = null;
						exit;
					}
				}
			}
			
			
		}
		else if($sub_but == "Cancel")
		{
			header("Location: edit_dish.php?rest_id=".$rest_id);
			$dbh = null;
			exit;
		}
		
		
	?>
	
	
	

	</body>
</html>