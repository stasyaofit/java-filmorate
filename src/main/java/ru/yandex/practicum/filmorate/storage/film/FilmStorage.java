package ru.yandex.practicum.filmorate.storage.film;

import ru.yandex.practicum.filmorate.model.Film;

import java.util.Collection;
import java.util.List;

public interface FilmStorage {

    Collection<Film> findAll();

    Film getFilm(Long id);

    Film createFilm(Film film);

    Film updateFilm(Film film);

    void deleteFilm(Long id);

    void addLike(Long filmId, Long userId);

    void removeLike(Long filmId, Long userId);

    List<Long> getLikes(Long filmId);

    List<Film> getTopNPopularFilms(Long count);
}
