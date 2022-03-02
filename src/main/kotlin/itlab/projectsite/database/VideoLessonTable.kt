package itlab.projectsite.database
import org.jetbrains.exposed.dao.id.IntIdTable


object VideoLesson : IntIdTable() {
    val captionVideo = varchar("caption", 50)
    val descriptionVideo = varchar("decription", 100)
}
