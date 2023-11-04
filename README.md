## Spring Basic

* Interface `ApplicationContext` adalah core dari Spring dan representasi dari container Inversion of Control. Untuk membuat `ApplicationContext` dengan annotation, harus membuat Configuration class yg ditandai dengan annotation `@Configuration`.
* Singleton merupakan salah satu design pattern dengan konsep pembuatan object hanya sekali namun dapat digunakan berkali-kali dengan output yg sama. Lihat implementasinya di [Class SingletonTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/SingletonTest.java)
* Bean merupakan object pada spring yang dibuat, dimanage dan didestroy di spring container. Lihat implementasinya di [Class BeanTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/BeanTest.java)