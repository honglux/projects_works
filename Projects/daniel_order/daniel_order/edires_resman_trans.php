 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$rest = $_POST['rest_name'];
	$rest_address = $_POST['rest_address'];
	$open_time = $_POST['open_time'];
	$close_time = $_POST['close_time'];
	$sub_but = $_POST['sub_but'];
	$rest_id = $_GET['rest_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	

	<?php
		//print $rest."!!!!!!!!!!!!!";
		if($sub_but == 'Submit')
		{
			if($rest == '')
			{
				
				print "<script>
						alert('Please enter the restaurants name!!');
					</script>";
				header("refresh:1;url=edit_rest.php?rest_id=".$rest_id);
				$dbh = null;
				exit;
			}
			else
			{
				$query = "SELECT * FROM rest.rests WHERE rest_name = '".$rest."' and rest_id != ".$rest_id;
				$result2 = $dbh->query($query);
				if (!$result2) 
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				$row = $result2->fetch();
				
				if($row['rest_id'] != null)
				{
					print "<script>
							alert('This name already exsit!!');
						</script>";
					header("refresh:1;url=edit_rest.php?rest_id=".$rest_id);
					$dbh = null;
					exit;
				}
				else
				{
					$excu_query = "UPDATE `rest`.`rests` SET `rest_name`='".$rest."', `rest_address`='".$rest_address."', `open_time`='".$open_time."', `close_time`='".$close_time."' WHERE `rest_id`='".$rest_id."';";
					$result = $dbh->query($excu_query);
					if (!$result) 
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					
					print "<script>
							alert('Success!!');
						</script>";
					header("refresh:1;url=rest_mana.php?rest_id=".$rest_id);
					$dbh = null;
					exit;
				}
			}
			
		}
		else if($sub_but == 'Cancel')
		{
			//print $sub_but;
			header("Location: rest_mana.php?rest_id=".$rest_id);
			$dbh = null;
			exit;
		}
		
		
	?>


	</body>
</html>