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
	$boss_id = $_GET['boss_id'];

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
				//print $rest."!!!!!!!!!!!!!";
				print "<script>
						alert('Please enter the restaurants name!!');
					</script>";
				header("refresh:1;url=new_rest.php?boss_id=".$boss_id);
				//print $sub_but;
				$dbh = null;
				exit;
			}
			else
			{
				$query = "SELECT * FROM rest.rests WHERE rest_name = '".$rest."'";
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
					header("refresh:1;url=new_rest.php?boss_id=".$boss_id);
					$dbh = null;
					exit;
				}
				else
				{
					$excu_query = "INSERT INTO `rest`.`rests` (`rest_name`, `rest_address`, `boss_id`, `open_time`, `close_time`) 
									VALUES ('".$rest."', '".$rest_address."', '".$boss_id."', '".$open_time."', '".$close_time."');";
					$result = $dbh->query($excu_query);
					if (!$result) 
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					
					$query = "SELECT * FROM rest.rests WHERE rest_name = '".$rest."'";
					$result2 = $dbh->query($query);
					if (!$result2) 
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					$row = $result2->fetch();
					
					print "<script>
							alert('Success!!');
						</script>";
					header("refresh:1;url=rest_mana.php?rest_id=".$row['rest_id']);
					$dbh = null;
					exit;
				}
			}
			
		}
		else if($sub_but == 'Cancel')
		{
			//print $sub_but;
			header("Location: boss.php?boss_id=".$boss_id);
			$dbh = null;
			exit;
		}
		
		
	?>


	</body>
</html>