pipeline {
    agent any
    stages {
        stage('Build') {

            script {
                        //first.groovy path might change as per your need
                        def var1 = load "EmailHelper.groovy"
                        var1.build("php build")
            }

            steps {
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

d