def product(f: Int => Int)(a: Int, b: Int): Int = {
  if(a > b) 1
  else f(a) * product(f)(a + 1, b)
}

def fact(n: Int): Int = {
  product(x => x)(1, n)
}

fact(4) // 1+1+2+4+6+10

//def sum(f: Int => Int, a: Int, b: Int): Int = {
//  def loop(a: Int, acc: Int): Int = {
//    if (a > b) acc
//    else loop(a + 1, f(a) + acc)
//  }
//  loop(a, 0)
//}

//sum(x=>x * x, 1, 5)

//def abs(x: Double) = if (x < 0) -x else x
//
//def sqrt(x: Double) = {
//
//  def isGoodEnough(guess: Double) =
//    abs(guess * guess - x) / x < 0.001
//
//  def improve(guess: Double) =
//    (guess + x / guess) / 2
//
//  def sqrtIter(guess: Double): Double =
//    if (isGoodEnough(guess)) guess
//    else sqrtIter(improve(guess))
//
//  sqrtIter(1.0)
//}
//
//def gcd(a: Int, b: Int): Int =
//  if (b == 0) a else gcd(b, a % b)
//
//def factorial(n: Int): Int =
//  if (n == 0) 1 else n * factorial(n - 1)
//
//def tailFactorial(n: Int): Int = {
//  def loop(acc: Int, n: Int):Int =
//    if (n == 0) acc
//    else loop(acc * n, n -1)
//  loop(1, n)
//}


