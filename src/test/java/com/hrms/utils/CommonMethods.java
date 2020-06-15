package com.hrms.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.PageInitializer;

public class CommonMethods extends PageInitializer {
	
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	
	public static void clickRadioOrCheckBox(List<WebElement> radioOrchechbox, String value) {
		String actualValue;
		for (WebElement el : radioOrchechbox) {
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) {
				el.click();

				break;
			}
		}
	}

	public static void radioClick(List<WebElement> elements, String radioText) {
		
		for (WebElement el:elements) {
			if (el.getText().equals(radioText)) {
				el.click();
				break;
			}
		}
		
	}
	public static void radioClickElement(WebElement element, String radioText) {
		
			if (element.getText().equals(radioText)) {
				element.click();
				
			}
		}

	
	public static void selectDdValue(WebElement element, String textToSelect) {

		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	public static void selectDdValue(WebElement element, int index) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			int size = options.size();
			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	
	
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	
	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	
	public static String getAlertText() {

		String alertText = null;
		try {
			Alert alert = driver.switchTo().alert();
			alertText = alert.getText();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();

		}

		return alertText;
	}

	
	public static void sendAlertText(String text) {

		try {

			Alert alert = driver.switchTo().alert();

			alert.sendKeys(text);

		} catch (NoAlertPresentException e) {

			e.printStackTrace();

		}

	}

	public static void switchToFrame(String nameOrId) {

		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrame(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}

	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitAndClick(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public static void clickRightElement(List<WebElement> elements, String text) {
		for (WebElement element : elements) {
			String eText = element.getText();
			if (eText.equals(text)) {
				element.click();
				wait(2);
				break;
			}
		}
	}
	

	public static void isDisplay(WebElement element) {
		boolean displayText = element.isDisplayed();
		String text = element.getText();
		if (displayText) {
			System.out.println(text + " is display. Test Case is passed :: " + displayText);
		} else {
			System.out.println(text + " is Not display. Test Case is failed :: " + displayText);
		}
	}

	
	public static void windowsHandle(Set<String> allWindowsHandle, String parentWindowHandle) {

		allWindowsHandle = driver.getWindowHandles();
		Iterator<String> it = allWindowsHandle.iterator();
		while (it.hasNext()) {
			String handle = it.next();
			if (!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(parentWindowHandle);
			}
		}

	}

	public static void parentWindowHandle() {
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("ID of Parent Window Handle is :: " + parentWindowHandle);
	}

	

	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click();", element);
	}

	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void scrollDown(int pixel) {
		getJSObject().executeScript("window.scrollBy(0,-" + pixel + ")");
	}

	
	public static String takeScreenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = Constants.SCREENSHOT_FILEPATH + fileName +getTimeStemp()+ ".png";
		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}
		return destinationFile;
	}
	
	 
	public static byte[] takeScreenShot(String filename) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File file = ts.getScreenshotAs(OutputType.FILE);

		String destinationFile = Constants.SCREENSHOT_FILEPATH + filename + getTimeStemp() + ".png";

		try {

			FileUtils.copyFile(file, new File(destinationFile));

		} catch (Exception ex) {

			System.out.println("Cannot take screenshot!");

		}

		return picBytes;

	}
	

	public static String getTimeStemp () {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
	}
	
	public static void wait(int num) {
		try {
			Thread.sleep(num * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
		
	
	
	
	
	
	
	
}
