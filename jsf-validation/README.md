# JSF Input Validation
> This repo contains a Java EE 7 with GlassFish 5 Application Server to validate inputs using JSF and Bean Validatos JSR 380 with CDI Bean.
### Tech
* Java 8
* JEE 7
* JSF
* GlassFish 5
* Maven
### Deploy
1. Package the application and generate war ```mvn clean package```
2. Start asadmin utility for GlassFish:
```./[glassfish installation directory]/glassfish5/bin/asadmin start-domain```
3. deploy the application from command line using:
```./[glassfish installation directory]/glassfish5/bin/asadmin deploy [path to war file]```
4. check log:
```tail -f [glassfish installation directory]/glassfish5/glassfish/domains/domain1/logs/serve.log```
5. to remove:
```./[glassfish installation directory]/glassfish5/bin/asadmin undeploy [path to war file]```

