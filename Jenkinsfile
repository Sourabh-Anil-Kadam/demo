 node{

   def tomcatWeb = 'C:\\IndusJDE\\jboss-eap-7.1\\standalone\\deployments'
   def tomcatBin = 'C:\\IndusJDE\\jboss-eap-7.1\\bin'
   def tomcatStatus = ''
   stage('SCM Checkout'){
     git 'https://github.com/Sourabh-Anil-Kadam/jenkins.git'
   }
   stage('Compile-Package-create-war-file'){
      // Get maven home path
      def mvnHome =  tool name: 'maven-3', type: 'maven'   
      bat "${mvnHome}/bin/mvn package"
      }
/*   stage ('Stop Tomcat Server') {
               bat ''' @ECHO OFF
               wmic process list brief | find /i "tomcat" > NUL
               IF ERRORLEVEL 1 (
                    echo  Stopped
               ) ELSE (
               echo running
                  "${tomcatBin}\\shutdown.bat"
                  sleep(time:10,unit:"SECONDS") 
               )
'''
   }*/
/*
   stage('Deploy to Tomcat'){
     bat "copy target\\Jenkins.war \"${tomcatWeb}\\Jenkins.war\""
   }


stage('Deploy to JBoss') { 
            steps {
                sh 'cp C:/Users/sourabh.kadam/.jenkins/workspace/test1@script/412489e20ea20b3d08dc90bf5fa0af32aa803f036afef725459e1cc3f800fa14/day22.5/ebixproject.war C:/IndusJDE/jboss-eap-7.1/standalone/deployments/ebixproject.war'
            } 
        }
        */
      stage ('Start Tomcat Server') {
         sleep(time:5,unit:"SECONDS") 
         bat "${tomcatBin}\\startup.bat"
         sleep(time:100,unit:"SECONDS")
   }
}
