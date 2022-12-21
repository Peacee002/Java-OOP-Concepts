package TasksCon;


class Print {


    public static void main(String[] args) {
        Görevli obj1 = new Görevli("barış","köseoğlu",23,345635);
        Ogrenci obj2 = new Ogrenci("ahmet","yana",45,34536);
        Ogretmen obj3 = new Ogretmen("kurt","yılmaz",33,45674);

        obj1.setGörevler("Temizlik");
        obj2.setOrtalama("65");
        obj3.setBolumu("Fizik");
        obj3.setDersIsimleri("Fizik giriş, calculus 1");


    obj1.print();
    obj2.print();
    obj3.print();

    }
}