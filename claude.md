# Project goal

Migrate Selenium to Playwright for Java (Java to Java, Gradle). Keep Cucumber and TestNG.

# Baseline (branch main)

Selenium suite passes: 4 scenarios, 8 executions, Java 21, gradlew test ~15s warm.

# Rules

- Only convert files that use Selenium (imports org.openqa.selenium.\*, WebDriver, WebDriverManager, PageFactory).
- Adapt files only if they depend on changed signatures (e.g. driver getters).
- Leave everything else, including .feature files, untouched.
- Edit build.gradle surgically: swap Selenium deps for com.microsoft.playwright:playwright.
- Tests run in parallel, so each thread needs its own Playwright instance.
- Verify with: gradlew.bat compileTestJava, then gradlew.bat test.
- Do not use Thread.sleep; rely on Playwright auto-waiting.
- Never edit files outside this repo. Ask before running anything that deletes files.
