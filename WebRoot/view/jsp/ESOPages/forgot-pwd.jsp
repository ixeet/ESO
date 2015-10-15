<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container mg_b10">
	<!-- Send mail for reset password begins-->
	<s:if test="#session.forgotPwd == null">	
	
		<div class="col-sm-12">
			<h4 class="txcl_cnthead hidden-xs fw_400"> Please enter the email address linked to your eSecondOpinion<br> account. You will receive a link via email.</h4>
			<h5 class="txcl_cnthead lh_20 visible-xs fw_400"> Please enter the email address linked to your eSecondOpinion account. You will receive a link via email.</h5>
			
		</div>	
		<div class="col-sm-5">	
			<form action="" method="post">
				
				<div class="form-group">
	            	<span class=" glyphicon glyphicon-envelope envelope"></span>
					<input type="email" class="form-control pad_l30" id="email" name="emailId" placeholder="email address(required)" required>
				</div>
				
				<button type="submit" class="btn bg_button textcolor_w">GET MAIL</button>
	 		</form>
		</div>
	</s:if>
	<!-- Send mail for reset password ends-->
	
	
	
	<!-- Reset password begins-->
	<s:if test="#session.forgotPwd != null">	
	
		<div class="col-sm-12">
			<h4 class="txcl_cnthead hidden-xs fw_400"> Please enter the changed password for your eSecondOpinion account.</h4>
			<h5 class="txcl_cnthead lh_20 visible-xs fw_400"> Please enter the changed password for your eSecondOpinion account.</h5>
			
		</div>	
		<div class="col-sm-4">	
			<form action="" method="post">
				
				<div class="form-group">
	            	<span class=" glyphicon glyphicon-envelope envelope"></span>
					<input type="password" class="form-control pad_l30" name="userPassword" placeholder="New Password(required)" required>
					<input type="password" class="form-control pad_l30" name="confirmPassword" placeholder="Confirm New Password(required)" required>
				</div>
				
				<button type="submit" class="btn bg_button textcolor_w">CHANGE PASSWORD</button>
	 		</form>
		</div>
	
	</s:if>
	<!-- Reset password ends-->
	
</div>
