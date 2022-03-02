package itlab.projectsite.database
import org.jetbrains.exposed.dao.id.IntIdTable

object Library : IntIdTable() {
    val bookName = varchar ("bookname", 50)
    val avtor = varchar("avtor", 50)
    val yearOfPublishing = integer("year of publishing")
}
