package models

import org.joda.time.DateTime
import play.api.libs.json._
import reactivemongo.play.json._
import reactivemongo.bson.BSONObjectID
import reactivemongo.bson._

import play.api.libs.json.JodaWrites._
import play.api.libs.json.JodaReads._

case class Employee(
    _id: Option[BSONObjectID],
    name: String,
    email: String
)

object Employee {
  implicit val format: OFormat[Employee] = Json.format[Employee]

}
