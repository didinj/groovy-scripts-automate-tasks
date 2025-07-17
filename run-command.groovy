// run-command.groovy
def command = 'ls -la' // On Windows, use 'dir'
def process = command.execute()
process.in.eachLine { line ->
    println line
}