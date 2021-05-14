package com.khoavu

import groovy.yaml.YamlSlurper


def file = new File('./config.yml')
def config = yaml.load(file.text)

def showData() {
    println("config.name: ${config.name}")
    println("config.tests: ${config.tests}")
}

