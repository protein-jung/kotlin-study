plugins {
    kotlin("jvm") version "2.0.21" // Kotlin JVM 플러그인을 적용, Kotlin 버전은 2.0.21을 사용
}

group = "org.example" // 프로젝트의 그룹 ID, 일반적으로 패키지 이름과 관련
version = "0.0.1"     // 이 프로젝트의 버전

repositories {
    mavenCentral() // Maven Central 저장소를 의존성 검색 및 다운로드 경로로 설정
}

dependencies {
    testImplementation(kotlin("test")) // Kotlin Test 라이브러리를 테스트 의존성으로 추가
}

tasks.test {
    useJUnitPlatform() // 테스트를 실행하기 위해 JUnit 플랫폼을 사용하도록 설정
}

kotlin {
    jvmToolchain(17) // JVM 기반 코드를 빌드하고 실행할 때 Java 17을 사용하도록 설정
}