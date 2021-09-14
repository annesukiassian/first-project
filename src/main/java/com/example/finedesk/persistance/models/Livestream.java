package com.example.finedesk.persistance.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livestreams")
public class Livestream {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long duration;
    private LocalDateTime liveDate;
    private Long views;
    private Long likes;
    private String videoUrl;
    private String description;
    private String toolsUsed;
    private String creativeFields;

    @ManyToOne
    @JoinColumn(name = "streamer_id")
    private User streamer;

    @ManyToMany(mappedBy = "likedStreams")
    private Set<User> userLikes;

}
