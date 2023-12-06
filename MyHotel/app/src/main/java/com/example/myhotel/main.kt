package com.example.myhotel

fun main(){
    val reserveList =
        mutableListOf<String>("사용자: 홍길동 ,방번호: 104호 ,체크인: 20230710, 체크아웃: 20230721")
    val checkAbleList = mutableListOf<String>("방번호: 104,체크인기간: 20230710~20230721")
    val today = 20231130
    while (true) {

        val sortedList = reserveList.sortedBy {
            var checkIn = it.split(",")[2].split(" ")[1].toInt()
            checkIn
        }



        println(
            "호텔 예약 프로그램입니다.\n[메뉴]\n1. 방 예약 2. 예약 목록 출력 3. 예약목록(정렬) 출력 " +
                    "4. 시스템 종료 5. 금액 입금 - 출금 내역 목록 출력 6. 예약 변경/취소"
        )
        val menuNum = readLine()!!.toInt()

        when (menuNum) {
            1 -> {
                println("예약자분의 성함을 입력해 주세요")
                val reserveName = readLine()!!
                println("예약할 방 번호를 입력해 주세요.")
                var roomNum = readLine()!!.toInt()
                while (true) {
                    if (roomNum in 100..999) {
                        break
                    } else {
                        println(
                            "올바르지 않은 방 번호입니다. 방 번호는 100~999 영역 이내입니다."
                                    + "\n다시 입력해 주세요"
                        )
                        roomNum = readLine()!!.toInt()
                    }
                }
                println("체크인 할 날짜를 입력해주세요. 표기방식 : $today")
                var checkInDate = readLine()!!.toInt()
                while (true) {
                    if (today <= checkInDate) {
                        break
                    } else {
                        println("체크인은 지난날은 선택할 수 없습니다. 다시 입력해 주세요. 오늘날짜 : $today")
                        checkInDate = readLine()!!.toInt()
                    }
                    for (i in 0 until checkAbleList.size) {
                        val checkRoom = checkAbleList[i].split(",")[0].split(" ")[1].toInt()
                        val (checkAbleCheckIn, cheackAbleCheckOut)
                                = checkAbleList[i].split(",")[1].split(" ")[1]
                            .split("~")
                        if (checkRoom == roomNum) {
                            if (checkInDate in checkAbleCheckIn.toInt()..cheackAbleCheckOut.toInt()) {
                                println("해당 날짜에 이미 방을 사용중 입니다. 다른날짜를 입력하세요")
                                checkInDate = readLine()!!.toInt()
                            }
                        }
                    }
                }
                println("체크아웃 날짜를 입력해 주세요. 체크인 날짜 : $checkInDate")
                var checkOutDate = readLine()!!.toInt()
                while (true) {
                    if (checkOutDate > checkInDate) {
                        break
                    } else {
                        println(
                            "체크인 날짜보다 이전이거나 같을 수는 없습니다. 다시 입력해주세요." +
                                    " 체크인 날짜 : $checkInDate"
                        )
                        checkOutDate = readLine()!!.toInt()
                    }
                }
                println("호텔 예약이 완료되었습니다.")
                reserveList += ("사용자: $reserveName ,방번호: $roomNum ,체크인: $checkInDate,체크아웃: $checkOutDate")
                checkAbleList += ("방번호: $roomNum, 체크인기간: $checkInDate~$checkOutDate")
            }

            2 -> {
                println("호텔 예약자 목록입니다. \n")
                for (i in 0 until reserveList.size){
                    println("${i+1}. ${reserveList[i]}")
                }

            }

            3 ->{
                println("호텔 예약자 목록입니다.\n")
                for (i in 0 until sortedList.size){
                    println("${i+1}. ${sortedList[i]} ")
                }
            }

            4 -> {
                println("호텔 예약 프로그램을 종료합니다.")
                break
            }

        }
    }

}