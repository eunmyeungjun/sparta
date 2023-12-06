package com.example.mykiosk

fun main(){
    while (true) {
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n\n" +
            "[ SHAKESHACK MENU ]\n" +
                    "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                    "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                    "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                    "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                    "0. 종료             | 프로그램 종료")

        var menuNum : Int
        while(true) {
            try {
                 menuNum = readLine()!!.toInt()
                if (menuNum > 5){
                    println("메뉴판에 없는 번호입니다. 번호를 다시입력해 주세요\n\n"+
                            "[ SHAKESHACK MENU ]\n" +
                            "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                            "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                            "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                            "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                            "0. 종료             | 프로그램 종료")
                } else break
            } catch (e:NumberFormatException){
                println("잘못된 형식입니다. 번호를 다시입력해 주세요\n\n" +
                        "[ SHAKESHACK MENU ]\n" +
                        "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                        "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                        "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                        "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                        "0. 종료             | 프로그램 종료")
            }
        }
        when(menuNum) { 
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }

            1 -> {
                println(
                    "[ Burgers MENU ]\n" +
                    "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                    "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0. 뒤로가기      | 뒤로가기")

                var burgerNum : Int
                while(true) {
                    try {
                        burgerNum = readLine()!!.toInt()
                        if (burgerNum > 5){
                            println(
                                "메뉴판에 없는 번호입니다. 번호를 다시입력해 주세요\n\n"+
                                "[ Burgers MENU ]\n" +
                                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                                "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                                "0. 뒤로가기      | 뒤로가기")
                        } else break
                    } catch (e:NumberFormatException){
                        println(
                            "잘못된 형식입니다. 번호를 다시입력해 주세요\n\n" +
                            "[ Burgers MENU ]\n" +
                            "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                            "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                            "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                            "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                            "0. 뒤로가기      | 뒤로가기")
                    }
                }
                when(burgerNum) {
                    0 -> menuNum = 1

                }//버거넘

            }//메뉴넘1번

        }//when 메뉴넘
        
    }//시작 whiletrue문


}//main