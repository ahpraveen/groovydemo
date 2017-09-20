/*
@Description : Collection of groovy script snippets required to achieve automation in soapUI
*/
1. Using Log variable
 log.info(“Any Text message ” + anyVariable)

2. Using Context variable
 def myVar = context.expand( ‘${#TestCase#SourceTestStep}’) //will expand TestCase property value into the new variable
  context.testCase // returns the current testCase handle

3. Using TestRunner variable
 testRunner.testCase.getTestStepByName(“TestStepName”)
  testRunner.testCase // return the handle to current testCase
  testRunner.testCase.testSuite.project.testSuites[“My_TestSuite”]

4. Using MessageExchange variable
 messageExchange.getEndpoint() //endpoint to the selected teststep
  messageExchange.getTimestamp() //timestamp
  messageExchange.getTimeTaken() //time taken to process the request/response

5. Using Project, TestSuite, TestCase, TestStep methods
def project = testRunner.testCase.testSuite.project
  def project = context.testCase.testSuite.project

  def myTestSuite = project.getTestSuiteAt(IndexNumber)
  def myTestSuite = project.getTestSuiteByName(“Name of the TestSuite”)

  def myTestCase = myTestSuite.getTestCaseAt(IndexNumber)
  def myTestCase = myTestSuite.getTestCaseByName(“Name of the TestCase”)

  def myTestStep = myTestCase.getTestStepAt(IndexNumber)
  def myTestStep = myTestCase.getTestStepByName(“Name of the TestStep”)

6. RawRequest & RawResponse
  messageExchange.getRequestContentAsXml.toString()
  messageExchange.getResponseContentAsXml.toString()

7. groovyUtils & XmlHolder
 def groovyUtils = new com.eviware.soapui.support.GroovyUtils( context )
  def holder = groovyUtils.getXmlHolder (“Assert_Script#Response”)

8. Converting String into Integer & Integer into String using groovy
  anyStringVar = anyIntegerVar.toString()
  anyIntegerVar = anyStringVar.toInteger()