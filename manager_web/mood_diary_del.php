<?php
	session_start();
	include("conn.php");
	$sql="delete from `diary` where `diary_id`='$_GET[id]'";
	$del=mysqli_query($conn,$sql);
	if($del){
		header("Location:main.php");
		$_SESSION["url"]="diary";
	}else{
		echo "<script>刪除失敗!!</script>";
	}
?>