package models

import skinny.orm._
import scalikejdbc._

case class User(
    id: Long,
    name: String)

object User extends SkinnyCRUDMapper[User] {
  override lazy val tableName = "user"
  override lazy val defaultAlias = createAlias("user")

  override def extract(rs: WrappedResultSet, user: ResultName[User]): User = new User(
    id = rs.long(user.id),
    name = rs.string(user.name)
  )
}

