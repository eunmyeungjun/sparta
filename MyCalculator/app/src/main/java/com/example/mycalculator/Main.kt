package com.example.mycalculator

fun main(){
    println("계산할 첫번째 정수를 입력해 주세요")
    var firstNum = readLine()!!.toInt()

    while (true) {
        println("입력된 숫자 : $firstNum \n+ , - , * , % 중 원하시는 연산자를 선택해 입력해 주세요")
        val operator = readLine()!!
        if (operator !in listOf<String>("+", "-", "*", "%")) {
            println("연산자를 잘못 선택하셨습니다. 계산기를 종료합니다, 다시실행 해주세요")
            return
        }
        println("계산할 두번째 정수를 입력해 주세요")
        val secondNum = readLine()!!.toInt()
        var result = 0.0
        val addCal = Calculator(AddOperation())
        val subCal = Calculator(SubtractOperation())
        val divCal = Calculator(DivideOperation())
        val mutCal = Calculator(MultiplyOperaiton())
        when(operator){
            "+" -> result = addCal.operate(firstNum ,secondNum)
            "-" -> result = subCal.operate(firstNum , secondNum)
            "*" -> result = mutCal.operate(firstNum, secondNum)
            "%" -> result = divCal.operate(firstNum , secondNum)
        }



        
        println("$firstNum 에 $operator $secondNum 을 한 결과는 $result 입니다.\n\n" +
                "$result 에서 더 계산을 원하시면 1, 종료하시려면 2를 눌러주세요. ")

        var againNum = readLine()!!.toInt()
        if (againNum == 2) {
            break
        } else {
            firstNum = result.toInt()
        }

    }
}



