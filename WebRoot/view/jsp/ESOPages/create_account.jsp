<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript">  
function onSubmit() 
{ 
  var fields = $("input[name='interest']").serializeArray(); 
  if (fields.length == 0) 
  { 
    alert('No Interest selected'); 
    // cancel submit
    return false;
  } 
  else 
  { 
    alert(fields.length + " items selected"); 
  }
}
</script>  
<script type="text/javascript">  
function validateform()
{  
var zip=document.myform.zip.value;  
var website=document.myform.website.value;  
var phoneNo=document.myform.contactNo.value;  

if(isNaN(zip)||zip.indexOf(" ")!=-1){
   alert("Enter numeric value");
   return false; 
}else if (zip.length>6){
     alert("enter 6 characters");
     return false;  
}else  if(isNaN(phoneNo)||phoneNo.indexOf(" ")!=-1){
   alert("Enter numeric value");
   return false; 
}else if (phoneNo.length>10){
     alert("enter 6 characters");
     return false;  
}
} 
</script>  

<!-----------body begins--------------->
<body>
<!------------Body Section  for account form begins------------>
<div class="container marge_bot5">
	<form action="updateProf" method="post" enctype="multipart/form-data" name="myform" onsubmit="return validateform()">

	<div class="col-sm-6">
		<h4 class="head-color">Account Details</h4>
		<h5 class="textcolor_gy lh_20 lh_25"> Registering for this site is easy, just fill in the fields below and we'll get a new account set up for you in no time, Get connected. Sign-up to get started. </h5>
						<label class="head-color">Login Information</label>
						<div class="form-group">
							<input type="text" class="form-control" name="userName" placeholder="Username (this name will show up on your posts)" required>
						</div>
						<div class="form-group"> 
							<input type="password" class="form-control" name="userPassword" placeholder="Choose a Password" required>
						</div>									
						<div class="form-group">
							<input type="password" class="form-control" name="confirmPassword" placeholder="Confirm a Password" required>
						</div>
						<label class="head-color">Member Information</label>
						<div class="form-group"> 
							<input type="text" class="form-control" name="userId"  value="${usId}"  style="display:none">
							<input type="email" class="form-control" name="emailId" placeholder=" " value="<s:property value="emailId"/> " >
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="fname" placeholder="First Name" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="lname" placeholder="Last Name" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="address" placeholder="Address" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="address2" placeholder="Address 2" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="city" placeholder="City" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="state" placeholder="State / Province" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="zip" placeholder="ZIP / Postal Code" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="country" placeholder="Country" value="USA" disabled>						
						</div>
						<div class="form-group">
							<input type="text" class="form-control " name="contactNo"  placeholder="Phone" required>
						</div>
						 	<div class="form-group">
                                  <a href="#" class="textcolor_gy fw_b crt_acc">Terms of Use: </a>
                                  <input type="checkbox" value="interest" name="interest" required>  I Accept<br>
                             </div> 
					
						<h4 class="textcolor_gy">Your account information will be emailed to this address.</h4>
					
		</div>	
		<div class="col-sm-6">	
				<h4 class="head-color">Areas of Interest</h4>
				<h5 class="textcolor_gy lh_25"> Click one or more areas of following interest. </h5>

				<s:iterator value="#session.crmUserInterest">
					<div class="form-group">
						<input type="checkbox" name="interestId"  value="<s:property value="interestId"/>"> &nbsp;  <s:property value="interestName"/><br>
					</div>
					</s:iterator>
			
					<div class="form-group col-sm-4 col-md-3 col-xs-12 mp_0 mg_lm20 webmg_lm20">
						<input type="checkbox">  &nbsp; Others<br>
					</div>
					<div class="form-group col-sm-8 col-md-9 col-xs-12 mp_0">
						<input type="text" class="form-control" name="otherInterestName" placeholder="" ><br>
					</div> 
					<h4 class="head-color">Add Profile Photo</h4>
					<div class="col-sm-5 col-md-3 mg_top2 mp_0 mg_lm20 webmg_lm20">			
<!-- 						<div id="divphoto">
								<img id="myImg" src="#" class="img-responsive"/>
								<input type='file' name="userImage" id="loadimage"/>
							</div> -->
						<img src='images/create_acc.png' class="img-responsive"> 
					</div>
					<div class="form-group col-sm-7 col-md-9 mp_0 mg_lm20 webmg_lm20">
						<h5 class="textcolor_gy lh_25 mg_rm35"> Select an image file on your computer. </h5>
						<h5 class="textcolor_gy lh_25 mg_rm35"> You can upload a JPG, GIF or PNG file (File size limit is 4MG). </h5>
					</div>
<%-- 						<s:form  method="post" enctype="multipart/form-data">
    					<s:file name="userImage" label="User Image" />
    					</s:form> --%>
					<div class="form-group col-sm-10 mp_0 mg_lm20 webmg_lm20">
						<input type="file" class="form-control" name="userImage" placeholder="Upload Photo" required>
					</div>
<!-- 					<div class="form-group col-sm-2 mp_0 mg_lm20 webmg_lm20">
						<button type="submit"  class="btn acc textcolor_gy">Browse</button> 
					</div>
					<div class="form-group">
						<button type="submit" class="btn bt_color textcolor_w">UPLOAD PHOTO</button> 
					</div> -->
					<div class="form-group">	
					<button type="submit" value="submit" class="btn bg_button mg_t10 textcolor_w">SUBMIT TO CREATE ACCOUNT</button>
					</div>

		</div>
	</form>
</div>

</body>
</html>