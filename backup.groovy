// backup.groovy
def sourceDir = new File("/path/to/source")
def backupDir = new File("/path/to/backup/${new Date().format('yyyyMMdd_HHmmss')}")

if (!backupDir.exists()) {
    backupDir.mkdirs()
}

sourceDir.eachFile { file ->
    def destFile = new File(backupDir, file.name)
    file.withInputStream { is ->
        destFile.withOutputStream { os ->
            os << is
        }
    }
}

println "Backup completed to: ${backupDir.absolutePath}"