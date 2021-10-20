package guru.springfamewk.jokesweb;

import guru.springfamewk.jokesweb.controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokeswebApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(JokeswebApplication.class, args);

/*        JokesController controller = (JokesController) ctx.getBean("jokesController");
        while (true) {
            System.out.println(controller.tellAJoke());
            Thread.sleep(6000);
        }*/
    }

}
