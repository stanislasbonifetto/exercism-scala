object Leap {
  def leapYear(year: Int): Boolean = {
    year match {
      case n if n % 400 == 0 => true
      case n if n % 4 == 0 && n % 100 != 0 => true
      case _ => false
    }
  }
}