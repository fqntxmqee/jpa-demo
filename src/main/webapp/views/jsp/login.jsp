<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<title>JPA DEMO</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="<c:url value='/resources/css/bootstrap.min.css' />" rel="stylesheet" media="screen">
<style type="text/css">
body {
   padding-top: 40px;
   padding-bottom: 40px;
   background-color: #f5f5f5;
}

.form-signin {
   max-width: 300px;
   padding: 19px 29px 29px;
   margin: 0 auto 20px;
   background-color: #fff;
   border: 1px solid #e5e5e5;
   -webkit-border-radius: 5px;
   -moz-border-radius: 5px;
   border-radius: 5px;
   -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
   -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
   box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading,.form-signin .checkbox {
   margin-bottom: 10px;
}

.form-signin input[type="text"],.form-signin input[type="password"] {
   font-size: 16px;
   height: auto;
   margin-bottom: 15px;
   padding: 7px 9px;
}
</style>
<link href="<c:url value='/resources/css/bootstrap-responsive.min.css' />" rel="stylesheet" media="screen">
</head>
<body>
   <div class="container">

      <form class="form-signin" action="<c:url value='/j_spring_security_check' />" method="post">
         <h2 class="form-signin-heading">Please sign in</h2>
         <input type="text" class="input-block-level" name="j_username" placeholder="Email address"> 
         <input type="password" class="input-block-level" name='j_password' placeholder="Password">
         <label class="checkbox"> 
            <input type="checkbox" value="remember-me"> Remember me
         </label>
         <button class="btn btn-large btn-primary" type="submit">Sign in</button>
      </form>

   </div>
   <!-- /container -->
   <script src="<c:url value='/resources/js/jquery/jquery-1.8.0.min.js' />"></script>
   <script src="<c:url value='/resources/js/bootstrap/bootstrap.min.js' />"></script>
</body>
</html>