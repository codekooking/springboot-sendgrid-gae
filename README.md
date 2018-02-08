Spring Boot Tutorial
===

Sending Email with Sendgrid and Spring Boot on Google App Engine (GAE)
---

> **Prerequisites:**

> - Java 8
> - Maven 3.5.x
> - Spring Boot 1.5.9
> - GAE Standard
> - Google Cloud SDK installed on your PC

#### <i class="icon-file"></i> Installation

 - Copy file "src\main\resources\application.dist.properties" to **"src\main\resources\application.properties"**. Change Sendgrid parameters as following:
	 - SENDGRID_USERNAME
	 - SENDGRID_PASSWORD
 - Copy file "src\main\webapp\WEB-INF\appengine-web.dist.xml" to **"src\main\webapp\WEB-INF\appengine-web.xml"**. Change GAE configuration as below:
	 - PROJECT_NAME
	 - GAE_SERVICE_NAME
 - Copy file "src\main\webapp\WEB-INF\logging.dist.properties" to **"src\main\webapp\WEB-INF\logging.properties"** and change logging level

#### <i class="icon-refresh"></i> Run on your Local environment
```
$ mvn clean install
$ mvn appengine:run
```

Go to http://localhost:8080

#### <i class="icon-upload"></i> Deploy to GAE
```
$ mvn clean install
$ mvn appengine:deploy
```

Go to https://GAE_SERVICE_NAME-dot-PROJECT_NAME.appspot.com

Or by using **glcoud** command as below
```
$ gcloud app browse -s GAE_SERVICE_NAME
```

