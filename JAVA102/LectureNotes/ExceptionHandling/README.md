# EXCEPTION HANDLING
* Java dilinde hatalara **istisna (exception)** denir. İstisna, adından da anlaşılacağı üzere, 
programın çalışması sırasında meydana gelen **istisnai (anormal)** durumları belirtir. Diğer 
bir deyişle, ***çalışma zamanında (runtime)*** meydana gelen hatalara istisna denir.<br />
<br />
Exception calisma zamaninda gerceklestigi icin program compile edilir. Eger error olsaydi
program compile edilmezdi. Belirli kurallar yazarak encapsulation ilkesindeki gibi mantik ve mate-
matiksel hatalari exception'lari handle edebiliriz. **Hata yönetiminden kastımız, hatanın meydana 
gelmesini engellemek değildir. Hata yönetimi, en basit ifadesiyle, çalışma sırasında bir hata 
meydana gelse bile programın çalışmasına devam etmesini sağlamaktır.**

```
    int a = input.nextInt();
    int b = 10;
    System.out.println(b / a);
```
* Eger burda a degerine 0 verilirse matematiksel bir imkansizlik olusur ve java exception firlatir.
```
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Main.main(Main.java:7)
```
![](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/exception/figures/exceptions-callstack.png)

* İki tip hata çeşidimiz vardır.
<br />
**Unchecked Exceptions** : Programın derlenmesi sırasında bilinemeyen ancak program çalıştığı esnada 
ortaya çıkan hata tiplerdir. Çalışma zamanında ortaya çıktıklarından yeniden oluşturulmaları ve 
tespit edilmeleri daha zordur.
<br />
<br />
**Checked Exceptions** : Derleme aşamasında tespit edilen hatalardır.Bu hataların alınabileceği önceden 
bilinir. Örneğin dosyayı açma işlemi Java'da hata oluşturabilecek bir işlemdir. Bu fonksiyonun hata 
fırlatabileceği önceden belirtildiği için kodu yazarken Java geliştirme platformu ona göre önlem al
mamızı ister.


* Error : Programdaki ciddi hatalı temsil eder. JVM tarafından iletilen uygulama dışında oluşan hatalardır.
Bu tip hatalar da "Unchecked Exceptions" tipindedir. Örneğin veritabanı sunucusuna bağlanmaya çalışınca 
bağlantı hatası verirse bunu ancak çalışma zamanında anlayabiliriz.

# TRY-CATCH-FINALLY KULLANIMI

```
    try { 
        System.out.println(b / a);
    }
    catch (Exception e) {
    }
    System.out.println("Program executed");
```

* Eger try blogunda bir exception yakalanirsa yakalandigi kisimdan sonrasindaki kismi execute etmez
direkt catch bloguna gecer ve blogun icerisindeki kodu execute eder.


* Alttaki kod blogundaki methodlarla exception geri bildirimlerini alabiliriz.

```
    catch (Exception e) {
        e.printStackTrace();
        e.toString();
        e.getMessage();
    }
```
* Scanner sinifindan input alirken bunlari try blogunun icerisine koyariz bu sayede istenen veri turu-
nun disinda bir data type girilirse hata almadan programa devam edebilelim.
```
    int[] arr = new int[2];
    try { 
        System.out.println(b / a);
        c = input.nextInt();
        arr[10] = 11;
    }
    catch (ArithmeticException e) {
        System.out.println("Arithmetic exception detecrted");
        System.out.println(e.getMessage());
    }
    catch (InputMismatchException e) {
        System.out.println("Wrong data type detected");
        System.out.println(e.getMessage());
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array exception detected");
        System.out.println(e.getMessage());
    }
    finally {
    System.out.println("Exception alinsa bile calisan kisim burasi");
    }
```

* Ozel exception alt siniflarinin hepsi ***Exception (Exception e)*** sinifindan inherit edildiginden her exception
type icin tekrar tekrar handle etmek zorunda degiliz.


* Exceptionlari Runtime error olarak aldigimizdan class icerisine yazilamaz onun yerine ***methodlar icerisine yazilir***

# THROW KULLANIMI

* throw methoduyla exceptionda verilen hatanin istedigimiz sekilde cikti vermesini saglariz.
Manuel olarak.
```
public static void checkAge (int age) {
    if (age < 18) {
       // throw new ArithmeticException("You are under 18");
       throw new AgeCheckException();
    }
}

public static void main (Strin[] args) { 
    try{
        int age = input.nextInt();
        checkage(age);
    }
    catch (Exception e) {
        System.out.println("lack of age");
        System.out.println(e.toString());
    }
}
```