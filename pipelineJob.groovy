pipeline {
    agent any
    stages {
        stage('Build') {

            steps {
                getInputParams(10, 20)


                echo 'Build'
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}

def getInputParams(def param1, def param2) {
    println("param1 is "+ param1 + ", param2 is " + param2)

    def mymap = ["tools-devportal":"22-11-2021", "a":"30", "2":"42"]

    def x = mymap.find{ it.key == "tools-devportal" }?.value
    if(x)
        println "x value: ${x}"

    String config = libraryResource 'config.json'

    //def props = readJSON file: 'config.json'
    def props = readJSON text: config

    props.each { key, value ->
        echo "Walked through key $key and value $value"
    }
}
