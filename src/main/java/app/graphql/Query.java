package app.graphql;

import app.constant.MovieTypeEnum;
import app.entity.Film;
import app.service.db.DataService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhihao zhang
 * @date 2019-04-14
 */

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private DataService dataService;

    public List<Film> getFilms() {
        return dataService.listAllFilms();
    }

    public List<Film> getFilmsByMovieType(MovieTypeEnum movieTypeEnum) {
        return dataService.listFilmsByMovieTypeEnum(movieTypeEnum);
    }
}
