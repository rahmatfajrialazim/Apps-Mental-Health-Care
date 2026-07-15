# Implementasi Detail Riwayat Pasien

Rencana ini bertujuan untuk mengimplementasikan halaman detail riwayat skrinning pasien (`DetailRiwayatPasienScreen.kt`) yang mencakup informasi kondisi mental, daftar gejala yang dialami (Ya/Tidak), serta catatan dari Rumah Sakit dan Dokter. Selain itu, daftar riwayat di Dashboard Pasien akan diperbarui agar bisa diklik dan mengarah ke halaman detail ini.

## User Review Required

> [!IMPORTANT]
> - Data gejala akan ditarik secara hirarkis dari koleksi `kategori_gejala` dan `master_gejala`.
> - Status "Ya" atau "Tidak" ditentukan berdasarkan apakah ID gejala tersebut ada dalam field `gejala_dipilih` pada dokumen `riwayat_screening`.
> - Tampilan akan menggunakan gradien biru-putih dan styling kartu sesuai dengan referensi gambar yang diberikan.

## Proposed Changes

### Dashboard Pasien

#### [MODIFY] [DashboardPasienScreen.kt](file:///C:/Users/rahma/Downloads/Apps-Mental-Health-Care-main/app/src/main/java/com/rahmat/mentalhealthcare/DashboardPasienScreen.kt)
- Memperbarui `Modifier.clickable` pada teks "Lihat Selengkapnya" (atau seluruh kartu riwayat) agar melakukan navigasi ke `detail_riwayat_pasien/{idRiwayat}`.

### Detail Riwayat Pasien

#### [MODIFY] [DetailRiwayatPasienScreen.kt](file:///C:/Users/rahma/Downloads/Apps-Mental-Health-Care-main/app/src/main/java/com/rahmat/mentalhealthcare/DetailRiwayatPasienScreen.kt)
- **Data Fetching**:
    - Mengambil detail screening dari `riwayat_screening`.
    - Mengambil data kategori dari `kategori_gejala`.
    - Mengambil data master gejala dari `master_gejala`.
- **UI Components**:
    - **Header Card**: Menampilkan tanggal screening dan kondisi mental hasil AI atau validasi dokter (dengan pewarnaan status: Merah untuk Tinggi, Hijau untuk Normal/Sedang).
    - **Gejala Section**: Tabel hirarkis yang menampilkan kategori dan daftar gejala beserta status "Ya" (jika terpilih) dan "Tidak" (jika tidak terpilih).
    - **Catatan RS Card**: Menampilkan field `catatan_rs` dari Firestore.
    - **Catatan Dokter Card**: Menampilkan field `catatan_dokter` dari Firestore.
    - Menangani kondisi data kosong atau sedang memuat dengan progress indicator.

## Verification Plan

### Manual Verification
- Membuka Dashboard Pasien.
- Mengklik salah satu item di daftar riwayat.
- Memastikan halaman Detail Riwayat terbuka dengan data yang benar:
    - Tanggal dan kondisi sesuai.
    - Daftar gejala menunjukkan centang yang tepat pada kolom Ya/Tidak.
    - Catatan RS dan Dokter tampil sesuai isi di Firebase.
- Memastikan tombol kembali (back) berfungsi dan kembali ke Dashboard.
