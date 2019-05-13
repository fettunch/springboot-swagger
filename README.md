This springboot project includes Swagger UI and exposed a REST services. 

The project is deployed in google cloud at the endpoint: https://springboot-240018.appspot.com/

SWAGGER:

Add the followgin dependency to the pom.xml:

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>

The class SwaggerConfig is the sawgger configuration class using Docket bean.

Add the maven dependency to connect to swagger ui https://springboot-240018.appspot.com/swagger-ui.html:

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>

Follow the article https://stackoverflow.com/questions/48170662/google-app-engine-standard-env-not-found-controller-method-spring-boot-app to check how to configure the app to work on google cloud.

Check ServletInitializer, this class is important to inject Springboot app in the Servlet context.

Run mvn clea install to build the app. 

Run mvn appengine:run to run the app within the app engine simulation environment.
