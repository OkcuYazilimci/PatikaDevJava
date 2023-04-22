# Kendi Liste Sınıfımızı Yazmak
***

* Java'da generic yapısını kullanarak verileri tuttuğumuz bir sınıf tasarlıyoruz.
Sınıfın amacı içerisinde dinamik bir Array (Dizi) tutması ve veri tipini dinamik 
olarak alması. Bunun için generic bir sınıf oluşturulması gerekli.


* **NOT : COLLECTION SINIFI KULLANILMAYACAKTIR ! KENDİ LİSTE SINIFIMIZI OLUŞTURMALIYIZ.**


**Sınıf özellikleri :**

* Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç 
duydukça 2 katı şeklinde artmalı. Sınıfa ait iki tür constructor metot bulunmalı.


* MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.


* MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.


* size() : dizideki eleman sayısını verir.


* getCapacity() : dizinin kapasite değerini verir.


* add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide 
yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.


***


* get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null 
döndürür.


* remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasındaki 
verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.


* set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini 
yapmalıdır. Geçersiz indis girilerse null döndürür.


* String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot. <br />
integer turundeki datayi Stringe donusturup bir str degiskenine for dongusunde ekleyerek
str degerini dondurduk.<br />
in case of T generic type is String. We used ***instanceof*** method to decide whether it is
integer or string


```
public String toString() {
       String str = "";
       for (int i = 0; i < size(); i++)
       {
           if (getGenericArray()[i] instanceof Integer) {
               T num = getGenericArray()[i];
               str = str + Integer.toString((Integer) num) + " ";
           }
           else if (getGenericArray()[i] instanceof String) {
               str = str + getGenericArray()[i] + " ";
           }
       }
       return str;
   }
```


***


* mint indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne 
listede yoksa -1 değerini verir.


* int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne 
listede yoksa -1 değerini verir.


* boolean isEmpty() : Listenin boş olup olmadığını söyler.


* T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.


* clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.


* MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir 
liste döner.


* boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.

# TAKEN NOTES
***
 ```
    Object[] myObjectArray = new Object[5];
    setGenericArray(new Object[getCapacity()]);
 ```  
* Yeni bir obje obje olusturuyoruz.


* This creates a new array of Object type with a length of 5, and each element in the array 
is initialized to null. This means that the array can hold any type of object, including 
other arrays, and you can assign any object to any element in the array.


* Overall, new Object[] is a way to create a new array of Object type in Java, which can hold 
any type of object and is useful for situations where you need to store objects of different 
types in a single data structure.

**(T[]) array** nedir?

* (T[]) array, Java'da bir dizi (array) nesnesini belirli bir türe (type) dönüştürmek için 
kullanılan bir cast (dönüştürme) işlemidir. Bu işlem, bir dizi nesnesinin elemanlarını 
belirli bir türdeki elemanlarla doldurmak veya bir diziyi belirli bir türdeki bir diziye 
dönüştürmek için kullanılabilir. <br />
<br />
Örneğin, aşağıdaki kod parçasında, bir Object dizisi oluşturulur ve daha sonra bu dizi, 
Integer türünde bir diziye dönüştürülür:


```
Object[] objects = new Object[] { 1, 2, 3 };
Integer[] integers = (Integer[]) objects;
```


* Bu kodda, "objects" adlı bir Object dizisi oluşturulur ve içine 1, 2 ve 3 elemanları eklenir. 
Daha sonra, "integers" adlı bir Integer dizisi oluşturulur ve "objects" dizisi bu diziye 
dönüştürülür. Bu dönüştürme işlemi, "(Integer[])" cast işlemiyle gerçekleştirilir.<br />
  <br />
Bu cast işlemi, unchecked cast hatasına neden olabilir, çünkü dönüştürme işlemi sırasında, 
Object dizisinde Integer dışındaki bir türün elemanı varsa, bu elemanlar otomatik olarak 
Integer'a dönüştürülemez ve bir runtime hatası oluşur.

***







 
