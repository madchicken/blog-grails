<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Blog: ${post.title}</title>
    <meta name="layout" content="main">
</head>
<body>
<div class="jumbotron">
    <div class="container">
        <h1>${post.title}</h1>
    </div>
</div>
<div class="row">
    <div class="col-md-12">
        <p>${post.text}</p>
        <p>

        <h5>Comments: </h5>
        <g:if test="${post.comments}">
            <ul class="media-list">
                <g:each in="${post.comments}" var="comment">
                    <li class="media">
                        <div class="media-body">
                            <h5 class="media-heading">On <g:formatDate date="${comment.dateCreated}" format="dd/MM/yyyy HH:mm"/>, ${comment.author} said:</h5>
                            <p>${comment.text}</p>
                        </div>
                    </li>
                </g:each>
            </ul>
        </g:if>
        <g:if test="${!post.comments}">
            <p>No comments for this post.</p>
        </g:if>
        <g:render template="/post/comment_form"/>
    </p>

    </div>
</div>
</body>
</html>