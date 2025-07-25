const { Builder, By } = require('selenium-webdriver');

(async function testLogin() {
  let driver = await new Builder().forBrowser('chrome').build();

  try {
    // 1. Open the local login page
    await driver.get('http://localhost:3000/loginform.html');

    // 2. Enter username and password
    await driver.findElement(By.id('username')).sendKeys('admin');
    await driver.findElement(By.id('password')).sendKeys('123456');

    // 3. Click the login button
    await driver.findElement(By.id('loginBtn')).click();

    // 4. Wait for 2 seconds
    await driver.sleep(2000);

    console.log('Login form test completed successfully.');
  } finally {
    await driver.quit();
  }
})();
