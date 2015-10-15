<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript">

 $(document).ready(function(){
var tabId ='${selectedTab}';
$("#"+tabId+"Id").show();

if(tabId == "homeTab"){
	$("#headerIds").addClass("head-image");
	$("#headerIds").removeClass("acne-head");
}
else{
$("#headerIds").removeClass("head-image");
	$("#headerIds").addClass("acne-head");
}
//$("#"+Id).parent().addClass("active");
});

function homeAction(){
window.location="welcome";

}

function aboutusAction(){
window.location="AboutUs";
}

function breakingAction(){
window.location="breakingNews";
}

function contactAction(){
window.location="contactUs";
}
</script>

<div id="homeTabId" style="display:none;">
<nav class="navbar navbar-default head_nav" role="navigation">
	<div class="container">
   <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" 
         data-target="#example-navbar-collapse">
         <span class="sr-only">Toggle navigation</span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="welcome"><img src="view/helper/images/logo1.png" class="head_logo"></a>
   </div>
   <div class="collapse navbar-collapse" id="example-navbar-collapse">
      <ul class="nav navbar-nav">
         <li class="active"><a href="welcome" onclick="homeAction();">HOME</a></li>
         <li><a href="javaScript:;" onclick="aboutusAction();">ABOUT US</a></li>
		 <li><a href="javaScript:;" onclick="breakingAction();">BREAKING NEWS</a></li>
         <li class="border-rht" ><a href="javaScript:;" onclick="contactAction();">CONTACT US</a></li>
      </ul>
   </div>
   </div>
</nav>


<div class="welcome">
		<h1 class="text-center textcolor_w hidden-xs">WELCOME TO eSecondOpinion</h1>
		<h3 class="text-center textcolor_w visible-xs">WELCOME TO eSecondOpinion</h3>
		<p class="text-center textcolor_w font-sz24 font-wt100">Your health. A world of solutions.</p>
	</div>

<div class="container slider">
	  <br>
	  <div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
		  <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		  <li data-target="#myCarousel" data-slide-to="1"></li>
		  <li data-target="#myCarousel" data-slide-to="2"></li>
		  <li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>
	
		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
		  <div class="item active">
			<img src="view/helper/images/images (2).jpg" alt="Chania" width="100%" height="200">
		  </div>
	
		  <div class="item">
			<img src="view/helper/images/images (4).jpg" alt="Chania" width="100%" height="200">
		  </div>
		
		  <div class="item">
			<img src="view/helper/images/images (3).jpg" alt="Flower" width="100%" height="200">
		  </div>
	
		  <div class="item">
			<img src="view/helper/images/img1.jpg" width="100%" height="200">
		  </div>
		</div>
	
		<!-- Left and right controls -->
		<button href="#myCarousel" role="button" data-slide="next" class="btn right-control">
		  <span class="glyphicon glyphicon-chevron-right textcolor_w" aria-hidden="true"></span>
		  <span class="sr-only">Next</span>
		
		</button>
		<button href="#myCarousel" role="button" data-slide="prev" class="btn left-control">
		  <span class="glyphicon glyphicon-chevron-left textcolor_w" aria-hidden="true"></span>
		  <span class="sr-only">Previous</span>
	</button>
		
	  </div>
	</div>

</div>


<div  id="aboutUsTabId" style="display: none;">
<div class="acne-head">
<!------------Header----------->
<nav class="navbar navbar-default head_nav" role="navigation">
	<div class="container">
   <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" 
         data-target="#example-navbar-collapse">
         <span class="sr-only">Toggle navigation</span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
      </button>
    <a class="navbar-brand" href="welcome"><img src="view/helper/images/logo1.png" class="head_logo"></a>
   </div>
   <div class="collapse navbar-collapse" id="example-navbar-collapse">
      <ul class="nav navbar-nav">
          <li><a href="welcome" onclick="homeAction();">HOME</a></li>
         <li class="active"><a href="javaScript:;" onclick="aboutusAction();">ABOUT US</a></li>
		 <li><a href="javaScript:;" onclick="breakingAction();">BREAKING NEWS</a></li>
         <li class="border-rht" ><a href="javaScript:;" onclick="contactAction();">CONTACT US</a></li>
      </ul>
   </div>
   </div>
</nav>
	<div class="container home_sec"><h6 class="text-center textcolor_w">HOME <span class="glyphicon glyphicon-chevron-right"></span><strong style="color:#669933"> ABOUT-US</strong></h6></div>
	<div class="container acne-opacity">
	<h1 class="hidden-xs text-center textcolor_w"> About Us</h1>
	<h3 class="visible-xs text-center textcolor_w"> About Us</h3>
	</div>
	<div class="container home_foot">
		<p class="text-center font-sz18 hidden-xs textcolor_w">Committed to finding treatment solutions.</p>
		<p class="text-center visible-xs textcolor_w">Committed to finding treatment solutions.</p>
	</div>

<!-----------Header ends--------------->
</div>
</div>

<div id="breakingNewsTabId" style="display:none;">
<div class="acne-head" id="top">
<!------------Header----------->
<nav class="navbar navbar-default head_nav" role="navigation">
	<div class="container">
   <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" 
         data-target="#example-navbar-collapse">
         <span class="sr-only">Toggle navigation</span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index.jsp"><img src="view/helper/images/logo1.png" class="head_logo"></a>
   </div>
   <div class="collapse navbar-collapse" id="example-navbar-collapse">
      <ul class="nav navbar-nav">
          <li><a href="welcome" onclick="homeAction();">HOME</a></li>
         <li><a href="javaScript:;" onclick="aboutusAction();">ABOUT US</a></li>
		 <li id="BREAKINGId" class="active"><a href="javaScript:;" onclick="breakingAction();">BREAKING NEWS</a></li>
         <li class="border-rht" ><a href="javaScript:;" onclick="contactAction();">CONTACT US</a></li>
      </ul>
   </div>
   </div>
</nav>
	 
	<div class="container home_sec"><h6 class="text-center textcolor_w">HOME <span class="glyphicon glyphicon-chevron-right"></span><strong style="color:#669933"> BREAKING NEWS</strong></h6></div>
	<div class="container acne-opacity">
	<h1 class="hidden-xs text-center textcolor_w"> Breaking News</h1>
	<h3 class="visible-xs text-center textcolor_w"> Breaking News</h3>
	</div>
	<div class="container home_foot">
    <h4 class="text-center textcolor_w hidden-xs">Find out whats happening in eSecondOpinion.</h4>
    <h5 class="text-center textcolor_w visible-xs">Find out whats happening in eSecondOpinion.</h5>
    </div>
</div>


</div>



<div id="contactUsTabId" style="display:none;">

<div class="acne-head">
<!------------Header----------->
<nav class="navbar navbar-default head_nav" role="navigation">
	<div class="container">
   <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" 
         data-target="#example-navbar-collapse">
         <span class="sr-only">Toggle navigation</span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index.jsp"><img src="view/helper/images/logo1.png" class="head_logo"></a>
   </div>
   <div class="collapse navbar-collapse" id="example-navbar-collapse">
      <ul class="nav navbar-nav">
          <li><a href="welcome" onclick="homeAction();">HOME</a></li>
         <li><a href="javaScript:;" onclick="aboutusAction();">ABOUT US</a></li>
		 <li><a href="javaScript:;" onclick="breakingAction();">BREAKING NEWS</a></li>
         <li class="active border-rht" ><a href="javaScript:;" onclick="contactAction();">CONTACT US</a></li>
      </ul>
      
   </div>
   </div>
</nav>
	 
	<div class="container home_sec"><h6 class="text-center textcolor_w">HOME <span class="glyphicon glyphicon-chevron-right"></span><strong style="color:#669933"> CONTACT-US</strong></h6></div>
	<div class="container acne-opacity">
	<h1 class="hidden-xs text-center textcolor_w"> Contact Us</h1>
	<h3 class="visible-xs text-center textcolor_w"> Contact Us</h3>
	</div>
	<div class="container home_foot"><h4 class="text-center textcolor_w">Have a question? We have the answer.</h4></div>
</div>
</div>


