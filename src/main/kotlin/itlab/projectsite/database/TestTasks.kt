package itlab.projectsite.database

import org.jetbrains.exposed.dao.id.IntIdTable

object TestTasks : IntIdTable() {
    val TaskTest = varchar("task", 250)
}