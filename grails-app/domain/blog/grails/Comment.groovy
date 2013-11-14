package blog.grails

class Comment {

    String author
    String text
    Date dateCreated
    Date lastUpdated

    static belongsTo = [post: Post]

    static constraints = {
        author nullable: false, blank: false
        text nullable: false, blank: false
        post nullable: false
    }
}
