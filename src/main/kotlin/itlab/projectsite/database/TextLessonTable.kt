package itlab.projectsite.database
import org.jetbrains.exposed.dao.id.IntIdTable


object TextLesson : IntIdTable() {
    val captionText = varchar("caption", 50)
    val labelText = varchar("label", 2000)
}
