
$(document).ready(function(){
$(".open_comment").hide();
$(".open_comment1").hide();
$(".open_comment2").hide();
$(".open_comment3").hide();
$(".open_comment4").hide();
$(".open_comment5").hide();
$(".open_comment6").hide();
    $(".c1").click(function(){
        $(".open_comment").slideDown(1000);
    });
	
	$(".c2").click(function(){
        $(".open_comment").slideUp(1000);
    });
	$(".c3").click(function(){
        $(".open_comment1").slideDown(1000);
    });
	
	$(".c4").click(function(){
        $(".open_comment1").slideUp(1000);
    });
	
	$(".c5").click(function(){
        $(".open_comment2").slideDown(1000);
    });
	
	$(".c6").click(function(){
        $(".open_comment2").slideUp(1000);
    });
	
	$(".c7").click(function(){
        $(".open_comment3").slideDown(1000);
    });
	
	$(".c8").click(function(){
        $(".open_comment3").slideUp(1000);
    });
	
	$(".c9").click(function(){
        $(".open_comment4").slideDown(1000);
    });
	
	$(".c10").click(function(){
        $(".open_comment4").slideUp(1000);
    });
	$(".c11").click(function(){
        $(".open_comment5").slideDown(1000);
    });
	
	$(".c12").click(function(){
        $(".open_comment5").slideUp(1000);
    });
	$(".c13").click(function(){
        $(".open_comment6").slideDown(1000);
    });
	
	$(".c14").click(function(){
        $(".open_comment6").slideUp(1000);
    });
});

 
/*<!------more button functions------->*/



jQuery(function ($) {
$("#back_more").hide();
    $('#back_more1').on('click', function () {
        $("#back_more").slideToggle(600);
		var $el = $(this),
            textNode = this.firstChild;
        $el.find('i').toggleClass('glyphicon-minus-sign glyphicon-plus-sign');
        textNode.nodeValue =  ($el.hasClass('showArchieved') ? 'LESS ' : 'MORE ')
        $el.toggleClass('showArchieved');
		
    });
});



jQuery(function ($) {
$("#symptom_more").hide();
    $('#symptom_more1').on('click', function () {
		$("#symptom_more").slideToggle(600);
        var $el = $(this),
            textNode = this.firstChild;
        $el.find('i').toggleClass('glyphicon-minus-sign glyphicon-plus-sign');
        textNode.nodeValue =  ($el.hasClass('showArchieved') ? 'LESS ' : 'MORE ')
        $el.toggleClass('showArchieved');
		
    });
});



jQuery(function ($) {
$("#prevent_more").hide();
    $('#prevent_more1').on('click', function () {
        $("#prevent_more").slideToggle(600);
		var $el = $(this),
            textNode = this.firstChild;
        $el.find('i').toggleClass('glyphicon-minus-sign glyphicon-plus-sign');
        textNode.nodeValue =  ($el.hasClass('showArchieved') ? 'LESS ' : 'MORE ')
        $el.toggleClass('showArchieved');
		
    });
});
