package itlab.projectsite.database

import org.jetbrains.exposed.dao.id.IntIdTable

object PictureLesson : IntIdTable() {
    val decriptionPicture = varchar("caption", 100)
}