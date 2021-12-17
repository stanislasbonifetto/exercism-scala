object SpaceAge {
  def onEarth(secondsOld: Double = 0) : Double = Earth.oldOnPlanet(secondsOld)
  def onMercury(secondsOld: Double = 0): Double = Mercury.oldOnPlanet(secondsOld)
  def onVenus(secondsOld: Double = 0): Double = Venus.oldOnPlanet(secondsOld)
  def onMars(secondsOld: Double = 0): Double = Mars.oldOnPlanet(secondsOld)
  def onJupiter(secondsOld: Double = 0): Double = Jupiter.oldOnPlanet(secondsOld)
  def onSaturn(secondsOld: Double = 0): Double = Saturn.oldOnPlanet(secondsOld)
  def onUranus(secondsOld: Double = 0): Double = Uranus.oldOnPlanet(secondsOld)
  def onNeptune(secondsOld: Double = 0): Double = Neptune.oldOnPlanet(secondsOld)
}

trait Planet {
  private val earthOrbitInSecond = 31557600.0

  val earthPlanetOrbitRatio : Double

  def oldOnPlanet(onEarthSecondsOld: Double = 0) : Double = onEarthSecondsOld / earthOrbitInSecond / earthPlanetOrbitRatio
}

object Earth extends Planet { val earthPlanetOrbitRatio = 1.0 }
object Mercury extends Planet { val earthPlanetOrbitRatio = 0.2408467 }
object Venus extends Planet { val earthPlanetOrbitRatio = 0.61519726 }
object Mars extends Planet { val earthPlanetOrbitRatio = 1.8808158 }
object Jupiter extends Planet { val earthPlanetOrbitRatio = 11.862615 }
object Saturn extends Planet { val earthPlanetOrbitRatio = 29.447498 }
object Uranus extends Planet { val earthPlanetOrbitRatio = 84.016846 }
object Neptune extends Planet { val earthPlanetOrbitRatio = 164.79132 }