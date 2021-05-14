pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('./src/com/khoavu/pipelineJob.groovy'))
            sandbox()
        }
    }
}