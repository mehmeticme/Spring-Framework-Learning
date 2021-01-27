package com.jackson.entity;

import com.jackson.entity.MovieCinema;
import com.jackson.entity.UserAccount;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_cinema_id")
    private MovieCinema movieCinema;
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_time;
    private int seatNumber;
    private int rowNumber;

    @Autowired
    public Ticket(Long ticketId, Date date_time, int seatNumber, int rowNumber) {
        this.id = ticketId;
        this.date_time = date_time;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}
