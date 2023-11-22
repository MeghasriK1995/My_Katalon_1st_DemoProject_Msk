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

WebUI.navigateToUrl('https://jpetstore.aspectran.com/catalog/')

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/a_Fish'))

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/a_FI-SW-01'))

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/a_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/input_true_EST-1'), '2')

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/button_Update Cart'))

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/a_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/button_Login'))

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/button_Continue'))

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/input_Ship to different address_shippingAdd_0f9b79'))

WebUI.setText(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/input_Zip_billZip'), '12356')

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/button_Continue'))

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/button_Continue'))

WebUI.setText(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/input_Zip_shipZip'), '1256')

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/button_Continue'))

WebUI.click(findTestObject('Object Repository/My_1st_OR_MSK/Page_JPetStore Demo/button_Confirm'))

WebUI.closeBrowser()
