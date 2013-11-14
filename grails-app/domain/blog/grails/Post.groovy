package blog.grails

class Post {

    String author
    String title
    String text
    Date dateCreated
    Date lastUpdated

    static hasMany = [comments: Comment]

    static transients = ['ellipsis']

    static constraints = {
        author nullable: false, blank: false
        title nullable: false, blank: false
        text nullable: false, blank: false
        comments nullable: true
    }

    def getEllipsis() {
        text[0..20] + "..."
    }
}
