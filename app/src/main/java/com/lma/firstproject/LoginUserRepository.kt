package com.lma.firstproject

class LoginUserRepository {

    var loginUser: User? = null

    fun login(email: String, pass: String) {

        val user = getUserFromRemoteServer(email, pass)
        loginUser = user
    }

    private fun getUserFromRemoteServer(email: String, pass: String): User? {
        return if (email == "admin@admin.ru" && pass == "12345") {
            User(email, pass, "Marina")
        } else {
            null
        }
    }
}