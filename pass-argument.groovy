def env = ["MY_ENV_VAR=Groovy"]
def cmd = ['bash', '-c', 'echo $MY_ENV_VAR']
def proc = cmd.execute(env, null)
println proc.text.trim()