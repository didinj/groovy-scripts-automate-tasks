// copy-file.groovy
def source = new File('sample.txt')
def target = new File('copied.txt')
target.text = source.text