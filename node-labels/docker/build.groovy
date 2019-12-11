void call(){
  stage("docker library"){
    node{
      sh "docker -v" 
    }
  }
}
