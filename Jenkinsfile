@Library('demo') _
// import org.foo.*


pipeline {
    agent any
    stages {
        /* "Build" and "Test" stages omitted */
        stage('Deploy - Staging') {
            steps {
                sh '''
                echo "hahahah"
                '''
                script {
                    ret = new org.foo.Bar("1").getVars()
                    println ret
                }
            }
        }

       
    }
}
