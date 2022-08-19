<?php  
	include('conn.php');
?>
<html>
    <header>
		<title>學生影片上傳紀錄</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/table.css">
		<link rel="stylesheet" type="text/css" href="css/button.css">
		<style>
			.button_upd {
				border: 2px solid #5599FF;
			}
			.button_upd:hover {
				background-color: #5599FF;
				color: white;
			}
			.button_del {
				border: 2px solid #FF3333;
			}
			.button_del:hover {
				background-color: #FF3333;
				color: white;
			}
		</style>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script>
			function qq(){
				var s1;
				if(document.getElementById("s1")){
					s1=document.getElementById("s1").value;
				}else{
					s1=1;
				}
				/*var stu=document.getElementById("stu").value;
				if(stu==""){
					show_apphistory('video.php?n='+s1);
				}else if(stu!=""){
					show_apphistory('video.php?stu='+stu+"&n="+s1);
				}*/
				show_apphistory('video.php?n='+s1);
			}
		</script>
	</header>
	<body>
		</p>
		<table align='center' width='50%'>
			
			<?php
				if(isset($_GET['n'])){
					$n=($_GET['n']*10)-10;
					$sel_video=mysqli_query($conn,"SELECT * FROM `video` ORDER BY `write_time` ASC limit ".$n.",10");
				}else{
					$sel_video=mysqli_query($conn,"SELECT * FROM `video` ORDER BY `write_time` ASC limit 0,10");
				}
				//$sel_video=mysqli_query($conn,"SELECT * FROM `video` ORDER BY `write_time` ASC ");
				$n = mysqli_num_rows($sel_video);
				if($n==0){
					echo "<h1 align='center'><font color='#FF3333'>目前無紀錄資料!!</font></h1>";
				}else{
			?>
					<tr>
						<th width="30%">學號</th>
						<th width="30%">影片網址</th>
						<th width="30%">上傳時間</th>
						<th width="10%"></th>
					</tr>	
			<?php
				}
				while($sel_video_ok=mysqli_fetch_array($sel_video)){
					echo "
						<tr>
							<td>$sel_video_ok[student_id]</td>
							<td><a href='$sel_video_ok[video_url]' target='_blank'>影片連結</a></td>
							<td>$sel_video_ok[write_time]</td>
							<td>
								<button class='button button_del' onclick=\"show('video_del.php?id=$sel_video_ok[video_id]')\"><b>刪除</b></button>
							</td>
						</tr>
					";
				}
			?>
		</table>
		<?php
			//查詢資料筆數
			$sel_number=mysqli_query($conn,"SELECT * FROM `video`");
			$data_number=mysqli_num_rows($sel_number);
			if($data_number!=0){
				$data_number_remove=intval($data_number/10);
				$data_number_remain=$data_number%10;
				$data_number_result=0;
				//echo "<script>alert('$data_number_remove')</script>";
				if($data_number_remove<1 && $data_number_remain!=0){
					$data_number_result=1;
				}else if($data_number_remove>=1 && $data_number_remain==0){
					$data_number_result=$data_number_remove;
				}else if($data_number_remove>=1 && $data_number_remain!=0){
					$data_number_result=$data_number_remove+1;
				}
				echo "
					<p/>
				";
				//if($n!=0){
					echo "
						<center>
							<select id='s1' onChange='qq();' style='font-size: 20px;'>
					";
						for($i=1;$i<=$data_number_result;$i++){
							if(isset($_GET['n'])){
								if($i==$_GET['n']){
									echo "<option value='".$i."' selected>第".$i."頁</option>";
								}else{
									echo "<option value='".$i."' >第".$i."頁</option>";
								}
							}else{
								if($i==1){
									echo "<option value='".$i."' selected>第".$i."頁</option>";
								}else{
									echo "<option value='".$i."' >第".$i."頁</option>";
								}
							}
						}
						echo "	
							</select>
						</center>
					";
				//}
			}
		?>
	</body>
</html>