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
	$user_name = $_POST['user_name'];
	$user_real_name = $_POST['user_real_name'];
	$user_address = $_POST['user_address'];
	$user_age = $_POST['user_age'];
	$user_gender = $_POST['user_gender'];
	$user_ssn = $_POST['user_ssn'];
	$cust_boss = $_POST['cust_boss'];
	
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
		
		<?php
			if($sub_but == 'Submit')
			{
				if($user_name == '')
				{
					print "<script>
							alert('Please enter your name!!');
						</script>";
					header("refresh:1;url=new_user.php");
					$dbh = null;
					exit;
				}
				else
				{
					$query = "SELECT * FROM rest.user WHERE user_name = '".$user_name."'";
					$result2 = $dbh->query($query);
					if (!$result2) 
					{
						print "execution error: </br>";
						$error = $dbh->errorInfo();
						print($error[2]);
						exit;
					}
					$row = $result2->fetch();
					
					if($row['user_id'] != null)
					{
						print "<script>
								alert('This user name already exist!!');
							</script>";
						header("refresh:1;url=new_user.php");
						$dbh = null;
						exit;
					}
					else
					{
						if($cust_boss == 'customer')
						{
							$excu_query = "INSERT INTO `rest`.`user` (`user_name`, `customer_boss`) VALUES ('".$user_name."', 'c');";
						}
						else if($cust_boss == 'boss')
						{
							$excu_query = "INSERT INTO `rest`.`user` (`user_name`, `customer_boss`) VALUES ('".$user_name."', 'b');";
						}
						
						$result = $dbh->query($excu_query);
						if (!$result) 
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						
						$query = "SELECT * FROM rest.user WHERE user_name = '".$user_name."'";
						$result2 = $dbh->query($query);
						if (!$result2) 
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						$row = $result2->fetch();
						
						if($cust_boss == 'customer')
						{
							$excu_query2 = "INSERT INTO `rest`.`customer` (`user_id`, `customer_name`, `customer_address`, `customer_age`, `customer_gender`, `customer_ssn`)
											VALUES ('".$row['user_id']."', '".$user_real_name."', '".$user_address."', '".$user_age."', '".$user_gender."', '".$user_ssn."');";
						}
						else if($cust_boss == 'boss')
						{
							$excu_query2 = "INSERT INTO `rest`.`boss` (`user_id`, `boss_name`, `boss_address`, `boss_age`, `boss_gender`, `boss_ssn`)
											VALUES ('".$row['user_id']."', '".$user_real_name."', '".$user_address."', '".$user_age."', '".$user_gender."', '".$user_ssn."');";
						}
						
						$result2 = $dbh->query($excu_query2);
						if (!$result2) 
						{
							print "execution error: </br>";
							$error = $dbh->errorInfo();
							print($error[2]);
							exit;
						}
						
						if($cust_boss == 'customer')
						{
							
							$query2 = "SELECT * FROM rest.customer WHERE user_id = ".$row['user_id'];
							$result3 = $dbh->query($query2);
							if (!$result3) 
							{
								print "execution error: </br>";
								$error = $dbh->errorInfo();
								print($error[2]);
								exit;
							}
							$row2 = $result3->fetch();
							
							print "<script>
									alert('Success!!');
								</script>";
							header("refresh:1;url=customer.php?cust_id=".$row2['customer_id']);
							$dbh = null;
							exit;
						}
						else if($cust_boss == 'boss')
						{
							
							$query2 = "SELECT * FROM rest.boss WHERE user_id = ".$row['user_id'];
							$result3 = $dbh->query($query2);
							if (!$result3) 
							{
								print "execution error: </br>";
								$error = $dbh->errorInfo();
								print($error[2]);
								exit;
							}
							$row2 = $result3->fetch();
							
							print "<script>
									alert('Success!!');
								</script>";
							header("refresh:1;url=boss.php?boss_id=".$row2['boss_id']);
							$dbh = null;
							exit;
						}
					}
					
					
					
				
				}
			
			}
			else if($sub_but == 'Cancel')
			{
				header("Location: index.php");
				$dbh = null;
				exit;
			}
		?>
		
	
	
	
	

	</body>
</html>