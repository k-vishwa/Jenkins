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
                    def z = new org.foo.Zot()
                    z.checkOutFrom("https://github.com/k-vishwa/blue.git")
                    println z
                }
                /*script { 
                    cool.info 'Starting'
                    cool.warning 'Nothing to do!'
                }*/
            }
        }

       
    }
}
