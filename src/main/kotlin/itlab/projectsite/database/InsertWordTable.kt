package itlab.projectsite.database

import org.jetbrains.exposed.dao.id.IntIdTable

object InsertWord : IntIdTable() {
    val TaskWord = varchar("task", 250)
}