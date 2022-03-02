package itlab.projectsite.model

import kotlinx.serialization.Serializable

@Serializable
data class UserModel(
    val login: String,
    val password: String,
    val fio: String,
    val token: String,
    val id: Int
    val email: String
)

@Serializable
data class UserResponseModel(
    val login: String,
    val password: String,
    val fio: String
    val email: String
)
