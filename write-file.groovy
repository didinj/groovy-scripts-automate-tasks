// write-file.groovy
def file = new File('output.txt')
file.text = 'Automated file writing with Groovy!\nLine 2 added.'
file << '\nAppending another line.'