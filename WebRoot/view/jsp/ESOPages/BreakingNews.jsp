<%@ taglib prefix="s" uri="/struts-tags"%>


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
});

});
</script>
<div class="container mp_0" style="margin:2% auto">
	<div class="col-sm-4 col-md-3">
		 <form >
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
                          <s:iterator value="#session.popularlist">
                            <li class="list-group-item">
                                <a href="#<s:property value="newsId"/>"><i class="fa fa-chevron-right fa-fw"></i> <s:property value="newsTitle"/></a>
                            </li>
                          </s:iterator>

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
                                       <img src="<s:property value="fileName"/>" alt="" class="img-circle" width="50" height="50" > 
                                    </div>
                                </div>
                                <div class="media-body">
                                    <h4 class="text-subhead margin-none">
                                        <a href="#" class="link-text-color"><s:property value="newsTitle"/></a>
                                    </h4>
                                    <div class="text-light text-caption">
                                        <s:property value="lastUpdtMonth"/> <s:property value="lastUpdtDay"/> by <s:property value="authorName"/>                                        
                                    </div>
                                </div>
							</li>
							</s:iterator>
                    		</ul>
		</div>
					
	</div>
	<div class="col-sm-8 col-md-9 col-xs-12">
		
		 <div>
	
		 	
			<!-- iterator article -->

			<s:iterator value="#session.popularlist">		
			
		 		 	<div id="article">
		 		 		<s:if test="#session.videoExist != null">
		 		 		<iframe  class="embed-responsive-item" src="<s:property value="videofileName"/>" frameborder="0" allowfullscreen></iframe>
		 		 		</s:if>
		 		 		<s:if test="#session.imageExist != null">
						<img src="<s:property value="fileName"/>" class="img-responsive">
						</s:if>
						<div class="left-div">
							<h3 class="magre_0 hidden-xs"><s:property value="lastUpdtMonth"/><br><strong><s:property value="lastUpdtDay"/></strong></h3>
		                    <h5 class="magre_0 visible-xs"><s:property value="lastUpdtMonth"/><br><strong><s:property value="lastUpdtDay"/></strong></h5>
						</div>
						<div class="right-div">
							<h4 class="magre_0 textcolor_w hidden-xs">Posted by <s:property value="lastUpdtBy"/> on <s:property value="lastUpdtDay"/> <s:property value="lastUpdtMonth"/> </h4>
							<h5 class="magre_0 textcolor_w visible-xs">Posted by <s:property value="lastUpdtBy"/> on <s:property value="lastUpdtDay"/> <s:property value="lastUpdtMonth"/> </h5>
						</div>
					</div>
			<div class="wraper marge-5a7">
				<div class="custom-textarea" id="custom-textarea">
					<h1 class="head-color hidden-xs"><s:property value="newsTitle"/></h1>
					<h3 class="head-color visible-xs"><s:property value="newsTitle"/></h3>
					 ${descTxt}
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
					 <!-- About author section begins -->
			<div class="container-fluid fluid">
					<div class="panel-body col-md-1 col-sm-2 col-xs-3">
					 <div class="media-left pull-left">
						<div>
						<p>
						<a href="">
						   <img src="<s:property value="authorImg"/>"  alt="" class="width-40" width="50" height="50" />   
						</a>
						</p>                                
						</div>
					  </div>
					</div>
					<div class=" panel-body col-md-11 col-sm-10 hidden-xs">
						<h4><strong class="head-color">Author: </strong><s:property value="authorName"/></h4>
						<p>ABOUT the author of this article. <s:property value="authorDetails"/> </p>
					</div>
                          <div class=" panel-body col-xs-9 visible-xs">
						<h6><strong class="head-color">Author: </strong><s:property value="authorName"/></h6>
					</div>	
                          <div class=" panel-body col-xs-12 marge-topm10 visible-xs">
						<p>ABOUT the author of this article. <s:property value="authorDetails"/> </p>
					</div>	
			</div>
					
					 <!-- About author section ends -->
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
				
								 
<%-- 		 	<div id="article">
				<img src="<s:property value="fileName"/>" class="img-responsive">
				<div class="left-div">
					<h3 class="magre_0 hidden-xs"><s:property value="lastUpdtMonth"/><br><strong><s:property value="lastUpdtDay"/></strong></h3>
                    <h5 class="magre_0 visible-xs"><s:property value="lastUpdtMonth"/><br><strong><s:property value="lastUpdtDay"/></strong></h5>
				</div>
				<div class="right-div">
					<h4 class="magre_0 textcolor_w hidden-xs">Posted by <s:property value="lastUpdtBy"/> on <s:property value="lastUpdtDay"/> <s:property value="lastUpdtMonth"/> </h4>
					<h5 class="magre_0 textcolor_w visible-xs">Posted by <s:property value="lastUpdtBy"/> on <s:property value="lastUpdtDay"/> <s:property value="lastUpdtMonth"/> </h5>
				</div>
				
			</div>	
			<div class="wraper1 marge-5a7">
				<div class="custom-textarea<s:property value="newsId"/> " id="custom-textarea<s:property value="newsId"/>">
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
				<div class="col-sm-6 custom-control<s:property value="newsId"/>">
					<ul class="pagination pagi-marge custom-pages<s:property value="newsId"/>">
						 
					</ul>
				</div>
			</div>
            <div class="visible-xs">
				<div class="col-xs-4 mp_0">
					READ MORE
				</div>
				<div class="col-xs-8 custom-control<s:property value="newsId"/>">
					<ul class="pagination pagi-marge custom-pages<s:property value="newsId"/>">
						 
					</ul>
				</div>
			</div>
 --%>			
				<div style="clear:both"></div><hr style=" border-top:3px solid #666666">
				
				
<script>
        $('#custom-textarea<s:property value="newsId"/>').textpager({
            controlArrows: ".custom-control<s:property value="newsId"/>",
            controlPages: ".custom-control<s:property value="newsId"/> .custom-pages<s:property value="newsId"/>",
            controlPagesContent: "li"
        });
</script> 


			</s:iterator>																		
											
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

			
<script>
             $('#custom-textarea1').textpager({
                 controlArrows: ".custom-control1",
                 controlPages: ".custom-control1 .custom-pages1",
                 controlPagesContent: "li"
             });
</script> 

<script>
                $('#custom-textarea2').textpager({
                    controlArrows: ".custom-control2",
                    controlPages: ".custom-control2 .custom-pages2",
                    controlPagesContent: "li"
                });
            </script> 