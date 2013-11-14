import blog.grails.Comment
import blog.grails.Post
import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->
        (new Post(author: 'Pierpaolo Follia', title: 'This is my first post', text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium adipisci assumenda autem dolor fugit harum id itaque laboriosam minus necessitatibus, pariatur perferendis praesentium quis reprehenderit sint sunt ut voluptatem? Harum?')).save(flush: true);
        (new Post(author: 'Pierpaolo Follia', title: 'This is my second post', text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium adipisci assumenda autem dolor fugit harum id itaque laboriosam minus necessitatibus, pariatur perferendis praesentium quis reprehenderit sint sunt ut voluptatem? Harum?')).save(flush: true);
        (new Post(author: 'Pierpaolo Follia', title: 'This is my third post', text: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium adipisci assumenda autem dolor fugit harum id itaque laboriosam minus necessitatibus, pariatur perferendis praesentium quis reprehenderit sint sunt ut voluptatem? Harum?')).save(flush: true);

        JSON.registerObjectMarshaller(Post) {
            [
                    id: it.id,
                    author: it.author,
                    title: it.title,
                    text: it.text,
                    dateCreated: it.dateCreated,
                    lastUpdated: it.lastUpdated,
                    comments: it.comments
            ]
        }
        JSON.registerObjectMarshaller(Comment) {
            [
                    id: it.id,
                    author: it.author,
                    text: it.text,
                    dateCreated: it.dateCreated,
                    lastUpdated: it.lastUpdated,
                    post: [id: it.post.id]
            ]
        }
    }
    def destroy = {
    }
}
