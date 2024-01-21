# Notas

- Spring Boot en sus dependencias contienen dependencias de Spring: como org.springframework:webmvc, org.spring.springframework:spring-core, org.spring.springframework:spring-context, org.spring.springframework:spring-beans, etc, todo esto contenido dentro el org.springframework.boot:spring-boot-starter-web.
- El final de cuentas Spring Boot es una forma sencilla o más fácil de utilizar Spring, ya que nos provee lo necesario, para hacer RestAPIs, MVC, etc.
- Para crear una aplicación web en Java, basta con añadir: `<packaging>war</packaging>` en el pom.xml.
- Tomcat 9 no funciona con el mvc, mejor utilizar tomcat 10.
- Importante crear una carpeta dentro de src/main/, llamada webapp/, que contenga el WEB-INF/ y dentro de este el jsp/home.jsp, spring-servlet.xml y web.xml, todo esto para la configuración de nuestra página web utilizando MVC.
- Para que funcione el mvc, es necesario añadir en el pom.xml, la dependencia de spring-webmvc, que contiene ya beans, context, core, etc.
- Si hay problemas a la hora de desplegar el proyecto, es porque aún están los archivos .xml de configuración para mvc.

# Configuración de Spring MVC
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans
        xmlns="http://www.springframework.org/schema/beans"
        xmlns:mvc="http://www.springframework.org/schema/mvc"
        xmlns:context="http://www.springframework.org/schema/context"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/mvc
        http://www.springframework.org/schema/mvc/spring-mvc.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd"
>

    <mvc:annotation-driven/>
    <context:component-scan base-package="mvc"/>

    <bean
            class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/jsp/"/>
        <property name="suffix" value=".jsp"/>
    </bean>

</beans>
```

# Configuración de web.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://xmlns.jcp.org/xml/ns/javaee"
        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
        id="WebApp_ID" version="3.1"
>

    <display-name>mvc ejemplo</display-name>

    <absolute-ordering/>

    <servlet>
        <servlet-name>dispatcher</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>WEB-INF/spring-servlet.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>dispatcher</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>

</web-app>
```