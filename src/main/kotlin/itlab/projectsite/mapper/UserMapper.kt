package itlab.projectsite.mapper

import itlab.projectsite.database.User
import itlab.projectsite.model.UserModel

class UserMapper : Mapper<User, UserModel> {
    override fun invoke(input: User): UserModel {
        return UserModel(
            login = input.login,
            password = input.password,
            fio = input.fio,
            token = input.token,
            id = input.id.value
        )
    }
}