$(document).ready(function(){
    var num =1;
    $('#ex').fadeIn(4000);
    $('#testA', '#testB', '#testC').css('background', '#000');
    $("p").css("color", "#fff");
    $('#ex p:nth-child(even)').css('background', '#fff');
  });