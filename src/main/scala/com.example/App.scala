package com.example
import java.util.UUID
import tapir._
import tapir.json.circe._
import tapir.openapi.circe.yaml._
import tapir.docs.openapi._
import io.circe.generic.auto._

object App {

class Foo(str: String)
case class Bar(hi: Foo)

  def main(args: Array[String]): Unit = {
    implicitly[SchemaFor[List[Bar]]]
  }

}
