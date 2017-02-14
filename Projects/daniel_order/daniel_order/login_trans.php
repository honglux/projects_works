 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$sub_but = $_POST['sub_but'];
?>

<html>
	<head>
		   <title>Page 1</title>
	</head>

	<body bgcolor="white">

		
		<?php
		
			//print $sub_but;
			
			if($sub_but == 'Submit')
			{
				$user_name = $_POST['user_name'];
				$query = "SELECT * 
						FROM rest.user
						LEFT JOIN rest.customer USING(user_id)
						LEFT JOIN rest.boss USING(user_id)
						where user_name = ";
				$query = $query."'".$user_name."'";
				$result = $dbh->query($query);
				if (!$result) 
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				$row = $result->fetch();
				
				if($row['customer_boss'] == 'c' )
				{
					$customer_id = $row['customer_id'];
					header("Location: customer.php?cust_id=$customer_id"); 
					$dbh = null;
					exit;
				}
				else if($row['customer_boss'] == 'b' )
				{
					$boss_id = $row['boss_id'];
					header("Location: notice.php?boss_id=".$boss_id); 
					$dbh = null;
					exit;
				}
			}
			else if($sub_but == 'New User!!')
			{
				
				header("Location: new_user.php"); 
				$dbh = null;
				exit;
			}
			
		?>


			






	</body>
</html>