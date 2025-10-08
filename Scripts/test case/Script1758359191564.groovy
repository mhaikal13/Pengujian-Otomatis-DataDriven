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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

TestData Data = TestDataFactory.findTestData('Data Files/DATAEXTERNAL')

WebUI.openBrowser('https://rpachallenge.com/')

WebUI.click(findTestObject('ObjectWeb/ButtonStart'))

for (def index : (1..Data.getRowNumbers())) {
    String FirstName = Data.getValue('First Name', index)

    if ((FirstName == null) || FirstName.trim().isEmpty()) {
        break
    }
    
    String lastName = Data.getValue('Last Name', index)

    if ((lastName == null) || lastName.trim().isEmpty()) {
        break
    }
    
    String CompanyName = Data.getValue('Company Name', index)

    if ((CompanyName == null) || CompanyName.trim().isEmpty()) {
        break
    }
    
    String RoleinCompany = Data.getValue('Role in Company', index)

    if ((RoleinCompany == null) || RoleinCompany.trim().isEmpty()) {
        break
    }
    
    String Address = Data.getValue('Address', index)

    if ((Address == null) || Address.trim().isEmpty()) {
        break
    }
    
    String Email = Data.getValue('Email', index)

    if ((Email == null) || Email.trim().isEmpty()) {
        break
    }
    
    String PhoneNumber = Data.getValue('Phone Number', index)

    if ((PhoneNumber == null) || PhoneNumber.trim().isEmpty()) {
        break
    }
    
    WebUI.setText(findTestObject('ObjectWeb/InputFirstName'), FirstName)

    WebUI.setText(findTestObject('ObjectWeb/InputLastName'), lastName)

    WebUI.setText(findTestObject('ObjectWeb/InputCompanyName'), CompanyName)

    WebUI.setText(findTestObject('ObjectWeb/InputRoleInCompany'), RoleinCompany)

    WebUI.setText(findTestObject('ObjectWeb/InputAddress'), Address)

    WebUI.setText(findTestObject('ObjectWeb/InputEmail'), Email)

    WebUI.setText(findTestObject('ObjectWeb/InputPhoneNumber'), PhoneNumber)

    WebUI.click(findTestObject('ObjectWeb/ButtonSubmit'))
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

