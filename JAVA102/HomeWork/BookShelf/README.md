# BOOK SORTER

* Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo"
metodunu override ediniz. Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız. 
Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız. Sonra iki-
nci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını 
sağlayınız. <br />
  <br />
Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.

* To sort as their name:
```
@Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
```
* To sort as their total pages:
```
@Override
    public int compareTo (Book o) {
        return this.getTotalPage() - o.getTotalPage();
    }
```