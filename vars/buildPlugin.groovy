// def call(Map config) {
//     node {
//         /* git url: "https://github.com/jenkinsci/${config.name}-plugin.git"
//         sh 'mvn install'
//          mail to: '...', subject: "${config.name} plugin build", body: '...' */
//         echo 'in BUild Plugin' ${config.name}
//     }
// }


def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

//    node {
        /* git url: "https://github.com/jenkinsci/${config.name}-plugin.git"
        sh 'mvn install'
         mail to: '...', subject: "${config.name} plugin build", body: '...' */
        //  stage ('in BUild Plugin'){
             echo "in BUild Plugin " + "${config.name}"
        //  }
        
//    }
}    