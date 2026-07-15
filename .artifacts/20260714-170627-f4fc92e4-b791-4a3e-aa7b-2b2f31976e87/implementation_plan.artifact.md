# Implementation Plan - Screening History Detail Page

The goal is to create a detailed screening history page for patients that displays the date, condition result, symptom indicators (Ya/Tidak), and notes from the hospital and doctor.

## User Review Required

> [!NOTE]
> The UI will follow the screenshot provided by the user, including the gradient background for cards and the "Ya/Tidak" checkbox list for symptoms.

## Proposed Changes

### Patient Dashboard

#### [DashboardPasienScreen.kt](file:///C:/Users/rahma/Downloads/Apps-Mental-Health-Care-main/app/src/main/java/com/rahmat/mentalhealthcare/DashboardPasienScreen.kt)

- Enable navigation to `detail_riwayat_pasien/{riwayatId}` when "Lihat Selengkapnya" is clicked.

```kotlin
// ... inside LazyColumn items(listRiwayat.value) ...
Text(
    text = "Lihat Selengkapnya",
    fontSize = 10.sp,
    color = Color.Gray,
    textDecoration = TextDecoration.Underline,
    modifier = Modifier.clickable {
        navController.navigate("detail_riwayat_pasien/${riwayat.idRiwayat}")
    }
)
```

---

### Screening Detail Screen

#### [DetailRiwayatPasienScreen.kt](file:///C:/Users/rahma/Downloads/Apps-Mental-Health-Care-main/app/src/main/java/com/rahmat/mentalhealthcare/DetailRiwayatPasienScreen.kt)

- Completely overhaul the UI to match the screenshot.
- Implement data fetching for `riwayat_screening`, `kategori_gejala`, and `master_gejala`.
- Logic for condition display:
    - If `hasil_validasi_dokter` is present, use it.
    - Otherwise, use `hasil_ai`.
- Logic for symptoms:
    - Map `gejala_dipilih` (list of IDs or names) to the full list of `master_gejala`.
    - Display categories in bold and symptoms with "Ya" and "Tidak" checkboxes.
- Display "Catatan RS Jiwa" and "Catatan Dokter" in gradient cards.

```kotlin
// Key Logic for Symptom List Rendering
listKategoriHirarkiUI.value.forEach { kategori ->
    Text(text = kategori.nama, fontWeight = FontWeight.Bold, ...)
    val childGejala = listGejalaHirarkiUI.value.filter { it.idKategori == kategori.id }
    childGejala.forEach { gejala ->
        Row {
            Text(gejala.namaGejala, ...)
            Checkbox(checked = gejala.isChecked, ...) // "Ya" column
            Checkbox(checked = !gejala.isChecked, ...) // "Tidak" column
        }
    }
}
```

## Verification Plan

### Automated Tests
- None (UI focused change).

### Manual Verification
- **Compose Preview**: Create a preview for `DetailRiwayatPasienScreen` with mock data to verify the UI layout matches the screenshot.
- **Run the App**: (If a device is available) Navigate from the dashboard to the detail page and verify data is correctly fetched from Firebase.
- **Check Layout**: Ensure the gradient cards, symptom list, and notes are displayed correctly and match the visual style of the app.
