package blog.grails

import grails.converters.JSON

class PostController {

    static allowedMethods = [addComment: 'POST']

    def index() {
        withFormat {
            html {
                return [posts: Post.findAll()]
            }
            json {
                render ([posts: Post.findAll()] as JSON)
            }
        }
    }

    def show() {
        withFormat {
            html {
                return [post: Post.get(params.id)]
            }
            json {
                render contentType: 'application/json', {
                    [post: Post.get(params.id)]
                }
            }
        }
    }

}
