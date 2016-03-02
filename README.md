# grails3.1.x-mongo-elasticsearch
Sample Grails 3.1.x with Mongo and Elasticsearch

Example project showing Elasticsearch v1.0.0 error with Grails v3.1.2 and Mongo v5.0.1

```
ERROR org.springframework.boot.SpringApplication - Application startup failed
org.grails.core.exceptions.GrailsConfigurationException: Error configuring dynamic methods for plugin [elasticsearch:1.0.0]: Cannot add new static method [search] for arguments [[class java.lang.String]]. It already exists!
	at grails.plugins.DefaultGrailsPluginManager.doDynamicMethods(DefaultGrailsPluginManager.java:714) ~[grails-core-3.1.2.jar:3.1.2]
	at grails.boot.config.GrailsApplicationPostProcessor.onApplicationEvent(GrailsApplicationPostProcessor.groovy:227) ~[grails-core-3.1.2.jar:3.1.2]
	at grails.boot.config.GrailsApplicationPostProcessor.onApplicationEvent(GrailsApplicationPostProcessor.groovy) ~[grails-core-3.1.2.jar:3.1.2]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:163) ~[spring-context-4.2.4.RELEASE.jar:4.2.4.RELEASE]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:136) ~[spring-context-4.2.4.RELEASE.jar:4.2.4.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:381) ~[spring-context-4.2.4.RELEASE.jar:4.2.4.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:335) ~[spring-context-4.2.4.RELEASE.jar:4.2.4.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:855) ~[spring-context-4.2.4.RELEASE.jar:4.2.4.RELEASE]
	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.finishRefresh(EmbeddedWebApplicationContext.java:140) ~[spring-boot-1.3.2.RELEASE.jar:1.3.2.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:541) ~[spring-context-4.2.4.RELEASE.jar:4.2.4.RELEASE]
	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:118) ~[spring-boot-1.3.2.RELEASE.jar:1.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:766) ~[spring-boot-1.3.2.RELEASE.jar:1.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.createAndRefreshContext(SpringApplication.java:361) ~[spring-boot-1.3.2.RELEASE.jar:1.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307) ~[spring-boot-1.3.2.RELEASE.jar:1.3.2.RELEASE]
	at grails.boot.GrailsApp.run(GrailsApp.groovy:55) [grails-core-3.1.2.jar:3.1.2]
	at grails.boot.GrailsApp.run(GrailsApp.groovy:365) [grails-core-3.1.2.jar:3.1.2]
	at grails.boot.GrailsApp.run(GrailsApp.groovy:354) [grails-core-3.1.2.jar:3.1.2]
	at grails.boot.GrailsApp$run.call(Unknown Source) [grails-core-3.1.2.jar:3.1.2]
	at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48) [groovy-2.4.6.jar:2.4.6]
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113) [groovy-2.4.6.jar:2.4.6]
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133) [groovy-2.4.6.jar:2.4.6]
	at g3.Application.main(Application.groovy:8) [main/:na]
Caused by: groovy.lang.GroovyRuntimeException: Cannot add new static method [search] for arguments [[class java.lang.String]]. It already exists!
	at groovy.lang.ExpandoMetaClass$ExpandoMetaProperty.registerStatic(ExpandoMetaClass.java:623) ~[groovy-2.4.6.jar:2.4.6]
	at groovy.lang.ExpandoMetaClass$ExpandoMetaProperty.registerIfClosure(ExpandoMetaClass.java:612) ~[groovy-2.4.6.jar:2.4.6]
	at groovy.lang.ExpandoMetaClass$ExpandoMetaProperty.leftShift(ExpandoMetaClass.java:596) ~[groovy-2.4.6.jar:2.4.6]
	at sun.reflect.GeneratedMethodAccessor61.invoke(Unknown Source) ~[na:na]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_74]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_74]
	at org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:210) ~[groovy-2.4.6.jar:2.4.6]
	at org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.call(PogoMetaMethodSite.java:71) ~[groovy-2.4.6.jar:2.4.6]
	at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48) [groovy-2.4.6.jar:2.4.6]
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113) [groovy-2.4.6.jar:2.4.6]
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125) [groovy-2.4.6.jar:2.4.6]
	at grails.plugins.elasticsearch.util.DomainDynamicMethodsUtils.injectDynamicMethods(DomainDynamicMethodsUtils.groovy:58) ~[elasticsearch-1.0.0.jar:na]
	at grails.plugins.elasticsearch.util.DomainDynamicMethodsUtils$injectDynamicMethods.call(Unknown Source) ~[na:na]
	at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48) [groovy-2.4.6.jar:2.4.6]
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113) [groovy-2.4.6.jar:2.4.6]
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133) [groovy-2.4.6.jar:2.4.6]
	at ElasticsearchGrailsPlugin.doWithDynamicMethods(ElasticsearchGrailsPlugin.groovy:150) ~[elasticsearch-1.0.0.jar:na]
	at org.grails.plugins.DefaultGrailsPlugin.doWithDynamicMethods(DefaultGrailsPlugin.java:750) ~[grails-core-3.1.2.jar:3.1.2]
	at grails.plugins.DefaultGrailsPluginManager.doDynamicMethods(DefaultGrailsPluginManager.java:711) ~[grails-core-3.1.2.jar:3.1.2]
	... 21 common frames omitted
```
