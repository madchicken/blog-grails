class UrlMappings {

	static mappings = {

        "/blog" {
            controller = "post"
            action = "index"
        }

        "/blog/$id" {
            controller = 'post'
            action = "show"
        }

        "/blog/$id/comment" {
            controller = "comment"
            action = ['GET': 'list', 'POST': 'create']
        }

        "/"(redirect: '/blog')

        "500"(view:'/error')
	}
}
