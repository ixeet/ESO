<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>ESO</title>
<link rel="stylesheet" href="view/helper/css/bootstrap.min.css" />
<link rel="stylesheet" href="view/helper/css/bootstrap-theme.css" />
<link rel="stylesheet" href="view/helper/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="view/helper/css/module-essentials.min.css" />
<link rel="stylesheet" href="view/helper/css/theme-core.min.css" />
<link rel="stylesheet" href="view/helper/css/wavex.css" />
<link rel="stylesheet" href="view/helper/css/animate.css" />
<link rel="stylesheet" href="view/helper/css/module-theme.css" />
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700'
	rel='stylesheet' type='text/css'>
	<script src="view/helper/js/jquery.min.js"></script>
<script src="view/helper/js/bootstrap.min.js"></script>
<script src="view/helper/js/jquery.textpager.js"></script>
	
</head>
<body>
	<div id="headerIds">
		<tiles:insertAttribute name="header" />
	</div>
	<!-- End Top login bar -->
		<tiles:insertAttribute name="body" />
	<!-- Footer -->
	<div>
		<tiles:insertAttribute name="footer" />
	</div>
	<!-- // Footer -->

<script>
 $(function () {
    $(":file").change(function () {
        if (this.files && this.files[0]) {
            var reader = new FileReader();
            reader.onload = imageIsLoaded;
            reader.readAsDataURL(this.files[0]);
        }
    });
});

function imageIsLoaded(e) {
    $('#myImg').attr('src', e.target.result);
};


</script>
<!--------upload image script ends------>
 
<!----slide add second user------>
<script>
$(document).ready(function(){
	 $("#add_usr1").hide();
    $("#add_usr").click(function(){
        $("#add_usr1").slideToggle("slow");
    });
});
</script>


<script>
                $('#custom-textarea').textpager({
                    controlArrows: ".custom-control",
                    controlPages: ".custom-control .custom-pages",
                    controlPagesContent: "li"
                });
            </script> 
			
			<script>
                $('#custom-textarea1').textpager({
                    controlArrows: ".custom-control1",
                    controlPages: ".custom-control1 .custom-pages1",
                    controlPagesContent: "li"
                });
            </script> 
</body>
</html>