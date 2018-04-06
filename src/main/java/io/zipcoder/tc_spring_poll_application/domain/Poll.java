package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * project: spring-demo
 * package: io.zipcoder.tc_spring_poll_application.domain
 * author: https://github.com/vvmk
 * date: 4/5/18
 */
@Entity
public class Poll {

    @Id
    @GeneratedValue
    @Column(name="POLL_ID")
    private Long Id;

    @Column(name="QUESTION")
    private String question;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="POLL_ID")
    @OrderBy
    private Set<Option> options;

    public Poll() {
        // -_-
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}