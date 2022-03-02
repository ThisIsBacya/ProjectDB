package itlab.projectsite.database

import org.jetbrains.exposed.dao.id.IntIdTable

object FullAnswer : IntIdTable() {
    val TaskAnswer = varchar("task", 250)
}