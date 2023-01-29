fun main() {
    print("Введите x1: ")
    var x1:Double = readLine().toString().toDouble()
    print("Введите y1: ")
    var y1:Double = readLine().toString().toDouble()
    print("Введите x2: ")
    var x2:Double = readLine().toString().toDouble()
    print("Введите y2: ")
    var y2:Double = readLine().toString().toDouble()
    val x3 = (x1+x2)/2
    val y3 = (y1+y2)/2
    println("Координаты точки делящей отрезок пополам: ($x3;$y3)")
}