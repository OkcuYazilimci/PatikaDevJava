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