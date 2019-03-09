<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<?php
	$a = $_GET["janken"];
	echo $a;

	$rand = rand();
	if($a == "guu"){
		if($rand == "gu"){
			echo 'あいこ';
		}else if($rand == "pa"){
			echo '勝ち';
		}else{

		}
	}
	    if($a == "guu"){
		if($rand == "gu"){
			echo 'あいこ';
		}else if($rand == "pa"){
			echo '勝ち';
		}else{

		}	
	}
	if($a == "guu"){
		if($rand == "gu"){
			echo 'あいこ';
		}else if($rand == "pa"){
			echo '勝ち';
		}else{

		}	
	}
	//（３）　
	$my_hand = array('グー', 'チョキ', 'パー');
	$my_hand_jp = array('グー', 'チョキ', 'パー');
	$aite_hand_jp = array('グー', 'チョキ', 'パー');
	//（４）　
	// $battle = $my_hand[$hand] - $aite_hand;
	// echo $battle
	//（５）　
	switch ($battle) {
		case 'グー' :
		case 'チョキ' :
			$result = "あなたの勝ちです。";
			break;
		case 'パー'  :
			$result = "引き分けです。";
			break;
		default :
			$result = "あなたの負けです……";
    }
    ?>
	<h1>janken.php(結果)</h1>
	<!-- <h1><?php echo $hand; ?></h1> -->
	<div class="main">
		<h2>あなた :<?echo $my_hand_out;?> 相手 : <? echo $aite_hand_out;?> </h2>
		<h2>結果は …… <? echo $result;?> </h2>
		<p>
			<a href="janken02-2.php">もう一回勝負！</a>
		</p>
	</div>  
</body>
</html>