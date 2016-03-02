package g3

import g3.domain.User
import grails.converters.JSON

class IndexController {

    def index() {
        def result = User.search("${params.query}")

        render text: result as JSON, contentType: 'application/json'
    }

}