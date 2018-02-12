package academy.learnprogramming.anotherpackage

import academy.learnprogramming.inheritance.Department.IT
import academy.learnprogramming.inheritance.Department.SALES
import academy.learnprogramming.inheritance.CompanyCommunications as Comm
import academy.learnprogramming.inheritance.topLevel as tp
import academy.learnprogramming.inheritance.upperFirstAndLast as ufal


fun main(args: Array<String>) {
    tp("Hello from AnotherFile")
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
    println("some string".ufal())

}