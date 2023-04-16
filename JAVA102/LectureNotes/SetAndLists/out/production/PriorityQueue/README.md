
## TREE SET

    Setlerde ayni veri tipinden sadece 1 adet olabilceginden Ahmet 30 ve 
    Damla 30 notlu ogrencilerden sadece birini yazdirabilecegiz.

    new OrderNoteComparator().reversed() yazdigimizda ise reversed() 
    methodu yuksek puandan dusuk puana gore siralatacaktir!!
    
    Stringler arasi karsilastirma yapmak icin comparateto(); methodunu 
    kullaniriz. HashSet'de rasgele hafizada yer ayrilarak liste elemanlari 
    gelisiguzel sekilde print edilir belirli bir siralama duzeni yoktur.

## ARRAY LIST

    veri islemede veri cikarmada kullanilir cunku arraylere gore daha efektiftir.
    girilen sekilde cikti verir siralamayi degistirmeden verir. Dilersek siralama 
    duzenini kendimiz olusturabiliriz degerler tekrar etse de ARRAYLISTLERDE tekrar ederler 
    
    HashSet'lerdeki gibi bir defa gostermez IndexOf(); methodu hangi verirnin hangi indexte 
    oldugunu gosterir eger listede yoksa -1 dondurur

## LINKED LIST

    her bir hucre kendinden onceki ve sonraki hucrenin adresini tutar.
    sondaki hucreden sonraki adreste null degeri tutularak listenin 
    sonu oldugu belirlenir. 
    
    Linked listte de birden fazla kez ayni veri 
    girilebilir 2 mert varsa 2 mert de iteratorla yazilir
    
    Array list'den farki maliyetle ilgilidir. listenin ortasina veri eklemek
    linked liste'de daha kolay ve az maliyetlidir.
    
    linked list'de eleman silme veya ekleme yaparken eleman kaydirma islemi yapilmaz.
    
    LinkedList sınıfı ve ArrayList thread-safe değildir. Bu List türünde de veri bütünlüğünü sorunu vardır.
    
    ThreadSafe nedir: Thread Safe kodlar, bir iş parçacığı tarafından kullanılan bir değişkeni güncellemeden 
    önce, diğer iş parçacıklarının o değişkene erişimini engelleyerek bir senkronizasyon mekanizması kullanır. 
    Böylece, iş parçacıkları arasındaki etkileşimler doğru bir şekilde yönetilir ve beklenmeyen hataların önüne 
    geçilir.
    
    Veri butunlugu sorunu nedir: Veri bütünlüğü sorunu, bir linked list yapısında herhangi bir düğümün veri 
    elemanının, yanlışlıkla değiştirilmesi veya silinmesi sonucu ortaya çıkar. Eğer bir düğümün veri elemanı 
    yanlışlıkla değiştirilirse, linked list yapısındaki verilerin doğru sırayla takip edilmesi mümkün olmaz. 
    Ayrıca, eğer bir düğümün veri elemanı silinirse, linked list yapısındaki verilerin doğru şekilde takip 
    edilmesi yine mümkün olmaz.
    
    LinkedList hem queue hem de list'den inherit edilmistir!!

![](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/collection-linkedlist/figures/linkedlist.png)

## QUEUE LINKED LIST
    linkedin polymorphism sayesinde queue gibi davranmasidir FIFO seklinde calisan bir yapidir. Collection
    frameworkunun bir uyesidir.

     
## PRIORITY QUEUE

    istedigimiz sekilde siralama olusturmak icin kullaniriz.
    QUEUE'dekiyle ayni mantikta calisir. Tree set'deki gibi comparator sinifiyla istedigimiz sekilde siralama
    yapabiliriz.
