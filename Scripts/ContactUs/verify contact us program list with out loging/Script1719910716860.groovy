import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://chamberskills.codeolima.com/')

WebUI.click(findTestObject('Object Repository/Page_CHAMBER SKILLS/input__full_name'))

WebUI.setText(findTestObject('Object Repository/Page_CHAMBER SKILLS/input__full_name'), 'Teat  Ayeshwery02')

WebUI.setText(findTestObject('Object Repository/Page_CHAMBER SKILLS/input__phone_number'), '601256')

WebUI.setText(findTestObject('Object Repository/Page_CHAMBER SKILLS/input__email'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_CHAMBER SKILLS/input_Company Name_company_name'), ' test pvt ltd')

WebUI.doubleClick(findTestObject('Object Repository/Page_CHAMBER SKILLS/input_Agile Project Management - The PMI-AC_87e62b'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CHAMBER SKILLS/input_Scrum Product Owner Certification und_b06d7b'))

WebUI.click(findTestObject('Object Repository/Page_CHAMBER SKILLS/button_SEND NOW'))

WebUI.closeBrowser()

