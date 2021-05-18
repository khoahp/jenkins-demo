pipeline {
    agent any
    stages {
        stage('Build') {

            steps {
                script {
                    //first.groovy path might change as per your need
                    def var1 = load "EmailHelper.groovy"
                    var1.build("php build")
                }

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
