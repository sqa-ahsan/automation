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

WebUI.navigateToUrl('https://nullbrainer.io/contact/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Contact - nullBrainer/input_Contact_your-name'), 'QA Engineer Testing the website for better user experience')

WebUI.setText(findTestObject('Object Repository/Page_Contact - nullBrainer/input_Contact_your-email'), 'ahsan@nullbrainer.io')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact - nullBrainer/select_App Development  TestingWebsite Deve_e473fb'), 
    'Website Development & Design', true)

WebUI.setText(findTestObject('Object Repository/Page_Contact - nullBrainer/input_Contact_Phone'), '0000000000000')

WebUI.setText(findTestObject('Object Repository/Page_Contact - nullBrainer/input_Contact_company'), 'Nullbrainers')

WebUI.setText(findTestObject('Object Repository/Page_Contact - nullBrainer/textarea_Contact_textarea'), 'HI there I am testing this website for better user experience so we don\'t face any difficulties in future, Best of luck!')

WebUI.click(findTestObject('Object Repository/Page_Contact - nullBrainer/input_Contact_wpcf7-form-control has-spinne_f93865'))

WebUI.click(findTestObject('Object Repository/Page_Contact - nullBrainer/div_Thank you for your message. Our team wi_a6901e'))

WebUI.closeBrowser()

