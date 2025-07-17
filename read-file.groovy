// read-file.groovy
def file = new File('sample.txt')
file.eachLine { line ->
    println line
}