# Tugas Minggu 3 - Object Oriented Programming

## Deskripsi

Repo ini berisi program Java sederhana yang menunjukkan konsep OOP dasar dengan penggunaan enkapsulasi, inheritance, dan interface. Program ini terdiri dari kelas Employee, BankAccount, Student, dan Main yang berfungsi untuk mengelola data karyawan, rekening bank, dan mahasiswa.

## Struktur Folder

```bash
Tugas_Yuto_Minggu3/
├── src/
│ ├── Employee/
│ │ ├── Employee.java
│ │ └── Payable.java
│ ├── BankAccount/
│ │ └── BankAccount.java
│ ├── Student/
│ │ └── Student.java
│ └── Main.java
├── bin/
├── lib/
└── README.md
```

## Struktur File dan Penjelasan

### src/

Folder ini berisi semua file source code untuk program Java.

### src/Employee/

- **Employee.java**: Kelas Employee yang merepresentasikan seorang karyawan.
- **Payable.java**: Interface Payable yang mendefinisikan method calculatePayment().

### src/BankAccount/

- **BankAccount.java**: Kelas BankAccount yang merepresentasikan sebuah rekening bank.

### src/Student/

- **Student.java**: Kelas Student yang merepresentasikan seorang mahasiswa.

- **Main.java**: Kelas Main yang berisi method utama untuk menjalankan program.

## Cara Penggunaan

Kompilasi semua file Java:

```bash
javac Main.java Employee/*.java BankAccount/*.java Student/*.java
```

Kemudian jalankan program:

```bash
java Main.java
```

## Panduan Penggunaan

- Pastikan Anda memiliki Java Development Kit (JDK) terinstal di komputer Anda.
- Untuk mengubah atau mengembangkan program, edit file yang ada di folder src/.
- Jika ingin menambahkan library eksternal, letakkan file JAR di folder lib/ dan tambahkan ke classpath saat kompilasi atau jalankan program.
- Hasil kompilasi akan disimpan di folder bin/.
- Untuk informasi lebih lanjut tentang setiap kelas dan method, lihat penjelasan di dalam file source code masing-masing.

### Catatan

- Pastikan untuk menjalankan perintah-perintah kompilasi dan eksekusi program dari root folder (contoh: Tugas_Yuto_Minggu3/).
