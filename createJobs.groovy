import groovy.json.JsonSlurper

pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('./src/com/khoavu/pipelineJob.groovy'))
            sandbox()
        }
    }

    testFunc()
}

pipelineJob('backend-pipe') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/khoahp/backend.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

def testFunc() {
    println("*******testFunc*******")

    String config = libraryResource 'config.json'

    //def props = readJSON file: 'smocktest.json'
    def props = readJSON text: config
    //def props = readJSON text: '{"tools-devportals":" 01-12-2021","mobile-authz":" 01-11-2021"}'

    props.each { key, value ->
        echo "Walked through key $key and value $value"
    }

}