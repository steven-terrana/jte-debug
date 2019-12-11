void call(String label = null, Closure body){
   echo "inside custom node block"
   echo "going to use label: ${label ?: config.label ?: ""}"
   steps.node( label ?: config.label ?: "" ){
    body()
  }
}
