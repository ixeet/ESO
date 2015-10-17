<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="container mp_0" style="margin:2% auto">
	<div class="col-sm-4 col-md-3">
		 <form role="form">
			<div class="input-group col-md-12 col-xs-12">
				<input type="text" class="form-control search-query" placeholder="Search Here">
					<span class=" glyphicon glyphicon-search search-icon head-color"></span>
			</div>
		</form><br>
		<div class="panel" id="panel">
                        <div class="panel-heading">
                            <h4 class="panel-title">POPULAR NEWS POSTS</h4>
							<ul>
								<li></li>
							</ul>
                        </div>
                        <ul class="list-group list-group-menu">
                            <li class="list-group-item">
                                <a href="#"><i class="fa fa-chevron-right fa-fw"></i> Breaking news Video headline</a>
                            </li>
                            <li class="list-group-item active">
                                <a href="#"><i class="fa fa-chevron-right fa-fw"></i> Breaking news article #1 head</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#"><i class="fa fa-chevron-right fa-fw"></i> Breaking news article #2 headline</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#"><i class="fa fa-chevron-right fa-fw"></i> Breaking News Article #3 headline</a>
                            </li>
							<li class="list-group-item">
							</li>
                        </ul>
        </div>
		<div class="panel" id="panel1" data-z="0.5">
						<div class="panel-heading">
                            <h4 class="panel-title">RECENT ARTICLE POSTS</h4>
							<ul>
								<li></li>
							</ul>
                        </div>
                        <ul class="list-group">
                        	<s:iterator value="#session.recentlist">
                            <li class="list-group-item media v-middle">
                                <div class="media-left">
                                    <div class="icon-block half img-circle bg-grey-300">
                                       <img src="C:/ESO/breakingNews/images/<s:property value="fileName"/>" alt="person" class="img-circle" width="50" height="50" /> 
                                    </div>
                                </div>
                                <div class="media-body">
                                    <h4 class="text-subhead margin-none">
                                        <a href="#" class="link-text-color"><s:property value="newsTitle"/></a>
                                    </h4>
                                    <div class="text-light text-caption">
                                        <s:property value="lastUpdtTm"/> by <s:property value="authorName"/>                                        
                                    </div>
                                </div>
							</li>
							</s:iterator>
                           <!--  <li class="list-group-item media v-middle">
                                <div class="media-left">
                                    <div class="icon-block half img-circle bg-grey-300">
                                       <img src="view/helper/images/dance.jpg" alt="person" class="img-circle" width="50" height="50" /> 
                                    </div>
                                </div>
                                <div class="media-body">
                                    <h4 class="text-subhead margin-none">
                                        <a href="#" class="link-text-color">Article Posted</a>
                                    </h4>
                                    <div class="text-light text-caption">
                                        september 9 2015 by admin 
                                        
                                    </div>
                                </div>
							</li>
							<li class="list-group-item media v-middle">
                                <div class="media-left">
                                    <div class="icon-block half img-circle bg-grey-300">
                                       <img src="view/helper/images/dance.jpg" alt="person" class="img-circle" width="50" height="50" /> 
                                    </div>
                                </div>
                                <div class="media-body">
                                    <h4 class="text-subhead margin-none">
                                        <a href="#" class="link-text-color">Article Posted</a>
                                    </h4>
                                    <div class="text-light text-caption">
                                        september 9 2015 by admin 
                                        
                                    </div>
                                </div>
							</li>
							<li class="list-group-item media v-middle">
                                <div class="media-left">
                                    <div class="icon-block half img-circle bg-grey-300">
                                       <img src="view/helper/images/dance.jpg" alt="person" class="img-circle" width="50" height="50" /> 
                                    </div>
                                </div>
                                <div class="media-body">
                                    <h4 class="text-subhead margin-none">
                                        <a href="#" class="link-text-color">Article Posted</a>
                                    </h4>
                                    <div class="text-light text-caption">
                                        september 9 2015 by admin 
                                        
                                    </div>
                                </div>
							</li> -->
						</ul>
		</div>
					
	</div>
	<div class="col-sm-8 col-md-9 col-xs-12">
		
		 <div>
		 <!-----Article1 begins---------->
		 <div id="video" >
				 
				<iframe  class="embed-responsive-item" src="https://www.youtube.com/embed/-o-w06DKr0A" frameborder="0" allowfullscreen></iframe>
				
			</div>	
			<div id="v1" class="marge-5a7">
				<h1 class="head-color hidden-xs">Video Headline</h1>
				<h3 class="head-color visible-xs">Video Headline</h3>
				<p class="textcolor_gy"> Some descriptive text about the video.....Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur at lacus et arcu blandit dapibus vel sed justo. Vivamus mi dui, rhoncus in diam at, vestibulum varius nisl. Ut nec nibh condimentum, iaculis ligula at, ornare nisi. Suspendisse tempus iaculis imperdiet. Aliquam erat volutpat. Fusce quis viverra dui, eget consectetur magna. Phasellus sollicitudin velit ante, sed sollicitudin dui aliquam id. Donec tempor fermentum mauris, sed sagittis ante faucibus nec. Praesent ac eleifend urna. Aliquam quis tellus ac dolor suscipit sodales. 
</p>
			</div>
			
		 
		 	<div id="article">
				<img src="view/helper/images/break_img.jpg" class="img-responsive">
				<div class="left-div">
					<h3 class="magre_0 hidden-xs">JUN<br><strong>2</strong></h3>
                    <h5 class="magre_0 visible-xs">JUN<br><strong>2</strong></h5>
				</div>
				<div class="right-div">
					<h4 class="magre_0 textcolor_w hidden-xs">Posted by admin on June 2, 2015</h4>
					<h5 class="magre_0 textcolor_w visible-xs">Posted by admin on June 2, 2015</h5>
				</div>
			</div>
			<div class="wraper marge-5a7">
				<div class="custom-textarea" id="custom-textarea">
					<h1 class="head-color hidden-xs">Article Headline</h1>
					<h3 class="head-color visible-xs">Article Headline</h3>
				<p class="textcolor_gy">Article Text.....Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur at lacus et arcu blandit dapibus vel sed justo. Vivamus mi dui, rhoncus in diam at, vestibulum varius nisl. Ut nec nibh condimentum, iaculis ligula at, ornare nisi. Suspendisse tempus iaculis imperdiet. Aliquam erat volutpat. Fusce quis viverra dui, eget consectetur magna. Phasellus sollicitudin velit ante, sed sollicitudin dui aliquam id. Donec tempor fermentum mauris, sed sagittis ante faucibus nec. Praesent ac eleifend urna. Aliquam quis tellus ac dolor suscipit sodales.</p>
				<p class="textcolor_gy">Etiam vitae semper odio. Donec et felis aliquet, molestie orci eu, placerat nibh. Sed nec rhoncus massa, id suscipit ligula. Curabitur sit amet varius elit. Pellentesque auctor tristique purus. Ut vitae ipsum sit amet nunc interdum mollis. Maecenas dignissim rutrum velit, vitae ullamcorper eros fermentum id. Morbi risus velit, luctus blandit vehicula quis, laoreet at ipsum.</p>
				<p class="textcolor_gy">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur at lacus et arcu blandit dapibus vel sed justo. Vivamus mi dui, rhoncus in diam at, vestibulum varius nisl. Ut nec nibh condimentum, iaculis ligula at, ornare nisi. Suspendisse tempus iaculis imperdiet. Aliquam erat volutpat. Fusce quis viverra dui, eget consectetur magna. Phasellus sollicitudin velit ante, sed sollicitudin dui aliquam id. Donec tempor fermentum mauris, sed sagittis ante faucibus nec. Praesent ac eleifend urna. Aliquam quis tellus ac dolor suscipit sodales.</p>	
				<p class="textcolor_gy">Article Text.....Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur at lacus et arcu blandit dapibus vel sed justo. Vivamus mi dui, rhoncus in diam at, vestibulum varius nisl. Ut nec nibh condimentum, iaculis ligula at, ornare nisi. Suspendisse tempus iaculis imperdiet. Aliquam erat volutpat. Fusce quis viverra dui, eget consectetur magna. Phasellus sollicitudin velit ante, sed sollicitudin dui aliquam id. Donec tempor fermentum mauris, sed sagittis ante faucibus nec. Praesent ac eleifend urna. Aliquam quis tellus ac dolor suscipit sodales.</p>
				<p class="textcolor_gy">Etiam vitae semper odio. Donec et felis aliquet, molestie orci eu, placerat nibh. Sed nec rhoncus massa, id suscipit ligula. Curabitur sit amet varius elit. Pellentesque auctor tristique purus. Ut vitae ipsum sit amet nunc interdum mollis. Maecenas dignissim rutrum velit, vitae ullamcorper eros fermentum id. Morbi risus velit, luctus blandit vehicula quis, laoreet at ipsum.</p>
				<p class="textcolor_gy">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur at lacus et arcu blandit dapibus vel sed justo. Vivamus mi dui, rhoncus in diam at, vestibulum varius nisl. Ut nec nibh condimentum, iaculis ligula at, ornare nisi. Suspendisse tempus iaculis imperdiet. Aliquam erat volutpat. Fusce quis viverra dui, eget consectetur magna. Phasellus sollicitudin velit ante, sed sollicitudin dui aliquam id. Donec tempor fermentum mauris, sed sagittis ante faucibus nec. Praesent ac eleifend urna. Aliquam quis tellus ac dolor suscipit sodales.</p>				
				
				
			</div>
			</div><hr style=" border-top:3px solid #666666">
			<div class="hidden-xs">
				<div class="col-sm-6 text-right">
					READ MORE
				</div>
				<div class="col-sm-6 custom-control">
					<ul class="pagination pagi-marge custom-pages">
						 
					</ul>
				</div>
			</div>
            <div class="visible-xs">
				<div class="col-xs-4 mp_0">
					READ MORE
				</div>
				<div class="col-xs-8 custom-control">
					<ul class="pagination pagi-marge custom-pages">
						 
					</ul>
				</div>
			</div>
			
				<div style="clear:both"></div><hr style=" border-top:3px solid #666666">
					 
											<div class="container-fluid fluid">
												<div class="panel-body col-md-1 col-sm-2 col-xs-3">
													 <div class="media-left pull-left">
															<div>
																<p>
																	<a href="">
																	   <img src="view/helper/images/dance.jpg" alt="person" class="width-40" width="50" height="50" />   
																	</a>
																</p>                                
															</div>
													  </div>
												</div>
												<div class=" panel-body col-md-11 col-sm-10 hidden-xs">
													<h4><strong class="head-color">Author: </strong>Becky Tabakman</h4>
													<p>ABOUT the author of this article.  um vel posuere ante. Etiam viverra, odio sit amet consequat rhoncus, lacus dolor sodales diam, aliquet fermentum lectus enim id lacus. Fusce eget tellus felis. Cras a mi in turpis imperdiet viverra vel sed metus. Pellentesque vehicula ullamcorper sodales. Nam vel orci tortor. Fusce diam.</p>
												</div>
                                                <div class=" panel-body col-xs-9 visible-xs">
													<h6><strong class="head-color">Author: </strong>Becky Tabakman</h6>
												</div>	
                                                 <div class=" panel-body col-xs-12 marge-topm10 visible-xs">
													<p>ABOUT the author of this article.  um vel posuere ante. Etiam viverra, odio sit amet consequat rhoncus, lacus dolor sodales diam, aliquet fermentum lectus enim id lacus. Fusce eget tellus felis. Cras a mi in turpis imperdiet viverra vel sed metus. Pellentesque vehicula ullamcorper sodales. Nam vel orci tortor. Fusce diam.</p>
												</div>	
											</div>
											<div class="share_body hidden-xs">
													<div class="col-sm-6">
														<h3 class="textcolor_w share hidden-sm">Share this post on</h3>
														<h4 class="textcolor_w share visible-sm">Share this post on</h4>
													</div>
													<div class="col-sm-6 share_link"> 
														<div class="pull-right ln"><a href="http://www.linkedin.com" target="_blank"><i class="fa fa-fw fa-linkedin"></i></a></div>
														<div class="pull-right gp"><a href="http://www.google.com" target="_blank"><i class="fa fa-fw fa-google-plus"></i></a> </div>
														
														<div class="pull-right fb"><a href="http://www.facebook.com" target="_blank"><i class="fa fa-fw fa-facebook"></i></a></div> 
														<div class="pull-right tw"><a href="http://www.twitter.com" target="_blank"><i class="fa fa-fw fa-twitter"></i></a></div>
													</div>	
													
											</div>
                                            
                                        <div class="share_body visible-xs">
													<div class="col-xs-6">
														<h6 class="textcolor_w share">Share this post on</h6>
													</div>
													<div class="col-xs-6 share_link"> 
														 
														<div class="pull-right ln"><a href="http://www.linkedin.com" target="_blank"><i class="fa fa-fw fa-linkedin"></i></a></div>
														<div class="pull-right gp"><a href="http://www.google.com" target="_blank"><i class="fa fa-fw fa-google-plus"></i></a> </div>
														
														<div class="pull-right fb"><a href="http://www.facebook.com" target="_blank"><i class="fa fa-fw fa-facebook"></i></a></div> 
														<div class="pull-right tw"><a href="http://www.twitter.com" target="_blank"><i class="fa fa-fw fa-twitter"></i></a></div>
													</div>	
													
											</div>
											<!-----Article1 ends---------->		
							<!-----Article2 begins---------->
							 
		 	<div id="article">
				<img src="view/helper/images/break_img2.jpg" class="img-responsive">
				<div class="left-div">
					<h3 class="magre_0 hidden-xs">JUN<br><strong>2</strong></h3>
                    <h5 class="magre_0 visible-xs">JUN<br><strong>2</strong></h5>
				</div>
				<div class="right-div">
					<h4 class="magre_0 textcolor_w hidden-xs">Posted by admin on June 2, 2015</h4>
					<h5 class="magre_0 textcolor_w visible-xs">Posted by admin on June 2, 2015</h5>
				</div>
				
			</div>	
			<div class="wraper1 marge-5a7">
				<div class="custom-textarea1" id="custom-textarea1">
					<h1 class="head-color hidden-xs">Article Headline</h1>
                    <h3 class="head-color visible-xs">Article Headline</h3>
				<p class="textcolor_gy"> Article Text.....Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur at lacus et arcu blandit dapibus vel sed justo. Vivamus mi dui, rhoncus in diam at, vestibulum varius nisl. Ut nec nibh condimentum, iaculis ligula at, ornare nisi. Suspendisse tempus iaculis imperdiet. Aliquam erat volutpat. Fusce quis viverra dui, eget consectetur magna. Phasellus sollicitudin velit ante, sed sollicitudin dui aliquam id. Donec tempor fermentum mauris, sed sagittis ante faucibus nec. Praesent ac eleifend urna. Aliquam quis tellus ac dolor suscipit sodales. </p>
				<p class="textcolor_gy">Etiam vitae semper odio. Donec et felis aliquet, molestie orci eu, placerat nibh. Sed nec rhoncus massa, id suscipit ligula. Curabitur sit amet varius elit. Pellentesque auctor tristique purus. Ut vitae ipsum sit amet nunc interdum mollis. Maecenas dignissim rutrum velit, vitae ullamcorper eros fermentum id. Morbi risus velit, luctus blandit vehicula quis, laoreet at ipsum.</p>
				<p class="textcolor_gy"> Article Text.....Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur at lacus et arcu blandit dapibus vel sed justo. Vivamus mi dui, rhoncus in diam at, vestibulum varius nisl. Ut nec nibh condimentum, iaculis ligula at, ornare nisi. Suspendisse tempus iaculis imperdiet. Aliquam erat volutpat. Fusce quis viverra dui, eget consectetur magna. Phasellus sollicitudin velit ante, sed sollicitudin dui aliquam id. Donec tempor fermentum mauris, sed sagittis ante faucibus nec. Praesent ac eleifend urna. Aliquam quis tellus ac dolor suscipit sodales. </p>
				<p class="textcolor_gy">Etiam vitae semper odio. Donec et felis aliquet, molestie orci eu, placerat nibh. Sed nec rhoncus massa, id suscipit ligula. Curabitur sit amet varius elit. Pellentesque auctor tristique purus. Ut vitae ipsum sit amet nunc interdum mollis. Maecenas dignissim rutrum velit, vitae ullamcorper eros fermentum id. Morbi risus velit, luctus blandit vehicula quis, laoreet at ipsum.</p>
				<p class="textcolor_gy"> Article Text.....Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur at lacus et arcu blandit dapibus vel sed justo. Vivamus mi dui, rhoncus in diam at, vestibulum varius nisl. Ut nec nibh condimentum, iaculis ligula at, ornare nisi. Suspendisse tempus iaculis imperdiet. Aliquam erat volutpat. Fusce quis viverra dui, eget consectetur magna. Phasellus sollicitudin velit ante, sed sollicitudin dui aliquam id. Donec tempor fermentum mauris, sed sagittis ante faucibus nec. Praesent ac eleifend urna. Aliquam quis tellus ac dolor suscipit sodales. </p>
				<p class="textcolor_gy">Etiam vitae semper odio. Donec et felis aliquet, molestie orci eu, placerat nibh. Sed nec rhoncus massa, id suscipit ligula. Curabitur sit amet varius elit. Pellentesque auctor tristique purus. Ut vitae ipsum sit amet nunc interdum mollis. Maecenas dignissim rutrum velit, vitae ullamcorper eros fermentum id. Morbi risus velit, luctus blandit vehicula quis, laoreet at ipsum.</p>				
				
				
				
			</div>
			</div><hr style=" border-top:3px solid #666666">
			<div class="hidden-xs">
				<div class="col-sm-6 text-right">
					READ MORE
				</div>
				<div class="col-sm-6 custom-control1">
					<ul class="pagination pagi-marge custom-pages1">
						 
					</ul>
				</div>
			</div>
            <div class="visible-xs">
				<div class="col-xs-4 mp_0">
					READ MORE
				</div>
				<div class="col-xs-8 custom-control1">
					<ul class="pagination pagi-marge custom-pages1">
						 
					</ul>
				</div>
			</div>
			
				<div style="clear:both"></div><hr style=" border-top:3px solid #666666">
					 
											<div class="container-fluid fluid">
												<div class="panel-body col-md-1 col-sm-2 col-xs-3">
													 <div class="media-left pull-left">
															<div>
																<p>
																	<a href="">
																	   <img src="view/helper/images/dance.jpg" alt="person" class="width-40" width="50" height="50" />   
																	</a>
																</p>                                
															</div>
													  </div>
												</div>
												<div class=" panel-body col-md-11 col-sm-10 hidden-xs">
													<h4><strong class="head-color">Author: </strong>Becky Tabakman</h4>
													<p>ABOUT the author of this article.  um vel posuere ante. Etiam viverra, odio sit amet consequat rhoncus, lacus dolor sodales diam, aliquet fermentum lectus enim id lacus. Fusce eget tellus felis. Cras a mi in turpis imperdiet viverra vel sed metus. Pellentesque vehicula ullamcorper sodales. Nam vel orci tortor. Fusce diam.</p>
												</div>
                                                <div class=" panel-body col-xs-9 visible-xs">
													<h6><strong class="head-color">Author: </strong>Becky Tabakman</h6>
												</div>	
                                                 <div class=" panel-body col-xs-12 marge-topm10 visible-xs">
													<p>ABOUT the author of this article.  um vel posuere ante. Etiam viverra, odio sit amet consequat rhoncus, lacus dolor sodales diam, aliquet fermentum lectus enim id lacus. Fusce eget tellus felis. Cras a mi in turpis imperdiet viverra vel sed metus. Pellentesque vehicula ullamcorper sodales. Nam vel orci tortor. Fusce diam.</p>
												</div>	
                                                
                                                	
											</div>
											<div class="share_body hidden-xs">
													<div class="col-sm-6">
														<h3 class="textcolor_w share hidden-sm">Share this post on</h3>
														<h4 class="textcolor_w share visible-sm">Share this post on</h4>
													</div>
													<div class="col-sm-6 share_link"> 
														 
														<div class="pull-right ln"><a href="http://www.linkedin.com" target="_blank"><i class="fa fa-fw fa-linkedin"></i></a></div>
														<div class="pull-right gp"><a href="https://plus.google.com/" target="_blank"><i class="fa fa-fw fa-google-plus"></i></a> </div>
														
														<div class="pull-right fb"><a href="http://www.facebook.com" target="_blank"><i class="fa fa-fw fa-facebook"></i></a></div> 
														<div class="pull-right tw"><a href="http://www.twitter.com" target="_blank"><i class="fa fa-fw fa-twitter"></i></a></div> 
													</div>	
											</div>	
                                            
                                     <div class="share_body visible-xs">
													<div class="col-xs-6">
														<h6 class="textcolor_w share">Share this post on</h6>
													</div>
													<div class="col-xs-6 share_link"> 
														 
														<div class="pull-right ln"><a href="http://www.linkedin.com" target="_blank"><i class="fa fa-fw fa-linkedin"></i></a></div>
														<div class="pull-right gp"><a href="https://plus.google.com/" target="_blank"><i class="fa fa-fw fa-google-plus"></i></a> </div>
														
														<div class="pull-right fb"><a href="http://www.facebook.com" target="_blank"><i class="fa fa-fw fa-facebook"></i></a></div> 
														<div class="pull-right tw"><a href="http://www.twitter.com" target="_blank"><i class="fa fa-fw fa-twitter"></i></a></div> 
													</div>	
											</div>       
											<!-----Article2 ends---------->	
											
											
		 </div>
	</div>
	
</div>
<!------------Section begins------------>
<section id="top_link">
		            <div class="nav_right">
     							<ul>
      			                    <li><a href="#top" class="textcolor_gy font-sz18">
           								TOP <i class="fa fa-chevron-circle-up textcolor_g"></i></a></li> 
     							</ul>
        			</div>
</section>											
 
<!------------Section2 begins------------>
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


<script>
$(function() {
  $('a[href*=#]:not([href=#])').click(function() {
    if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
      var target = $(this.hash);
      target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
      if (target.length) {
        $('html,body').animate({
          scrollTop: target.offset().top
        }, 1000);
        return false;
      }
    }
  });
});
</script>

<script type="text/javascript">
$(function(){
$('ul li a').click(function(){
$('ul li.active').removeClass('active');
$(this).closest('li').addClass('active');
 $("#BREAKINGId").addClass("active");
});

});
</script>