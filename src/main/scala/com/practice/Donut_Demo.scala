package com.practice

case class Donut(name: String, tasteLevel: String)

object Donut_Demo extends App {
  val myDonut : Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"myDonut name: ${myDonut.name} taste: ${myDonut.tasteLevel}")
}
