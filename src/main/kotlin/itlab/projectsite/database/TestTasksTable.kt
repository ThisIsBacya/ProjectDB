package itlab.projectsite.database

import org.jetbrains.exposed.dao.id.IntIdTable

object TestTasksTable : IntIdTable() {
    val TaskTest = varchar("task", 250)
}