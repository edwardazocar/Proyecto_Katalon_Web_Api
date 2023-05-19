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

CustomKeywords.'open.Browser.Abrir_Navegador.OpenNavegador'()

WebUI.setText(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setText(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/input_Password_password'), 'admin123')

WebUI.click(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/button_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/div_0247 abhi  shekLe'))

WebUI.click(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/a_Emergency Contacts'))

WebUI.click(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    'Homero')

WebUI.setText(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/input_Relationship_oxd-input oxd-input--focus'), 
    'Father')

WebUI.setText(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/input_Mobile_oxd-input oxd-input--focus'), 
    '123456789')

WebUI.click(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_Agregar_Contacto_Emergencia_Empleado/Page_OrangeHRM/div_SuccessSuccessfully Saved'), 
    0)

WebUI.closeBrowser()

