package mx.com.sintelti.usuarios


import grails.plugins.springsecurity.Secured

@Secured(['ROLE_ADMIN'])
class SecureController {
    def index = { 
        render (template: "bienvenido")
    }
}
