def call (){
  echo"build Proyect..."
  bat"mvn clean package -Dmaven.test.skip=true"
}
