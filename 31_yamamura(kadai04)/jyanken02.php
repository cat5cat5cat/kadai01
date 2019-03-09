<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<title> janken.php </title>
	<link rel="stylesheet" href="css_main.css" type="text/css" media="all" />
</head>
<body>
	<h1>janken.php</h1>
	<div class="main">
		<form id="janken" method="GET" action="jyanken02-2.php">
		<h2>じゃんけん？</h2>
		<div>
			<select name="janken">
				<option value="goo">グー！</option>
				<option value="choki">チョキ！</option>
				<option value="paa">パー！</option>
			</select>
			<br />
			<br />
			<input type="submit" value="勝負！" />
		</div>
		</form>
	</div>
	<script>
		$(function () {
			$('button').click(function () {
					$('img').hide();
			});
	});
	</script>
</body>
</html> -->

<!-- ここから上は古いhtml仕様の書き方なので使わない！というか現在はこの書き方は推奨されていないので注意しておきましょう☺️ -->


<!DOCTYPE html>
<html lang='ja'>

<head>
	<meta charset='UTF-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1.0'>
	<meta http-equiv='X-UA-Compatible' content='ie=edge'>
	<title>Document</title>
</head>
<!-- bodyの中身は同じ -->
<body>
	<h1>janken.php</h1>
	<div class="main">
		<form id="janken" method="POST" action="jyanken02-2.php">
			<h2>じゃんけん？</h2>
			<div>
				<select name="janken">
					<option value="goo">グー！</option>
					<option value="choki">チョキ！</option>
					<option value="paa">パー！</option>
				</select>
				<br />
				<br />
				<input type="submit" value="勝負！" />
			</div>
		</form>
	</div>

	<div class='hako' style="width: 150px; height: 120px; background: tomato;">
		上のタグからグー、チョキ、パーを選びましょう！
		読んだらここをクリックしてね！
	</div>

	<!-- jqueryが動かないのはcdnがないからです☺️ -->
	<!-- https://www.sejuku.net/blog/65045　の記事をみて授業を思い出しましょう！ -->
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>

	<script>
		$(function () {
			// alert(1) jqueryのcdnを読み込むことで使えるようになります！まずはalert()とかを使って表示できるところからやるといった授業内容を思い出しましょう☺️

			// classのときは$('.xxx') ドットから始まり、idの時は$('#xxx') ハッシュから始まります♫
			$('.hako').click(function () {
				$('.hako').hide();
			});
		});
	</script>
</body>
<!-- bodyの中身は同じ -->

</html>