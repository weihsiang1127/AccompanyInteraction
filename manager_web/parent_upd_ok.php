<?php
	session_start();
	include("conn.php");
	$sql="update `parent` set `password`='$_GET[password]' where `parent_id`='$_GET[user]'";
	$upd=mysqli_query($conn,$sql);
	if($upd){
		header("Location:main.php");
		$_SESSION['url']="p";
	}else{
		echo "<script>修改失敗!!</script>";
	}
?>