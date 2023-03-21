	<!-- Fixed navbar -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="<#if (content.rootpath)??>${content.rootpath}<#else></#if>">Java Jottings</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Java Fundamentals<b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/java-jottings/java-fundamentals/java-basic-syntax.html">Java Basic Syntax</a></li>
                <li><a href="#">Data Types and variables</a></li>                
              </ul>
            </li>
            <li><a href="<#if (content.rootpath)??>${content.rootpath}<#else></#if>about.html">About</a></li>           
                                 
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    <div class="container">