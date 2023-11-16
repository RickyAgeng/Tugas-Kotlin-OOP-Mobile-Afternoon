package KotlinSubmissionAfternoon.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile(namaDepan: String, namaBelakang: String, umur: Int, status: Boolean) {
    println("Nama Depan: $namaDepan")
    println("Nama Belakang: $namaBelakang")
    println("Umur: $umur")
    println("Status Single: $status")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val Detailsgroup = mapOf(
        "Id group" to groupId,
        "Members group" to groupMember,
        "session" to session
    )
    return Detailsgroup
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val AnggotaGroup = listOf("Ricky", "Ayyas", "Alfateh", "Anggi", "Shella")
    val NamaSaya = AnggotaGroup[0]

    println("Anggota Group Mobile: $AnggotaGroup")

    return listOf(NamaSaya)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Budi Prayoga", "Annisyah")
    val countOfGroup = arrayOf<String>("Ricky", "Ayyas", "Alfateh", "Anggi", "Shella")

    val totalmentor = mentor.size
    val totalcountofgroup = countOfGroup.size

    return totalmentor + totalcountofgroup
}

fun main() {

    val NamaDepan = "Ricky"
    val NamaBelakang = "Ageng S"
    val Umur = 21
    val Status = true
    myProfile(NamaDepan, NamaBelakang, Umur, Status)

    println("\n")

    val groupId = "404"
    val groupMember = listOf("Ricky", "Ageng", "Saputra")
    val session = "session404"

    val result = groupDetail(groupId, groupMember, session)
    println(result)

    println("\n")

    val myTeam = myTeam()
    println("My team is: $myTeam")

    println("\n")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("404", listOf(groupMember), "session404")

}
