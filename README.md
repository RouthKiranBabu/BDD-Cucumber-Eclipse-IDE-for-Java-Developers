# 🧪 Test Execution
<img src = 'Cucumber Result.gif'/>

# 🪜 Guide
## Create the maven Project and Guide:
 - File -> New -> Others -> Maven(Folder) -> Maven Project -> Next -> Next -> In the New Maven Project -> Select Catalog as Internal -> next -> provide same name of the Project in the Group id and Artifact id -> Finish
 - Wait for some time for download progress. Enter Y then Press enter key.
 - Delete the Packages present in the src/main/java and src/test/java, Which is created by default
 - Dependencies need to add:
    - Cucumber-core
    - Cucumber-html
    - cobertura code coverage
    - Cucumber-java
    - Cucumber-junit
    - Cucumber-jvm-deps
    - Cucumber-reporting
    - Hamcrest-core
    - Gherkin
    - Junit
    - Selenium-java
    - com.sun tools
  - Create Folder Structure:<br>
    Project Name<br>
|-> Features(Folder of mavenProject)<br>
|-> pageObjects(Package of src/test/java)<br>
|-> stepDefinitions(Package of src/test/java)<br>
|-> testRunner(Package of src/test/java)<br>
|-> Utilities(Package of src/test/java)<br>
|-> Drivers(Folder of mavenProject)<br>
|-> target(for Reports already present)<br>
|-> pom.xml<br>
 - In the Drivers folder -> add the necessary drivers.<br>Link for Drivers -> https://github.com/RouthKiranBabu/Masai-School-Journey/tree/main/Lectures/Selenium/Cucumber/Drivers
 - Right Click -> Features Folder -> New -> File -> Name: Login.feature -> Finish -> Write in Login.feature.
 - In the pageObjects package -> Create class -> Name: LoginPage -> Finish -> Write in LoginPage.java
 - Right click -> stepDefinitions -> New -> Class -> Name -> Steps -> Finish
 - Right Click -> MavenProject -> Maven -> Update Project -> OK
 - Login.feature -> Run as -> Cucumber Feature
 - Right Click -> mavenProject -> Run as -> Run Configurations 
 - Name Correct -> Project Name
 - Enter the correct Feature Path if needed -> Apply -> Run
 - In the Login.feature -> Right click -> Run as -> Cucumber Feature
 - Copy the methods shown at Console -> Paste in the Steps.java
 - Then remove the following from the Steps.java:<br>```
   // Write code here that turns the phrase above into concrete actions
   throw new io.cucumber.java.PendingException();```
 - Write -> in -> Steps.java
 - Inside the testRunner -> Create Class -> TestRun.java
 - Write -> in -> TestRun.java

> [!WARNING]
> If you face error line over '@RunWith(Cucumber.class)' Hover over it and select first option.

 - refresh the project -> In the target Folder -> Open the htmlreport.html ->  Open with System Editor
 - In the Login.feature -> add the Scenario Outline and examples in the Testrun.java -> make dryRun = true -> run the TestRun.java -> Junit Test watch the output
 - In the Login.feature -> make dryRun = false -> run the TestRun.java -> Junit Test watch the output

# 📃 Previous Assignments
- [1. BDD Cucumber with POM(Page Object Models)](https://github.com/RouthKiranBabu/Masai-School-Journey/tree/main/Assignment/Cucumber/CCP_Block3_S4%20%20Page%20Object%20Model%20%26%20Implementation/Group_artifact_id)
- [2. Click here](https://github.com/RouthKiranBabu/Masai-School-Journey/tree/main/Lectures/Selenium/Cucumber)
