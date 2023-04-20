## MAP INTERFACE VE HASH MAP
* map ve collectionlar mantik olarak ayni olsa da birbirinden farklidirlar.
iki veri birbiriyle eslenerek olusturulan key value'ye gore ayarlanir map
interface vardir asagida tabloda gorulmektedir.
**Tek bir key tek bir value'yi ifade etmek zorundadir!!.**
```
    country.put("TR","Turkiye");
    country.put("TR", "Almanya");
```
seklinde olamaz!!!

* **Map <K,V>** Pythondaki sozluklere benziyor biraz.
```
     HashMap<String, String> country = new HashMap<>();
```
* size(), get(), remove(), size(), replace() gibi methodlari vardir.
* Maplere ozel iterator yoktur for each'le gezilebilir.

```
    for (String countryKey : country.keySet()) {
    System.out.println(countryKey);
    }
    
    for (String countryValue : country.values()) {
    System.out.println(countryValue);
    }
```
* country.get(countryKey) yazarak da key'ler uzerinden value degerine ulasabiliriz

```
    for (String countryKey : country.keySet()) {
    System.out.println(country.get(countryKey);
    }
```    
## LINKED HASH MAP AND TREE MAP

* LinkedHashset ve hashset arasindaki farkla aynidir girilen orderda print almayi saglar
```
    LinkedHashMap<Integer, Student> students = new LinkedHashMap<>():
    
    students.put(102, new Student(102, "Umut", 85));

    for (Student stu: students.values()) {
        System.out.println(stu.getName());
}
```