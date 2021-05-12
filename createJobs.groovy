pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
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