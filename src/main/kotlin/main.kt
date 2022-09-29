/*fun main() {
    // write your code her
    println("I love animals!")
    println("Let's check on the animals...")
    println("The deer looks fine.")
    println("The bat looks happy.")
    println("The lion looks healthy.")
}
var camel = """Switching on the camera in the camel habitat...
 ___.-''''-.
/___  @    |
',,,,.     |         _.'''''''._
     '     |        /           \
     |     \    _.-'             \
     |      '.-'                  '-.
     |                               ',
     |                                '',
      ',,-,                           ':;
           ',,| ;,,                 ,' ;;
              ! ; !'',,,',',,,,'!  ;   ;:
             : ;  ! !       ! ! ;  ;   :;
             ; ;   ! !      ! !  ; ;   ;,
            ; ;    ! !     ! !   ; ;
            ; ;    ! !    ! !     ; ;
           ;,,      !,!   !,!     ;,;
           /_I      L_I   L_I     /_I
Look at that! Our little camel is sunbathing!"""
fun main() {
println(camel)
}
val regex = "\\s+".toRegex()  // 1 or more whitespace character (space, tabs etc.)
val str = "1 2\t\t3  4\t5  6"
val nums = str.split(regex).map { it.toInt() }.toMutableList()
println(nums.joinToString()) // 1, 2, 3, 4, 5, 6
*/
fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val num = numbers.first()
    numbers.first() = numbers.last()
    numbers.last() = num
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}