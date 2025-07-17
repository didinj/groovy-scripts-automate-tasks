// delete-file.groovy
def file = new File('copied.txt')
if (file.exists()) {
    file.delete()
    println "File deleted successfully."
} else {
    println "File not found."
}