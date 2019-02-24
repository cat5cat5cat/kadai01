//alert(11111);
//console.log("はじめてのジャバスクリプト");
//console.log("5+3");
//console.log("3");
//console.log("5-1");
//console.log(23+5);
//console.log(2000-1800);
//console.log("18+5");
//var name="山村綾"
//console.log("自分の名前を表示");
//console.log(name);
//var point=90;
//if(point>=80){console.log("「素晴らしい！おめでとう！」");}
//else{console.log("「もっと頑張りましょう！」");}
//var point2=60;
//if(point2<=80){console.log("「もっと頑張りましょう！」");}
//else{console.log("「素晴らしい！おめでとう！」");}

//var arr=["1","2","3"];
  //  var hand=Math.floor(Math.random()*arr.length);
   // console.log(arr[hand]);

//var kazu=[10,20,30,40,50,60,70,80,90,100];
//var jyouken=Math.floor(Math.random()*kazu.length);
//if(kazu[jyouken]>=90){
  //  console.log(kazu[jyouken],"「素晴らしい！おめでとう！」");
//}else if(60<=kazu[jyouken] &&kazu[jyouken] <90){
  //  console.log(kazu[jyouken],"「よくできました！」");
//}
//else if(40<=kazu[jyouken]&&kazu[jyouken]<60){
  //  console.log(kazu[jyouken],"「これからですね！」");
//}
//else if(10<=kazu[jyouken]&&kazu[jyouken]<40){
  //  console.log(kazu[jyouken],"「頑張りましょう！」");
//}
//else {
   // console.log(kazu[jyouken],"「追試！」");
//}//
//これは０から４までの5パターンの乱数
//var random = Math.floor(Math.random()*5);
//console.log(random);
//if(random==0){
    //console.log('1だよ');
//}
//else if(random==1){
    //console.log('2だよ')
//}


//$(document).ready(function(){ 
  //  $('#test').on("click",function(){ 
    //$('#test').html('ああああ');
    //$('#test').css('color','#f00');
    //$('#test').fadeOut(2000);
    //$('#test').fadeIn(2000);
    //// });
//})




$(document).ready(function(){
  var num =1;
  $('#testA', '#testB', '#testC').fadeIn(16000);
  $('#testA', '#testB', '#testC').css('background', 
  '#000');
  $("p").css("color", "#fff");
  $('#ex p:nth-child(even)').css('background', '#fff');
});















