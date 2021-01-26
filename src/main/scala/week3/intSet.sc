abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}
class Nonempty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  def incl(x: Int): IntSet =
    if (x < elem) new Nonempty(elem, left incl x, right)
    else if (x > elem) new Nonempty(elem, left, right incl x)
    else this
  def union(other: IntSet): IntSet =
    ((left union right) union other) incl elem

  override def toString: String = "{" + left + elem + right + "}"
}
class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new Nonempty(x, new Empty, new Empty)
  def union(other: IntSet): IntSet = other
  override def toString = "."
}
val t1 = new Nonempty(3, new Empty, new Empty)
val t2 = t1 incl 7
t2 incl 5