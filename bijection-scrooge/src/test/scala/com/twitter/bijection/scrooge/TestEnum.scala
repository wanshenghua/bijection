/**
 * generated by Scrooge 3.1-SNAPSHOT
 */
package com.twitter.bijection.scrooge

import com.twitter.scrooge.ThriftEnum


case object TestEnum {
  case object One extends TestEnum {
    val value = 1
    val name = "One"
  }
  case object Two extends TestEnum {
    val value = 2
    val name = "Two"
  }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * @throws NoSuchElementException if the value is not found.
   */
  def apply(value: Int): TestEnum = {
    value match {
      case 1 => One
      case 2 => Two
      case _ => throw new NoSuchElementException(value.toString)
    }
  }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * Returns None if the value is not found
   */
  def get(value: Int): Option[TestEnum] = {
    value match {
      case 1 => scala.Some(One)
      case 2 => scala.Some(Two)
      case _ => scala.None
    }
  }

  def valueOf(name: String): Option[TestEnum] = {
    name.toLowerCase match {
      case "one" => scala.Some(TestEnum.One)
      case "two" => scala.Some(TestEnum.Two)
      case _ => scala.None
    }
  }
}



sealed trait TestEnum extends ThriftEnum with Serializable
