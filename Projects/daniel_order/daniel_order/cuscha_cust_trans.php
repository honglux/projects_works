 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$customer_id = $_GET['customer_id'];
	$sub_but = $_POST['sub_but'];
	$customer_name = $_POST['customer_name'];
	$customer_address = $_POST['customer_address'];
	$customer_age = $_POST['customer_age'];
	$customer_gender = $_POST['customer_gender'];
	$customer_ssn = $_POST['customer_ssn'];
	
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
		
		<?php
			if($sub_but == 'Submit')
			{
				if($customer_name == '')
				{
					print "<script>
							alert('Please enter your name!!');
						</script>";
					header("refresh:1;url=cust_info_chang.php?customer_id=".$customer_id);
					$dbh = null;
					exit;
				}
				else
				{
					$excu_query = "UPDATE `rest`.`customer` SET `customer_name`='".$customer_name."', `customer_address`='".$customer_address."', `customer_age`='".$customer_age."', `customer_gender`='".$customer_gender."', `customer_ssn`='".$customer_ssn."' WHERE `customer_id`='".$customer_id."';";
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
					header("refresh:1;url=customer.php?cust_id=".$customer_id);
					$dbh = null;
					exit;
				}
			
			}
			else if($sub_but == 'Cancel')
			{
				header("Location: customer.php?cust_id=".$customer_id);
				$dbh = null;
				exit;
			}
		?>
		
	
	
	
	

	</body>
</html>