<g:form action="comment" controller="comment" id="${post.id}" class="form-horizontal" method="post">
    <div class="form-group">
        <label>Author:</label> <input type="text" name="author" class="form-control"/>
        <span class="help-block"><g:fieldError field="author" bean="${comment}"></g:fieldError></span>
    </div>
    <div class="form-group">
        <label>Text:</label> <textarea name="text" rows="3" class="form-control"></textarea>
        <span class="help-block"><g:fieldError field="text" bean="${comment}"></g:fieldError></span>
    </div>
    <button type="submit" class="btn btn-info pull-right">Comment</button>
</g:form>
