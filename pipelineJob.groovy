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
}
