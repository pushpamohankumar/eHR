package org.base;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.List;
	import java.util.Properties;
	import java.util.Set;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class BaseClass {
		 protected static WebDriver driver;
			Select s;
			String data;
			
		public static String getProjectPath() {
		String property = System.getProperty("user.dir");
		return property;
		

	}

		
		public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
			Properties p=new Properties();
			p.load(new FileInputStream(getProjectPath()+"Configure\\Cofigure Properties"));
			String value=(String)p.get(key);
			return value;

		}

		public byte[] Screenshot() {
			TakesScreenshot tks=(TakesScreenshot)driver;
			byte[] screenshotAs = tks.getScreenshotAs(OutputType.BYTES);
			return screenshotAs;
			

		

		}
		
		

			public static void browserLaunch() {
				 driver = new ChromeDriver();
				//driver = new EdgeDriver();

			}
		

			public static  void enterAppInUrl(String data) {
				if (data != null)
					driver.get(data);
			}
		

			public static  void maximixeWindow() {
				// TODO Auto-generated method stub
				driver.manage().window().maximize();
			}
		

			public void sendKeys(WebElement element, String data) {
				// TODO Auto-generated method stub
				element.sendKeys(data);
			}
			
			public void sendKeysEnter(WebElement element, String data) {
				// TODO Auto-generated method stub
				element.sendKeys(data,Keys.ENTER);
			}
			
		

			public void click(WebElement element) {
				// TODO Auto-generated method stub
				element.click();
			}
			

			public String getTitle() {
				// TODO Auto-generated method stub

				String title = driver.getTitle();
				return title;
			}
			

			public void sendKeysJs(WebElement element, String data) {
				// TODO Auto-generated method stub
				boolean enabled = isEnabled(element);
				boolean displayed = isDisplayed(element);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				if (enabled && displayed) {
					executor.executeScript("arguments[0], Setattribute('value," + data + "')", element);
				}
			}
		

			public void clickJS(List<WebElement> close) {
				// TODO Auto-generated method stub
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click()", close);
			}
		

			public Object returnJS(WebElement element, String data) {
				// TODO Auto-generated method stub
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				Object object = executor.executeScript("returnarguments[0].getAttribute('value," + data + "')", element);
				return object;
			}
			

			public void scrollUp(WebElement element) {
				// TODO Auto-generated method stub
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].scrollIntoView(false)", element);
			}
		
			public void scrollDown(WebElement element) {
				// TODO Auto-generated method stub
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].scrollIntoView(true)", element);

			}
		

			public void selectOptionByAttribute(WebElement element, String value) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				s.selectByValue(value);
			}
		

			public void selectByText(WebElement element, String text) {
				Select s = new Select(element);
				s.selectByVisibleText(text);
			}
			
			public void selectByIndex(WebElement element, int index) {
				Select s = new Select(element);
				s.selectByIndex(index);
			}
		

			public void deselectByIndex(WebElement element, int index) {
				Select s = new Select(element);
				s.deselectByIndex(index);
			}
			

			public void deselectByText(WebElement element, String text) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				s.deselectByVisibleText(text);
			}
		
			public void deselectByAttribute(WebElement element, String value) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				s.deselectByValue(value);
			}
		
			public void deselectAll(WebElement element, String value) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				s.deselectAll();
			}

			public static boolean isDisplayed(WebElement element) {
				// TODO Auto-generated method stub
				boolean display = element.isDisplayed();
				return display;
			}
		

			public boolean isSelected(WebElement element) {
				// TODO Auto-generated method stub
				boolean select = element.isSelected();
				return select;
			}
			

			public boolean isEnabled(WebElement element) {
				// TODO Auto-generated method stub
				boolean enable = element.isEnabled();
				return enable;
			}
			
			public Object explicitWait(int time, String locator, WebElement element) {
				// TODO Auto-generated method stub
				WebDriverWait ref = new WebDriverWait(driver, Duration.ofSeconds(time));
				WebElement element1 = ref.until(ExpectedConditions.visibilityOf(element));
				return element1;
			}
		
			public static void implicitWait(int secs) {
				// TODO Auto-generated method stub
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
			}
		

			public Object fluentWait(long time, long time1, String locator, WebElement element) {
				// TODO Auto-generated method stub
				Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(time))
						.pollingEvery(Duration.ofSeconds(time1));
				Object ref = w.until(ExpectedConditions.elementToBeClickable(element));
				return ref;

			}
		

			public void accept() {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}
			
			public void dismiss() {
				// TODO Auto-generated method stub
				Alert alert = driver.switchTo().alert();
				alert.dismiss();

			}
			

			public static String getText(WebElement element) {
				// TODO Auto-generated method stub
				String text = null;
				boolean displayed = isDisplayed(element);
				if (displayed) {
					text = element.getText();
				}
				return text;
			}
			
			public void robot() throws AWTException {
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);

			}
			

			public  String currenturl() {
				// TODO Auto-generated method stub
				String text = driver.getCurrentUrl();
				return text;
			}
			

			public  void close() {
				// TODO Auto-generated method stub
				driver.close();

			}
		
			public void quit() {
				// TODO Auto-generated method stub
				driver.quit();
			}
		

			public String getAttribute(WebElement element, String value) {
				// TODO Auto-generated method stub
				String text = null;
				boolean displayed = isDisplayed(element);
				if (displayed) {
					text = element.getAttribute("value");
				}
				return text;
			}
		
			public Set<String> childWindow() {
				// TODO Auto-generated method stub
				Set<String> handle = driver.getWindowHandles();
				return handle;
			}
			

			public String ParentWindow() {
				// TODO Auto-generated method stub
				String handle = driver.getWindowHandle();
				return handle;
			}
		
			public void framebyindex(int index) {
				// TODO Auto-generated method stub
				driver.switchTo().frame(index);
			}
		

			public void framebyid(String Id) {
				// TODO Auto-generated method stub
				driver.switchTo().frame(Id);
			}
		

			public void framebyname(String name) {
				// TODO Auto-generated method stub
				driver.switchTo().frame(name);
			}
		

			public void framebyElement(WebElement element) {
				// TODO Auto-generated method stub
				driver.switchTo().frame(element);
			}
		
			public void parentFrame() {
				// TODO Auto-generated method stub
				driver.switchTo().parentFrame();
			}
			
		
			public WebElement findlocatorbyId(String Id) {
				// TODO Auto-generated method stub
				WebElement element = driver.findElement(By.id(Id));
				return element;
			}

		

			public WebElement findlocatorbyname(String name) {
				// TODO Auto-generated method stub
				WebElement element = driver.findElement(By.name(name));
				return element;
			}

		

			public WebElement findlocatorbyclassName(String className) {
				// TODO Auto-generated method stub
				WebElement element = driver.findElement(By.className(className));
				return element;
			}

		
			public WebElement findlocatorbyxPath(String xpathexpression) {
				// TODO Auto-generated method stub
				WebElement element = driver.findElement(By.xpath(xpathexpression));
				return element;
			}

		
			public List<WebElement> findlocatorbyElementsxPath(String xpathexpression) {
				// TODO Auto-generated method stub
				List<WebElement> element = driver.findElements(By.xpath(xpathexpression));
				return element;
			}
		
			public List<WebElement> findlocatorbyElementsId(String xpression) {
				// TODO Auto-generated method stub
				List<WebElement> element = driver.findElements(By.id(xpression));
				return element;
			}

		
			public List<WebElement> getOptions(WebElement element) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				List<WebElement> option = s.getOptions();
				for (int i = 0; i < option.size(); i++) {
					option.get(i).getText();

				}
				return option;
			}
			
			public List<WebElement> getAllAttributeValueOptions(WebElement element, String text, int i) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				s.selectByValue(text);
				List<WebElement> option = s.getOptions();
				for (i = 0; i < option.size(); i++) {
					option.get(i).getText();

				}
				return option;
			}
		
			public WebElement getFirstOption(WebElement element) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				WebElement option = s.getFirstSelectedOption();
				return option;
			}
		
			public List<WebElement> getAllSelectedOptions(WebElement element) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				List<WebElement> option = s.getAllSelectedOptions();
				return option;
			}
			
			public boolean isMultiple(WebElement element) {
				// TODO Auto-generated method stub
				Select s = new Select(element);
				boolean option = s.isMultiple();
				return option;
			}
			
			public void clear(WebElement element) {
				// TODO Auto-generated method stub
				element.clear();
			}
			
		
			public String getprojectpath() {
				// TODO Auto-generated method stub
				String path = System.getProperty("user.dir");
				return path;
			}
			
		
			public void takeScreenshot(String filename, WebElement element) {
				// TODO Auto-generated method stub
				TakesScreenshot tk = (TakesScreenshot) driver;
				tk.getScreenshotAs(OutputType.FILE);
				File d = new File(getprojectpath() + "\\Screenshot\\" + filename + ".png");
			}
			
			public void mouseover(WebElement element) {
				// TODO Auto-generated method stub
				Actions a = new Actions(driver);
				a.moveToElement(element).perform();
			}
			
		
			public void dragAndDrop(WebElement element, WebElement element1) {
				// TODO Auto-generated method stub
				Actions a = new Actions(driver);
				a.dragAndDrop(element, element1).perform();
			}
			
			
			public void rightClick(WebElement element) {
				// TODO Auto-generated method stub
				Actions a = new Actions(driver);
				a.contextClick(element).perform();
			}
			
			
			public void doubleclick(WebElement element) {
				// TODO Auto-generated method stub
				Actions a = new Actions(driver);
				a.doubleClick(element);
			}
			
		
			public void insertValue(WebElement element, String text) throws AWTException {
				// TODO Auto-generated method stub
				element.sendKeys(text);
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
			
			
			public void refresh() {
				// TODO Auto-generated method stub
				driver.navigate().refresh();
			}
			
		
			public void to(String url) {
				// TODO Auto-generated method stub
				driver.navigate().to(url);
			}
			
		
			public void back() {
				// TODO Auto-generated method stub
				driver.navigate().back();
			}
			
			public void forward() {
				// TODO Auto-generated method stub
				driver.navigate().forward();
			}
			
			
			public List<WebElement> tableHeading(WebElement element, String th, String id) {
				// TODO Auto-generated method stub
				WebElement table = driver.findElement(By.id(id));
				List<WebElement> theading = table.findElements(By.tagName(th));
				for (int i = 0; i < theading.size(); i++) {
					theading.get(i).getText();
				}
				return theading;
			}
			
			
			public List<WebElement> tableRow(WebElement element, String tr, WebElement table) {
				// TODO Auto-generated method stub
				List<WebElement> tRow = table.findElements(By.tagName(tr));
				for (int i = 0; i < tRow.size(); i++) {
					tRow.get(i).getText();
				}
				return tRow;
			}
			
		
			public List<WebElement> tableData(WebElement element, String td, String tr, WebElement table, WebElement rows) {
				// TODO Auto-generated method stub
				List<WebElement> tRow = table.findElements(By.tagName(tr));
				for (int i = 0; i < tRow.size(); i++) {
					rows = tRow.get(i);
				}
				List<WebElement> tData = rows.findElements(By.tagName(td));
				for (int j = 0; j < tData.size(); j++) {
					tData.get(j).getText();
				}
				return tData;
			}
			
		
			public void staticWait(int secs) throws InterruptedException {
				// TODO Auto-generated method stub
				Thread.sleep(secs);
			}
			
			
			public String addTenanteHR(String SheetName,int rownum, int cellnum) throws IOException {
				// TODO Auto-generated method stub
				String res = "";
				File file = new File("C:\\Users\\EMPULSE\\eclipse-workspace\\eHR\\target\\Library\\Tenant.xlsx");
				FileInputStream fileInputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				Sheet sheet = workbook.getSheet(SheetName);
				Row row = sheet.getRow(rownum);
				Cell cell = row.getCell(cellnum);
				CellType type = cell.getCellType();
				switch (type) {
				case STRING:
					res = cell.getStringCellValue();
					break;
				case NUMERIC:
					double d = cell.getNumericCellValue();
					if (DateUtil.isCellDateFormatted(cell)) {
						Date datecellvalue = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
					} else {
						long round = Math.round(d);
						if (d == round) {
							res = String.valueOf(round);
						} else
							res = String.valueOf(d);
					}
				default:
					break;
				}
				return res;
			}
			
		
		
			
			
			
			
			public void updatecelldata(String SheetName, int rownum, int cellnum, String oldData, String newData)
					throws IOException {
				// TODO Auto-generated method stub
				File file = new File(getprojectpath() + "\\Excel sheet\\testing worksheet.xlsx");
				FileInputStream fileInputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				Sheet sheet = workbook.getSheet("hello");
				Row row = sheet.getRow(rownum);
				Cell cell = row.getCell(cellnum);
				String value = cell.getStringCellValue();
				if (value.equals(oldData)) {
					cell.setCellValue(newData);
				}
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				workbook.write(fileoutputstream);

			}
			
		
			public void insertValueInCell(String SheetName, int rownum, int cellnum, String data) throws IOException {
				// TODO Auto-generated method stub
				File file = new File(getprojectpath() + "\\Excel sheet\\testing worksheet.xlsx");
				FileInputStream fileInputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				Sheet sheet = workbook.getSheet("hello");
				Row row = sheet.getRow(rownum);
				Cell createCell = row.createCell(cellnum);
				createCell.setCellValue(data);
				FileOutputStream fileOutput = new FileOutputStream(file);
				workbook.write(fileOutput);

			}

			public void writeCell(String SheetName, int rownum, int cellnum,String data) throws IOException {
				// TODO Auto-generated method stub
				File file = new File(getprojectpath() + "\\Excel sheet\\testing worksheet.xlsx");
				FileInputStream fileInputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				Sheet sheet = workbook.getSheet("hello");
				Row row = sheet.createRow(rownum);
				Cell cell = row.createCell(cellnum);
				cell.setCellValue(data);
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				workbook.write(fileoutputstream);

				
			}


}
