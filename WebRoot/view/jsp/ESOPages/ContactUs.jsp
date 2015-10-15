<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container" style="margin-bottom:2%">
	<div class="col-sm-6">
		<h3 class="txcl_cnthead hidden-xs">Reach us by email or phone</h3>
		<h3 class="txcl_cnthead visible-xs">Reach us by email or phone</h3>
		<form class="form-horizontal" role="form">
			<div class="form-group bottom-marge">
			  <label class="control-label col-sm-4 txcl_cnt text-left" for="email">General inquiries:</label>
			  <div class="col-sm-8" >
				<p class="form-control-static p_cnt">1-888-555-5555</p>
			  </div>
			</div>
			<div class="form-group bottom-marge">
			  <label class="control-label col-sm-4 txcl_cnt text-left" for="email">Support Line:</label>
			  <div class="col-sm-8" >
				<p class="form-control-static p_cnt">1-888-555-5555</p>
			  </div>
			</div>
			<div class="form-group bottom-marge">
			  <label class="control-label col-sm-4 txcl_cnt text-left" for="email">Email:</label>
			  <div class="col-sm-8" >
				<p class="form-control-static p_cnt">info@eSecondOpinion.com</p>
			  </div>
			</div>
		</form>
		<h3 class="txcl_cnthead">Fill out our contact form</h3>
		<form action="contact-us" method="post">
			<div class="form-group">
      			<input type="text" class="form-control" name="name" id="name" placeholder="name">
			</div>
			<div class="form-group">
				<input type="email" class="form-control" name="email" id="email" placeholder="email address">
			</div>
			<div class="form-group">			   
			  <textarea class="form-control" rows="5" name="inquiry" id="comment" placeholder="inquiry"></textarea>
			</div>
			<button type="submit" class="btn bg_button textcolor_w" onclick="contact()">Submit</button>
			<script>function contact(){ alert("Thanks to Contact Us. Your information is saved with us. Please feel free for any queries");}</script>
			
 		</form>
	</div>
	<div class="col-sm-6 marge-5a7">
		<h3 class="txcl_cnthead">Our Location</h3>
		<span class="p_cnt">Greenwood Ave<br>Seattle, WA 98103</span>
	</div>
</div>
<!------------Section begins------------>
 
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
					<a href="#">
						<img src="view/helper/images/tc.png" alt="person" class="img-circle" width="50" height="50" />
					</a>
				</div>
				<div class="media-body">
					<a href="#"><h5 class="text-subhead textcolor_w"><strong>Terms & Conditions</strong></h5></a>
				</div>
			</div>
			<div class="media v-middle">
				<div class="media-left">
					<a href="#">
						<img src="view/helper/images/pp.png" alt="person" class="img-circle" width="50" height="50" />
					</a>
				</div>
				<div class="media-body">
					<a href="#"><h5 class="text-subhead textcolor_w"><strong>Privacy Policy</strong></h5></a>
				</div>
			</div>
			<div class="media v-middle">
				<div class="media-left">
					<a href="#">
						<img src="view/helper/images/dc.png" alt="person" class="img-circle" width="50" height="50" />
					</a>
				</div>
				<div class="media-body">
					<a href="#"><h5 class="text-subhead textcolor_w"><strong>Disclaimer Information</strong></h5></a>
				</div>
			</div>
		</div>		
	</div>
</section>