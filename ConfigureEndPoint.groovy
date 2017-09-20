def myEndpoint = "http://testing:8080/VService/SOAP_v3_1/"
def project = testRunner.testCase.testSuite.project
def testSuiteList = project.getTestSuites()
 text = "~"
 testSuiteList.each
 {
 testSuite = project.getTestSuiteByName(it.key)
 testCaseList = testSuite.getTestCases()
 log.info " ${text*5} TestSuite :: $testSuite.name"
 testCaseList.each
  {
  testCase = testSuite.getTestCaseByName(it.key)
  log.info " ${text*5} Testcase :: $testCase.name"

  wsdlTestSteps = testCase.getTestStepsOfType( com.eviware.soapui.impl.wsdl.teststeps.WsdlTestRequestStep.class ) //only WsdlTestRequest steps
  wsdlTestSteps.each
  {
  //log.info it.properties['Endpoint'].value
  it.properties['Endpoint'].value = myEndpoint
  }
  }
 }

log.info "All the endpoints are now : $myEndpoint"