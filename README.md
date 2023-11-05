## Spring Basic

* Interface `ApplicationContext` adalah core dari Spring dan representasi dari container Inversion of Control. Untuk membuat `ApplicationContext` dengan annotation, harus membuat Configuration class yg ditandai dengan annotation `@Configuration`.
* Singleton merupakan salah satu design pattern dengan konsep pembuatan object hanya sekali namun dapat digunakan berkali-kali dengan output yg sama. Lihat implementasinya di [Class SingletonTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/SingletonTest.java)
* Bean spring adalah suatu object dari class java yang terbentuk sekali (singleton) saat aplikasi spring di jalankan dan dikendalikan oleh Spring IoC (Inversion of Control) Container. Jadi dengan kata lain Spring IoC Container ini yang membentuk, menyimpan dan menyediakan bean bagi yang membutuhkannya. Bean bisa disebut juga sebagai object, jadi jika sudah terbentuk bean, kita tidak perlu lagi membuat object secara manual atau secara terus menerus, karena default bean ini modenya mode singleton (jika sudah terbentuk tdk membentuk lagi) dan akan terus hidup sepanjang aplikasi spring masih menyala. Lihat implementasinya di [Class BeanTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/BeanTest.java). Namun pada spring kita bisa membuat bean dengan tipe data yg sama dengan syarat nama bean nya harus berbeda.
* Jika terjadi duplicate bean, terdapat beberapa opsi untuk solusinya:
    - Membuat nama/method bean yg berbeda, inject nama methodnya
    - Membuat primary bean, tambahkan annotation `@Primary`
* Dependency injection adalah suatu teknik dalam menyediakan object dengan membuatnya menjadi sebuah parameter di constructor ataupun di setter method dari pada membuatnya langsung di classnya.
* 