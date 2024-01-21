## Spring Basic

* Inversion of Control (IoC) adalah prinsip pengembangan software dimana kita menggunakan sebuah container untuk menghandle code, data dan function kita tanpa perlu membuat method main pada setiap code/class dan container IoC akan otomatis mengeksekusi code yg ada pada program.
* Interface `ApplicationContext` adalah core dari Spring dan representasi dari container Inversion of Control. Pada versi Spring 4 keatas, application context ditandai dengan sebuah annotation (sebelumnya XML), seperti @Service, @Repository, @Entity dll. Untuk membuat `ApplicationContext` dengan annotation, harus membuat Configuration class yg ditandai dengan annotation `@Configuration`.
* Jika ingin menjalankan spring secara otomatis tanpa menggunakan `ApplicationContext`, gunakan annotation `@SpringBootApplication` lalu buat main class dan gunakan class `SpringApplication` dan method `run()`. Lihat implementasinya di [Class FooApplicationTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/FooApplicationTest.java)
* Untuk menjalankan configuration lebih dari satu, gunakan annotation `@Import(value = {YourConfiguration.class, AnotherConfiguration.class})` atau gunakan `@ComponentScan(basePackage = "namaPackages")` jika diletakkan dalam satu package yg sama
* Singleton merupakan salah satu design pattern dengan konsep pembuatan object hanya sekali namun dapat digunakan berkali-kali dengan output yg sama. Lihat implementasinya di [Class SingletonTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/SingletonTest.java)

* Bean spring adalah suatu object dari class java yang terbentuk sekali (singleton) saat aplikasi spring di jalankan dan dikendalikan oleh Spring IoC (Inversion of Control) Container. **Bean akan otomatis dibuat ketika spring dijalankan**. Bean bisa disebut juga sebagai object, jadi jika sudah terbentuk bean, kita tidak perlu lagi membuat object secara manual atau secara terus menerus, karena default bean ini modenya mode singleton (jika sudah terbentuk tdk membentuk lagi) dan akan terus hidup sepanjang aplikasi spring masih menyala. Lihat implementasinya di [Class BeanTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/BeanTest.java). Namun pada spring kita bisa membuat bean dengan tipe data yg sama dengan syarat nama bean nya harus berbeda.
* Jika terjadi duplicate bean, terdapat beberapa opsi untuk solusinya:
    - Membuat nama/method bean yg berbeda, inject nama methodnya
    - Membuat primary bean, tambahkan annotation `@Primary`
* Bean dapat dibuat sebagai lazy (akan dipanggil ketika dibutuhkan), tambahkan annotation `@Lazy`. 
 
* Dependency injection adalah suatu teknik dalam menyediakan object dengan membuatnya menjadi sebuah parameter di constructor ataupun di setter method dari pada membuatnya langsung di classnya. Lihat implementasinya di [Class DITest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/DITest.java)
* Case circular dependencies adalah terjadinya lingkaran dependency, bean A butuh bean B, bean B butuh bean C dan bean C butuh bean A maka spring akan menganggapnya error.
* Jika ingin meng-inject multiple constructor, gunakan annotation `@Autowired`. Pada setter injection, diwajibkan menggunakan `@Autowired`. Annotation ini dapat digunakan di setter method, field, constructor dan method dengan multiple argument.

* Terdapat beberapa bean scope:
    - singleton: default/hanya dibuat sekali dalam spring IoC.
    - prototype: selalu dibuat object baru setiap kali bean diakses.
    - request: dibuat baru per HTTP request (only web app)
    - session: dibuat baru per HTTP session (only web app)
    - application: dibuat baru per ServletContext (only web app)
    - websocket: dibuat baru per WebSocket 
* Tambahkan annotation `@Scope("scopeName")` pada bean untuk mengatur scope.
* Mengkonfigurasi bean untuk menjalankan ketika spring dibuat dan ditutup ketika spring selesai.

* Pembuatan implementation interface digunakan agar tidak terjadi duplicate bean saat interface memiliki banyak turunan dan saat ingin mengganti model class nya, cukup ubah class implementasinya tanpa harus mengubah dependency yg menggunakan interface nya. Lihat implementasiya di [Class InheritanceTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/InheritanceTest.java)

* Annotation `@EventListener` digunakan untuk menandai terjadinya event pada sebuah listener. Listener event adalah sebuah komponen atau metode dalam sebuah program yang menunggu dan merespons terhadap kejadian (events) yang terjadi dalam sistem atau aplikasi. Lihat implementasinya di [Class EventListenerTest](https://github.com/ichwansh03/spring-basic/blob/main/src/test/java/com/ichwan/basic/EventListenerTest.java)

* Pastikan hanya ada satu main class saat menjalankan `SpringBootApplication`
