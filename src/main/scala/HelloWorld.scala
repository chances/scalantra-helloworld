import org.scalatra._

class HelloWorld extends ScalatraFilter {
  get("/") {"Hello, world!"}
}
