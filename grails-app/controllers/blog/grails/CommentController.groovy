package blog.grails

import grails.converters.JSON

class CommentController {

    static allowedMethods = [comment: 'POST']

    def list() {
        def post = Post.get(params.id)
        withFormat {
            html {
                post.comments
            }
            json {
                render post.comments as JSON
            }
        }
    }

    def create() {
        def comment = new Comment(params)
        def post = Post.get(params.id)
        comment.setPost(post)

        withFormat {
            html {
                if(comment.validate()) {
                    comment.save()
                    redirect(controller: 'post', action: 'show', params: [id: params.id])
                } else {
                    render view: 'show', model: [post: post, comment: comment]
                }
            }

            json {
                if(comment.validate()) {
                    comment.save()
                    render contentType: 'application/json', {
                        [comment: comment]
                    }
                } else {
                    render status: 422
                }
            }
        }
    }
}
