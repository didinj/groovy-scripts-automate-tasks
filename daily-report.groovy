#!/usr/bin/env groovy
def date = new Date().format("yyyy-MM-dd")
def report = new File("report-${date}.txt")
report.text = "Generated report on ${date}"
println "Report saved: ${report.name}"