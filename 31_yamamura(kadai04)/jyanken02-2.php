<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

	<?php
	$hand = $_POST['janken'];
	echo $hand;

	// 相手の手を用意　配列で
	$teki = ['ぐー', 'ちょき', 'ぱー'];

	//配列にアクセスできるようにランダムの数を、０、１、２の３こ表示できるようにmt_randを使う
	$randNum = mt_rand(0,2);

	// 配列のぐー、ちょき、ぱーにアクセスするには$teki[0] でぐー、$teki[1] でちょき, $teki[2] でぱー　となるので、そこにランダムで出てくる数字と組み合わせる
	echo $teki[$randNum];

	// 上の準備をしたのちにif分で比較する

	// ぐー
	if($hand == 'goo' && $teki[$randNum] == 'ぐー'){
		$result = 'あいこ';
		$kekka = 'お互いあいこでした';
	}else if($hand == 'goo' && $teki[$randNum] == 'ちょき'){
		$result =  'かち';
		$kekka = 'あなたのかちです';
	}else if($hand == 'goo' && $teki[$randNum] == 'ぱー'){
		$result = "まけ";
		$kekka = 'あなたのまけです';
	}

	// ちょき
	if($hand == 'choki' && $teki[$randNum] == 'ぐー'){
		$result = 'まけ';
		$kekka = 'あなたのまけです';
	}else if($hand == 'choki' && $teki[$randNum] == 'ちょき'){
		$result =  'あいこ';
		$kekka = 'お互いあいこでした';
	}else if($hand == 'choki' && $teki[$randNum] == 'ぱー'){
		$result = "かち";
		$kekka = 'あなたのかちです';
	}

	// ぱー
	if($hand == 'paa' && $teki[$randNum] == 'ぐー'){
		$result = 'かち';
		$kekka = 'あなたのかちです';
	}else if($hand == 'paa' && $teki[$randNum] == 'ちょき'){
		$result =  'まけ';
		$kekka = 'あなたのまけです';
	}else if($hand == 'paa' && $teki[$randNum] == 'ぱー'){
		$result = "あいこ";
		$kekka = 'お互いあいこでした';
	}

?>

	<h1>janken.php(結果)</h1>
	<div class="main">
		<h2>あなた :<? echo $result?></h2>
		<h2>結果は ……<? echo $kekka?></h2>
		<p>
			<a href="janken02-2.php">もう一回勝負！</a>
		</p>
	</div>  
</body>
</html>