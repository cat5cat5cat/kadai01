
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
	//（３）　
	$my_hand = array('グー', 'チョキ', 'パー');
	$my_hand_jp = array('グー', 'チョキ', 'パー');
	$aite_hand_jp = array('グー', 'チョキ', 'パー');
	//（４）　
	$battle = $my_hand[$hand] - $aite_hand;
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
	<div class="main">
		<h2>あなた : $my_hand_out 相手 : $aite_hand_out </h2>
		<h2>結果は …… $result </h2>
		<p>
			<a href="janken02-2.php">もう一回勝負！</a>
		</p>
	</div>  
</body>
</html>