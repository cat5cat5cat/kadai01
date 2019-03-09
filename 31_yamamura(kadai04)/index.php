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
		<form id="janken" method="POST" action="result.php">
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