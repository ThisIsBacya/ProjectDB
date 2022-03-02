package itlab.projectsite.database.managers

import itlab.projectsite.database.User
import itlab.projectsite.mapper.UserMapper
import itlab.projectsite.model.UserModel
import itlab.projectsite.model.UserResponseModel
import org.jetbrains.exposed.sql.transactions.transaction

class UserManager(
    private val userMapper: UserMapper
) {
    fun checkAuth(userModel: UserModel) = kotlin.runCatching {
        transaction {

        }
    }

    fun getUsers() = runCatching {
        transaction {
            User.all().map { user -> userMapper(user) }
        }
    }.getOrElse { it.localizedMessage }

    fun addUser(userModel: UserResponseModel) = runCatching {
        transaction {
            User.new {
                login = userModel.login
                password = userModel.password
                fio = userModel.fio
                token = (userModel.fio.hashCode() % 100000000).toString()
            }.let {
                userMapper(it)
            }
        }
    }.getOrElse { it.localizedMessage }
}