@Init
void call(){
    additionalParams << booleanParam(name: 'PUSH_RELEASE_ARTIFACTS', defaultValue: false, description: 'Deploy to release repository')
    stage("Maven: Build"){
        println "build from the maven library"
    }
}
