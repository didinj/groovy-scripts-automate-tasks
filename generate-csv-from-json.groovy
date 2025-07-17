@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.2')
import groovyx.net.http.RESTClient
import groovy.json.JsonSlurper

def client = new RESTClient('https://jsonplaceholder.typicode.com/')
def response = client.get(path: 'users')

def users = new JsonSlurper().parseText(response.data.toString())

new File('users.csv').withWriter { writer ->
    writer.writeLine("ID,Name,Email")
    users.each { user ->
        writer.writeLine("${user.id},${user.name},${user.email}")
    }
}

println "CSV report generated!"