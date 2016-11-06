import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer

object Main extends App with Config {


  implicit val system = ActorSystem("my-system")
  implicit val materializer = ActorMaterializer()


  val route =
    pathSingleSlash {
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
      }
    }

  Http().bindAndHandle(route, httpHost, httpPort)


}
