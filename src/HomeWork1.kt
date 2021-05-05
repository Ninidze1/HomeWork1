// გიორგი ნინიძე, საშინაო დავალება

fun main() {

    // დავალება 1
//    val number1 = 36
//    val number2 = 96
//    println("$number1-ს და $number2-ს უსგ არის ${findGcd(number1, number2)}")

    // დავალება 2
//    val number1 = 6
//    val number2 = 9
//    println("$number1-ს და $number2-ს უსჯ არის ${findLcm(number1, number2)}")

    // დავალება 3
//    println(symbolChecker("i have 100$"))
//
    // დავალება 4
//    println(sumRecursion(100))

    // დავალება 5
//    println(reverseNum(44234000))

    // დავალება 6
//    println(palindromeCheck("Solos"))

}

// Task 1
fun findGcd(x: Int, y: Int): Int {
    var gcd = 1
    var i = 1
    /* while ციკლი სრულდება მანამ სანამ i ცვლადი ნაკლებია x და y ცვკადზე, შესაბამისად უსგ იძებნება 1 დან ამ ორს შორის
     უმცირეს რიცხვამდე */
    while (i <= x && i <= y) {
        /* თუ ამ რეინჯში, იტერაციისას მოიძებნება ისეთი i რიცხვი, რომელიც იყოფა ორივე რიცხვზე,
        i ცვლადი ენიჭება gcd-ს, ხოლო ციკლის ბოლოს ბრუნდება უდიდესი რიცხვი, რომელიც უნაშთოდ იყოფა ორივე რიცხვზე. */
        if (x % i == 0 && y % i == 0) {
            gcd = i
        }
        i += 1
    }
    return gcd
}

// Task 2
fun findLcm(x: Int, y: Int): Int {
    /* მოცემული 2 რიცხვის უსჯ არის ამ რიცხვების ნამრავლი გაყოფილი მათ უსგ-ზე :)
    მოსალოდნელია, რომ ორი Int ტიპის გაყოფისას, თუ ისინი ერთმანეთზე უნაშთოდ არ იყოფიან, არასწორი პასუხი მივიღოთ,
    მაგრამ, ამ კონკრეტულ შემთხვევაში findGcd(x, y) ფუნქციით მიღებული შედეგი უეჭველად იყოფა x და y რიცხვზე უნაშთოდ, და
    შესაბამისად მათ ნამრავლზეც. ასე, რომ პრობლემა არ უნდა იყოს. */
    return ((x * y) / findGcd(x, y))
}

// Task 3
fun symbolChecker(text: String): Boolean {
    // ინტეგრირებული მეთოდის გამოყენებით, მაგრამ ეს მეთოდი მგონი უკვე Deprecated-ა, ზუსტად არ ვიცი :)
//    return text.contains("$")
    /* სტრინგი იშლება char ების array ად, for loop-ის გარბენის შემთხვევაში თუ იტერატორი წააწყდება '$' ჩარს დაბრუნდება true
    თუ არა და false */
    var output = -1
    for (each in text) {
        output = if (each == '$')
            1
        else
            0
    }
    return output == 1
}

// Task 4
fun sumRecursion(num:Int): Int {
    val result: Int
    return if (num <= 1)
        num
    else
        num + sumRecursion(num - 2)
}

// Task 5
fun reverseNum(num: Int): Int {
    return num.toString().reversed().toInt()
}

// Task 6
fun palindromeCheck(str: String): Boolean {
    return str.toLowerCase() == str.toLowerCase().reversed()
}