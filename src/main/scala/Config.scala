import com.typesafe.config.ConfigFactory

/**
  * Created by charafau on 2016/11/07.
  */
trait Config {
  private val config = ConfigFactory.load()
  private val httpConfig = config.getConfig("http")

  val httpHost = httpConfig.getString("interface")
  val httpPort = httpConfig.getInt("port")

}
