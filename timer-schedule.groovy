// timer-schedule.groovy
// def timer = new Timer()
// timer.scheduleAtFixedRate({
//     println "Task running at: ${new Date()}"
// } as TimerTask, 0, 5000) // run immediately, then every 5 seconds

// // Keep the script alive for 20 seconds
// sleep(20000)
// timer.cancel()

def timer = new Timer()
timer.schedule({
    println "Delayed task executed at ${new Date()}"
} as TimerTask, 3000) // run after 3 seconds

sleep(5000)
timer.cancel()