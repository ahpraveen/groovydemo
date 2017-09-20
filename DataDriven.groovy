/**
 * The below script is used for data driven
 */
import java.io.*
import jxl.*

def f = new File("C:\\TESTDATA\\data\\Test_Data.xls")
def wk = Workbook.getWorkbook(f)
def ws = wk.getSheet("A")
r = ws.getRows()
log.info r

Cell c2 = ws.getCell(5,13)
log.info c2.getContents()
testRunner.testCase.testSuite.setPropertyValue("NAME",c2.getContents())

Cell c3 = ws.getCell(6,13)
log.info c3.getContents()
testRunner.testCase.testSuite.setPropertyValue("ADDRESS",c3.getContents())

Cell c4 = ws.getCell(7,13)
log.info c3.getContents()
testRunner.testCase.testSuite.setPropertyValue("SURNAME",c4.getContents())