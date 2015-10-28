<%@ taglib prefix="s" uri="/struts-tags"%>

<script>
$(document).ready(function(){
var temp ='${userMsg}';
if(temp != "" )
alert(temp);
}
);
</script>
<script>
$(document).ready(function(){
var temp ='${crmUserMsg}';
if(temp != "" )
{alert(temp);}
});
</script>
<script>
$(document).ready(function(){
var temp ='${NewsLetterMsg}';
if(temp != "" )
alert(temp);
});
</script>
<script>
$(document).ready(function(){
var temp ='${contactusMsg}';
if(temp != "" )
{alert(temp);}
});
</script>
<section class="container common_sec marge_bot5 mp_0">
	<div class="container mp_0">
		<div class="col-md-6 col-sm-6"><h3 class="head-color">HOW IT WORKS</h3>
			<p class=" head-p">Let eSecondOpinion search the globe for alternative treatments, holistic approaches, and credible in-depth information from over 800 contributors, doctors, and healthcare professionals. Trustworthy products, reputable doctors, and reviews from people just like you may also be included in the results. We believe that your health takes more than a village . . . <strong style=" color:#1564a0">IT IS WORTH A WORLD OF SOLUTIONS!</strong></p>
		</div>
		
	 
		
		<div class="col-md-6 col-sm-6" style=" margin-top:20px">
					<!-----Login and registration page begins----------------->
					<s:if test="#session.userVO == null">	
									 <div style="position:relative">
												<ul class="nav nav-tabs toggle-color">
													 <li class="col-xs-6 active"><a  data-toggle="tab" href="#sectionA">LOGIN</a></li>
													<li class="col-xs-6"><a  data-toggle="tab" href="#sectionB">NEW USER</a></li>
												</ul>
									</div>
								<div class="tab-content"><!---------tab content starts------>
									<div id="sectionA" class="tab-pane fade in active"><!---------content of section A starts------>																
<%-- 										 ${userMsg}
					 				 	 ${crmUserMsg}			
										  --%>
										<form method="POST" action="userLogin" >
											<div class="form-group pos-relat">
												  <label for="email" class="head-color">Member Login - </label> <span style="color:#256ea6">Sign in to begin.</span>
												  <i class="glyphicon glyphicon-user left-inner-addon"></i>
												  <input type="email" class="form-control member-input" name="emailId" id="email" placeholder="username/ email address" required>
											</div>
											<div class="form-group pos-relat">
												   <i class="glyphicon glyphicon-lock"></i>
												  <input type="password" name="userPassword" class="form-control member-input" id="pwd" placeholder="password" required>
											</div>
											<div class="form-group pos-relat">
												<label class="textcolor_bl"><input type="checkbox"> Remember me </label>
											</div>
											<div class="form-group pos-relat col-sm-6 pad_0">
												  <button type="submit" value="Newuser"  class="btn bg_button textcolor_w">LOGIN</button>    
											</div>
											<div class="form-group pos-relat col-sm-6 psw">
												  <a href="forgot-pwd.jsp"  >Forgot password ?</a>
												 
											</div>
										</form>
									</div>
				<!---------content of section A ends------>

				<!-------content of section B starts--------->
				<s:if test="#session.crmUser == null">	
				 <div id="sectionB" class="tab-pane fade">
						<form method="POST" action="crmLogin" >
							<div class="form-group pos-relat">
								  <label for="email" class="head-color">CRM Login - </label> <span style="color:#256ea6">Sign in to begin.</span>
								  <i class="glyphicon glyphicon-user left-inner-addon"></i>
								  <input type="email" class="form-control member-input" name="emailId"  id="email" placeholder="username/ email address" required="required">
							</div>

							<div class="form-group pos-relat">
								  <button type="submit" value="Newuser"  class="btn bg_button textcolor_w" >Continue</button> 									   
							</div>
						</form>															
					</div><!---------tab content ends------>		
				</s:if>	
					</div><!-----Login and registration page ends----------------->
						</s:if>
							<s:elseif test="#session.userVO != null">
							 
								<div class="col-md-6 col-sm-6 mg_top20">
									<span style="color:#256ea6">Welcome  <s:property value="fname"/> <s:property value="lname"/>, You are Logged in.</span>
									<div class="row"><br>
									<form action="logout" >
										<div class="form-group col-sm-6" >									
											  <button type="submit" value="logout" class="btn bg_button textcolor_w">LOGOUT</button>    
										</div>	
									</form>
									<form action="profilePage" >
										<div class="form-group col-sm-6" >									
											  <button type="submit" value="myProfile" class="btn bg_button textcolor_w">MY PROFILE</button>    
										</div>	
									</form>	
									</div>	
									<form  method="POST" action="">
										<div class="input-group col-md-12 mg_top20">
											<input type="text" class="form-control search-query" placeholder="Search Here">
												<span class=" glyphicon glyphicon-search search-icon lft head-color"></span>
										</div>
									</form >								
								</div>							
							</s:elseif>			
		</div>		
	</div>
</section>
<!------------Section ends------------>
<hr class="hr">
<div class="text-center centerion-img "> 
<img src="view/helper/images/midlogo.png" width="50" height="50"  >
 </div>
<!------------Section2 begins------------>
<section class="container section2 mp_0">
	<div class="container mg_top20">
		<h2 class="textcolor_w hidden-xs">OUR MISSION</h2>
		<h4 class="marge-top10 visible-xs textcolor_w">OUR MISSION</h4>
		<p class="marge-rht20">Our mission is to <strong>globalize and centralize healthcare knowledge.</strong> Information about how to most effectively treat your ailment may have been discovered in Germany or widely used in India, but because you live in a certain city in the United States, you may not know about it. Why?</p>
<p class="marge-rht20">1. Sometimes, the old “tried and true” methods work fast and safely to heal an illness, but gets forgotten over time.</p>
<p class="marge-rht20">2. Certain cultures or nationalities may commonly treat a sickness effectively with a particular method, but this doesn’t get shared with doctors or families in other cities or countries.</p>
<p class="marge-rht20">3. When a scientist or doctor discovers something new, it may take years to reach the marketplace due to lack of distribution knowledge, poor advertising, language barriers, or red taped.</p>
<p class="marge-rht20">eSecondOpinion solves these problems by providing the most credible and reliable tool to research and find your alternatives, providers, and products, all in one place. We scour the globe to the find the newest and most cutting edge treatments, along with remining you of that cure from grandma that always worked so well. We don’t allow advertising anywhere on our site so no one can “buy” their way in, and the feedback is made by people just like you wo have experienced it and want to share their outcome.</p>
	</div>
	<h4 class="text-center textcolor_w"><span>OUR GUIDING PRINCIPLE IS</span> <strong>"TRUST"</strong>!<br><span>OUR PRIMARY GOAL IS TO HELP YOU FIND THE BEST SOLUTION FOR YOUR</span> <strong>"OPTIMAL HEALTH"</strong>! </h4>
	
</section>
<!------------Section2 ends------------>
<!------------Section3 begins------------>
<section class="container common_sec mp_0">
	<div class="container mp_0 section3-marge">
	<h4 class="text-center head-color">WHAT WE OFFER</h4>
	<p class="text-center" style="margin-bottom:3%; color:5f5f5f">These are just a few of the many steller features included in eSecondOpinion.</p>
	<div class="col-md-4 col-sm-4 col-xs-12">
		<div class="panel panel-default paper-shadow section3" data-z="0.5">
                                <div class="panel-heading panel-height bgcolor section3">
                                    <div class="circle circle-border">
										<div class="circle-inner">
											<img src="view/helper/images/treat.png" alt="person" class="offer-img"/>
										</div>
									</div>
									<h4 class="text-center subhead-color">TREATMENT OPTIONS</h4>
									<p>We scour the globe and bring the best treatment modalities to you from other countries and cultures. Herbals, Ayurvedics, nutriceuticals, nanotechnology, cutting edge break throughs, and much more.</p>
                                </div>
                                
                            </div>
 	</div>
	<div class="col-md-4 col-sm-4 col-xs-12">
		<div class="panel panel-default paper-shadow section3" data-z="0.5">
                                <div class="panel-heading panel-height bgcolor section3">
                                    <div class="circle circle-border">
										<div class="circle-inner">
											<img src="view/helper/images/community.png" alt="person" class="offer-img1" /> 
										</div>
									</div>
									<h4 class="text-center subhead-color">COMMUNITY</h4>
									<p>Ask questions, discuss treatment plans, request referrals, and learn more about the alternatives offered from like-minded individuals.</p>
                                </div>
                                
                            </div>
 	</div>
 	 
	<div class="col-md-4 col-sm-4 col-xs-12">
		<div class="panel panel-default paper-shadow section3" data-z="0.5">
                                <div class="panel-heading panel-height bgcolor section3">
                                    <div class="circle circle-border">
										<div class="circle-inner" style="top:15px">
											<img src="view/helper/images/market.png" alt="person" class="offer-img1"/> 
										</div>
									</div>
									<h4 class="text-center subhead-color">MARKETPLACE</h4>
									<p>Check out some of the options and unique products discussed and try them for yourself.</p>
                                </div>
                                
                            </div>
 	</div>
 	
	</div>	 
</section>
<!------------Section3 ends------------>
<hr class="hr">
<div class="text-center centerion-img "> 
<img src="view/helper/images/message_icon.png" width="50" height="50"  >
 </div>
<!------------Section4 begins------------>
<section class="container contact contact-section mp_0">
	<div class="col-md-12 text-center">
		<p class="section4-p">Sign up for our free newsletter, and stay up to date with eSecondOpinion.</p>
		<form class="form-inline" action = "newsLetterSave" >
			<div class="form-group marge-rhtm3">		 
			  <input type="text" class="form-control" name="name"  id="name" placeholder="Your Name">
			</div>
			<div class="form-group marge-rhtm3">		   
			  <input type="email" class="form-control" name="email"  id="email" placeholder="Your Email">
			</div>				 
			<button type="submit" class="btn btn-success">Sign Up</button>
	  </form>
  </div>
  <div class="col-md-12 col-sm-12 col-xs-12 textcolor_w">
  	<p class="text-center"><strong>JOIN THE CONVERSATION </strong> Follow us on social media for special announcements and  upcoming events.</p>
  </div>
  <div class="col-md-12 col-sm-12 col-xs-12 text-center marge-bottom" style="margin-bottom:3%; margin-top:-3%;">
  	<div class="social">
  	 <a href="https://www.facebook.com/" class="fb animate bounceIn animated" data-delay="1400" title="Like us on Facebook"></a>
	 <a href="https://www.youtube.com/" class="yt animate bounceIn animated" data-delay="1400" title="Watch us on Youtube"></a>
	 <a href="https://www.linkedin.com/" class="li animate bounceIn animated" data-delay="1400" title="Get connected on LinkedIn"></a>
	 <a href="https://plus.google.com/" class="gp animate bounceIn animated" data-delay="1400" title="Follow us on Google+"></a>
	</div>
  </div>
</section>
<!------------Section4 ends------------>
<!------------Section5 begins------------>
<section class="container col-sm-12 section5 mp_0">
	<div class="container mp_0">
		<div class="col-sm-3 text-center">
			<img src="view/helper/images/bottom_logo.png">
			<p class="text-center head-p1">eSecondOption, LLC<br>7511 Greenwood Ave N, #307<br>Seattle, WA 98103</p>
		</div>
				<div class="col-sm-6 mg_10a">
					<p class="lh20">eSecondOpinion does not provide medical advice, 
		diagnosis or treatment. Please seek professional 
		medical treatment in case of emergency.</p>
		
		
		<p class="lh20 ">Never disregard professional medical advice or delay 
		in seeking it because of something you have read the eSeondOpinion site.</p>	
				</div>
		<div class="col-sm-3">
			 <div class="media v-middle">
				<div class="media-left">
					<a href="javaScript:;">
						<img src="view/helper/images/tc.png" alt="person" class="img-circle" width="50" height="50" />
					</a>
				</div>
				<div class="media-body">
					<a href="javaScript:;"><h5 class="text-subhead textcolor_w"><strong>Terms & Conditions</strong></h5></a>
				</div>
			</div>
			<div class="media v-middle">
				<div class="media-left">
					<a href="javaScript:;">
						<img src="view/helper/images/pp.png" alt="person" class="img-circle" width="50" height="50" />
					</a>
				</div>
				<div class="media-body">
					<a href="javaScript:;"><h5 class="text-subhead textcolor_w"><strong>Privacy Policy</strong></h5></a>
				</div>
			</div>
			<div class="media v-middle">
				<div class="media-left">
					<a href="javaScript:;">
						<img src="view/helper/images/dc.png" alt="person" class="img-circle" width="50" height="50" />
					</a>
				</div>
				<div class="media-body">
					<a href="javaScript:;"><h5 class="text-subhead textcolor_w"><strong>Disclaimer Information</strong></h5></a>
				</div>
			</div>
		</div>		
	</div>
</section>
