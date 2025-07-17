// cleanup-logs.groovy
def logsDir = new File("/var/log/myapp")
def now = System.currentTimeMillis()

logsDir.eachFileMatch(~/.*\.log/) { file ->
    def ageInDays = (now - file.lastModified()) / (1000 * 60 * 60 * 24)
    if (ageInDays > 7) {
        println "Deleting old log: ${file.name}"
        file.delete()
    }
}