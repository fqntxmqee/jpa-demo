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
   padding-top: 60px;
   padding-bottom: 40px;
}

.sidebar-nav {
   padding: 9px 0;
}

@media ( max-width : 980px) { /* Enable use of floated navbar text */
   .navbar-text.pull-right {
      float: none;
      padding-left: 5px;
      padding-right: 5px;
   }
}
</style>
<link href="<c:url value='/resources/css/bootstrap-responsive.min.css' />" rel="stylesheet" media="screen">
</head>
<body>
   <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
         <div class="container-fluid">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
            </button>
            <a class="brand" href="#">JPA DEMO</a>
            <div class="nav-collapse collapse">
               <p class="navbar-text pull-right">
                  Logged in as <a href="#" class="navbar-link">Username</a>
               </p>
               <ul class="nav">
                  <li class="active"><a href="#">Home</a></li>
                  <li><a href="#about">About</a></li>
                  <li><a href="#contact">Contact</a></li>
               </ul>
            </div>
            <!--/.nav-collapse -->
         </div>
      </div>
   </div>

   <div class="container-fluid">
      <div class="row-fluid">
         <div class="span3">
            <div class="well sidebar-nav">
               <ul class="nav nav-list">
                  <li class="nav-header">Sidebar</li>
                  <li class="active"><a href="#">Link</a></li>
                  <li><a href="#">Link</a></li>
                  <li><a href="#">Link</a></li>
                  <li><a href="#">Link</a></li>
               </ul>
            </div>
            <!--/.well -->
         </div>
         <!--/span-->
         <div class="span9">
            <div class="hero-unit">
               <h1>Hello, world!</h1>
               <p>Wellcome!</p>
               <p>
                  <a href="#" class="btn btn-primary btn-large">Learn more &raquo;</a>
               </p>
            </div>
            <div class="row-fluid">
               <div class="span4">
                  <h2>First</h2>
                  <p>First content</p>
                  <p>
                     <a class="btn" href="#">View details &raquo;</a>
                  </p>
               </div>
               <!--/span-->
               <div class="span4">
                  <h2>Second</h2>
                  <p>Second content</p>
                  <p>
                     <a class="btn" href="#">View details &raquo;</a>
                  </p>
               </div>
               <!--/span-->
               <div class="span4">
                  <h2>Third</h2>
                  <p>Third content</p>
                  <p>
                     <a class="btn" href="#">View details &raquo;</a>
                  </p>
               </div>
               <!--/span-->
            </div>
            <!--/row-->
         </div>
         <!--/span-->
      </div>
      <!--/row-->

      <hr>

      <footer>
         <p>&copy; Guoqing Huang 2013</p>
      </footer>

   </div>
   <!--/.fluid-container-->
   <script src="<c:url value='/resources/js/jquery/jquery-1.8.0.min.js' />"></script>
   <script src="<c:url value='/resources/js/bootstrap/bootstrap.min.js' />"></script>
</body>
</html>
