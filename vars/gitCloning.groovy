def call(String branch,String url){
  echo "This is cloning the code"
  git url: url, branch:branch
  echo "Code cloned successfully"
}
