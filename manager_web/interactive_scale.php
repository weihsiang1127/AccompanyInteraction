<?php  
	include('conn.php');
?>
<html>
    <header>
		<title>互動量表管理</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/table.css">
		<link rel="stylesheet" type="text/css" href="css/button.css">
		<style>
		
		</style>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script>

		</script>
	</header>
	<body>
		</p>
		<table align='center' width='30%'>
			
			<?php
				$sel_interactive_scale=mysqli_query($conn,"SELECT * FROM `interactive_scale`");
				$n = mysqli_num_rows($sel_interactive_scale);
				if($n==0){
					echo "<h1 align='center'><font color='#FF3333'>目前無紀錄資料!!</font></h1>";
				}else{
			?>
					<tr>
						<th width="30%">題目編號</th>
						<th width="70%">題目內容</th>
					</tr>
			<?php		
				}
				while($sel_interactive_scale_ok=mysqli_fetch_array($sel_interactive_scale)){
					echo "
						<tr>
							<td>$sel_interactive_scale_ok[q_id]</td>
							<td>$sel_interactive_scale_ok[question]</td>
						</tr>
					";
				}
			?>
		</table>
	</body>
</html>