# tugas3strukturdata
Tugas Praktik 3 Struktur Data - Depth-First Search (DFS) dan Breadth-First Search (BFS) di Java
Proyek ini berisi implementasi algoritma pencarian graf dasar, yaitu **Depth-First Search (DFS)** dan **Breadth-First Search (BFS)**, menggunakan bahasa pemrograman Java. Tugas praktik ini merupakan bagian dari mata kuliah **Struktur Data**.

## 🎯 Tujuan Tugas

Tujuan utama dari tugas praktik ini adalah untuk:

1.  Memahami representasi struktur data **Graf** (Graph) dalam pemrograman.
2.  Mampu mengimplementasikan dan memvisualisasikan cara kerja algoritma **Depth-First Search (DFS)** untuk penelusuran (traversal) graf.
3.  Mampu mengimplementasikan dan memvisualisasikan cara kerja algoritma **Breadth-First Search (BFS)** untuk penelusuran (traversal) graf.
4.  Membandingkan dan memahami perbedaan antara kedua algoritma penelusuran tersebut.

## 📁 Struktur File

Repositori ini terdiri dari dua file utama yang mengimplementasikan masing-masing algoritma:

* **`GraphTraversalDFS.java`**: Implementasi algoritma **Depth-First Search (DFS)**. Algoritma ini menelusuri graf sejauh mungkin di sepanjang setiap cabang sebelum kembali (backtracking).
* **`GraphTraversalBFS.java`**: Implementasi algoritma **Breadth-First Search (BFS)**. Algoritma ini menelusuri graf lapis demi lapis, menjelajahi semua tetangga pada kedalaman saat ini sebelum pindah ke tingkat kedalaman berikutnya.

## ⚙️ Cara Menjalankan Program

Proyek ini dikembangkan menggunakan bahasa **Java**. Untuk menjalankan kode sumber, pastikan Anda memiliki **Java Development Kit (JDK)** terinstal di sistem Anda.

1.  **Kloning Repositori:** Unduh atau klon repositori ini ke komputer Anda.
2.  **Kompilasi dan Jalankan:** Anda dapat mengompilasi dan menjalankan setiap file `.java` secara terpisah dari *Command Line* atau melalui *Integrated Development Environment* (IDE) seperti VS Code atau IntelliJ.

    * **Contoh Command Line (Linux/Windows):**
        ```bash
        javac GraphTraversalDFS.java
        java GraphTraversalDFS
        ```
3.  Output dari program akan menampilkan urutan penelusuran (traversal) graf sesuai dengan algoritma yang dijalankan.
