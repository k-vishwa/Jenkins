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
    // echo '111111'
    //     git url: "${config.name}"

    // echo '222222'
    //     // git(url: config.name)
    //     git(url: "https://github.com/jenkinsci/pipeline-examples.git")
        // sh 'mvn install'
        //  mail to: '...', subject: "${config.name} plugin build", body: '...' */
        //  stage ('in BUild Plugin'){
            //  echo "in BUild Plugin " + "${config.name}"
        //  }
        println "hholla" + body.name
        
//    }
}    