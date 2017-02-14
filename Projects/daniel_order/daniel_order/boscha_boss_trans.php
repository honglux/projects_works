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
	$sub_but = $_POST['sub_but'];
	$boss_name = $_POST['boss_name'];
	$boss_address = $_POST['boss_address'];
	$boss_age = $_POST['boss_age'];
	$boss_gender = $_POST['boss_gender'];
	$boss_ssn = $_POST['boss_ssn'];
	
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
		
		<?php
			if($sub_but == 'Submit')
			{
				if($boss_name == '')
				{
					print "<script>
							alert('Please enter your name!!');
						</script>";
					header("refresh:1;url=boss_info_chang.php?boss_id=".$boss_id);
					$dbh = null;
					exit;
				}
				else
				{
					$excu_query = "UPDATE `rest`.`boss` SET `boss_name`='".$boss_name."', `boss_address`='".$boss_address."', `boss_age`='".$boss_age."', `boss_gender`='".$boss_gender."', `boss_ssn`='".$boss_ssn."' WHERE `boss_id`='".$boss_id."';";
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
					header("refresh:1;url=boss.php?boss_id=".$boss_id);
					$dbh = null;
					exit;
				}
			
			}
			else if($sub_but == 'Cancel')
			{
				header("Location: boss.php?boss_id=".$boss_id);
				$dbh = null;
				exit;
			}
		?>
		
	
	
	
	

	</body>
</html>