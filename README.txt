WSO2 Platform Automated Test Suite 

WSO2  Platform Automated Test Suite (PATS) is a distribution containing all integration and platform test jars released with each product. It contains an ant based test executor to run the test cases in each test jar file. This ant script is based on TestNG ant task which can be used as a test case runner. 

WSO2 PATS is an open source product available under the Apache Software License (v2.0) 

Installing WSO2 PATS

1. Extract the PATS distribution zip.
2. The directory containing the INSTALL.txt file will be the root and will be treated as the build home directory. This will be referred to as PATS_HOME from here onwards.
3. All the test jars are available in the PATS_HOME/bin directory.
4. All the PATS configuration files are available in the PATS_HOME/config directory.
5. WSO2 PATS is an ant based testNG suite runner which can be used to execute a set of tests on premise or cloud platform.
6. WSO2 PATS test runner provides three types of test invocations:

    * Run all testng suite files in the given test jar.
    * Run a test class provided as command line argument.
    * Run a test package provided as command line argument.

Option two and three are provided for debugging purposes.

7. To get started, go to PATS_HOME and run the command given below. This will download the required ant jars to ${user.home}/.ant/lib.  
      ant install-jars
8.Then you need to copy all the jars to $ANT_HOME/lib. This step is optional (required only for mail generation).
9.Test runner can be configured by editing the automation.xml file at PATS_HOME/config.

      The minimum set of properties to run tests is as follows:
<configurations>
       <!--
        Change this to edit wait time for test artifact deployment
       -->
       <deploymentDelay>60000</deploymentDelay>
       <!--
        Change this to true if you want to generate coverage statistics
       -->
       <coverage>false</coverage>
       <!--
        Change this to true if you want to enable framework dashboard
       -->
       <frameworkDashboard>false</frameworkDashboard>
  </configurations>
Edit the product group tag and set clustringEnabled=true to enable clustering and set your platform details under each product group.
<productGroup name="AS" clusteringEnabled="true">
11. Import the server certificate to our default keystore, wso2carbon.jks at PATS_HOME/config/keystores. Default keystore password is wso2carbon.
12. Edit the automation.xml again and put your user credentials under the userManagement tag.
13. To execute the tests, run the following commands:

Execute all test suites inside a test jar file
          ant run-suite - Djar.name=org.wso2.carbon.esb.tests-4.x.x-tests.jar
Execute particular test class
           ant run-class - Djar.name=org.wso2.carbon.esb.tests-4.x.x-tests.jar -Dclass.name=ProxyServiceWithWSAddressingTestCase
Execute test package inside a jar file

ant run-package - Djar.name=org.wso2.carbon.esb.tests-4.x.x-tests.jar -Dpackage.name=org.wso2.carbon.esb.proxyservice.test.*
Usage: ant [commands] [system-properties]
Commands:
run-suite - execute all testng suites inside the given jar.
run-class - execute the class given as command line argument.
run-package - execute the given package specified as command line argument.
system-properties:
-Djar.name: Name of the test jar file to be executed.
-Dpackage.name: Name of the test package to be executed.
-Dclass.name: Name of the test class to be executed.


System Requirements

1. Minimum memory - 2GB

2. Processor - Pentium 800MHz or equivalent at minimum

3. Java SE Development Kit 1.6.0_24 or higher

4. Maven 2.1.0 or later.

Project Resources

WSO2 PATS Documentation 

https://docs.wso2.com/pages/viewpage.action?pageId=34603102

Reporting Problems

Issues can be reported using the WSO2 PATS public JIRA available here

Support

We are committed to ensuring that your enterprise middleware deployment is completely supported from evaluation to production. Our unique approach ensures that all support leverages our open development methodology and is provided by the very same engineers who build the technology. For more details and to take advantage of this unique opportunity http://wso2.com/support/

For more information about WSO2 Platform Automated Test Suite, please refer https://docs.wso2.com/display/TA430/Introducing+Test+Automation+Framework or visit the WSO2 Oxygen Tank developer portal for addition resources.

Thank you for your interest in WSO2 Test Automation Framework.We value your patronage.

- The WSO2 Test Automation Framework Team - 


(c) Copyright 2014 WSO2 Inc.


