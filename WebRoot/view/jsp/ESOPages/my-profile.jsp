<%@ taglib prefix="s" uri="/struts-tags"%>

<script>  
function validateform(){  
var regex = new RegExp("^(http[s]?:\\/\\/(www\\.)?|ftp:\\/\\/(www\\.)?|www\\.){1}([0-9A-Za-z-\\.@:%_\+~#=]+)+((\\.[a-zA-Z]{2,3})+)(/(.)*)?(\\?(.)*)?");

var zip=document.myform.zip.value;  
var website=document.myform.website.value;  
var phoneNo=document.myform.contactNo.value;  
var phoneNo2=document.myform.homeContactNo.value;  
    alert(( zip.length<6));  
if (!regex.test(website)){  
  alert("Enter the valid website");  
  return false;  
}else  if(isNaN(zip)||zip.indexOf(" ")!=-1){
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
}else  if(isNaN(phoneNo2)||phoneNo2.indexOf(" ")!=-1){
   alert("Enter numeric value");
   return false; 
}else if (phoneNo2.length>10){
     alert("enter 6 characters");
     return false;  
} 
}  
</script>  
<script type="text/javascript">  
function matchpass(){  
var firstpassword=document.f1.userPassword.value;  
var secondpassword=document.f1.confirmPassword.value;  
  
if(firstpassword==secondpassword){  
return true;  
}  
else{  
alert("password must be same!");  
return false;  
}  
}  
</script>
<!------------Section begins------------>

<s:if test="hasActionMessages()">
   <div class="welcome">
      <s:actionmessage/>
   </div>
</s:if>


<s:if test="#session.userVO_2 != null">	
<div class="container marge_bot5" id="member">
  <div class="form-group mbr_prf">
  
    <input type="text" class="form-control"  placeholder="Welcome back,${userVO_2.userName} " disabled>
   <form action="logout" >
    <button type="submit" value="submit" class="btn">Sign Out</button>
    </form>
    <h4 class="head-color">My Account</h4>
    <h5 class="textcolor_gy lh_25 mg_rm35 fw_b">You can change your password, your profile photo, and update your contact information.<br>
      Please make sure your profile information is accurate.</h5>
  </div>
  <!----Row begins---->
  <div class="row">
    <div class="col-sm-4">
      <h4 class="head-color">Reset / Change Password </h4>
      <form action="resetPwd" method="post" name="f1" onsubmit="return matchpass()">
        <div class="form-group">
          <input type="email" class="form-control" name="emailId" placeholder=" "  value="${userVO_2.emailId}" style="display:none">
          <input type="password" class="form-control"   placeholder="Current Password" value="${userVO_2.userPassword}" >
        </div>
        <div class="form-group">
          <input type="password" class="form-control" name="userPassword"  placeholder="New Password" required>
        </div>
        <div class="form-group">
          <input type="password" class="form-control" name="confirmPassword" placeholder="Confirm Password" required>
        </div>
        <div class="form-group">
          <button type="submit" class="btn bg_button textcolor_w">UPDATE PASSWORD</button>
        </div>
      </form>
    </div>
    <div class="col-sm-6">
      <form action="changeProfPic" method="post" enctype="multipart/form-data">
        <h4 class="head-color">Add Profile Photo</h4>
        <div class="col-sm-5 col-md-3 mg_top2 mp_0 mg_lm20 webmg_lm20"> 
          <!---<div id="divphoto">
							<img id="myImg" src="#" />
							<input type='file' id="loadimage"/>
						</div>---> 
			<img src="${userVO_2.profilePic}" class="img-responsive">
          <!-- <img src='view/helper/images/create_acc.png' class="img-responsive"> --> </div>
        <div class="form-group col-sm-7 col-md-9 mp_0 mg_lm20 webmg_lm20">
          <h5 class="textcolor_gy lh_25 mg_rm35"> Select an image file on your computer. </h5>
          <h5 class="textcolor_gy lh_25 mg_rm35"> You can upload a JPG, GIF or PNG file (File size limit is 4MG). </h5>
        </div>
        <div class="form-group col-sm-10 mp_0 mg_lm20 webmg_lm20">
       <!--    <input type="text" class="form-control" placeholder=""> -->
      		 <input type="file" class="form-control" name="userImage" placeholder="Upload Photo">
      		 <input type="email" class="form-control" name="emailId" placeholder=" "  value="${userVO_2.emailId}" style="display:none">
        </div>
        <div class="form-group col-sm-2 mp_0 mg_lm20 webmg_lm20">
         <!--  <button type="submit" value="submit" class="btn acc textcolor_gy">Browse</button> -->
        </div>
        <div class="form-group">
                 <button type="submit" class="btn bg_button textcolor_w">UPDATE PROFILE PICTURE</button>
          <!-- <button type="submit" value="submit" class="btn bg_button textcolor_w">UPLOAD PHOTO</button> -->
        </div>
      </form>
    </div>
    <h4 class="col-sm-12 head-color">Account Profile</h4>
    <form action="myprofileCheck" method="post" name="myform" onsubmit="return validateform()" >
	    <div class="col-md-4">
	        <div class="form-group">
	          <input type="text" class="form-control " name="fname" placeholder="First Name" value="${userVO_2.firstName}" required>
	        </div>
	        <div class="form-group">
	          <input type="text" class="form-control "  name="lname" placeholder="Last Name"  value="${userVO_2.lastName}" required>
	        </div>
	        <div class="form-group">
	          <input type="text" class="form-control "  name="address" placeholder="Address" value="${userVO_2.address1}" required>
	        </div>
	        <div class="form-group">
	          <input type="text" class="form-control "  name="city" placeholder="City" value="${userVO_2.city}" required>
	        </div>
	    </div>
    <div class="col-md-4">
        <div class="form-group">
          <input type="text" class="form-control " name="state"  placeholder="State/Province" value="${userVO_2.state}" required>
        </div>
        <div class="form-group">
          <input type="text" class="form-control " name="zip" placeholder="Zip/Postal" value="${userVO_2.zip}" required>
        </div>
        <div class="form-group">
		  <input type="text" class="form-control " name="country" placeholder="Country" value="USA" disabled>						
        </div>
        <div class="form-group">
          <input type="text" class="form-control "  name="companyName" placeholder="Organization" value="${userVO_2.companyName}" required>
        </div>
    </div>
		    <div class="col-md-4">
		        <div class="form-group">
					<input type="text" class="form-control" name="userId"  value="${userVO_2.userId}"  style="display:none">
					<input type="email" class="form-control" name="emailId" placeholder="<s:property value="emailId"/> "  value="${userVO_2.emailId}">
		        </div>
		        <div class="form-group">
		          <input type="text" class="form-control "  name="contactNo" placeholder="Work Phone" value="${userVO_2.contactNo}" required>
		        </div>
		        <div class="form-group">
		          <input type="text" class="form-control " name="homeContactNo" placeholder="Home Phone" value="${userVO_2.homeContact}" >
		        </div>
		        <div class="form-group">
		          <input type="text" class="form-control " name="website" placeholder="Website" value="${userVO_2.website}" required>
		        </div>
		    </div>

    <div class="form-group col-sm-12">
      <button type="submit" class="btn bg_button textcolor_w">SAVE CHANGES</button>
    </div>
   </form>
   </s:if>
   
   
    <div class="col-sm-4">
       <s:if test="#session.parentUser == null">    
		      <h4 class="head-color"> Add Alternative Account</h4>
		      <form action="addUser" method="post">
		        <div class="form-group">
		             <input type="text" class="form-control" name="userId" placeholder=" "  value="${userVO_2.userId}" style="display:none">
		      		 <input type="email" class="form-control" name="emailId" placeholder=" "  value="${userVO_2.emailId}" style="display:none">
		          <input type="text" class="form-control" name="addedUsername"  placeholder=" Add User Name"  required>
		        </div>
		        <div class="form-group">
		       		 <input type="text" class="form-control" name="userId" placeholder=" "  value="${userVO_2.userId}" style="display:none">
		      		 <input type="email" class="form-control" name="emailId" placeholder=" "  value="${userVO_2.emailId}" style="display:none">
		          <input type="email" class="form-control" name="addedEmailId"  placeholder=" Add User email Id" required>
		        </div>

		        <div class="form-group">
		          <button type="submit" class="btn bg_button textcolor_w">ADD ACCOUNT</button>
		        </div>
		      </form>
      </s:if>
      <s:elseif test="#session.parentUser != null">
      		  <h4 class="head-color"> Spouse/Alternative Account</h4>
		      <form >
		        <div class="form-group">
		             <input type="text" class="form-control" name="userId" placeholder=" "  value="${userVO_2.userId}" style="display:none">
		      		 <input type="email" class="form-control" name="emailId" placeholder=" "  value="${userVO_2.emailId}" style="display:none">
		          <input type="text" class="form-control" value="${parentUser.addedUsername}"  placeholder=" Add User Name"  disabled>
		        </div>
		        <div class="form-group">
		          <input type="email" class="form-control" value="${parentUser.addedEmailId}"  placeholder=" Add User email Id" disabled>
		        </div>
		      </form>
      </s:elseif>
    </div>
    <h4 class="col-sm-12 head-color ">Your Community Dialog</h4>
    <div class="col-sm-12">
      <div class="border"></div>
    </div>
    <h5 class="textcolor_gy col-sm-12 lh_25 mg_rm35">Anything you have ranked or commented will also appear here.</h5>
    <div class="col-md-8">
      <div class="panel-group" id="accordion">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title"> <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseOne"><i class="fa fa-user"></i> Name of Post - Jan 4 at 4:30 PM </a> </h4>
          </div>
          <div id="collapseOne" class="panel-collapse collapse in">
            <div class="panel-body">
            
              <div class="post-bx">
                            
                <ul class="icon-list">
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star-half-empty"></i></li>
                </ul>
                <h3>Eusabi<span>Jan 4 , 2015 at 4:30 PM</span></h3>
                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS. </div>
              <div class=" pull-right" id="up">
              <a href="#collapseOne" data-toggle="collapse" data-parent="#accordion" class="btn btn-default">Close Comments <i class="fa fa-angle-up"></i></a> 						      		</div>
              
            </div>
          </div>
        </div>
        
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title"> <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><i class="fa fa-user"></i> Name of Post - Jul 10 </a> </h4>
          </div>
          <div id="collapseTwo" class="panel-collapse collapse">
            <div class="panel-body">
            
              <div class="post-bx">
                            
                <ul class="icon-list">
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star-half-empty"></i></li>
                </ul>
                <h3>Eusabi<span>Jan 4 , 2015 at 4:30 PM</span></h3>
                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS. </div>
              <div class=" pull-right" id="up">
              <a href="#collapseTwo" data-toggle="collapse" data-parent="#accordion" class="btn btn-default">Close Comments <i class="fa fa-angle-up"></i></a> 						      		</div>
              
            </div>
          </div>
        </div>
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title"> <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseThree"><i class="fa fa-user"></i> Name of Post - Jul 17 </a> </h4>
          </div>
          <div id="collapseThree" class="panel-collapse collapse">
            <div class="panel-body">
            
              <div class="post-bx">
                            
                <ul class="icon-list">
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star-half-empty"></i></li>
                </ul>
                <h3>Eusabi<span>Jan 4 , 2015 at 4:30 PM</span></h3>
                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS. </div>
              <div class=" pull-right" id="up">
              <a href="#collapseThree" data-toggle="collapse" data-parent="#accordion" class="btn btn-default">Close Comments <i class="fa fa-angle-up"></i></a> 						      		</div>
              
            </div>
          </div>
        </div>
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title"> <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseFour"><i class="fa fa-user"></i> Name of Post - Jul 25 </a> </h4>
          </div>
          <div id="collapseFour" class="panel-collapse collapse">
            <div class="panel-body">
            
              <div class="post-bx">
                            
                <ul class="icon-list">
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star"></i></li>
                  <li><i class="fa fa-star-half-empty"></i></li>
                </ul>
                <h3>Eusabi<span>Jan 4 , 2015 at 4:30 PM</span></h3>
                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS. </div>
              <div class=" pull-right" id="up">
              <a href="#collapseFour" data-toggle="collapse" data-parent="#accordion" class="btn btn-default">Close Comments <i class="fa fa-angle-up"></i></a> 						      		</div>
              
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="col-md-4">
      <h4 class="head-color">BROWSE POSTS BY YEAR</h4>
      <hr style="width:50%">
      <form>
        <div class="form-group">
          <select class="form-control" reuired>
            <option>2014</option>
            <option>2015</option>
            <option>2016</option>
            <option>2017</option>
          </select>
        </div>
      </form>
    </div>
  </div>
  <!---Row ends-----> 
</div>

<!------------Section begins------------> 
