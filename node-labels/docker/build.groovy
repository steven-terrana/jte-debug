void call(){
  stage("docker library"){
    node{
      sh "docker -v" 
    }
    node("directly-passed"){
      sh "docker -v"
    }
  }
}
