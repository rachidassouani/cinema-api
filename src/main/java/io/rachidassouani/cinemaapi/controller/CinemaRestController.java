package io.rachidassouani.cinemaapi.controller;

import io.rachidassouani.cinemaapi.dao.MovieRepository;
import io.rachidassouani.cinemaapi.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class CinemaRestController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping(value = "moviePhoto/{idMovie}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhotoOfMovie(@PathVariable("idMovie") Long id) throws IOException {
        Movie movie = movieRepository.findById(id).get();
        if (movie != null) {

            // get photo name of a movie
            String photoName = movie.getPhoto();

            // get path of photo by it's name
            String photoPath = "/imagesProjects/cinema-api/images/"+photoName+".jpeg";

            File file =
                    new File(System.getProperty("user.home") + photoPath);

            Path path = Paths.get(file.toURI());

            // return photo of a movie
            return Files.readAllBytes(path);
        }
        return null;
    }

}
