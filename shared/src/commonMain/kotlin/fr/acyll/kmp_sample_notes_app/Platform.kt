package fr.acyll.kmp_sample_notes_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform