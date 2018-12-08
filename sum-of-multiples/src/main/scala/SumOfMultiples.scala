object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val result = for (
      factor <- factors;
      n <- factor until limit by factor
    ) yield n
    result.sum
  }
}

