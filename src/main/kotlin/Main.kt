import kotlin.random.Random // 랜덤 숫자를 생성하기 위해 코틀린의 Random 라이브러리를 가져옵니다.

fun main() { // 프로그램 실행의 시작점인 main 함수 정의
    println("Welcome to the Number Guessing Game!") // 사용자에게 인사 메시지를 출력
    println("I'm thinking of a number between 1 and 100. Can you guess it?") // 게임 설명 출력

    val targetNumber = Random.nextInt(1, 101) // 1부터 100 사이의 랜덤 숫자를 생성. 사용자가 맞춰야 할 목표 숫자
    var attempts = 0 // 시도 횟수를 저장하는 변수 선언 및 초기화
    var guessedCorrectly = false // 정답을 맞췄는지 확인하는 플래그 변수. 초기값은 false.

    while (!guessedCorrectly) { // 사용자가 숫자를 맞추기 전까지 반복 실행
        print("Enter your guess: ") // 사용자로부터 입력 받도록 메시지 출력
        val guess = readLine()?.toIntOrNull() // 입력 값을 문자열로 받아 숫자로 변환. 유효하지 않은 경우 null을 반환

        if (guess == null) { // 입력 값이 null(숫자가 아닌 경우)일 때 처리
            println("Please enter a valid number.") // 에러 메시지 출력
            continue // 무효 입력이므로 루프의 다음 반복으로 넘어감
        }

        attempts++ // 유효한 입력이므로 시도 횟수를 증가

        when { // 조건부 로직 처리
            guess < targetNumber -> println("Too low! Try again.") // 입력 값이 목표 숫자보다 작을 경우 메시지 출력
            guess > targetNumber -> println("Too high! Try again.") // 입력 값이 목표 숫자보다 클 경우 메시지 출력
            else -> { // 입력 값이 목표 숫자와 일치할 경우
                println("Congratulations! You guessed the number in $attempts attempts.") // 축하 메시지 출력
                guessedCorrectly = true // 정답을 맞췄으므로 루프 종료를 위해 플래그 변경
            }
        }
    }
}