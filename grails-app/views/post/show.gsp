<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Blog: ${post.title}</title>
    <meta name="layout" content="main">
</head>
<body>
    <div class="jumbotron">
        <h1>${post.title}</h1>
    </div>
    <div class="row marketing">
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
            <g:render template="comment_form"/>
        </p>

        </div>
    </div>
    <div class="footer">
        <p>♥ from Redoddity</p>
    </div>
</body>
</html>