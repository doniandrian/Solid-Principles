/**
 * Single responsibility berarti setiap class / method hanya memiliki satu tanggung jawab.
 * Contoh di bawah ini, class Person hanya memiliki tanggung jawab untuk menyimpan data person
 * sedangkan logic sorting dipisahkan ke dalam comparator agar bisa digunakan untuk class lain jika kita mau mengubah urutannya tanpa perlu mengubah class Person
 */

/*
    -High cohesion vs Low cohesion
    High cohesion berarti setiap class / method memiliki tanggung jawab yang jelas dan spesifik, sehingga mudah untuk dipahami dan di-maintain.
    Low cohesion berarti setiap class / method memiliki tanggung jawab yang tidak jelas dan terlalu banyak,

    -High coupling vs Low coupling
    High coupling berarti setiap class / method memiliki ketergantungan yang tinggi terhadap class / method lain, sehingga sulit untuk dipahami dan di-maintain.
    Low coupling berarti setiap class / method memiliki ketergantungan yang rendah terhadap class / method

*/
package Single_responsibility_Principle;

import java.util.ArrayList;
import java.util.Comparator;

class Person  {
    String nama;
    Integer umur;
    Integer gaji;

    Person(String nama, Integer umur, Integer gaji) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
    }

    public String toString(){
        return this.nama + " " + this.umur + " " + this.gaji;
    }

    //commented karena kita akan menggunakan comparator untuk single responsibility, agar logic sorting tidak ada di class Person
    // @Override
    // public int compareTo(Person o) {
    //     // TODO Auto-generated method stub
    //     // priority 1 = nama, priority 2 = umur, priority 3 = gaji
    //     int resNama = this.nama.compareTo(o.nama);
    //     if (resNama != 0) {
    //         return resNama;
    //     }

    //     int umur = this.umur.compareTo(o.umur);
    //     if (umur != 0) {
    //         return umur;
    //     }

    //     return this.gaji.compareTo(o.gaji);

    // }

}

public class Single_responsibility {
    public static void main(String[] args) {
        ArrayList<Person> data = new ArrayList<>();
        data.add(new Person("Adit", 25, 5000));
        data.add(new Person("Dito", 30, 6000));
        data.add(new Person("Kejol", 28, 5500));
        data.add(new Person("Kejol", 29, 5500));
        data.add(new Person("Kejol", 28, 5000));

        // Collections.sort(data);

        //ini contoh penggunaan comparator untuk single responsibility, dimana kita memisahkan logic sorting dari class Person agar 
        //bisa dipakai untuk class lain jika kita mau ubah mengurutannya tanpa perlu mengubah class Person
        Comparator <Person> comparator = Comparator.comparing((Person p) -> p.gaji)
                .thenComparing(p -> p.umur)
                .thenComparing(p -> p.nama);    
        
        data.sort(comparator);
        for (Person person : data) {
            System.out.println(person.toString());
        }

    }

}
