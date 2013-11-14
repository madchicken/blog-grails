<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Blog</title>
    <meta name="layout" content="main">
</head>
<body>
    <div class="jumbotron">
        <h1>Welcome to the blog</h1>
        <p class="lead">live example with Grails</p>
    </div>
    <div class="row marketing">
        <div class="col-md-12">
            <ul class="media-list">
                <g:each in="${posts}" var="post">
                    <li class="media">
                        <a class="pull-left" href="#">
                            <img class="media-object" src="http://placehold.it/50x50&text=Yo!" alt="${post.title}">
                        </a>
                        <div class="media-body">
                            <h4 class="media-heading"><g:link uri="/blog/${post.id}">${post.title}</g:link></h4>
                            <p>${post.ellipsis}</p>
                        </div>
                    </li>
                </g:each>
            </ul>
        </div>
    </div>
    <div class="footer">
        <p>♥ from Redoddity</p>
    </div>
</body>
</html>