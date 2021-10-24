package guru.springfamewk.jokesweb.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Primary
@Service
public class ChuckNorrisJokesService implements JokesService {
    private final ChuckNorrisQuotes quotes;

    public ChuckNorrisJokesService() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
