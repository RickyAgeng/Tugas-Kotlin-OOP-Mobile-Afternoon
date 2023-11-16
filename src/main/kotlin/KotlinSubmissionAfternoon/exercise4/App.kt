package KotlinSubmissionAfternoon.exercise4

fun main() {
    //val Inputan = "123" // Inputan berupa number, jika kita masukan berupa huruf maka terjadi kesalahan konversi
    val Inputan = "Ricky" // Inputan berupa number, jika kita masukan berupa huruf maka terjadi kesalahan konversi

    try {
        val convertedNumber = Inputan.toInt()
        println("Konversi kamu berhasil: $convertedNumber")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan konversi: ${e.message}")
    }
}

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini