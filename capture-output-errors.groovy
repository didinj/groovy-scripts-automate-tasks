// Capture output
def process = 'git --version'.execute()
def output = process.text
println "Git Version:\n$output"

// Capture error
def badCmd = 'some-nonexistent-command'.execute()
badCmd.waitFor()
println "Exit code: ${badCmd.exitValue()}"
println "Error: ${badCmd.err.text}"