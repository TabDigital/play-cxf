import play.api.{Application, GlobalSettings}

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    super.onStart(app)
    ctx.start()
  }

  override def onStop(app: Application) {
    ctx.stop()
    super.onStop(app)
  }
}
