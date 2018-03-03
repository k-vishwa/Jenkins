@Library('demo') _
// import org.foo.*

/*standardPipeline {
        projectName = "Project1"
        serverDomain = "Project1 Server Domain"
    }*/

pipeline {
    agent any
    stages {
        /* "Build" and "Test" stages omitted */
        stage('Deploy - Staging') {
            steps {
                sh '''
                echo "---------"
                '''
               /*  script {
                    def z = new org.foo.Zot()
                    z.checkOutFrom("https://github.com/k-vishwa/blue.git")
                    println z
                } */
                script { 
                    // def param = [name: 'git']
                    buildPlugin { 
                        name = "https://github.com/k-vishwa/blue.git"
                    }
                }
            }
        }

       
    }
}
