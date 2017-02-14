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
	$sub_but = $_POST['sub_but'];
	$dish_price = $_POST['dish_price'];
	$dish_name = $_POST['dish_name'];
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
		<?php
			if($sub_but == "Submit")
			{
				//print "aaa";
				if($dish_price == '' || $dish_name == '')
				{
					print "<script>
								alert('Not valid dish name or price!!');
							</script>";
					header("refresh:1;url=add_dish.php?rest_id=".$rest_id);
					$dbh = null;
					exit;
				}
				
				$query = "SELECT * FROM rest.dish WHERE dish_name = '".$dish_name."'";
				$result = $dbh->query($query);
				if (!$result)
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				$row = $result->fetch();
				if($row['dish_id'] == null)
				{
					$excu_query2 = "INSERT INTO `rest`.`dish` (`dish_name`) VALUES ('".$dish_name."');";
					$result4 = $dbh->query($excu_query2);
					if (!$result4)
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					
					$query3 = "SELECT * FROM rest.dish WHERE dish_name = '".$dish_name."'";
					$result5 = $dbh->query($query3);
					if (!$result5)
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					$row3 = $result5->fetch();
					
					$excu_query3 = "INSERT INTO `rest`.`rest_to_dish` (`rest_id`, `dish_id`, `dish_price`) VALUES ('".$rest_id."', '".$row3['dish_id']."', '".$dish_price."')";
					$result6 = $dbh->query($excu_query3);
					if (!$result6)
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					
					print "<script>
							alert('Success!');
						</script>";
					header("refresh:1;url=edit_dish.php?rest_id=".$rest_id);
					$dbh = null;
					exit;
				}
				else
				{
					$dish_id = $row['dish_id'];
					$query2 = "SELECT * FROM rest.rest_to_dish
							WHERE rest_id = ".$rest_id." and dish_id = ".$dish_id;
					$result2 = $dbh->query($query2);
					if (!$result2)
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					$row2 = $result2->fetch();
					if($row2['dish_id'] == null)
					{
						//print "entered";
						$excu_query = "INSERT INTO `rest`.`rest_to_dish` (`rest_id`, `dish_id`, `dish_price`) VALUES ('".$rest_id."', '".$dish_id."', '".$dish_price."')";
						$result3 = $dbh->query($excu_query);
						if (!$result3)
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
					else
					{
						print "<script>
								alert('You already have this dish!');
							</script>";
						header("refresh:1;url=add_dish.php?rest_id=".$rest_id);
						$dbh = null;
						exit;
					}
				}
			}
			else if($sub_but == "Cancel")
			{
				header("Location: edit_dish.php?rest_id=".$rest_id);
				$dbh = null;
				exit;
			}
			
			
			
			$dbh = null;
		?>
		
	
	
	

	</body>
</html>