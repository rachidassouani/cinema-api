package io.rachidassouani.cinemaapi.controller;

import io.rachidassouani.cinemaapi.dao.MovieRepository;
import io.rachidassouani.cinemaapi.dao.TicketRepository;
import io.rachidassouani.cinemaapi.entity.Movie;
import io.rachidassouani.cinemaapi.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class CinemaRestController {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private TicketRepository ticketRepository;

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

    @PostMapping("buyTickets")
    @Transactional
    public List<Ticket> buyTicket(@RequestBody TicketForm ticketForm) {
        // list of tickets that will be returned
        List<Ticket> tickets = new ArrayList<>();

        // iterate tickets that user pay to save it later
        ticketForm.getTickets().forEach( idTicket -> {
            Ticket ticket = ticketRepository.findById(idTicket).get();
            ticket.setNameClient(ticketForm.getNameClient());
            ticket.setReserve(true);
            ticket.setPaymentCode(ticketForm.getCodePayment());

            // save ticket
            Ticket savedTicket = ticketRepository.save(ticket);
            // add saved ticket to the list
            tickets.add(savedTicket);
        });
        // return lists of tickets that user payed
        return tickets;
    }

}
class TicketForm {
    private List<Long> tickets = new ArrayList<>();
    private String nameClient;
    private String codePayment;

    public TicketForm() {
    }

    public TicketForm(List<Long> tickets, String nameClient, String codePayment) {
        this.tickets = tickets;
        this.nameClient = nameClient;
        this.codePayment = codePayment;
    }

    public List<Long> getTickets() {
        return tickets;
    }

    public void setTickets(List<Long> tickets) {
        this.tickets = tickets;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getCodePayment() {
        return codePayment;
    }

    public void setCodePayment(String codePayment) {
        this.codePayment = codePayment;
    }
}
