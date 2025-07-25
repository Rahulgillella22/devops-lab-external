// Import selenium-webdriver library
const { Builder, By, Key } = require('selenium-webdriver');

// Create an asynchronous function to run the browser automation
(async function googleSearch() {
  // Step 1: Launch Chrome browser
  let driver = await new Builder().forBrowser('chrome').build();

  try {
    // Step 2: Open Google website
    await driver.get('https://www.google.com');

    // Step 3: Find the search box by its name 'q' and type in the search query
    await driver.findElement(By.name('q')).sendKeys('DevOps with Selenium', Key.RETURN);

    // Step 4: Wait for 2 seconds to see the results
    await driver.sleep(2000);

    // Log a message
    console.log('✅ Test completed successfully.');
  } finally {
    // Step 5: Close the browser
    await driver.quit();
  }
})();
