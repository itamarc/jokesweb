package guru.springfamewk.jokesweb.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Primary
@Service
public class ChuckNorrisJokesService implements JokesService {
    @Override
    public String getJoke() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
