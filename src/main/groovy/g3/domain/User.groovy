package g3.domain

import grails.persistence.Entity

/**
 * Created with IntelliJ IDEA.
 * User: bhughes Bryan Hughes<hugheba@gmail.com>
 * Date: 3/2/16
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
class User {

    static mapping = 'mongo'

    String username
    String email

    static searchable = true
}
