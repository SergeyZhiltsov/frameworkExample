# frameworkExample
* This test framework is created only for researching and demonstrating purposes
* Main goal of this test framework is to achieve balance beetwen comfort and simplicity of writing code, speed of tests execution and memory management
* Framework can be easly extended to projects needs(add Android/iOS driver, add additional subprojects, web sites etc.)

### How do I get set up? ###

* JDK 8, path to it is added to the system classPath
* NodeJS last version

### Project structure ###
* DriverManager - class with base config of env, driver, browser, sys vars etc.
* Config, ui-config, api-config, - config files with urls, env propeties etc.
* For each site we have ui and api parts
* Wiki - base site class(for example), pls add new page object to it and reuse them in test (smt like ptvc.newPage.doSmth) instead of creating new object in test class
* In "pages" directory placed all pages of web site, pls add there a new directory for page with methods and uiObjects classes
* Api part consist of services(can by copy of devs projects structure), controllers(to call actions from services), pojos, assertions, conditions etc.
* If you need to create object of pojo class with randomzed fields you can add new methods to BaseWikiTest instead of BaseApiTest class if you want to use pojos in ui tests for example
* If you want to sout smt, pls use logger class.
